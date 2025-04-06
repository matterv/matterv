package computer.matter.vcenter;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.OvfCreateImportSpecParams;
import com.vmware.vim25.OvfCreateImportSpecResult;
import com.vmware.vim25.OvfFileItem;
import com.vmware.vim25.ParaVirtualSCSIController;
import com.vmware.vim25.VAppEntityConfigInfo;
import com.vmware.vim25.VirtualDeviceConfigSpec;
import com.vmware.vim25.VirtualDeviceConfigSpecFileOperation;
import com.vmware.vim25.VirtualDeviceConfigSpecOperation;
import com.vmware.vim25.VirtualDeviceConnectInfo;
import com.vmware.vim25.VirtualDisk;
import com.vmware.vim25.VirtualDiskFlatVer2BackingInfo;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VirtualMachineFileInfo;
import com.vmware.vim25.VirtualMachineImportSpec;
import com.vmware.vim25.VirtualSCSISharing;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

record DiskInfo(Long capacityInKB, String diskId, String href) {
}

public class OvfManager extends ManagedObjectReference {

  final Logger logger = LoggerFactory.getLogger(OvfManager.class);
  private final ManagedObjectManager managedObjectManager;

  public OvfManager(String value, ManagedObjectManager managedObjectManager) {
    type = "OvfManager";
    this.value = value;
    this.managedObjectManager = managedObjectManager;
  }

  OvfCreateImportSpecResult getOvfCreateImportSpecResult() throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, JAXBException {
    var rsp = """
              <soapenv:Envelope xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/"
               xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
               xmlns:xsd="http://www.w3.org/2001/XMLSchema"
               xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
              <soapenv:Body>
              <CreateImportSpecResponse xmlns="urn:internalvim25"><returnval><importSpec xsi:type="VirtualMachineImportSpec"><entityConfig><tag>MyVM1</tag></entityConfig><configSpec><name>MyVM1</name><version>vmx-19</version><guestId>windows2019srvNext_64Guest</guestId>
              <files><vmPathName>[datastore1]</vmPathName></files>
              <tools><afterPowerOn>true</afterPowerOn><afterResume>true</afterResume><beforeGuestStandby>true</beforeGuestStandby><beforeGuestShutdown>true</beforeGuestShutdown><beforeGuestReboot>true</beforeGuestReboot><toolsUpgradePolicy>manual</toolsUpgradePolicy><syncTimeWithHostAllowed>true</syncTimeWithHostAllowed><syncTimeWithHost>false</syncTimeWithHost></tools>
              <flags><vvtdEnabled>false</vvtdEnabled><vbsEnabled>false</vbsEnabled></flags>
              <powerOpInfo><powerOffType>soft</powerOffType>
              <suspendType>soft</suspendType><resetType>soft</resetType><standbyAction>checkpoint</standbyAction></powerOpInfo><numCPUs>2</numCPUs><numCoresPerSocket>1</numCoresPerSocket><memoryMB>4096</memoryMB><memoryHotAddEnabled>false</memoryHotAddEnabled><cpuHotAddEnabled>false</cpuHotAddEnabled><cpuHotRemoveEnabled>false</cpuHotRemoveEnabled><virtualICH7MPresent>false</virtualICH7MPresent><virtualSMCPresent>false</virtualSMCPresent>
              <deviceChange><operation>add</operation><device xsi:type="VirtualIDEController"><key>201</key><connectable><startConnected>true</startConnected><allowGuestControl>false</allowGuestControl><connected>true</connected></connectable><busNumber>1</busNumber></device></deviceChange>
              <deviceChange><operation>add</operation><device xsi:type="VirtualIDEController"><key>200</key><connectable><startConnected>true</startConnected><allowGuestControl>false</allowGuestControl><connected>true</connected></connectable><busNumber>0</busNumber></device></deviceChange>
              <deviceChange><operation>add</operation><device xsi:type="VirtualMachineVideoCard"><key>500</key><connectable><startConnected>false</startConnected><allowGuestControl>false</allowGuestControl><connected>true</connected></connectable><videoRamSizeInKB>16384</videoRamSizeInKB><useAutoDetect>true</useAutoDetect><enable3DSupport>false</enable3DSupport><use3dRenderer>automatic</use3dRenderer><graphicsMemorySizeInKB>262144</graphicsMemorySizeInKB></device></deviceChange>
              <deviceChange><operation>add</operation><device xsi:type="VirtualUSBXHCIController"><key>-100</key><slotInfo xsi:type="VirtualDevicePciBusSlotInfo"><pciSlotNumber>224</pciSlotNumber></slotInfo><unitNumber>0</unitNumber><busNumber>0</busNumber></device></deviceChange>
              <deviceChange><operation>add</operation><fileOperation>create</fileOperation><device xsi:type="VirtualDisk"><key>-102</key><backing xsi:type="VirtualDiskFlatVer2BackingInfo"><fileName></fileName><diskMode>persistent</diskMode><split>false</split><writeThrough>false</writeThrough><thinProvisioned>true</thinProvisioned><eagerlyScrub>false</eagerlyScrub></backing><connectable><startConnected>true</startConnected><allowGuestControl>false</allowGuestControl><connected>true</connected></connectable><controllerKey>-101</controllerKey><unitNumber>0</unitNumber><capacityInKB>20971520</capacityInKB></device></deviceChange>
              <deviceChange><operation>add</operation><device xsi:type="ParaVirtualSCSIController"><key>-101</key><connectable><startConnected>true</startConnected><allowGuestControl>false</allowGuestControl><connected>true</connected></connectable><slotInfo xsi:type="VirtualDevicePciBusSlotInfo"><pciSlotNumber>160</pciSlotNumber></slotInfo><busNumber>0</busNumber><device>-102</device><sharedBus>noSharing</sharedBus></device></deviceChange>
              <deviceChange><operation>add</operation><device xsi:type="VirtualCdrom"><key>-104</key><backing xsi:type="VirtualCdromAtapiBackingInfo"><deviceName>CD/DVD drive 0</deviceName></backing><connectable><startConnected>false</startConnected><allowGuestControl>true</allowGuestControl><connected>true</connected></connectable><controllerKey>-103</controllerKey><unitNumber>0</unitNumber></device></deviceChange>
              <deviceChange><operation>add</operation><device xsi:type="VirtualAHCIController"><key>-103</key><connectable><startConnected>true</startConnected><allowGuestControl>false</allowGuestControl><connected>true</connected></connectable><slotInfo xsi:type="VirtualDevicePciBusSlotInfo"><pciSlotNumber>32</pciSlotNumber></slotInfo><busNumber>0</busNumber><device>-104</device></device></deviceChange>
              <deviceChange><operation>add</operation><device xsi:type="VirtualMachineVMCIDevice"><key>12000</key><allowUnrestrictedCommunication>false</allowUnrestrictedCommunication></device></deviceChange><deviceChange><operation>add</operation><device xsi:type="VirtualE1000e"><key>-105</key><backing xsi:type="VirtualEthernetCardNetworkBackingInfo"><deviceName>VM Network</deviceName></backing><connectable><startConnected>true</startConnected><allowGuestControl>true</allowGuestControl><connected>true</connected></connectable><slotInfo xsi:type="VirtualDevicePciBusSlotInfo"><pciSlotNumber>192</pciSlotNumber></slotInfo><addressType>generated</addressType><wakeOnLanEnabled>false</wakeOnLanEnabled></device></deviceChange>
              <cpuAllocation><shares><shares>2000</shares><level>normal</level></shares></cpuAllocation>
              <extraConfig><key>nvram</key><value xsi:type="xsd:string">MyVM1.nvram</value></extraConfig><extraConfig><key>svga.autodetect</key><value xsi:type="xsd:string">TRUE</value></extraConfig>
              <bootOptions><efiSecureBootEnabled>true</efiSecureBootEnabled></bootOptions>
              <vAppConfig><installBootRequired>false</installBootRequired><installBootStopDelay>0</installBootStopDelay></vAppConfig>
              <firmware>efi</firmware><nestedHVEnabled>false</nestedHVEnabled>
              <vPMCEnabled>false</vPMCEnabled></configSpec>
              </importSpec>
              <fileItem><deviceId>/MyVM1/ParaVirtualSCSIController0:0</deviceId><path>/4/ParaVirtualSCSIController0:0</path><compressionMethod></compressionMethod><size>-1</size><cimType>17</cimType><create>false</create></fileItem>
              <fileItem><deviceId>/MyVM1/nvram</deviceId><path>/4/nvram</path><compressionMethod></compressionMethod><size>-1</size><cimType>1</cimType><create>true</create></fileItem>
              </returnval></CreateImportSpecResponse>
              </soapenv:Body>
              </soapenv:Envelope>
            """;
    System.setProperty("com.sun.xml.bind.v2.runtime.JAXBContextImpl.fastBoot", "false");
    System.setProperty("jaxb.debug", "true");

    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    factory.setNamespaceAware(true); // This is important!
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document doc = builder.parse(new InputSource(new StringReader(rsp)));

// Extract the relevant part (OvfCreateImportSpecResult inside returnval)
    XPath xpath = XPathFactory.newInstance().newXPath();
    xpath.setNamespaceContext(new NamespaceContext() {
      @Override
      public String getNamespaceURI(String prefix) {
        switch (prefix) {
          case "soapenv":
            return "http://schemas.xmlsoap.org/soap/envelope/";
          case "vim25":
            return "urn:internalvim25";
          default:
            return XMLConstants.NULL_NS_URI;
        }
      }

      @Override
      public String getPrefix(String namespaceURI) {
        return null;
      }

      @Override
      public Iterator<String> getPrefixes(String namespaceURI) {
        return null;
      }
    });

// Extract the returnval element
    Node returnvalNode = (Node) xpath.evaluate("//vim25:returnval", doc, XPathConstants.NODE);

// Now unmarshal just this node
    JAXBContext jaxbContext = JAXBContext.newInstance(OvfCreateImportSpecResult.class,
            VirtualMachineImportSpec.class,
            OvfFileItem.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

    // Enable debugging
    unmarshaller.setEventHandler(event -> {
      System.out.println("Event: " + event.getMessage());
      return true;
    });

// Unmarshal the returnval node
    JAXBElement<OvfCreateImportSpecResult> element = unmarshaller.unmarshal(
            new DOMSource(returnvalNode), OvfCreateImportSpecResult.class);
    OvfCreateImportSpecResult result = element.getValue();
    return result;
  }

  public OvfCreateImportSpecResult createImportSpec(String ovfDescriptor, ManagedObjectReference resourcePool, ManagedObjectReference datastoreMo, OvfCreateImportSpecParams cisp) {
    try {
      Map<String, Integer> instanceIdToDeviceKeyMap = new HashMap<>();
      Map<String, DiskInfo> diskInfoMap = new HashMap<>();
      AtomicInteger deviceKey = new AtomicInteger(-101);
      OvfDescriptor.Envelope ovf = JaxbHelper.unmarshal(ovfDescriptor, List.of(OvfDescriptor.Envelope.class));
      var dataStore = (DataStore) managedObjectManager.get(datastoreMo);

      var result = new OvfCreateImportSpecResult();
      var importSpec = new VirtualMachineImportSpec();
      var entityConfig = new VAppEntityConfigInfo();
      entityConfig.setTag(cisp.getEntityName());
      importSpec.setEntityConfig(entityConfig);
      var configSpec = new VirtualMachineConfigSpec();
      configSpec.setName(cisp.getEntityName());
      configSpec.setVersion(ovf.getVirtualSystem().getVirtualHardwareSection().getSystem().getVirtualSystemType());
      configSpec.setGuestId(ovf.getVirtualSystem().getOperatingSystemSection().getOsType());

      var fileInfo = new VirtualMachineFileInfo();
      var dsSummary = dataStore.getSummary();
      fileInfo.setVmPathName("[" + dsSummary.getName() + "]");
      configSpec.setFiles(fileInfo);

      ovf.getDiskSection().getDisks().forEach(disk -> {
        var ref = ovf.getReferences().getFiles().stream().filter(f -> f.getId().equalsIgnoreCase(disk.getFileRef())).findFirst().get();
        long capacityInKB;
        if (disk.getCapacityAllocationUnits().equalsIgnoreCase("byte * 2^30")) {
          capacityInKB = Long.parseLong(disk.getCapacity()) * 1024 * 1024;
        } else if (disk.getCapacityAllocationUnits().equalsIgnoreCase("byte * 2^20")) {
          capacityInKB = Long.parseLong(disk.getCapacity()) * 1024;
        } else {
          capacityInKB = Long.parseLong(disk.getCapacity()) * 1024 * 1024 * 1024;
        }
        diskInfoMap.put(disk.getDiskId(), new DiskInfo(capacityInKB, disk.getDiskId(), ref.getHref()));
      });

      ovf.getVirtualSystem().getVirtualHardwareSection().getItems().forEach(item -> {
        if (item.getResourceType().equalsIgnoreCase("3")) {
          // cpu
          configSpec.setNumCPUs(Integer.parseInt(item.getVirtualQuantity()));
          configSpec.setNumCoresPerSocket(1);
        } else if (item.getResourceType().equalsIgnoreCase("4")) {
          configSpec.setMemoryMB(Long.parseLong(item.getVirtualQuantity()));
        } else if (item.getResourceType().equalsIgnoreCase("6")) {
          var pvScsi = new VirtualDeviceConfigSpec();
          pvScsi.setOperation(VirtualDeviceConfigSpecOperation.ADD);
          var pvScsiController = new ParaVirtualSCSIController();
          pvScsiController.setKey(deviceKey.get());
          var pvScsiConnectableInfo = new VirtualDeviceConnectInfo();
          pvScsiConnectableInfo.setConnected(true);
          pvScsiConnectableInfo.setStartConnected(true);
          pvScsiConnectableInfo.setAllowGuestControl(false);
          pvScsiController.setConnectable(pvScsiConnectableInfo);
          pvScsiController.setBusNumber(0);
          pvScsiController.setSharedBus(VirtualSCSISharing.NO_SHARING);

          pvScsi.setDevice(pvScsiController);
          configSpec.getDeviceChange().add(pvScsi);
          instanceIdToDeviceKeyMap.put(item.getInstanceID(), deviceKey.get());
          deviceKey.addAndGet(-1);
        } else if (item.getResourceType().equalsIgnoreCase("17")) {
          var disk1 = new VirtualDeviceConfigSpec();
          disk1.setOperation(VirtualDeviceConfigSpecOperation.ADD);
          disk1.setFileOperation(VirtualDeviceConfigSpecFileOperation.CREATE);
          var vdisk1 = new VirtualDisk();
          vdisk1.setKey(deviceKey.get());
          var vdisk1BackingInfo = new VirtualDiskFlatVer2BackingInfo();
          vdisk1BackingInfo.setFileName("");
          vdisk1BackingInfo.setDiskMode("persistent");
          vdisk1BackingInfo.setSplit(false);
          vdisk1BackingInfo.setWriteThrough(false);
          vdisk1BackingInfo.setThinProvisioned(true);
          vdisk1BackingInfo.setEagerlyScrub(false);
          vdisk1.setBacking(vdisk1BackingInfo);

          var vdisk1ConnectableInfo = new VirtualDeviceConnectInfo();
          vdisk1ConnectableInfo.setConnected(true);
          vdisk1ConnectableInfo.setStartConnected(true);
          vdisk1ConnectableInfo.setAllowGuestControl(false);
          vdisk1.setConnectable(vdisk1ConnectableInfo);
          vdisk1.setControllerKey(instanceIdToDeviceKeyMap.get(item.getParent()));
          vdisk1.setUnitNumber(Integer.parseInt(item.getAddressOnParent()));

          var parts = item.getHostResource().split("/");
          var diskInfo = diskInfoMap.get(parts[parts.length - 1]);
          vdisk1.setCapacityInKB(diskInfo.capacityInKB());
          disk1.setDevice(vdisk1);
          configSpec.getDeviceChange().add(disk1);

          var fileItem = new OvfFileItem();
          fileItem.setDeviceId("/" + cisp.getEntityName() + "/ParaVirtualSCSIController0:0");
          fileItem.setPath(diskInfo.href());
          fileItem.setCompressionMethod("");
          fileItem.setSize(0L);
          fileItem.setCimType(17);
          fileItem.setCreate(false);
          result.getFileItem().add(fileItem);
        }
      });

      importSpec.setConfigSpec(configSpec);

      result.setImportSpec(importSpec);

//        var fileItem2 = new OvfFileItem();
//        fileItem2.setDeviceId("/" + cisp.getEntityName() + "/nvram");
//        var nvram = ovf.getReferences().getFiles().stream().filter(f -> f.getId().equalsIgnoreCase("file2")).findFirst().get();
//
//        fileItem2.setPath(nvram.getHref());
//        fileItem2.setCompressionMethod("");
//        fileItem2.setSize(0L);
//        fileItem2.setCimType(1);
//        fileItem2.setCreate(true);
//        result.getFileItem().add(fileItem2);
      return result;

//        logger.debug("start createImportSpec");
//        var r = getOvfCreateImportSpecResult();
//        logger.debug("end createImportSpec");
//        return r;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}

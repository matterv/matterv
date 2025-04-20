package computer.matter.vcenter;

import com.vmware.vim25.ImportVAppRequestType;
import com.vmware.vim25.VirtualMachineImportSpec;
import computer.matter.cluster.api.DatacenterApi;
import computer.matter.cluster.api.JobApi;
import computer.matter.cluster.api.VmApi;
import computer.matter.cluster.model.CreateVirtualMachineResponse;
import computer.matter.cluster.model.VirtualMachine;
import computer.matter.common.test.ClusterDbTestBase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class VirtualMachineManagerTest extends ClusterDbTestBase {

  @Mock
  private VmApi vmApi;
  @Mock
  private JobApi jobApi;
  @Mock
  private DatacenterApi datacenterApi;

  @Test
  void testParse() {
    var m = Pattern.compile("\\[(.*?)\\]").matcher("[datastore1]");
    String n = "";
    if (m.find()) {
      n = m.group(1);
    }
    String b = n;
  }

  @Test
  void createVm() {
    var clusterEnv = setupCluster();
    var scManager = new ServiceContentManager(jdbi, clusterEnv.jsonUtil(), datacenterApi, vmApi, jobApi);
    var vcenterVimServer = new VcenterVimServer(scManager);
    var xmlParser = new XmlParser(vcenterVimServer);
    var storageDo = clusterEnv.storages().getFirst();
    var rsp = """
            <?xml version="1.0" encoding="UTF-8"?>
            <soapenv:Envelope xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/"
             xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
             xmlns:xsd="http://www.w3.org/2001/XMLSchema"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
            <soapenv:Body>
            <ImportVApp xmlns="urn:internalvim25"><_this type="ResourcePool">resgroup-9</_this><spec xsi:type="VirtualMachineImportSpec"><entityConfig><tag>MyVM1</tag></entityConfig><instantiationOst><id></id><type>envelope</type><child><id>MyVM1</id><type>virtualSystem</type></child></instantiationOst><configSpec><name>MyVM1</name><version>vmx-19</version><guestId>windows2019srvNext_64Guest</guestId><files><vmPathName>[datastore1]</vmPathName></files><tools><afterPowerOn>true</afterPowerOn><afterResume>true</afterResume><beforeGuestStandby>true</beforeGuestStandby><beforeGuestShutdown>true</beforeGuestShutdown><beforeGuestReboot>true</beforeGuestReboot><toolsUpgradePolicy>manual</toolsUpgradePolicy><syncTimeWithHostAllowed>true</syncTimeWithHostAllowed><syncTimeWithHost>false</syncTimeWithHost></tools><flags><vvtdEnabled>false</vvtdEnabled><vbsEnabled>false</vbsEnabled></flags><powerOpInfo><powerOffType>soft</powerOffType><suspendType>soft</suspendType><resetType>soft</resetType><standbyAction>checkpoint</standbyAction></powerOpInfo><numCPUs>2</numCPUs><numCoresPerSocket>1</numCoresPerSocket><memoryMB>4096</memoryMB><memoryHotAddEnabled>false</memoryHotAddEnabled><cpuHotAddEnabled>false</cpuHotAddEnabled><cpuHotRemoveEnabled>false</cpuHotRemoveEnabled><virtualICH7MPresent>false</virtualICH7MPresent><virtualSMCPresent>false</virtualSMCPresent><deviceChange><operation>add</operation><device xsi:type="VirtualIDEController"><key>201</key><connectable><startConnected>true</startConnected><allowGuestControl>false</allowGuestControl><connected>true</connected></connectable><busNumber>1</busNumber></device></deviceChange><deviceChange><operation>add</operation><device xsi:type="VirtualIDEController"><key>200</key><connectable><startConnected>true</startConnected><allowGuestControl>false</allowGuestControl><connected>true</connected></connectable><busNumber>0</busNumber></device></deviceChange><deviceChange><operation>add</operation><device xsi:type="VirtualMachineVideoCard"><key>500</key><connectable><startConnected>false</startConnected><allowGuestControl>false</allowGuestControl><connected>true</connected></connectable><videoRamSizeInKB>16384</videoRamSizeInKB><useAutoDetect>true</useAutoDetect><enable3DSupport>false</enable3DSupport><use3dRenderer>automatic</use3dRenderer><graphicsMemorySizeInKB>262144</graphicsMemorySizeInKB></device></deviceChange><deviceChange><operation>add</operation><device xsi:type="VirtualUSBXHCIController"><key>-100</key><slotInfo xsi:type="VirtualDevicePciBusSlotInfo"><pciSlotNumber>224</pciSlotNumber></slotInfo><unitNumber>0</unitNumber><busNumber>0</busNumber></device></deviceChange><deviceChange><operation>add</operation><fileOperation>create</fileOperation><device xsi:type="VirtualDisk"><key>-102</key><backing xsi:type="VirtualDiskFlatVer2BackingInfo"><fileName></fileName><diskMode>persistent</diskMode><split>false</split><writeThrough>false</writeThrough><thinProvisioned>true</thinProvisioned><eagerlyScrub>false</eagerlyScrub></backing><connectable><startConnected>true</startConnected><allowGuestControl>false</allowGuestControl><connected>true</connected></connectable><controllerKey>-101</controllerKey><unitNumber>0</unitNumber><capacityInKB>20971520</capacityInKB></device></deviceChange><deviceChange><operation>add</operation><device xsi:type="ParaVirtualSCSIController"><key>-101</key><connectable><startConnected>true</startConnected><allowGuestControl>false</allowGuestControl><connected>true</connected></connectable><slotInfo xsi:type="VirtualDevicePciBusSlotInfo"><pciSlotNumber>160</pciSlotNumber></slotInfo><busNumber>0</busNumber><device>-102</device><sharedBus>noSharing</sharedBus></device></deviceChange><deviceChange><operation>add</operation><device xsi:type="VirtualCdrom"><key>-104</key><backing xsi:type="VirtualCdromAtapiBackingInfo"><deviceName>CD/DVD drive 0</deviceName></backing><connectable><startConnected>false</startConnected><allowGuestControl>true</allowGuestControl><connected>true</connected></connectable><controllerKey>-103</controllerKey><unitNumber>0</unitNumber></device></deviceChange><deviceChange><operation>add</operation><device xsi:type="VirtualAHCIController"><key>-103</key><connectable><startConnected>true</startConnected><allowGuestControl>false</allowGuestControl><connected>true</connected></connectable><slotInfo xsi:type="VirtualDevicePciBusSlotInfo"><pciSlotNumber>32</pciSlotNumber></slotInfo><busNumber>0</busNumber><device>-104</device></device></deviceChange><deviceChange><operation>add</operation><device xsi:type="VirtualMachineVMCIDevice"><key>12000</key><allowUnrestrictedCommunication>false</allowUnrestrictedCommunication></device></deviceChange><deviceChange><operation>add</operation><device xsi:type="VirtualE1000e"><key>-105</key><backing xsi:type="VirtualEthernetCardNetworkBackingInfo"><deviceName>VM Network</deviceName></backing><connectable><startConnected>true</startConnected><allowGuestControl>true</allowGuestControl><connected>true</connected></connectable><slotInfo xsi:type="VirtualDevicePciBusSlotInfo"><pciSlotNumber>192</pciSlotNumber></slotInfo><addressType>generated</addressType><wakeOnLanEnabled>false</wakeOnLanEnabled></device></deviceChange><cpuAllocation><shares><shares>2000</shares><level>normal</level></shares></cpuAllocation><extraConfig><key>nvram</key><value xsi:type="xsd:string">MyVM1.nvram</value></extraConfig><extraConfig><key>pciBridge0.present</key><value xsi:type="xsd:string">TRUE</value></extraConfig><extraConfig><key>pciBridge4.present</key><value xsi:type="xsd:string">TRUE</value></extraConfig><extraConfig><key>pciBridge4.virtualDev</key><value xsi:type="xsd:string">pcieRootPort</value></extraConfig><extraConfig><key>pciBridge4.functions</key><value xsi:type="xsd:string">8</value></extraConfig><extraConfig><key>pciBridge5.present</key><value xsi:type="xsd:string">TRUE</value></extraConfig><extraConfig><key>pciBridge5.virtualDev</key><value xsi:type="xsd:string">pcieRootPort</value></extraConfig><extraConfig><key>pciBridge5.functions</key><value xsi:type="xsd:string">8</value></extraConfig><extraConfig><key>pciBridge6.present</key><value xsi:type="xsd:string">TRUE</value></extraConfig><extraConfig><key>pciBridge6.virtualDev</key><value xsi:type="xsd:string">pcieRootPort</value></extraConfig><extraConfig><key>pciBridge6.functions</key><value xsi:type="xsd:string">8</value></extraConfig><extraConfig><key>pciBridge7.present</key><value xsi:type="xsd:string">TRUE</value></extraConfig><extraConfig><key>pciBridge7.virtualDev</key><value xsi:type="xsd:string">pcieRootPort</value></extraConfig><extraConfig><key>pciBridge7.functions</key><value xsi:type="xsd:string">8</value></extraConfig><extraConfig><key>svga.autodetect</key><value xsi:type="xsd:string">TRUE</value></extraConfig><extraConfig><key>pciBridge0.pciSlotNumber</key><value xsi:type="xsd:string">17</value></extraConfig><extraConfig><key>pciBridge4.pciSlotNumber</key><value xsi:type="xsd:string">21</value></extraConfig><extraConfig><key>pciBridge5.pciSlotNumber</key><value xsi:type="xsd:string">22</value></extraConfig><extraConfig><key>pciBridge6.pciSlotNumber</key><value xsi:type="xsd:string">23</value></extraConfig><extraConfig><key>pciBridge7.pciSlotNumber</key><value xsi:type="xsd:string">24</value></extraConfig><bootOptions><efiSecureBootEnabled>true</efiSecureBootEnabled></bootOptions><vAppConfig><installBootRequired>false</installBootRequired><installBootStopDelay>0</installBootStopDelay></vAppConfig><firmware>efi</firmware><nestedHVEnabled>false</nestedHVEnabled><vPMCEnabled>false</vPMCEnabled></configSpec></spec><folder type="Folder">group-v4</folder><host type="H
            Client -> Server: ostSystem">host-1</host></ImportVApp>
            </soapenv:Body>
            </soapenv:Envelope>
            
            
            """;

    var req = xmlParser.parse(rsp, ImportVAppRequestType.class);
    assertEquals("MyVM1", req.getSpec().getEntityConfig().getTag());
    ((VirtualMachineImportSpec)req.getSpec()).getConfigSpec().getFiles().setVmPathName("[" + storageDo.uuid + "]");
    var taskFactory = new TaskFactory(jobApi, vmApi, clusterEnv.jsonUtil(), datacenterApi);
    var moFactory = new ManagedObjectFactory(clusterEnv.jsonUtil(), vmApi, jdbi, jobApi, taskFactory, datacenterApi);
    var moMgr = new ManagedObjectManager(moFactory);
    var vmManager = new VirtualMachineManager(moMgr, vmApi, jdbi, clusterEnv.jsonUtil(), jobApi, datacenterApi);

    var createVmRsp = new CreateVirtualMachineResponse();
    var mockVm = Mockito.mock(VirtualMachine.class);
    Mockito.when(mockVm.getId()).thenReturn("1");
    createVmRsp.setVm(mockVm);
    Mockito.when(vmApi.createVm(Mockito.any())).thenReturn(createVmRsp);
    var vm = vmManager.createVm(((VirtualMachineImportSpec)req.getSpec()).getConfigSpec(), req.getHost());

    assertEquals("vm-1", vm.getValue());

  }
}
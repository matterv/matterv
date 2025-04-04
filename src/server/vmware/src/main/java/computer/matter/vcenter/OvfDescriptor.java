package computer.matter.vcenter;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

public class OvfDescriptor {
  // Root element class
  @XmlRootElement(name = "Envelope", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
  @XmlAccessorType(XmlAccessType.FIELD)
  public static class Envelope {

    @XmlElement(name = "References", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private References references;

    @XmlElement(name = "DiskSection", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private DiskSection diskSection;

    @XmlElement(name = "NetworkSection", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private NetworkSection networkSection;

    @XmlElement(name = "VirtualSystem", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private VirtualSystem virtualSystem;

    // Getters and setters
    public References getReferences() {
      return references;
    }

    public void setReferences(References references) {
      this.references = references;
    }

    public DiskSection getDiskSection() {
      return diskSection;
    }

    public void setDiskSection(DiskSection diskSection) {
      this.diskSection = diskSection;
    }

    public NetworkSection getNetworkSection() {
      return networkSection;
    }

    public void setNetworkSection(NetworkSection networkSection) {
      this.networkSection = networkSection;
    }

    public VirtualSystem getVirtualSystem() {
      return virtualSystem;
    }

    public void setVirtualSystem(VirtualSystem virtualSystem) {
      this.virtualSystem = virtualSystem;
    }
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  public static class References {
    @XmlElement(name = "File", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private List<File> files;

    public List<File> getFiles() {
      return files;
    }

    public void setFiles(List<File> files) {
      this.files = files;
    }
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  public static class File {
    @XmlAttribute(name = "href", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String href;

    @XmlAttribute(name = "id", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String id;

    @XmlAttribute(name = "size", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String size;

    // Getters and setters
    public String getHref() {
      return href;
    }

    public void setHref(String href) {
      this.href = href;
    }

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getSize() {
      return size;
    }

    public void setSize(String size) {
      this.size = size;
    }
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  public static class DiskSection {
    @XmlElement(name = "Info", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String info;

    @XmlElement(name = "Disk", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private List<Disk> disks;

    // Getters and setters
    public String getInfo() {
      return info;
    }

    public void setInfo(String info) {
      this.info = info;
    }

    public List<Disk> getDisks() {
      return disks;
    }

    public void setDisks(List<Disk> disks) {
      this.disks = disks;
    }

  }

  @XmlAccessorType(XmlAccessType.FIELD)
  public static class Disk {
    @XmlAttribute(name = "capacity", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String capacity;

    @XmlAttribute(name = "capacityAllocationUnits", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String capacityAllocationUnits;

    @XmlAttribute(name = "diskId", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String diskId;

    @XmlAttribute(name = "fileRef", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String fileRef;

    @XmlAttribute(name = "format", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String format;

    // Getters and setters
    public String getCapacity() {
      return capacity;
    }

    public void setCapacity(String capacity) {
      this.capacity = capacity;
    }

    public String getCapacityAllocationUnits() {
      return capacityAllocationUnits;
    }

    public void setCapacityAllocationUnits(String capacityAllocationUnits) {
      this.capacityAllocationUnits = capacityAllocationUnits;
    }

    public String getDiskId() {
      return diskId;
    }

    public void setDiskId(String diskId) {
      this.diskId = diskId;
    }

    public String getFileRef() {
      return fileRef;
    }

    public void setFileRef(String fileRef) {
      this.fileRef = fileRef;
    }

    public String getFormat() {
      return format;
    }

    public void setFormat(String format) {
      this.format = format;
    }
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  public static class NetworkSection {
    @XmlElement(name = "Info", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String info;

    @XmlElement(name = "Network", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private Network network;

    // Getters and setters
    public String getInfo() {
      return info;
    }

    public void setInfo(String info) {
      this.info = info;
    }

    public Network getNetwork() {
      return network;
    }

    public void setNetwork(Network network) {
      this.network = network;
    }
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  public static class Network {
    @XmlAttribute(name = "name", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String name;

    @XmlElement(name = "Description", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String description;

    // Getters and setters
    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  public static class VirtualSystem {
    @XmlAttribute(name = "id", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String id;

    @XmlElement(name = "Info", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String info;

    @XmlElement(name = "Name", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String name;

    @XmlElement(name = "OperatingSystemSection", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private OperatingSystemSection operatingSystemSection;

    @XmlElement(name = "VirtualHardwareSection", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private VirtualHardwareSection virtualHardwareSection;

    // Getters and setters
    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getInfo() {
      return info;
    }

    public void setInfo(String info) {
      this.info = info;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public OperatingSystemSection getOperatingSystemSection() {
      return operatingSystemSection;
    }

    public void setOperatingSystemSection(OperatingSystemSection operatingSystemSection) {
      this.operatingSystemSection = operatingSystemSection;
    }

    public VirtualHardwareSection getVirtualHardwareSection() {
      return virtualHardwareSection;
    }

    public void setVirtualHardwareSection(VirtualHardwareSection virtualHardwareSection) {
      this.virtualHardwareSection = virtualHardwareSection;
    }
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  public static class OperatingSystemSection {
    @XmlAttribute(name = "id", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String id;

    @XmlAttribute(name = "osType", namespace = "http://www.vmware.com/schema/ovf")
    private String osType;

    @XmlElement(name = "Info", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String info;

    // Getters and setters
    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getOsType() {
      return osType;
    }

    public void setOsType(String osType) {
      this.osType = osType;
    }

    public String getInfo() {
      return info;
    }

    public void setInfo(String info) {
      this.info = info;
    }
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  public static class VirtualHardwareSection {
    @XmlElement(name = "Info", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private String info;

    @XmlElement(name = "System", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private System system;

    @XmlElement(name = "Item", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    private List<Item> items;

    // Getters and setters
    public String getInfo() {
      return info;
    }

    public void setInfo(String info) {
      this.info = info;
    }

    public System getSystem() {
      return system;
    }

    public void setSystem(System system) {
      this.system = system;
    }

    public List<Item> getItems() {
      return items;
    }

    public void setItems(List<Item> items) {
      this.items = items;
    }
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  public static class System {
    @XmlElement(name = "ElementName", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData")
    private String elementName;

    @XmlElement(name = "InstanceID", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData")
    private String instanceID;

    @XmlElement(name = "VirtualSystemIdentifier", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData")
    private String virtualSystemIdentifier;

    @XmlElement(name = "VirtualSystemType", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData")
    private String virtualSystemType;

    // Getters and setters
    public String getElementName() {
      return elementName;
    }

    public void setElementName(String elementName) {
      this.elementName = elementName;
    }

    public String getInstanceID() {
      return instanceID;
    }

    public void setInstanceID(String instanceID) {
      this.instanceID = instanceID;
    }

    public String getVirtualSystemIdentifier() {
      return virtualSystemIdentifier;
    }

    public void setVirtualSystemIdentifier(String virtualSystemIdentifier) {
      this.virtualSystemIdentifier = virtualSystemIdentifier;
    }

    public String getVirtualSystemType() {
      return virtualSystemType;
    }

    public void setVirtualSystemType(String virtualSystemType) {
      this.virtualSystemType = virtualSystemType;
    }
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  public static class Item {
    @XmlElement(name = "AllocationUnits", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData")
    private String allocationUnits;

    @XmlElement(name = "Description", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData")
    private String description;

    @XmlElement(name = "ElementName", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData")
    private String elementName;

    @XmlElement(name = "InstanceID", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData")
    private String instanceID;

    @XmlElement(name = "ResourceType", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData")
    private String resourceType;

    @XmlElement(name = "VirtualQuantity", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData")
    private String virtualQuantity;

    @XmlElement(name = "Address", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData")
    private String address;

    @XmlElement(name = "AddressOnParent", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData")
    private String addressOnParent;

    @XmlElement(name = "AutomaticAllocation", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData")
    private String automaticAllocation;

    @XmlElement(name = "Connection", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData")
    private String connection;

    @XmlElement(name = "HostResource", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData")
    private String hostResource;

    @XmlElement(name = "Parent", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData")
    private String parent;

    @XmlElement(name = "ResourceSubType", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData")
    private String resourceSubType;

    // Getters and setters
    public String getAllocationUnits() {
      return allocationUnits;
    }

    public void setAllocationUnits(String allocationUnits) {
      this.allocationUnits = allocationUnits;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public String getElementName() {
      return elementName;
    }

    public void setElementName(String elementName) {
      this.elementName = elementName;
    }

    public String getInstanceID() {
      return instanceID;
    }

    public void setInstanceID(String instanceID) {
      this.instanceID = instanceID;
    }

    public String getResourceType() {
      return resourceType;
    }

    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }

    public String getVirtualQuantity() {
      return virtualQuantity;
    }

    public void setVirtualQuantity(String virtualQuantity) {
      this.virtualQuantity = virtualQuantity;
    }

    public String getAddress() {
      return address;
    }

    public void setAddress(String address) {
      this.address = address;
    }

    public String getAddressOnParent() {
      return addressOnParent;
    }

    public void setAddressOnParent(String addressOnParent) {
      this.addressOnParent = addressOnParent;
    }

    public String getAutomaticAllocation() {
      return automaticAllocation;
    }

    public void setAutomaticAllocation(String automaticAllocation) {
      this.automaticAllocation = automaticAllocation;
    }

    public String getConnection() {
      return connection;
    }

    public void setConnection(String connection) {
      this.connection = connection;
    }

    public String getHostResource() {
      return hostResource;
    }

    public void setHostResource(String hostResource) {
      this.hostResource = hostResource;
    }

    public String getParent() {
      return parent;
    }

    public void setParent(String parent) {
      this.parent = parent;
    }

    public String getResourceSubType() {
      return resourceSubType;
    }

    public void setResourceSubType(String resourceSubType) {
      this.resourceSubType = resourceSubType;
    }
  }
}

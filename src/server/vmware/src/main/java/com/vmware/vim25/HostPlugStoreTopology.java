
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostPlugStoreTopology complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostPlugStoreTopology">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="adapter" type="{urn:internalvim25}HostPlugStoreTopologyAdapter" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="path" type="{urn:internalvim25}HostPlugStoreTopologyPath" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="target" type="{urn:internalvim25}HostPlugStoreTopologyTarget" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="device" type="{urn:internalvim25}HostPlugStoreTopologyDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="plugin" type="{urn:internalvim25}HostPlugStoreTopologyPlugin" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPlugStoreTopology", propOrder = {
    "adapter",
    "path",
    "target",
    "device",
    "plugin"
})
public class HostPlugStoreTopology
    extends DynamicData
{

    protected List<HostPlugStoreTopologyAdapter> adapter;
    protected List<HostPlugStoreTopologyPath> path;
    protected List<HostPlugStoreTopologyTarget> target;
    protected List<HostPlugStoreTopologyDevice> device;
    protected List<HostPlugStoreTopologyPlugin> plugin;

    /**
     * Gets the value of the adapter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adapter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAdapter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPlugStoreTopologyAdapter }
     * </p>
     * 
     * 
     * @return
     *     The value of the adapter property.
     */
    public List<HostPlugStoreTopologyAdapter> getAdapter() {
        if (adapter == null) {
            adapter = new ArrayList<>();
        }
        return this.adapter;
    }

    /**
     * Gets the value of the path property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the path property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPlugStoreTopologyPath }
     * </p>
     * 
     * 
     * @return
     *     The value of the path property.
     */
    public List<HostPlugStoreTopologyPath> getPath() {
        if (path == null) {
            path = new ArrayList<>();
        }
        return this.path;
    }

    /**
     * Gets the value of the target property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the target property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPlugStoreTopologyTarget }
     * </p>
     * 
     * 
     * @return
     *     The value of the target property.
     */
    public List<HostPlugStoreTopologyTarget> getTarget() {
        if (target == null) {
            target = new ArrayList<>();
        }
        return this.target;
    }

    /**
     * Gets the value of the device property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the device property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPlugStoreTopologyDevice }
     * </p>
     * 
     * 
     * @return
     *     The value of the device property.
     */
    public List<HostPlugStoreTopologyDevice> getDevice() {
        if (device == null) {
            device = new ArrayList<>();
        }
        return this.device;
    }

    /**
     * Gets the value of the plugin property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plugin property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPlugin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPlugStoreTopologyPlugin }
     * </p>
     * 
     * 
     * @return
     *     The value of the plugin property.
     */
    public List<HostPlugStoreTopologyPlugin> getPlugin() {
        if (plugin == null) {
            plugin = new ArrayList<>();
        }
        return this.plugin;
    }

}

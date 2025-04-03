
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanHostConfigInfoNetworkInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanHostConfigInfoNetworkInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="port" type="{urn:internalvim25}VsanHostConfigInfoNetworkInfoPortConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostConfigInfoNetworkInfo", propOrder = {
    "port"
})
public class VsanHostConfigInfoNetworkInfo
    extends DynamicData
{

    protected List<VsanHostConfigInfoNetworkInfoPortConfig> port;

    /**
     * Gets the value of the port property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the port property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VsanHostConfigInfoNetworkInfoPortConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the port property.
     */
    public List<VsanHostConfigInfoNetworkInfoPortConfig> getPort() {
        if (port == null) {
            port = new ArrayList<>();
        }
        return this.port;
    }

}

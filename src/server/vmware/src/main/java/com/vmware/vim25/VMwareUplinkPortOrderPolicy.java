
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareUplinkPortOrderPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareUplinkPortOrderPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InheritablePolicy">
 *       <sequence>
 *         <element name="activeUplinkPort" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="standbyUplinkPort" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareUplinkPortOrderPolicy", propOrder = {
    "activeUplinkPort",
    "standbyUplinkPort"
})
public class VMwareUplinkPortOrderPolicy
    extends InheritablePolicy
{

    protected List<String> activeUplinkPort;
    protected List<String> standbyUplinkPort;

    /**
     * Gets the value of the activeUplinkPort property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeUplinkPort property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getActiveUplinkPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the activeUplinkPort property.
     */
    public List<String> getActiveUplinkPort() {
        if (activeUplinkPort == null) {
            activeUplinkPort = new ArrayList<>();
        }
        return this.activeUplinkPort;
    }

    /**
     * Gets the value of the standbyUplinkPort property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standbyUplinkPort property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStandbyUplinkPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the standbyUplinkPort property.
     */
    public List<String> getStandbyUplinkPort() {
        if (standbyUplinkPort == null) {
            standbyUplinkPort = new ArrayList<>();
        }
        return this.standbyUplinkPort;
    }

}

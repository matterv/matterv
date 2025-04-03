
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostStorageElementInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostStorageElementInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostHardwareElementInfo">
 *       <sequence>
 *         <element name="operationalInfo" type="{urn:internalvim25}HostStorageOperationalInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostStorageElementInfo", propOrder = {
    "operationalInfo"
})
public class HostStorageElementInfo
    extends HostHardwareElementInfo
{

    protected List<HostStorageOperationalInfo> operationalInfo;

    /**
     * Gets the value of the operationalInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationalInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOperationalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostStorageOperationalInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the operationalInfo property.
     */
    public List<HostStorageOperationalInfo> getOperationalInfo() {
        if (operationalInfo == null) {
            operationalInfo = new ArrayList<>();
        }
        return this.operationalInfo;
    }

}

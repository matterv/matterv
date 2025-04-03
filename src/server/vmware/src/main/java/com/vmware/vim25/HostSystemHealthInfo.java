
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSystemHealthInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostSystemHealthInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="numericSensorInfo" type="{urn:internalvim25}HostNumericSensorInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSystemHealthInfo", propOrder = {
    "numericSensorInfo"
})
public class HostSystemHealthInfo
    extends DynamicData
{

    protected List<HostNumericSensorInfo> numericSensorInfo;

    /**
     * Gets the value of the numericSensorInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numericSensorInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNumericSensorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostNumericSensorInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the numericSensorInfo property.
     */
    public List<HostNumericSensorInfo> getNumericSensorInfo() {
        if (numericSensorInfo == null) {
            numericSensorInfo = new ArrayList<>();
        }
        return this.numericSensorInfo;
    }

}


package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VVolVmConfigFileUpdateResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VVolVmConfigFileUpdateResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="succeededVmConfigFile" type="{urn:internalvim25}KeyValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="failedVmConfigFile" type="{urn:internalvim25}VVolVmConfigFileUpdateResultFailedVmConfigFileInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VVolVmConfigFileUpdateResult", propOrder = {
    "succeededVmConfigFile",
    "failedVmConfigFile"
})
public class VVolVmConfigFileUpdateResult
    extends DynamicData
{

    protected List<KeyValue> succeededVmConfigFile;
    protected List<VVolVmConfigFileUpdateResultFailedVmConfigFileInfo> failedVmConfigFile;

    /**
     * Gets the value of the succeededVmConfigFile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the succeededVmConfigFile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSucceededVmConfigFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the succeededVmConfigFile property.
     */
    public List<KeyValue> getSucceededVmConfigFile() {
        if (succeededVmConfigFile == null) {
            succeededVmConfigFile = new ArrayList<>();
        }
        return this.succeededVmConfigFile;
    }

    /**
     * Gets the value of the failedVmConfigFile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failedVmConfigFile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFailedVmConfigFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VVolVmConfigFileUpdateResultFailedVmConfigFileInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the failedVmConfigFile property.
     */
    public List<VVolVmConfigFileUpdateResultFailedVmConfigFileInfo> getFailedVmConfigFile() {
        if (failedVmConfigFile == null) {
            failedVmConfigFile = new ArrayList<>();
        }
        return this.failedVmConfigFile;
    }

}

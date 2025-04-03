
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfCreateImportSpecResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfCreateImportSpecResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="importSpec" type="{urn:internalvim25}ImportSpec" minOccurs="0"/>
 *         <element name="fileItem" type="{urn:internalvim25}OvfFileItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="warning" type="{urn:internalvim25}LocalizedMethodFault" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="error" type="{urn:internalvim25}LocalizedMethodFault" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfCreateImportSpecResult", propOrder = {
    "importSpec",
    "fileItem",
    "warning",
    "error"
}
)
public class OvfCreateImportSpecResult
    extends DynamicData
{

    protected ImportSpec importSpec;
    protected List<OvfFileItem> fileItem;
    protected List<LocalizedMethodFault> warning;
    protected List<LocalizedMethodFault> error;

    /**
     * Gets the value of the importSpec property.
     * 
     * @return
     *     possible object is
     *     {@link ImportSpec }
     *     
     */
    public ImportSpec getImportSpec() {
        return importSpec;
    }

    /**
     * Sets the value of the importSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportSpec }
     *     
     */
    public void setImportSpec(ImportSpec value) {
        this.importSpec = value;
    }

    /**
     * Gets the value of the fileItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFileItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OvfFileItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the fileItem property.
     */
    public List<OvfFileItem> getFileItem() {
        if (fileItem == null) {
            fileItem = new ArrayList<>();
        }
        return this.fileItem;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizedMethodFault }
     * </p>
     * 
     * 
     * @return
     *     The value of the warning property.
     */
    public List<LocalizedMethodFault> getWarning() {
        if (warning == null) {
            warning = new ArrayList<>();
        }
        return this.warning;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizedMethodFault }
     * </p>
     * 
     * 
     * @return
     *     The value of the error property.
     */
    public List<LocalizedMethodFault> getError() {
        if (error == null) {
            error = new ArrayList<>();
        }
        return this.error;
    }

}


package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiskChangeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DiskChangeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="startOffset" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="length" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="changedArea" type="{urn:internalvim25}DiskChangeExtent" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiskChangeInfo", propOrder = {
    "startOffset",
    "length",
    "changedArea"
})
public class DiskChangeInfo
    extends DynamicData
{

    protected long startOffset;
    protected long length;
    protected List<DiskChangeExtent> changedArea;

    /**
     * Gets the value of the startOffset property.
     * 
     */
    public long getStartOffset() {
        return startOffset;
    }

    /**
     * Sets the value of the startOffset property.
     * 
     */
    public void setStartOffset(long value) {
        this.startOffset = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public long getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(long value) {
        this.length = value;
    }

    /**
     * Gets the value of the changedArea property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changedArea property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChangedArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiskChangeExtent }
     * </p>
     * 
     * 
     * @return
     *     The value of the changedArea property.
     */
    public List<DiskChangeExtent> getChangedArea() {
        if (changedArea == null) {
            changedArea = new ArrayList<>();
        }
        return this.changedArea;
    }

}


package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestListFileInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuestListFileInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="files" type="{urn:internalvim25}GuestFileInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="remaining" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestListFileInfo", propOrder = {
    "files",
    "remaining"
})
public class GuestListFileInfo
    extends DynamicData
{

    protected List<GuestFileInfo> files;
    protected int remaining;

    /**
     * Gets the value of the files property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the files property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestFileInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the files property.
     */
    public List<GuestFileInfo> getFiles() {
        if (files == null) {
            files = new ArrayList<>();
        }
        return this.files;
    }

    /**
     * Gets the value of the remaining property.
     * 
     */
    public int getRemaining() {
        return remaining;
    }

    /**
     * Sets the value of the remaining property.
     * 
     */
    public void setRemaining(int value) {
        this.remaining = value;
    }

}

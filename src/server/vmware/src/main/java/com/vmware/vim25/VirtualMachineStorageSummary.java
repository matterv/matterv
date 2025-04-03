
package com.vmware.vim25;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineStorageSummary complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineStorageSummary">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="committed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="uncommitted" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="unshared" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineStorageSummary", propOrder = {
    "committed",
    "uncommitted",
    "unshared",
    "timestamp"
})
public class VirtualMachineStorageSummary
    extends DynamicData
{

    protected long committed;
    protected long uncommitted;
    protected long unshared;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Gets the value of the committed property.
     * 
     */
    public long getCommitted() {
        return committed;
    }

    /**
     * Sets the value of the committed property.
     * 
     */
    public void setCommitted(long value) {
        this.committed = value;
    }

    /**
     * Gets the value of the uncommitted property.
     * 
     */
    public long getUncommitted() {
        return uncommitted;
    }

    /**
     * Sets the value of the uncommitted property.
     * 
     */
    public void setUncommitted(long value) {
        this.uncommitted = value;
    }

    /**
     * Gets the value of the unshared property.
     * 
     */
    public long getUnshared() {
        return unshared;
    }

    /**
     * Sets the value of the unshared property.
     * 
     */
    public void setUnshared(long value) {
        this.unshared = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}

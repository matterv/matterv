
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SnapshotRevertIssue complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SnapshotRevertIssue">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}MigrationFault">
 *       <sequence>
 *         <element name="snapshotName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="event" type="{urn:internalvim25}Event" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="errors" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnapshotRevertIssue", propOrder = {
    "snapshotName",
    "event",
    "errors"
})
public class SnapshotRevertIssue
    extends MigrationFault
{

    protected String snapshotName;
    protected List<Event> event;
    protected boolean errors;

    /**
     * Gets the value of the snapshotName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnapshotName() {
        return snapshotName;
    }

    /**
     * Sets the value of the snapshotName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnapshotName(String value) {
        this.snapshotName = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * </p>
     * 
     * 
     * @return
     *     The value of the event property.
     */
    public List<Event> getEvent() {
        if (event == null) {
            event = new ArrayList<>();
        }
        return this.event;
    }

    /**
     * Gets the value of the errors property.
     * 
     */
    public boolean isErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     */
    public void setErrors(boolean value) {
        this.errors = value;
    }

}

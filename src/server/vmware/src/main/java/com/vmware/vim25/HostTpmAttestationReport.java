
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostTpmAttestationReport complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostTpmAttestationReport">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="tpmPcrValues" type="{urn:internalvim25}HostTpmDigestInfo" maxOccurs="unbounded"/>
 *         <element name="tpmEvents" type="{urn:internalvim25}HostTpmEventLogEntry" maxOccurs="unbounded"/>
 *         <element name="tpmLogReliable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmAttestationReport", propOrder = {
    "tpmPcrValues",
    "tpmEvents",
    "tpmLogReliable"
})
public class HostTpmAttestationReport
    extends DynamicData
{

    @XmlElement(required = true)
    protected List<HostTpmDigestInfo> tpmPcrValues;
    @XmlElement(required = true)
    protected List<HostTpmEventLogEntry> tpmEvents;
    protected boolean tpmLogReliable;

    /**
     * Gets the value of the tpmPcrValues property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpmPcrValues property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTpmPcrValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostTpmDigestInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the tpmPcrValues property.
     */
    public List<HostTpmDigestInfo> getTpmPcrValues() {
        if (tpmPcrValues == null) {
            tpmPcrValues = new ArrayList<>();
        }
        return this.tpmPcrValues;
    }

    /**
     * Gets the value of the tpmEvents property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpmEvents property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTpmEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostTpmEventLogEntry }
     * </p>
     * 
     * 
     * @return
     *     The value of the tpmEvents property.
     */
    public List<HostTpmEventLogEntry> getTpmEvents() {
        if (tpmEvents == null) {
            tpmEvents = new ArrayList<>();
        }
        return this.tpmEvents;
    }

    /**
     * Gets the value of the tpmLogReliable property.
     * 
     */
    public boolean isTpmLogReliable() {
        return tpmLogReliable;
    }

    /**
     * Sets the value of the tpmLogReliable property.
     * 
     */
    public void setTpmLogReliable(boolean value) {
        this.tpmLogReliable = value;
    }

}

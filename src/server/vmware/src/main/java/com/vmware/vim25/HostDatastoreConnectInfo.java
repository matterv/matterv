
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDatastoreConnectInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostDatastoreConnectInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="summary" type="{urn:internalvim25}DatastoreSummary"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDatastoreConnectInfo", propOrder = {
    "summary"
})
@XmlSeeAlso({
    HostDatastoreExistsConnectInfo.class,
    HostDatastoreNameConflictConnectInfo.class
})
public class HostDatastoreConnectInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected DatastoreSummary summary;

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link DatastoreSummary }
     *     
     */
    public DatastoreSummary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatastoreSummary }
     *     
     */
    public void setSummary(DatastoreSummary value) {
        this.summary = value;
    }

}

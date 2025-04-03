
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDvsCheckCompatibilityRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="QueryDvsCheckCompatibilityRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="hostContainer" type="{urn:internalvim25}DistributedVirtualSwitchManagerHostContainer"/>
 *         <element name="dvsProductSpec" type="{urn:internalvim25}DistributedVirtualSwitchManagerDvsProductSpec" minOccurs="0"/>
 *         <element name="hostFilterSpec" type="{urn:internalvim25}DistributedVirtualSwitchManagerHostDvsFilterSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDvsCheckCompatibilityRequestType", propOrder = {
    "_this",
    "hostContainer",
    "dvsProductSpec",
    "hostFilterSpec"
})
public class QueryDvsCheckCompatibilityRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected DistributedVirtualSwitchManagerHostContainer hostContainer;
    protected DistributedVirtualSwitchManagerDvsProductSpec dvsProductSpec;
    protected List<DistributedVirtualSwitchManagerHostDvsFilterSpec> hostFilterSpec;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the hostContainer property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchManagerHostContainer }
     *     
     */
    public DistributedVirtualSwitchManagerHostContainer getHostContainer() {
        return hostContainer;
    }

    /**
     * Sets the value of the hostContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchManagerHostContainer }
     *     
     */
    public void setHostContainer(DistributedVirtualSwitchManagerHostContainer value) {
        this.hostContainer = value;
    }

    /**
     * Gets the value of the dvsProductSpec property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchManagerDvsProductSpec }
     *     
     */
    public DistributedVirtualSwitchManagerDvsProductSpec getDvsProductSpec() {
        return dvsProductSpec;
    }

    /**
     * Sets the value of the dvsProductSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchManagerDvsProductSpec }
     *     
     */
    public void setDvsProductSpec(DistributedVirtualSwitchManagerDvsProductSpec value) {
        this.dvsProductSpec = value;
    }

    /**
     * Gets the value of the hostFilterSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostFilterSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostFilterSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchManagerHostDvsFilterSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostFilterSpec property.
     */
    public List<DistributedVirtualSwitchManagerHostDvsFilterSpec> getHostFilterSpec() {
        if (hostFilterSpec == null) {
            hostFilterSpec = new ArrayList<>();
        }
        return this.hostFilterSpec;
    }

}

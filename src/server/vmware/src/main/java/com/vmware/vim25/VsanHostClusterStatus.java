
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanHostClusterStatus complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanHostClusterStatus">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nodeUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="health" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nodeState" type="{urn:internalvim25}VsanHostClusterStatusState"/>
 *         <element name="memberUuid" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostClusterStatus", propOrder = {
    "uuid",
    "nodeUuid",
    "health",
    "nodeState",
    "memberUuid"
})
public class VsanHostClusterStatus
    extends DynamicData
{

    protected String uuid;
    protected String nodeUuid;
    @XmlElement(required = true)
    protected String health;
    @XmlElement(required = true)
    protected VsanHostClusterStatusState nodeState;
    protected List<String> memberUuid;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the nodeUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeUuid() {
        return nodeUuid;
    }

    /**
     * Sets the value of the nodeUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeUuid(String value) {
        this.nodeUuid = value;
    }

    /**
     * Gets the value of the health property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealth() {
        return health;
    }

    /**
     * Sets the value of the health property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealth(String value) {
        this.health = value;
    }

    /**
     * Gets the value of the nodeState property.
     * 
     * @return
     *     possible object is
     *     {@link VsanHostClusterStatusState }
     *     
     */
    public VsanHostClusterStatusState getNodeState() {
        return nodeState;
    }

    /**
     * Sets the value of the nodeState property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsanHostClusterStatusState }
     *     
     */
    public void setNodeState(VsanHostClusterStatusState value) {
        this.nodeState = value;
    }

    /**
     * Gets the value of the memberUuid property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberUuid property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMemberUuid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the memberUuid property.
     */
    public List<String> getMemberUuid() {
        if (memberUuid == null) {
            memberUuid = new ArrayList<>();
        }
        return this.memberUuid;
    }

}

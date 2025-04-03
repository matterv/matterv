
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanHostRuntimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanHostRuntimeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="membershipList" type="{urn:internalvim25}VsanHostMembershipInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="diskIssues" type="{urn:internalvim25}VsanHostRuntimeInfoDiskIssue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="accessGenNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostRuntimeInfo", propOrder = {
    "membershipList",
    "diskIssues",
    "accessGenNo"
})
public class VsanHostRuntimeInfo
    extends DynamicData
{

    protected List<VsanHostMembershipInfo> membershipList;
    protected List<VsanHostRuntimeInfoDiskIssue> diskIssues;
    protected Integer accessGenNo;

    /**
     * Gets the value of the membershipList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membershipList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMembershipList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VsanHostMembershipInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the membershipList property.
     */
    public List<VsanHostMembershipInfo> getMembershipList() {
        if (membershipList == null) {
            membershipList = new ArrayList<>();
        }
        return this.membershipList;
    }

    /**
     * Gets the value of the diskIssues property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diskIssues property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDiskIssues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VsanHostRuntimeInfoDiskIssue }
     * </p>
     * 
     * 
     * @return
     *     The value of the diskIssues property.
     */
    public List<VsanHostRuntimeInfoDiskIssue> getDiskIssues() {
        if (diskIssues == null) {
            diskIssues = new ArrayList<>();
        }
        return this.diskIssues;
    }

    /**
     * Gets the value of the accessGenNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccessGenNo() {
        return accessGenNo;
    }

    /**
     * Sets the value of the accessGenNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccessGenNo(Integer value) {
        this.accessGenNo = value;
    }

}

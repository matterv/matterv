
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NvdimmSystemInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NvdimmSystemInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="summary" type="{urn:internalvim25}NvdimmSummary" minOccurs="0"/>
 *         <element name="dimms" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dimmInfo" type="{urn:internalvim25}NvdimmDimmInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="interleaveSet" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="iSetInfo" type="{urn:internalvim25}NvdimmInterleaveSetInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="namespace" type="{urn:internalvim25}NvdimmGuid" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="nsInfo" type="{urn:internalvim25}NvdimmNamespaceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="nsDetails" type="{urn:internalvim25}NvdimmNamespaceDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmSystemInfo", propOrder = {
    "summary",
    "dimms",
    "dimmInfo",
    "interleaveSet",
    "iSetInfo",
    "namespace",
    "nsInfo",
    "nsDetails"
})
public class NvdimmSystemInfo
    extends DynamicData
{

    protected NvdimmSummary summary;
    @XmlElement(type = Integer.class)
    protected List<Integer> dimms;
    protected List<NvdimmDimmInfo> dimmInfo;
    @XmlElement(type = Integer.class)
    protected List<Integer> interleaveSet;
    protected List<NvdimmInterleaveSetInfo> iSetInfo;
    protected List<NvdimmGuid> namespace;
    protected List<NvdimmNamespaceInfo> nsInfo;
    protected List<NvdimmNamespaceDetails> nsDetails;

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link NvdimmSummary }
     *     
     */
    public NvdimmSummary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link NvdimmSummary }
     *     
     */
    public void setSummary(NvdimmSummary value) {
        this.summary = value;
    }

    /**
     * Gets the value of the dimms property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimms property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDimms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the dimms property.
     */
    public List<Integer> getDimms() {
        if (dimms == null) {
            dimms = new ArrayList<>();
        }
        return this.dimms;
    }

    /**
     * Gets the value of the dimmInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimmInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDimmInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NvdimmDimmInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the dimmInfo property.
     */
    public List<NvdimmDimmInfo> getDimmInfo() {
        if (dimmInfo == null) {
            dimmInfo = new ArrayList<>();
        }
        return this.dimmInfo;
    }

    /**
     * Gets the value of the interleaveSet property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interleaveSet property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInterleaveSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the interleaveSet property.
     */
    public List<Integer> getInterleaveSet() {
        if (interleaveSet == null) {
            interleaveSet = new ArrayList<>();
        }
        return this.interleaveSet;
    }

    /**
     * Gets the value of the iSetInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iSetInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getISetInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NvdimmInterleaveSetInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the iSetInfo property.
     */
    public List<NvdimmInterleaveSetInfo> getISetInfo() {
        if (iSetInfo == null) {
            iSetInfo = new ArrayList<>();
        }
        return this.iSetInfo;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namespace property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNamespace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NvdimmGuid }
     * </p>
     * 
     * 
     * @return
     *     The value of the namespace property.
     */
    public List<NvdimmGuid> getNamespace() {
        if (namespace == null) {
            namespace = new ArrayList<>();
        }
        return this.namespace;
    }

    /**
     * Gets the value of the nsInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NvdimmNamespaceInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the nsInfo property.
     */
    public List<NvdimmNamespaceInfo> getNsInfo() {
        if (nsInfo == null) {
            nsInfo = new ArrayList<>();
        }
        return this.nsInfo;
    }

    /**
     * Gets the value of the nsDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NvdimmNamespaceDetails }
     * </p>
     * 
     * 
     * @return
     *     The value of the nsDetails property.
     */
    public List<NvdimmNamespaceDetails> getNsDetails() {
        if (nsDetails == null) {
            nsDetails = new ArrayList<>();
        }
        return this.nsDetails;
    }

}

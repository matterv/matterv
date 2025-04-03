
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="id" type="{urn:internalvim25}ID"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="keepAfterDeleteVm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="relocationDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="nativeSnapshotSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="changedBlockTrackingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="backing" type="{urn:internalvim25}BaseConfigInfoBackingInfo"/>
 *         <element name="metadata" type="{urn:internalvim25}KeyValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vclock" type="{urn:internalvim25}vslmVClockInfo" minOccurs="0"/>
 *         <element name="iofilter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseConfigInfo", propOrder = {
    "id",
    "name",
    "createTime",
    "keepAfterDeleteVm",
    "relocationDisabled",
    "nativeSnapshotSupported",
    "changedBlockTrackingEnabled",
    "backing",
    "metadata",
    "vclock",
    "iofilter"
})
@XmlSeeAlso({
    VStorageObjectConfigInfo.class
})
public class BaseConfigInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected ID id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    protected Boolean keepAfterDeleteVm;
    protected Boolean relocationDisabled;
    protected Boolean nativeSnapshotSupported;
    protected Boolean changedBlockTrackingEnabled;
    @XmlElement(required = true)
    protected BaseConfigInfoBackingInfo backing;
    protected List<KeyValue> metadata;
    protected VslmVClockInfo vclock;
    protected List<String> iofilter;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setId(ID value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the keepAfterDeleteVm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepAfterDeleteVm() {
        return keepAfterDeleteVm;
    }

    /**
     * Sets the value of the keepAfterDeleteVm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepAfterDeleteVm(Boolean value) {
        this.keepAfterDeleteVm = value;
    }

    /**
     * Gets the value of the relocationDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelocationDisabled() {
        return relocationDisabled;
    }

    /**
     * Sets the value of the relocationDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelocationDisabled(Boolean value) {
        this.relocationDisabled = value;
    }

    /**
     * Gets the value of the nativeSnapshotSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNativeSnapshotSupported() {
        return nativeSnapshotSupported;
    }

    /**
     * Sets the value of the nativeSnapshotSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNativeSnapshotSupported(Boolean value) {
        this.nativeSnapshotSupported = value;
    }

    /**
     * Gets the value of the changedBlockTrackingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangedBlockTrackingEnabled() {
        return changedBlockTrackingEnabled;
    }

    /**
     * Sets the value of the changedBlockTrackingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangedBlockTrackingEnabled(Boolean value) {
        this.changedBlockTrackingEnabled = value;
    }

    /**
     * Gets the value of the backing property.
     * 
     * @return
     *     possible object is
     *     {@link BaseConfigInfoBackingInfo }
     *     
     */
    public BaseConfigInfoBackingInfo getBacking() {
        return backing;
    }

    /**
     * Sets the value of the backing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseConfigInfoBackingInfo }
     *     
     */
    public void setBacking(BaseConfigInfoBackingInfo value) {
        this.backing = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadata property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the metadata property.
     */
    public List<KeyValue> getMetadata() {
        if (metadata == null) {
            metadata = new ArrayList<>();
        }
        return this.metadata;
    }

    /**
     * Gets the value of the vclock property.
     * 
     * @return
     *     possible object is
     *     {@link VslmVClockInfo }
     *     
     */
    public VslmVClockInfo getVclock() {
        return vclock;
    }

    /**
     * Sets the value of the vclock property.
     * 
     * @param value
     *     allowed object is
     *     {@link VslmVClockInfo }
     *     
     */
    public void setVclock(VslmVClockInfo value) {
        this.vclock = value;
    }

    /**
     * Gets the value of the iofilter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iofilter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIofilter().add(newItem);
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
     *     The value of the iofilter property.
     */
    public List<String> getIofilter() {
        if (iofilter == null) {
            iofilter = new ArrayList<>();
        }
        return this.iofilter;
    }

}

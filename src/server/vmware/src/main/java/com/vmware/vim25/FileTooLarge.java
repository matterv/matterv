
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileTooLarge complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FileTooLarge">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}FileFault">
 *       <sequence>
 *         <element name="datastore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="maxFileSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileTooLarge", propOrder = {
    "datastore",
    "fileSize",
    "maxFileSize"
})
public class FileTooLarge
    extends FileFault
{

    @XmlElement(required = true)
    protected String datastore;
    protected long fileSize;
    protected Long maxFileSize;

    /**
     * Gets the value of the datastore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatastore() {
        return datastore;
    }

    /**
     * Sets the value of the datastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatastore(String value) {
        this.datastore = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     */
    public long getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     */
    public void setFileSize(long value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the maxFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxFileSize() {
        return maxFileSize;
    }

    /**
     * Sets the value of the maxFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxFileSize(Long value) {
        this.maxFileSize = value;
    }

}

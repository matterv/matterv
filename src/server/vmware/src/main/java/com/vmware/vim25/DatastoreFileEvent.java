
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatastoreFileEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DatastoreFileEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DatastoreEvent">
 *       <sequence>
 *         <element name="targetFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sourceOfOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="succeeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreFileEvent", propOrder = {
    "targetFile",
    "sourceOfOperation",
    "succeeded"
})
@XmlSeeAlso({
    DatastoreFileCopiedEvent.class,
    DatastoreFileMovedEvent.class,
    DatastoreFileDeletedEvent.class
})
public class DatastoreFileEvent
    extends DatastoreEvent
{

    @XmlElement(required = true)
    protected String targetFile;
    protected String sourceOfOperation;
    protected Boolean succeeded;

    /**
     * Gets the value of the targetFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetFile() {
        return targetFile;
    }

    /**
     * Sets the value of the targetFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetFile(String value) {
        this.targetFile = value;
    }

    /**
     * Gets the value of the sourceOfOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfOperation() {
        return sourceOfOperation;
    }

    /**
     * Sets the value of the sourceOfOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfOperation(String value) {
        this.sourceOfOperation = value;
    }

    /**
     * Gets the value of the succeeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSucceeded() {
        return succeeded;
    }

    /**
     * Sets the value of the succeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSucceeded(Boolean value) {
        this.succeeded = value;
    }

}


package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScsiLunDurableName complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ScsiLunDurableName">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="namespace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="namespaceId" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         <element name="data" type="{http://www.w3.org/2001/XMLSchema}byte" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScsiLunDurableName", propOrder = {
    "namespace",
    "namespaceId",
    "data"
})
public class ScsiLunDurableName
    extends DynamicData
{

    @XmlElement(required = true)
    protected String namespace;
    protected byte namespaceId;
    @XmlElement(type = Byte.class)
    protected List<Byte> data;

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the namespaceId property.
     * 
     */
    public byte getNamespaceId() {
        return namespaceId;
    }

    /**
     * Sets the value of the namespaceId property.
     * 
     */
    public void setNamespaceId(byte value) {
        this.namespaceId = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Byte }
     * </p>
     * 
     * 
     * @return
     *     The value of the data property.
     */
    public List<Byte> getData() {
        if (data == null) {
            data = new ArrayList<>();
        }
        return this.data;
    }

}


package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GatewayToHostAuthFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GatewayToHostAuthFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}GatewayToHostConnectFault">
 *       <sequence>
 *         <element name="invalidProperties" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="missingProperties" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GatewayToHostAuthFault", propOrder = {
    "invalidProperties",
    "missingProperties"
})
public class GatewayToHostAuthFault
    extends GatewayToHostConnectFault
{

    @XmlElement(required = true)
    protected List<String> invalidProperties;
    @XmlElement(required = true)
    protected List<String> missingProperties;

    /**
     * Gets the value of the invalidProperties property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invalidProperties property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInvalidProperties().add(newItem);
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
     *     The value of the invalidProperties property.
     */
    public List<String> getInvalidProperties() {
        if (invalidProperties == null) {
            invalidProperties = new ArrayList<>();
        }
        return this.invalidProperties;
    }

    /**
     * Gets the value of the missingProperties property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missingProperties property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMissingProperties().add(newItem);
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
     *     The value of the missingProperties property.
     */
    public List<String> getMissingProperties() {
        if (missingProperties == null) {
            missingProperties = new ArrayList<>();
        }
        return this.missingProperties;
    }

}

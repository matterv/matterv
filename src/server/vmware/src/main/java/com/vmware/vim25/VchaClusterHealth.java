
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VchaClusterHealth complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VchaClusterHealth">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="runtimeInfo" type="{urn:internalvim25}VchaClusterRuntimeInfo"/>
 *         <element name="healthMessages" type="{urn:internalvim25}LocalizableMessage" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="additionalInformation" type="{urn:internalvim25}LocalizableMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VchaClusterHealth", propOrder = {
    "runtimeInfo",
    "healthMessages",
    "additionalInformation"
})
public class VchaClusterHealth
    extends DynamicData
{

    @XmlElement(required = true)
    protected VchaClusterRuntimeInfo runtimeInfo;
    protected List<LocalizableMessage> healthMessages;
    protected List<LocalizableMessage> additionalInformation;

    /**
     * Gets the value of the runtimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VchaClusterRuntimeInfo }
     *     
     */
    public VchaClusterRuntimeInfo getRuntimeInfo() {
        return runtimeInfo;
    }

    /**
     * Sets the value of the runtimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VchaClusterRuntimeInfo }
     *     
     */
    public void setRuntimeInfo(VchaClusterRuntimeInfo value) {
        this.runtimeInfo = value;
    }

    /**
     * Gets the value of the healthMessages property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthMessages property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHealthMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizableMessage }
     * </p>
     * 
     * 
     * @return
     *     The value of the healthMessages property.
     */
    public List<LocalizableMessage> getHealthMessages() {
        if (healthMessages == null) {
            healthMessages = new ArrayList<>();
        }
        return this.healthMessages;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizableMessage }
     * </p>
     * 
     * 
     * @return
     *     The value of the additionalInformation property.
     */
    public List<LocalizableMessage> getAdditionalInformation() {
        if (additionalInformation == null) {
            additionalInformation = new ArrayList<>();
        }
        return this.additionalInformation;
    }

}

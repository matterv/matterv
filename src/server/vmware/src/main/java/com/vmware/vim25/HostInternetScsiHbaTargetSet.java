
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostInternetScsiHbaTargetSet complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostInternetScsiHbaTargetSet">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="staticTargets" type="{urn:internalvim25}HostInternetScsiHbaStaticTarget" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="sendTargets" type="{urn:internalvim25}HostInternetScsiHbaSendTarget" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaTargetSet", propOrder = {
    "staticTargets",
    "sendTargets"
})
public class HostInternetScsiHbaTargetSet
    extends DynamicData
{

    protected List<HostInternetScsiHbaStaticTarget> staticTargets;
    protected List<HostInternetScsiHbaSendTarget> sendTargets;

    /**
     * Gets the value of the staticTargets property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staticTargets property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStaticTargets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostInternetScsiHbaStaticTarget }
     * </p>
     * 
     * 
     * @return
     *     The value of the staticTargets property.
     */
    public List<HostInternetScsiHbaStaticTarget> getStaticTargets() {
        if (staticTargets == null) {
            staticTargets = new ArrayList<>();
        }
        return this.staticTargets;
    }

    /**
     * Gets the value of the sendTargets property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sendTargets property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSendTargets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostInternetScsiHbaSendTarget }
     * </p>
     * 
     * 
     * @return
     *     The value of the sendTargets property.
     */
    public List<HostInternetScsiHbaSendTarget> getSendTargets() {
        if (sendTargets == null) {
            sendTargets = new ArrayList<>();
        }
        return this.sendTargets;
    }

}

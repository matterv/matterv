
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostFibreChannelOverEthernetHba complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostFibreChannelOverEthernetHba">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostFibreChannelHba">
 *       <sequence>
 *         <element name="underlyingNic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="linkInfo" type="{urn:internalvim25}HostFibreChannelOverEthernetHbaLinkInfo"/>
 *         <element name="isSoftwareFcoe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="markedForRemoval" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFibreChannelOverEthernetHba", propOrder = {
    "underlyingNic",
    "linkInfo",
    "isSoftwareFcoe",
    "markedForRemoval"
})
public class HostFibreChannelOverEthernetHba
    extends HostFibreChannelHba
{

    @XmlElement(required = true)
    protected String underlyingNic;
    @XmlElement(required = true)
    protected HostFibreChannelOverEthernetHbaLinkInfo linkInfo;
    protected boolean isSoftwareFcoe;
    protected Boolean markedForRemoval;

    /**
     * Gets the value of the underlyingNic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderlyingNic() {
        return underlyingNic;
    }

    /**
     * Sets the value of the underlyingNic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderlyingNic(String value) {
        this.underlyingNic = value;
    }

    /**
     * Gets the value of the linkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostFibreChannelOverEthernetHbaLinkInfo }
     *     
     */
    public HostFibreChannelOverEthernetHbaLinkInfo getLinkInfo() {
        return linkInfo;
    }

    /**
     * Sets the value of the linkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostFibreChannelOverEthernetHbaLinkInfo }
     *     
     */
    public void setLinkInfo(HostFibreChannelOverEthernetHbaLinkInfo value) {
        this.linkInfo = value;
    }

    /**
     * Gets the value of the isSoftwareFcoe property.
     * 
     */
    public boolean isIsSoftwareFcoe() {
        return isSoftwareFcoe;
    }

    /**
     * Sets the value of the isSoftwareFcoe property.
     * 
     */
    public void setIsSoftwareFcoe(boolean value) {
        this.isSoftwareFcoe = value;
    }

    /**
     * Gets the value of the markedForRemoval property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkedForRemoval() {
        return markedForRemoval;
    }

    /**
     * Sets the value of the markedForRemoval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkedForRemoval(Boolean value) {
        this.markedForRemoval = value;
    }

}

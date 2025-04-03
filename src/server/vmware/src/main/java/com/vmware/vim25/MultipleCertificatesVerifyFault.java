
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultipleCertificatesVerifyFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MultipleCertificatesVerifyFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostConnectFault">
 *       <sequence>
 *         <element name="thumbprintData" type="{urn:internalvim25}MultipleCertificatesVerifyFaultThumbprintData" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleCertificatesVerifyFault", propOrder = {
    "thumbprintData"
})
public class MultipleCertificatesVerifyFault
    extends HostConnectFault
{

    @XmlElement(required = true)
    protected List<MultipleCertificatesVerifyFaultThumbprintData> thumbprintData;

    /**
     * Gets the value of the thumbprintData property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thumbprintData property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getThumbprintData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultipleCertificatesVerifyFaultThumbprintData }
     * </p>
     * 
     * 
     * @return
     *     The value of the thumbprintData property.
     */
    public List<MultipleCertificatesVerifyFaultThumbprintData> getThumbprintData() {
        if (thumbprintData == null) {
            thumbprintData = new ArrayList<>();
        }
        return this.thumbprintData;
    }

}

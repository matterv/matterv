
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsPortReconfiguredEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsPortReconfiguredEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsEvent">
 *       <sequence>
 *         <element name="portKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="configChanges" type="{urn:internalvim25}ChangesInfoEventArgument" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsPortReconfiguredEvent", propOrder = {
    "portKey",
    "configChanges"
})
public class DvsPortReconfiguredEvent
    extends DvsEvent
{

    @XmlElement(required = true)
    protected List<String> portKey;
    protected List<ChangesInfoEventArgument> configChanges;

    /**
     * Gets the value of the portKey property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portKey property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPortKey().add(newItem);
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
     *     The value of the portKey property.
     */
    public List<String> getPortKey() {
        if (portKey == null) {
            portKey = new ArrayList<>();
        }
        return this.portKey;
    }

    /**
     * Gets the value of the configChanges property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configChanges property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConfigChanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangesInfoEventArgument }
     * </p>
     * 
     * 
     * @return
     *     The value of the configChanges property.
     */
    public List<ChangesInfoEventArgument> getConfigChanges() {
        if (configChanges == null) {
            configChanges = new ArrayList<>();
        }
        return this.configChanges;
    }

}

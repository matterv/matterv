
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutOfSyncDvsHost complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OutOfSyncDvsHost">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsEvent">
 *       <sequence>
 *         <element name="hostOutOfSync" type="{urn:internalvim25}DvsOutOfSyncHostArgument" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutOfSyncDvsHost", propOrder = {
    "hostOutOfSync"
})
public class OutOfSyncDvsHost
    extends DvsEvent
{

    @XmlElement(required = true)
    protected List<DvsOutOfSyncHostArgument> hostOutOfSync;

    /**
     * Gets the value of the hostOutOfSync property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostOutOfSync property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostOutOfSync().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DvsOutOfSyncHostArgument }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostOutOfSync property.
     */
    public List<DvsOutOfSyncHostArgument> getHostOutOfSync() {
        if (hostOutOfSync == null) {
            hostOutOfSync = new ArrayList<>();
        }
        return this.hostOutOfSync;
    }

}

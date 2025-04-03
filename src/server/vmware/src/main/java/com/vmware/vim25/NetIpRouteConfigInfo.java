
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetIpRouteConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NetIpRouteConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="ipRoute" type="{urn:internalvim25}NetIpRouteConfigInfoIpRoute" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetIpRouteConfigInfo", propOrder = {
    "ipRoute"
})
public class NetIpRouteConfigInfo
    extends DynamicData
{

    protected List<NetIpRouteConfigInfoIpRoute> ipRoute;

    /**
     * Gets the value of the ipRoute property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipRoute property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIpRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetIpRouteConfigInfoIpRoute }
     * </p>
     * 
     * 
     * @return
     *     The value of the ipRoute property.
     */
    public List<NetIpRouteConfigInfoIpRoute> getIpRoute() {
        if (ipRoute == null) {
            ipRoute = new ArrayList<>();
        }
        return this.ipRoute;
    }

}

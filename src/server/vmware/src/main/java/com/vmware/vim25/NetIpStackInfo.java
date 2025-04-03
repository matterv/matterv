
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetIpStackInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NetIpStackInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="neighbor" type="{urn:internalvim25}NetIpStackInfoNetToMedia" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="defaultRouter" type="{urn:internalvim25}NetIpStackInfoDefaultRouter" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetIpStackInfo", propOrder = {
    "neighbor",
    "defaultRouter"
})
public class NetIpStackInfo
    extends DynamicData
{

    protected List<NetIpStackInfoNetToMedia> neighbor;
    protected List<NetIpStackInfoDefaultRouter> defaultRouter;

    /**
     * Gets the value of the neighbor property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neighbor property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNeighbor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetIpStackInfoNetToMedia }
     * </p>
     * 
     * 
     * @return
     *     The value of the neighbor property.
     */
    public List<NetIpStackInfoNetToMedia> getNeighbor() {
        if (neighbor == null) {
            neighbor = new ArrayList<>();
        }
        return this.neighbor;
    }

    /**
     * Gets the value of the defaultRouter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultRouter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDefaultRouter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetIpStackInfoDefaultRouter }
     * </p>
     * 
     * 
     * @return
     *     The value of the defaultRouter property.
     */
    public List<NetIpStackInfoDefaultRouter> getDefaultRouter() {
        if (defaultRouter == null) {
            defaultRouter = new ArrayList<>();
        }
        return this.defaultRouter;
    }

}


package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterMigrationAction complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterMigrationAction">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterAction">
 *       <sequence>
 *         <element name="drsMigration" type="{urn:internalvim25}ClusterDrsMigration" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterMigrationAction", propOrder = {
    "drsMigration"
})
public class ClusterMigrationAction
    extends ClusterAction
{

    protected ClusterDrsMigration drsMigration;

    /**
     * Gets the value of the drsMigration property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDrsMigration }
     *     
     */
    public ClusterDrsMigration getDrsMigration() {
        return drsMigration;
    }

    /**
     * Sets the value of the drsMigration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDrsMigration }
     *     
     */
    public void setDrsMigration(ClusterDrsMigration value) {
        this.drsMigration = value;
    }

}

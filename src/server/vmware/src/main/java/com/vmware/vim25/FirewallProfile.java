
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirewallProfile complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FirewallProfile">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ApplyProfile">
 *       <sequence>
 *         <element name="ruleset" type="{urn:internalvim25}FirewallProfileRulesetProfile" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirewallProfile", propOrder = {
    "ruleset"
})
public class FirewallProfile
    extends ApplyProfile
{

    protected List<FirewallProfileRulesetProfile> ruleset;

    /**
     * Gets the value of the ruleset property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleset property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRuleset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FirewallProfileRulesetProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the ruleset property.
     */
    public List<FirewallProfileRulesetProfile> getRuleset() {
        if (ruleset == null) {
            ruleset = new ArrayList<>();
        }
        return this.ruleset;
    }

}


package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInputRequiredParameterMetadata complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UserInputRequiredParameterMetadata">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ProfilePolicyOptionMetadata">
 *       <sequence>
 *         <element name="userInputParameter" type="{urn:internalvim25}ProfileParameterMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInputRequiredParameterMetadata", propOrder = {
    "userInputParameter"
})
public class UserInputRequiredParameterMetadata
    extends ProfilePolicyOptionMetadata
{

    protected List<ProfileParameterMetadata> userInputParameter;

    /**
     * Gets the value of the userInputParameter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userInputParameter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUserInputParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileParameterMetadata }
     * </p>
     * 
     * 
     * @return
     *     The value of the userInputParameter property.
     */
    public List<ProfileParameterMetadata> getUserInputParameter() {
        if (userInputParameter == null) {
            userInputParameter = new ArrayList<>();
        }
        return this.userInputParameter;
    }

}

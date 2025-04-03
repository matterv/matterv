
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayUpdateSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayUpdateSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="operation" type="{urn:internalvim25}ArrayUpdateOperation"/>
 *         <element name="removeKey" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayUpdateSpec", propOrder = {
    "operation",
    "removeKey"
})
@XmlSeeAlso({
    ClusterDasVmConfigSpec.class,
    ClusterDrsVmConfigSpec.class,
    ClusterDpmHostConfigSpec.class,
    ClusterGroupSpec.class,
    ClusterVmOrchestrationSpec.class,
    ClusterPreemptibleVmPairSpec.class,
    ClusterRuleSpec.class,
    ClusterDatastoreUpdateSpec.class,
    ClusterTagCategoryUpdateSpec.class,
    StorageDrsVmConfigSpec.class,
    StorageDrsOptionSpec.class,
    VAppProductSpec.class,
    VAppPropertySpec.class,
    VAppOvfSectionSpec.class,
    VirtualMachineCpuIdInfoSpec.class
})
public class ArrayUpdateSpec
    extends DynamicData
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ArrayUpdateOperation operation;
    protected Object removeKey;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayUpdateOperation }
     *     
     */
    public ArrayUpdateOperation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayUpdateOperation }
     *     
     */
    public void setOperation(ArrayUpdateOperation value) {
        this.operation = value;
    }

    /**
     * Gets the value of the removeKey property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRemoveKey() {
        return removeKey;
    }

    /**
     * Sets the value of the removeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRemoveKey(Object value) {
        this.removeKey = value;
    }

}

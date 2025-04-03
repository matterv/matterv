
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosticManagerLogHeader complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DiagnosticManagerLogHeader">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="lineStart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="lineEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="lineText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticManagerLogHeader", propOrder = {
    "lineStart",
    "lineEnd",
    "lineText"
})
public class DiagnosticManagerLogHeader
    extends DynamicData
{

    protected int lineStart;
    protected int lineEnd;
    protected List<String> lineText;

    /**
     * Gets the value of the lineStart property.
     * 
     */
    public int getLineStart() {
        return lineStart;
    }

    /**
     * Sets the value of the lineStart property.
     * 
     */
    public void setLineStart(int value) {
        this.lineStart = value;
    }

    /**
     * Gets the value of the lineEnd property.
     * 
     */
    public int getLineEnd() {
        return lineEnd;
    }

    /**
     * Sets the value of the lineEnd property.
     * 
     */
    public void setLineEnd(int value) {
        this.lineEnd = value;
    }

    /**
     * Gets the value of the lineText property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineText property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLineText().add(newItem);
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
     *     The value of the lineText property.
     */
    public List<String> getLineText() {
        if (lineText == null) {
            lineText = new ArrayList<>();
        }
        return this.lineText;
    }

}

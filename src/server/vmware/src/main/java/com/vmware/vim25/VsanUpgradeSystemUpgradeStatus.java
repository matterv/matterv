
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanUpgradeSystemUpgradeStatus complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanUpgradeSystemUpgradeStatus">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="inProgress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="history" type="{urn:internalvim25}VsanUpgradeSystemUpgradeHistoryItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="aborted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="completed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="progress" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemUpgradeStatus", propOrder = {
    "inProgress",
    "history",
    "aborted",
    "completed",
    "progress"
})
public class VsanUpgradeSystemUpgradeStatus
    extends DynamicData
{

    protected boolean inProgress;
    protected List<VsanUpgradeSystemUpgradeHistoryItem> history;
    protected Boolean aborted;
    protected Boolean completed;
    protected Integer progress;

    /**
     * Gets the value of the inProgress property.
     * 
     */
    public boolean isInProgress() {
        return inProgress;
    }

    /**
     * Sets the value of the inProgress property.
     * 
     */
    public void setInProgress(boolean value) {
        this.inProgress = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the history property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VsanUpgradeSystemUpgradeHistoryItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the history property.
     */
    public List<VsanUpgradeSystemUpgradeHistoryItem> getHistory() {
        if (history == null) {
            history = new ArrayList<>();
        }
        return this.history;
    }

    /**
     * Gets the value of the aborted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAborted() {
        return aborted;
    }

    /**
     * Sets the value of the aborted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAborted(Boolean value) {
        this.aborted = value;
    }

    /**
     * Gets the value of the completed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompleted() {
        return completed;
    }

    /**
     * Sets the value of the completed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompleted(Boolean value) {
        this.completed = value;
    }

    /**
     * Gets the value of the progress property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * Sets the value of the progress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgress(Integer value) {
        this.progress = value;
    }

}


package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoragePerformanceSummary complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StoragePerformanceSummary">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="interval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="percentile" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *         <element name="datastoreReadLatency" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded"/>
 *         <element name="datastoreWriteLatency" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded"/>
 *         <element name="datastoreVmLatency" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded"/>
 *         <element name="datastoreReadIops" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded"/>
 *         <element name="datastoreWriteIops" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded"/>
 *         <element name="siocActivityDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoragePerformanceSummary", propOrder = {
    "interval",
    "percentile",
    "datastoreReadLatency",
    "datastoreWriteLatency",
    "datastoreVmLatency",
    "datastoreReadIops",
    "datastoreWriteIops",
    "siocActivityDuration"
})
public class StoragePerformanceSummary
    extends DynamicData
{

    protected int interval;
    @XmlElement(type = Integer.class)
    protected List<Integer> percentile;
    @XmlElement(type = Double.class)
    protected List<Double> datastoreReadLatency;
    @XmlElement(type = Double.class)
    protected List<Double> datastoreWriteLatency;
    @XmlElement(type = Double.class)
    protected List<Double> datastoreVmLatency;
    @XmlElement(type = Double.class)
    protected List<Double> datastoreReadIops;
    @XmlElement(type = Double.class)
    protected List<Double> datastoreWriteIops;
    protected int siocActivityDuration;

    /**
     * Gets the value of the interval property.
     * 
     */
    public int getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     */
    public void setInterval(int value) {
        this.interval = value;
    }

    /**
     * Gets the value of the percentile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the percentile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPercentile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the percentile property.
     */
    public List<Integer> getPercentile() {
        if (percentile == null) {
            percentile = new ArrayList<>();
        }
        return this.percentile;
    }

    /**
     * Gets the value of the datastoreReadLatency property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datastoreReadLatency property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDatastoreReadLatency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * </p>
     * 
     * 
     * @return
     *     The value of the datastoreReadLatency property.
     */
    public List<Double> getDatastoreReadLatency() {
        if (datastoreReadLatency == null) {
            datastoreReadLatency = new ArrayList<>();
        }
        return this.datastoreReadLatency;
    }

    /**
     * Gets the value of the datastoreWriteLatency property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datastoreWriteLatency property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDatastoreWriteLatency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * </p>
     * 
     * 
     * @return
     *     The value of the datastoreWriteLatency property.
     */
    public List<Double> getDatastoreWriteLatency() {
        if (datastoreWriteLatency == null) {
            datastoreWriteLatency = new ArrayList<>();
        }
        return this.datastoreWriteLatency;
    }

    /**
     * Gets the value of the datastoreVmLatency property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datastoreVmLatency property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDatastoreVmLatency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * </p>
     * 
     * 
     * @return
     *     The value of the datastoreVmLatency property.
     */
    public List<Double> getDatastoreVmLatency() {
        if (datastoreVmLatency == null) {
            datastoreVmLatency = new ArrayList<>();
        }
        return this.datastoreVmLatency;
    }

    /**
     * Gets the value of the datastoreReadIops property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datastoreReadIops property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDatastoreReadIops().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * </p>
     * 
     * 
     * @return
     *     The value of the datastoreReadIops property.
     */
    public List<Double> getDatastoreReadIops() {
        if (datastoreReadIops == null) {
            datastoreReadIops = new ArrayList<>();
        }
        return this.datastoreReadIops;
    }

    /**
     * Gets the value of the datastoreWriteIops property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datastoreWriteIops property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDatastoreWriteIops().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * </p>
     * 
     * 
     * @return
     *     The value of the datastoreWriteIops property.
     */
    public List<Double> getDatastoreWriteIops() {
        if (datastoreWriteIops == null) {
            datastoreWriteIops = new ArrayList<>();
        }
        return this.datastoreWriteIops;
    }

    /**
     * Gets the value of the siocActivityDuration property.
     * 
     */
    public int getSiocActivityDuration() {
        return siocActivityDuration;
    }

    /**
     * Sets the value of the siocActivityDuration property.
     * 
     */
    public void setSiocActivityDuration(int value) {
        this.siocActivityDuration = value;
    }

}

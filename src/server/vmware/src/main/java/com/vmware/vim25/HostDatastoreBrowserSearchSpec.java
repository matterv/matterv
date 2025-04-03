
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDatastoreBrowserSearchSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostDatastoreBrowserSearchSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="query" type="{urn:internalvim25}FileQuery" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="details" type="{urn:internalvim25}FileQueryFlags" minOccurs="0"/>
 *         <element name="searchCaseInsensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="matchPattern" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="sortFoldersFirst" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDatastoreBrowserSearchSpec", propOrder = {
    "query",
    "details",
    "searchCaseInsensitive",
    "matchPattern",
    "sortFoldersFirst"
})
public class HostDatastoreBrowserSearchSpec
    extends DynamicData
{

    protected List<FileQuery> query;
    protected FileQueryFlags details;
    protected Boolean searchCaseInsensitive;
    protected List<String> matchPattern;
    protected Boolean sortFoldersFirst;

    /**
     * Gets the value of the query property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the query property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileQuery }
     * </p>
     * 
     * 
     * @return
     *     The value of the query property.
     */
    public List<FileQuery> getQuery() {
        if (query == null) {
            query = new ArrayList<>();
        }
        return this.query;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link FileQueryFlags }
     *     
     */
    public FileQueryFlags getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileQueryFlags }
     *     
     */
    public void setDetails(FileQueryFlags value) {
        this.details = value;
    }

    /**
     * Gets the value of the searchCaseInsensitive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchCaseInsensitive() {
        return searchCaseInsensitive;
    }

    /**
     * Sets the value of the searchCaseInsensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchCaseInsensitive(Boolean value) {
        this.searchCaseInsensitive = value;
    }

    /**
     * Gets the value of the matchPattern property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchPattern property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMatchPattern().add(newItem);
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
     *     The value of the matchPattern property.
     */
    public List<String> getMatchPattern() {
        if (matchPattern == null) {
            matchPattern = new ArrayList<>();
        }
        return this.matchPattern;
    }

    /**
     * Gets the value of the sortFoldersFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSortFoldersFirst() {
        return sortFoldersFirst;
    }

    /**
     * Sets the value of the sortFoldersFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSortFoldersFirst(Boolean value) {
        this.sortFoldersFirst = value;
    }

}

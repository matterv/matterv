
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUsbScanCodeSpecKeyEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfUsbScanCodeSpecKeyEvent">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UsbScanCodeSpecKeyEvent" type="{urn:internalvim25}UsbScanCodeSpecKeyEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUsbScanCodeSpecKeyEvent", propOrder = {
    "usbScanCodeSpecKeyEvent"
})
public class ArrayOfUsbScanCodeSpecKeyEvent {

    @XmlElement(name = "UsbScanCodeSpecKeyEvent")
    protected List<UsbScanCodeSpecKeyEvent> usbScanCodeSpecKeyEvent;

    /**
     * Gets the value of the usbScanCodeSpecKeyEvent property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usbScanCodeSpecKeyEvent property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUsbScanCodeSpecKeyEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsbScanCodeSpecKeyEvent }
     * </p>
     * 
     * 
     * @return
     *     The value of the usbScanCodeSpecKeyEvent property.
     */
    public List<UsbScanCodeSpecKeyEvent> getUsbScanCodeSpecKeyEvent() {
        if (usbScanCodeSpecKeyEvent == null) {
            usbScanCodeSpecKeyEvent = new ArrayList<>();
        }
        return this.usbScanCodeSpecKeyEvent;
    }

}

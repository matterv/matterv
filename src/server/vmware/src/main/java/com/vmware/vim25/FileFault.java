
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FileFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VimFault">
 *       <sequence>
 *         <element name="file" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileFault", propOrder = {
    "file"
})
@XmlSeeAlso({
    CannotAccessFile.class,
    CannotCreateFile.class,
    CannotDeleteFile.class,
    DirectoryNotEmpty.class,
    FileAlreadyExists.class,
    FileLocked.class,
    FileNameTooLong.class,
    FileNotFound.class,
    FileNotWritable.class,
    FileTooLarge.class,
    IncorrectFileType.class,
    NetworkCopyFault.class,
    NoDiskSpace.class,
    NotADirectory.class,
    NotAFile.class,
    TooManyConcurrentNativeClones.class,
    TooManyNativeCloneLevels.class,
    TooManyNativeClonesOnFile.class
})
public class FileFault
    extends VimFault
{

    @XmlElement(required = true)
    protected String file;

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

}

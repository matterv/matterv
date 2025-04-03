
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileQuery complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FileQuery">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileQuery")
@XmlSeeAlso({
    VmConfigFileQuery.class,
    VmDiskFileQuery.class,
    FolderFileQuery.class,
    VmSnapshotFileQuery.class,
    IsoImageFileQuery.class,
    FloppyImageFileQuery.class,
    VmNvramFileQuery.class,
    VmLogFileQuery.class
})
public class FileQuery
    extends DynamicData
{


}

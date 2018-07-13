
package com.icss.regie.api.models.file;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.icss.regie.basic.bean package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    public ObjectFactory() {
    }

    public ContentFile createContentFile() {
        return new ContentFile();
    }

    public ContentFolder createContentFolder() {
        return new ContentFolder();
    }
    
    public ContentType createContentType() {
        return new ContentType();
    }
    
    public DiskFile createDiskFile() {
        return new DiskFile();
    }
    
    public FileInfo createFileInfo() {
        return new FileInfo();
    }
    
    public Folder createFolder() {
        return new Folder();
    }
   
    public StoreFile createStoreFile() {
        return new StoreFile();
    }
    
}

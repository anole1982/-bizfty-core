
package com.icss.regie.api.models;

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

    public BasicEntity createBasicEntity() {
        return new BasicEntity();
    }

    public BasicModel createBasicModel() {
        return new BasicModel();
    }
    
    public ValueChoose createValueChoose() {
        return new ValueChoose();
    }
    
    public ValueDate createValueDate() {
        return new ValueDate();
    }
    
    public ValueNumber createValueNumber() {
        return new ValueNumber();
    }
    
    public ValueString createValueString() {
        return new ValueString();
    }
   
    public ValueBlob createValueBlob() {
        return new ValueBlob();
    }
    
}

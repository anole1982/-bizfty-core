package com.icss.regie.retailer.svc.api.models;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public Retailer createRetailer() {
        return new Retailer();
    }

}

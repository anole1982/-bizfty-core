
package com.icss.regie.api.models.quantity;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {


    public ObjectFactory() {
    }

    public Amt createAmt() {
        return new Amt();
    }

    public Area createArea() {
        return new Area();
    }

}

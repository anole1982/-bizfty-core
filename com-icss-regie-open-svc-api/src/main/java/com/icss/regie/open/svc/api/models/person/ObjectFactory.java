
package com.icss.regie.open.svc.api.models.person;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {


    public ObjectFactory() {
    }

    public Identity createIdentity() {
        return new Identity();
    }

    public IdentityType createIdentityType() {
        return new IdentityType();
    }

    public Nationality createNationality() {
        return new Nationality();
    }
}

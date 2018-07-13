package com.icss.regie.api.models.address;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.icss.regie.basic.bean package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public Address createAddress() {
        return new Address();
    }

    public Province createProvince() {
        return new Province();
    }

    public City createCity() {
        return new City();
    }

    public County createCounty() {
        return new County();
    }

    public Region createRegion() {
        return new Region();
    }

    public Town createTown() {
        return new Town();
    }
    
    public Village createVillage() {
        return new Village();
    }
    
    public Position createPosition() {
        return new Position();
    }
}

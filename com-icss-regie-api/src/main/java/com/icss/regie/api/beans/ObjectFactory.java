
package com.icss.regie.api.beans;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.icss.regie.basic.bean
     * 
     */
    public ObjectFactory() {
    }

    public BasicResponse createBasicResponse() {
        return new BasicResponse();
    }

    public BasicRequest createBasicRequest() {
        return new BasicRequest();
    }
    
    public BusinessException createBusinessException() {
        return new BusinessException();
    }
    
    public TechnicalException createTechnicalException() {
        return new TechnicalException();
    }

    public ChannelContext createChannelContext() {
        return new ChannelContext();
    }
    
    public Fault createFault() {
        return new Fault();
    }

    public Extension createExtension() {
        return new Extension();
    }

    public Reason createReason() {
        return new Reason();
    }
    
    public Page createPage() {
        return new Page();
    }
    
}

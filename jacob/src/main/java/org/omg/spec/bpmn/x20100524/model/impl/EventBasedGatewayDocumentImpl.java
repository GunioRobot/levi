/*
 * An XML document type.
 * Localname: eventBasedGateway
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.EventBasedGatewayDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one eventBasedGateway(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class EventBasedGatewayDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.EventBasedGatewayDocument
{
    private static final long serialVersionUID = 1L;
    
    public EventBasedGatewayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTBASEDGATEWAY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "eventBasedGateway");
    
    
    /**
     * Gets the "eventBasedGateway" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEventBasedGateway getEventBasedGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEventBasedGateway target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEventBasedGateway)get_store().find_element_user(EVENTBASEDGATEWAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eventBasedGateway" element
     */
    public void setEventBasedGateway(org.omg.spec.bpmn.x20100524.model.TEventBasedGateway eventBasedGateway)
    {
        generatedSetterHelperImpl(eventBasedGateway, EVENTBASEDGATEWAY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "eventBasedGateway" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEventBasedGateway addNewEventBasedGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEventBasedGateway target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEventBasedGateway)get_store().add_element_user(EVENTBASEDGATEWAY$0);
            return target;
        }
    }
}

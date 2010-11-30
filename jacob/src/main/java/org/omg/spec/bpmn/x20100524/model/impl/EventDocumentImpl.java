/*
 * An XML document type.
 * Localname: event
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.EventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one event(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class EventDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.EventDocument
{
    private static final long serialVersionUID = 1L;
    
    public EventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "event");
    
    
    /**
     * Gets the "event" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEvent getEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEvent)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "event" element
     */
    public void setEvent(org.omg.spec.bpmn.x20100524.model.TEvent event)
    {
        generatedSetterHelperImpl(event, EVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "event" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEvent addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEvent)get_store().add_element_user(EVENT$0);
            return target;
        }
    }
}

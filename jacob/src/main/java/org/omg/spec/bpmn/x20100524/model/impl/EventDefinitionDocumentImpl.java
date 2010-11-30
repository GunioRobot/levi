/*
 * An XML document type.
 * Localname: eventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.EventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one eventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class EventDefinitionDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.EventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public EventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "eventDefinition");
    private static final org.apache.xmlbeans.QNameSet EVENTDEFINITION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "linkEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "timerEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conditionalEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "errorEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "signalEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "compensateEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "escalationEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "terminateEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "eventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "cancelEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "messageEventDefinition"),
    });
    
    
    /**
     * Gets the "eventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEventDefinition getEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEventDefinition)get_store().find_element_user(EVENTDEFINITION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eventDefinition" element
     */
    public void setEventDefinition(org.omg.spec.bpmn.x20100524.model.TEventDefinition eventDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEventDefinition)get_store().find_element_user(EVENTDEFINITION$1, 0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TEventDefinition)get_store().add_element_user(EVENTDEFINITION$0);
            }
            target.set(eventDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "eventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEventDefinition addNewEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEventDefinition)get_store().add_element_user(EVENTDEFINITION$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: startEvent
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.StartEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one startEvent(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class StartEventDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.StartEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public StartEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTEVENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "startEvent");
    
    
    /**
     * Gets the "startEvent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TStartEvent getStartEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TStartEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TStartEvent)get_store().find_element_user(STARTEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "startEvent" element
     */
    public void setStartEvent(org.omg.spec.bpmn.x20100524.model.TStartEvent startEvent)
    {
        generatedSetterHelperImpl(startEvent, STARTEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "startEvent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TStartEvent addNewStartEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TStartEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TStartEvent)get_store().add_element_user(STARTEVENT$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: endEvent
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.EndEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one endEvent(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class EndEventDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.EndEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public EndEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDEVENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "endEvent");
    
    
    /**
     * Gets the "endEvent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEndEvent getEndEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEndEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEndEvent)get_store().find_element_user(ENDEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "endEvent" element
     */
    public void setEndEvent(org.omg.spec.bpmn.x20100524.model.TEndEvent endEvent)
    {
        generatedSetterHelperImpl(endEvent, ENDEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "endEvent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEndEvent addNewEndEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEndEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEndEvent)get_store().add_element_user(ENDEVENT$0);
            return target;
        }
    }
}

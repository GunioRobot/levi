/*
 * An XML document type.
 * Localname: throwEvent
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ThrowEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one throwEvent(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ThrowEventDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ThrowEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public ThrowEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName THROWEVENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "throwEvent");
    
    
    /**
     * Gets the "throwEvent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TThrowEvent getThrowEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TThrowEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TThrowEvent)get_store().find_element_user(THROWEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "throwEvent" element
     */
    public void setThrowEvent(org.omg.spec.bpmn.x20100524.model.TThrowEvent throwEvent)
    {
        generatedSetterHelperImpl(throwEvent, THROWEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "throwEvent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TThrowEvent addNewThrowEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TThrowEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TThrowEvent)get_store().add_element_user(THROWEVENT$0);
            return target;
        }
    }
}

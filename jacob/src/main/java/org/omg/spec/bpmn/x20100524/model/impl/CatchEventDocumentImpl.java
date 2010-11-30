/*
 * An XML document type.
 * Localname: catchEvent
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.CatchEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one catchEvent(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class CatchEventDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.CatchEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public CatchEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATCHEVENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "catchEvent");
    
    
    /**
     * Gets the "catchEvent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCatchEvent getCatchEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCatchEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCatchEvent)get_store().find_element_user(CATCHEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "catchEvent" element
     */
    public void setCatchEvent(org.omg.spec.bpmn.x20100524.model.TCatchEvent catchEvent)
    {
        generatedSetterHelperImpl(catchEvent, CATCHEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "catchEvent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCatchEvent addNewCatchEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCatchEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCatchEvent)get_store().add_element_user(CATCHEVENT$0);
            return target;
        }
    }
}

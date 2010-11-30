/*
 * An XML document type.
 * Localname: implicitThrowEvent
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ImplicitThrowEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one implicitThrowEvent(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ImplicitThrowEventDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ImplicitThrowEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImplicitThrowEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPLICITTHROWEVENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "implicitThrowEvent");
    
    
    /**
     * Gets the "implicitThrowEvent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TImplicitThrowEvent getImplicitThrowEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TImplicitThrowEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TImplicitThrowEvent)get_store().find_element_user(IMPLICITTHROWEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "implicitThrowEvent" element
     */
    public void setImplicitThrowEvent(org.omg.spec.bpmn.x20100524.model.TImplicitThrowEvent implicitThrowEvent)
    {
        generatedSetterHelperImpl(implicitThrowEvent, IMPLICITTHROWEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "implicitThrowEvent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TImplicitThrowEvent addNewImplicitThrowEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TImplicitThrowEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TImplicitThrowEvent)get_store().add_element_user(IMPLICITTHROWEVENT$0);
            return target;
        }
    }
}

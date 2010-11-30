/*
 * An XML document type.
 * Localname: intermediateThrowEvent
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.IntermediateThrowEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one intermediateThrowEvent(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class IntermediateThrowEventDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.IntermediateThrowEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public IntermediateThrowEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERMEDIATETHROWEVENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "intermediateThrowEvent");
    
    
    /**
     * Gets the "intermediateThrowEvent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TIntermediateThrowEvent getIntermediateThrowEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TIntermediateThrowEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TIntermediateThrowEvent)get_store().find_element_user(INTERMEDIATETHROWEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "intermediateThrowEvent" element
     */
    public void setIntermediateThrowEvent(org.omg.spec.bpmn.x20100524.model.TIntermediateThrowEvent intermediateThrowEvent)
    {
        generatedSetterHelperImpl(intermediateThrowEvent, INTERMEDIATETHROWEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "intermediateThrowEvent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TIntermediateThrowEvent addNewIntermediateThrowEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TIntermediateThrowEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TIntermediateThrowEvent)get_store().add_element_user(INTERMEDIATETHROWEVENT$0);
            return target;
        }
    }
}

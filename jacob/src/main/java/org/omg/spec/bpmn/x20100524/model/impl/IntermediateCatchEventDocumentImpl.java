/*
 * An XML document type.
 * Localname: intermediateCatchEvent
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.IntermediateCatchEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one intermediateCatchEvent(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class IntermediateCatchEventDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.IntermediateCatchEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public IntermediateCatchEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERMEDIATECATCHEVENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "intermediateCatchEvent");
    
    
    /**
     * Gets the "intermediateCatchEvent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TIntermediateCatchEvent getIntermediateCatchEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TIntermediateCatchEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TIntermediateCatchEvent)get_store().find_element_user(INTERMEDIATECATCHEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "intermediateCatchEvent" element
     */
    public void setIntermediateCatchEvent(org.omg.spec.bpmn.x20100524.model.TIntermediateCatchEvent intermediateCatchEvent)
    {
        generatedSetterHelperImpl(intermediateCatchEvent, INTERMEDIATECATCHEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "intermediateCatchEvent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TIntermediateCatchEvent addNewIntermediateCatchEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TIntermediateCatchEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TIntermediateCatchEvent)get_store().add_element_user(INTERMEDIATECATCHEVENT$0);
            return target;
        }
    }
}

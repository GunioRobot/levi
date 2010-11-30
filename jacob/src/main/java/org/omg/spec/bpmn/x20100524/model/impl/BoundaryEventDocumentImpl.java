/*
 * An XML document type.
 * Localname: boundaryEvent
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.BoundaryEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one boundaryEvent(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class BoundaryEventDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.BoundaryEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public BoundaryEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOUNDARYEVENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "boundaryEvent");
    
    
    /**
     * Gets the "boundaryEvent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TBoundaryEvent getBoundaryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TBoundaryEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TBoundaryEvent)get_store().find_element_user(BOUNDARYEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "boundaryEvent" element
     */
    public void setBoundaryEvent(org.omg.spec.bpmn.x20100524.model.TBoundaryEvent boundaryEvent)
    {
        generatedSetterHelperImpl(boundaryEvent, BOUNDARYEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "boundaryEvent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TBoundaryEvent addNewBoundaryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TBoundaryEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TBoundaryEvent)get_store().add_element_user(BOUNDARYEVENT$0);
            return target;
        }
    }
}

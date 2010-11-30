/*
 * An XML document type.
 * Localname: BPMNShape
 * Namespace: http://www.omg.org/spec/BPMN/20100524/DI
 * Java type: org.omg.spec.bpmn.x20100524.di.BPMNShapeDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.di.impl;
/**
 * A document containing one BPMNShape(@http://www.omg.org/spec/BPMN/20100524/DI) element.
 *
 * This is a complex type.
 */
public class BPMNShapeDocumentImpl extends org.omg.spec.dd.x20100524.di.impl.DiagramElementDocumentImpl implements org.omg.spec.bpmn.x20100524.di.BPMNShapeDocument
{
    private static final long serialVersionUID = 1L;
    
    public BPMNShapeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BPMNSHAPE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNShape");
    
    
    /**
     * Gets the "BPMNShape" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNShape getBPMNShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNShape target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNShape)get_store().find_element_user(BPMNSHAPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BPMNShape" element
     */
    public void setBPMNShape(org.omg.spec.bpmn.x20100524.di.BPMNShape bpmnShape)
    {
        generatedSetterHelperImpl(bpmnShape, BPMNSHAPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BPMNShape" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNShape addNewBPMNShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNShape target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNShape)get_store().add_element_user(BPMNSHAPE$0);
            return target;
        }
    }
}

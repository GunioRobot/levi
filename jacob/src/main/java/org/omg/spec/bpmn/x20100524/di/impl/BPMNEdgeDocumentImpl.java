/*
 * An XML document type.
 * Localname: BPMNEdge
 * Namespace: http://www.omg.org/spec/BPMN/20100524/DI
 * Java type: org.omg.spec.bpmn.x20100524.di.BPMNEdgeDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.di.impl;
/**
 * A document containing one BPMNEdge(@http://www.omg.org/spec/BPMN/20100524/DI) element.
 *
 * This is a complex type.
 */
public class BPMNEdgeDocumentImpl extends org.omg.spec.dd.x20100524.di.impl.DiagramElementDocumentImpl implements org.omg.spec.bpmn.x20100524.di.BPMNEdgeDocument
{
    private static final long serialVersionUID = 1L;
    
    public BPMNEdgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BPMNEDGE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNEdge");
    
    
    /**
     * Gets the "BPMNEdge" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNEdge getBPMNEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNEdge target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNEdge)get_store().find_element_user(BPMNEDGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BPMNEdge" element
     */
    public void setBPMNEdge(org.omg.spec.bpmn.x20100524.di.BPMNEdge bpmnEdge)
    {
        generatedSetterHelperImpl(bpmnEdge, BPMNEDGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BPMNEdge" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNEdge addNewBPMNEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNEdge target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNEdge)get_store().add_element_user(BPMNEDGE$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: BPMNDiagram
 * Namespace: http://www.omg.org/spec/BPMN/20100524/DI
 * Java type: org.omg.spec.bpmn.x20100524.di.BPMNDiagramDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.di.impl;
/**
 * A document containing one BPMNDiagram(@http://www.omg.org/spec/BPMN/20100524/DI) element.
 *
 * This is a complex type.
 */
public class BPMNDiagramDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.di.BPMNDiagramDocument
{
    private static final long serialVersionUID = 1L;
    
    public BPMNDiagramDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BPMNDIAGRAM$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNDiagram");
    
    
    /**
     * Gets the "BPMNDiagram" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNDiagram getBPMNDiagram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNDiagram target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNDiagram)get_store().find_element_user(BPMNDIAGRAM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BPMNDiagram" element
     */
    public void setBPMNDiagram(org.omg.spec.bpmn.x20100524.di.BPMNDiagram bpmnDiagram)
    {
        generatedSetterHelperImpl(bpmnDiagram, BPMNDIAGRAM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BPMNDiagram" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNDiagram addNewBPMNDiagram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNDiagram target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNDiagram)get_store().add_element_user(BPMNDIAGRAM$0);
            return target;
        }
    }
}

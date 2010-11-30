/*
 * An XML document type.
 * Localname: BPMNPlane
 * Namespace: http://www.omg.org/spec/BPMN/20100524/DI
 * Java type: org.omg.spec.bpmn.x20100524.di.BPMNPlaneDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.di.impl;
/**
 * A document containing one BPMNPlane(@http://www.omg.org/spec/BPMN/20100524/DI) element.
 *
 * This is a complex type.
 */
public class BPMNPlaneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.di.BPMNPlaneDocument
{
    private static final long serialVersionUID = 1L;
    
    public BPMNPlaneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BPMNPLANE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNPlane");
    
    
    /**
     * Gets the "BPMNPlane" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNPlane getBPMNPlane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNPlane target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNPlane)get_store().find_element_user(BPMNPLANE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BPMNPlane" element
     */
    public void setBPMNPlane(org.omg.spec.bpmn.x20100524.di.BPMNPlane bpmnPlane)
    {
        generatedSetterHelperImpl(bpmnPlane, BPMNPLANE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BPMNPlane" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNPlane addNewBPMNPlane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNPlane target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNPlane)get_store().add_element_user(BPMNPLANE$0);
            return target;
        }
    }
}

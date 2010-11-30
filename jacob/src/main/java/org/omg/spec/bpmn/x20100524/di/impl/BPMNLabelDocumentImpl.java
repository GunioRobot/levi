/*
 * An XML document type.
 * Localname: BPMNLabel
 * Namespace: http://www.omg.org/spec/BPMN/20100524/DI
 * Java type: org.omg.spec.bpmn.x20100524.di.BPMNLabelDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.di.impl;
/**
 * A document containing one BPMNLabel(@http://www.omg.org/spec/BPMN/20100524/DI) element.
 *
 * This is a complex type.
 */
public class BPMNLabelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.di.BPMNLabelDocument
{
    private static final long serialVersionUID = 1L;
    
    public BPMNLabelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BPMNLABEL$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNLabel");
    
    
    /**
     * Gets the "BPMNLabel" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNLabel getBPMNLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNLabel target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNLabel)get_store().find_element_user(BPMNLABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BPMNLabel" element
     */
    public void setBPMNLabel(org.omg.spec.bpmn.x20100524.di.BPMNLabel bpmnLabel)
    {
        generatedSetterHelperImpl(bpmnLabel, BPMNLABEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BPMNLabel" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNLabel addNewBPMNLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNLabel target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNLabel)get_store().add_element_user(BPMNLABEL$0);
            return target;
        }
    }
}

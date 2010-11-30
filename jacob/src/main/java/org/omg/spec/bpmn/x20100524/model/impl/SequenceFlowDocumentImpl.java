/*
 * An XML document type.
 * Localname: sequenceFlow
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.SequenceFlowDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one sequenceFlow(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class SequenceFlowDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.SequenceFlowDocument
{
    private static final long serialVersionUID = 1L;
    
    public SequenceFlowDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQUENCEFLOW$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "sequenceFlow");
    
    
    /**
     * Gets the "sequenceFlow" element
     */
    public org.omg.spec.bpmn.x20100524.model.TSequenceFlow getSequenceFlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TSequenceFlow target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TSequenceFlow)get_store().find_element_user(SEQUENCEFLOW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sequenceFlow" element
     */
    public void setSequenceFlow(org.omg.spec.bpmn.x20100524.model.TSequenceFlow sequenceFlow)
    {
        generatedSetterHelperImpl(sequenceFlow, SEQUENCEFLOW$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sequenceFlow" element
     */
    public org.omg.spec.bpmn.x20100524.model.TSequenceFlow addNewSequenceFlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TSequenceFlow target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TSequenceFlow)get_store().add_element_user(SEQUENCEFLOW$0);
            return target;
        }
    }
}

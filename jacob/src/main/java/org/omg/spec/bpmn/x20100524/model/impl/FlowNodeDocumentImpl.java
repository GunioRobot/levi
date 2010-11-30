/*
 * An XML document type.
 * Localname: flowNode
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.FlowNodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one flowNode(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class FlowNodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.FlowNodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public FlowNodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLOWNODE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "flowNode");
    
    
    /**
     * Gets the "flowNode" element
     */
    public org.omg.spec.bpmn.x20100524.model.TFlowNode getFlowNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TFlowNode target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TFlowNode)get_store().find_element_user(FLOWNODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "flowNode" element
     */
    public void setFlowNode(org.omg.spec.bpmn.x20100524.model.TFlowNode flowNode)
    {
        generatedSetterHelperImpl(flowNode, FLOWNODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "flowNode" element
     */
    public org.omg.spec.bpmn.x20100524.model.TFlowNode addNewFlowNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TFlowNode target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TFlowNode)get_store().add_element_user(FLOWNODE$0);
            return target;
        }
    }
}

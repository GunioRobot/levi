/*
 * An XML document type.
 * Localname: messageFlow
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.MessageFlowDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one messageFlow(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class MessageFlowDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.MessageFlowDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageFlowDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEFLOW$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "messageFlow");
    
    
    /**
     * Gets the "messageFlow" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMessageFlow getMessageFlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMessageFlow target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMessageFlow)get_store().find_element_user(MESSAGEFLOW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "messageFlow" element
     */
    public void setMessageFlow(org.omg.spec.bpmn.x20100524.model.TMessageFlow messageFlow)
    {
        generatedSetterHelperImpl(messageFlow, MESSAGEFLOW$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "messageFlow" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMessageFlow addNewMessageFlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMessageFlow target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMessageFlow)get_store().add_element_user(MESSAGEFLOW$0);
            return target;
        }
    }
}

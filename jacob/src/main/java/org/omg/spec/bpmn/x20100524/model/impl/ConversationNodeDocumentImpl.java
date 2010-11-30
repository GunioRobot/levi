/*
 * An XML document type.
 * Localname: conversationNode
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ConversationNodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one conversationNode(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ConversationNodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ConversationNodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConversationNodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSATIONNODE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conversationNode");
    private static final org.apache.xmlbeans.QNameSet CONVERSATIONNODE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conversationNode"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "callConversation"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conversation"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "subConversation"),
    });
    
    
    /**
     * Gets the "conversationNode" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationNode getConversationNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationNode target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationNode)get_store().find_element_user(CONVERSATIONNODE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "conversationNode" element
     */
    public void setConversationNode(org.omg.spec.bpmn.x20100524.model.TConversationNode conversationNode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationNode target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationNode)get_store().find_element_user(CONVERSATIONNODE$1, 0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TConversationNode)get_store().add_element_user(CONVERSATIONNODE$0);
            }
            target.set(conversationNode);
        }
    }
    
    /**
     * Appends and returns a new empty "conversationNode" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationNode addNewConversationNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationNode target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationNode)get_store().add_element_user(CONVERSATIONNODE$0);
            return target;
        }
    }
}

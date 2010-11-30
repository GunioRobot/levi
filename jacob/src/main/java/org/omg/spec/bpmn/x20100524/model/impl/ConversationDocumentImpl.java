/*
 * An XML document type.
 * Localname: conversation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ConversationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one conversation(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ConversationDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.ConversationNodeDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ConversationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConversationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conversation");
    
    
    /**
     * Gets the "conversation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversation getConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversation)get_store().find_element_user(CONVERSATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "conversation" element
     */
    public void setConversation(org.omg.spec.bpmn.x20100524.model.TConversation conversation)
    {
        generatedSetterHelperImpl(conversation, CONVERSATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "conversation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversation addNewConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversation)get_store().add_element_user(CONVERSATION$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: conversationLink
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ConversationLinkDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one conversationLink(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ConversationLinkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ConversationLinkDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConversationLinkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSATIONLINK$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conversationLink");
    
    
    /**
     * Gets the "conversationLink" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationLink getConversationLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationLink target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationLink)get_store().find_element_user(CONVERSATIONLINK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "conversationLink" element
     */
    public void setConversationLink(org.omg.spec.bpmn.x20100524.model.TConversationLink conversationLink)
    {
        generatedSetterHelperImpl(conversationLink, CONVERSATIONLINK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "conversationLink" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationLink addNewConversationLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationLink target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationLink)get_store().add_element_user(CONVERSATIONLINK$0);
            return target;
        }
    }
}

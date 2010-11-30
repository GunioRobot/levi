/*
 * An XML document type.
 * Localname: conversationAssociation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ConversationAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one conversationAssociation(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ConversationAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ConversationAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConversationAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSATIONASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conversationAssociation");
    
    
    /**
     * Gets the "conversationAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationAssociation getConversationAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationAssociation)get_store().find_element_user(CONVERSATIONASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "conversationAssociation" element
     */
    public void setConversationAssociation(org.omg.spec.bpmn.x20100524.model.TConversationAssociation conversationAssociation)
    {
        generatedSetterHelperImpl(conversationAssociation, CONVERSATIONASSOCIATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "conversationAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationAssociation addNewConversationAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationAssociation)get_store().add_element_user(CONVERSATIONASSOCIATION$0);
            return target;
        }
    }
}

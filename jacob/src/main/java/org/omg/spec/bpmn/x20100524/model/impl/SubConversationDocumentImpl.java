/*
 * An XML document type.
 * Localname: subConversation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.SubConversationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one subConversation(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class SubConversationDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.ConversationNodeDocumentImpl implements org.omg.spec.bpmn.x20100524.model.SubConversationDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubConversationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBCONVERSATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "subConversation");
    
    
    /**
     * Gets the "subConversation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TSubConversation getSubConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TSubConversation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TSubConversation)get_store().find_element_user(SUBCONVERSATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subConversation" element
     */
    public void setSubConversation(org.omg.spec.bpmn.x20100524.model.TSubConversation subConversation)
    {
        generatedSetterHelperImpl(subConversation, SUBCONVERSATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subConversation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TSubConversation addNewSubConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TSubConversation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TSubConversation)get_store().add_element_user(SUBCONVERSATION$0);
            return target;
        }
    }
}

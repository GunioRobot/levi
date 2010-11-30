/*
 * An XML document type.
 * Localname: callConversation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.CallConversationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one callConversation(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class CallConversationDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.ConversationNodeDocumentImpl implements org.omg.spec.bpmn.x20100524.model.CallConversationDocument
{
    private static final long serialVersionUID = 1L;
    
    public CallConversationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLCONVERSATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "callConversation");
    
    
    /**
     * Gets the "callConversation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCallConversation getCallConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCallConversation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCallConversation)get_store().find_element_user(CALLCONVERSATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "callConversation" element
     */
    public void setCallConversation(org.omg.spec.bpmn.x20100524.model.TCallConversation callConversation)
    {
        generatedSetterHelperImpl(callConversation, CALLCONVERSATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "callConversation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCallConversation addNewCallConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCallConversation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCallConversation)get_store().add_element_user(CALLCONVERSATION$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: globalConversation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.GlobalConversationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one globalConversation(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class GlobalConversationDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.CollaborationDocumentImpl implements org.omg.spec.bpmn.x20100524.model.GlobalConversationDocument
{
    private static final long serialVersionUID = 1L;
    
    public GlobalConversationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBALCONVERSATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalConversation");
    
    
    /**
     * Gets the "globalConversation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGlobalConversation getGlobalConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGlobalConversation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGlobalConversation)get_store().find_element_user(GLOBALCONVERSATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "globalConversation" element
     */
    public void setGlobalConversation(org.omg.spec.bpmn.x20100524.model.TGlobalConversation globalConversation)
    {
        generatedSetterHelperImpl(globalConversation, GLOBALCONVERSATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "globalConversation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGlobalConversation addNewGlobalConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGlobalConversation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGlobalConversation)get_store().add_element_user(GLOBALCONVERSATION$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: messageFlowAssociation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.MessageFlowAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one messageFlowAssociation(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class MessageFlowAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.MessageFlowAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageFlowAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEFLOWASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "messageFlowAssociation");
    
    
    /**
     * Gets the "messageFlowAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation getMessageFlowAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation)get_store().find_element_user(MESSAGEFLOWASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "messageFlowAssociation" element
     */
    public void setMessageFlowAssociation(org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation messageFlowAssociation)
    {
        generatedSetterHelperImpl(messageFlowAssociation, MESSAGEFLOWASSOCIATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "messageFlowAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation addNewMessageFlowAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation)get_store().add_element_user(MESSAGEFLOWASSOCIATION$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: messageEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.MessageEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one messageEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class MessageEventDefinitionDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.EventDefinitionDocumentImpl implements org.omg.spec.bpmn.x20100524.model.MessageEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEEVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "messageEventDefinition");
    
    
    /**
     * Gets the "messageEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMessageEventDefinition getMessageEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMessageEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMessageEventDefinition)get_store().find_element_user(MESSAGEEVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "messageEventDefinition" element
     */
    public void setMessageEventDefinition(org.omg.spec.bpmn.x20100524.model.TMessageEventDefinition messageEventDefinition)
    {
        generatedSetterHelperImpl(messageEventDefinition, MESSAGEEVENTDEFINITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "messageEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMessageEventDefinition addNewMessageEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMessageEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMessageEventDefinition)get_store().add_element_user(MESSAGEEVENTDEFINITION$0);
            return target;
        }
    }
}

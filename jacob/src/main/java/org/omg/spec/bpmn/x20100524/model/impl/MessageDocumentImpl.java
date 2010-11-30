/*
 * An XML document type.
 * Localname: message
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.MessageDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one message(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class MessageDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.MessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "message");
    
    
    /**
     * Gets the "message" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMessage getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMessage target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMessage)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "message" element
     */
    public void setMessage(org.omg.spec.bpmn.x20100524.model.TMessage message)
    {
        generatedSetterHelperImpl(message, MESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "message" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMessage addNewMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMessage target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMessage)get_store().add_element_user(MESSAGE$0);
            return target;
        }
    }
}

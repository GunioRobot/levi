/*
 * XML Type:  tMessageEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TMessageEventDefinition
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tMessageEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TMessageEventDefinitionImpl extends org.omg.spec.bpmn.x20100524.model.impl.TEventDefinitionImpl implements org.omg.spec.bpmn.x20100524.model.TMessageEventDefinition
{
    private static final long serialVersionUID = 1L;
    
    public TMessageEventDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONREF$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "operationRef");
    private static final javax.xml.namespace.QName MESSAGEREF$2 = 
        new javax.xml.namespace.QName("", "messageRef");
    
    
    /**
     * Gets the "operationRef" element
     */
    public javax.xml.namespace.QName getOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "operationRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(OPERATIONREF$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "operationRef" element
     */
    public boolean isSetOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONREF$0) != 0;
        }
    }
    
    /**
     * Sets the "operationRef" element
     */
    public void setOperationRef(javax.xml.namespace.QName operationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONREF$0);
            }
            target.setQNameValue(operationRef);
        }
    }
    
    /**
     * Sets (as xml) the "operationRef" element
     */
    public void xsetOperationRef(org.apache.xmlbeans.XmlQName operationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(OPERATIONREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(OPERATIONREF$0);
            }
            target.set(operationRef);
        }
    }
    
    /**
     * Unsets the "operationRef" element
     */
    public void unsetOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONREF$0, 0);
        }
    }
    
    /**
     * Gets the "messageRef" attribute
     */
    public javax.xml.namespace.QName getMessageRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGEREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetMessageRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(MESSAGEREF$2);
            return target;
        }
    }
    
    /**
     * True if has "messageRef" attribute
     */
    public boolean isSetMessageRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MESSAGEREF$2) != null;
        }
    }
    
    /**
     * Sets the "messageRef" attribute
     */
    public void setMessageRef(javax.xml.namespace.QName messageRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGEREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGEREF$2);
            }
            target.setQNameValue(messageRef);
        }
    }
    
    /**
     * Sets (as xml) the "messageRef" attribute
     */
    public void xsetMessageRef(org.apache.xmlbeans.XmlQName messageRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(MESSAGEREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(MESSAGEREF$2);
            }
            target.set(messageRef);
        }
    }
    
    /**
     * Unsets the "messageRef" attribute
     */
    public void unsetMessageRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MESSAGEREF$2);
        }
    }
}

/*
 * XML Type:  tErrorEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TErrorEventDefinition
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tErrorEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TErrorEventDefinitionImpl extends org.omg.spec.bpmn.x20100524.model.impl.TEventDefinitionImpl implements org.omg.spec.bpmn.x20100524.model.TErrorEventDefinition
{
    private static final long serialVersionUID = 1L;
    
    public TErrorEventDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORREF$0 = 
        new javax.xml.namespace.QName("", "errorRef");
    
    
    /**
     * Gets the "errorRef" attribute
     */
    public javax.xml.namespace.QName getErrorRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetErrorRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ERRORREF$0);
            return target;
        }
    }
    
    /**
     * True if has "errorRef" attribute
     */
    public boolean isSetErrorRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ERRORREF$0) != null;
        }
    }
    
    /**
     * Sets the "errorRef" attribute
     */
    public void setErrorRef(javax.xml.namespace.QName errorRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORREF$0);
            }
            target.setQNameValue(errorRef);
        }
    }
    
    /**
     * Sets (as xml) the "errorRef" attribute
     */
    public void xsetErrorRef(org.apache.xmlbeans.XmlQName errorRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ERRORREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(ERRORREF$0);
            }
            target.set(errorRef);
        }
    }
    
    /**
     * Unsets the "errorRef" attribute
     */
    public void unsetErrorRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ERRORREF$0);
        }
    }
}

/*
 * XML Type:  tTransaction
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TTransaction
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tTransaction(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TTransactionImpl extends org.omg.spec.bpmn.x20100524.model.impl.TSubProcessImpl implements org.omg.spec.bpmn.x20100524.model.TTransaction
{
    private static final long serialVersionUID = 1L;
    
    public TTransactionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METHOD$0 = 
        new javax.xml.namespace.QName("", "method");
    
    
    /**
     * Gets the "method" attribute
     */
    public java.lang.Object getMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(METHOD$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "method" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TTransactionMethod xgetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TTransactionMethod target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TTransactionMethod)get_store().find_attribute_user(METHOD$0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TTransactionMethod)get_default_attribute_value(METHOD$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "method" attribute
     */
    public boolean isSetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METHOD$0) != null;
        }
    }
    
    /**
     * Sets the "method" attribute
     */
    public void setMethod(java.lang.Object method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHOD$0);
            }
            target.setObjectValue(method);
        }
    }
    
    /**
     * Sets (as xml) the "method" attribute
     */
    public void xsetMethod(org.omg.spec.bpmn.x20100524.model.TTransactionMethod method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TTransactionMethod target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TTransactionMethod)get_store().find_attribute_user(METHOD$0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TTransactionMethod)get_store().add_attribute_user(METHOD$0);
            }
            target.set(method);
        }
    }
    
    /**
     * Unsets the "method" attribute
     */
    public void unsetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METHOD$0);
        }
    }
}

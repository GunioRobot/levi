/*
 * XML Type:  tBusinessRuleTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TBusinessRuleTask
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tBusinessRuleTask(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TBusinessRuleTaskImpl extends org.omg.spec.bpmn.x20100524.model.impl.TTaskImpl implements org.omg.spec.bpmn.x20100524.model.TBusinessRuleTask
{
    private static final long serialVersionUID = 1L;
    
    public TBusinessRuleTaskImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPLEMENTATION$0 = 
        new javax.xml.namespace.QName("", "implementation");
    
    
    /**
     * Gets the "implementation" attribute
     */
    public java.lang.Object getImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPLEMENTATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IMPLEMENTATION$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "implementation" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TImplementation xgetImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TImplementation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TImplementation)get_store().find_attribute_user(IMPLEMENTATION$0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TImplementation)get_default_attribute_value(IMPLEMENTATION$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "implementation" attribute
     */
    public boolean isSetImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IMPLEMENTATION$0) != null;
        }
    }
    
    /**
     * Sets the "implementation" attribute
     */
    public void setImplementation(java.lang.Object implementation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPLEMENTATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMPLEMENTATION$0);
            }
            target.setObjectValue(implementation);
        }
    }
    
    /**
     * Sets (as xml) the "implementation" attribute
     */
    public void xsetImplementation(org.omg.spec.bpmn.x20100524.model.TImplementation implementation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TImplementation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TImplementation)get_store().find_attribute_user(IMPLEMENTATION$0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TImplementation)get_store().add_attribute_user(IMPLEMENTATION$0);
            }
            target.set(implementation);
        }
    }
    
    /**
     * Unsets the "implementation" attribute
     */
    public void unsetImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IMPLEMENTATION$0);
        }
    }
}

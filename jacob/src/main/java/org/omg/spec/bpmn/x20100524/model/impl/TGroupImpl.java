/*
 * XML Type:  tGroup
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TGroup
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tGroup(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TGroupImpl extends org.omg.spec.bpmn.x20100524.model.impl.TArtifactImpl implements org.omg.spec.bpmn.x20100524.model.TGroup
{
    private static final long serialVersionUID = 1L;
    
    public TGroupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYVALUEREF$0 = 
        new javax.xml.namespace.QName("", "categoryValueRef");
    
    
    /**
     * Gets the "categoryValueRef" attribute
     */
    public javax.xml.namespace.QName getCategoryValueRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORYVALUEREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "categoryValueRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetCategoryValueRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CATEGORYVALUEREF$0);
            return target;
        }
    }
    
    /**
     * True if has "categoryValueRef" attribute
     */
    public boolean isSetCategoryValueRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CATEGORYVALUEREF$0) != null;
        }
    }
    
    /**
     * Sets the "categoryValueRef" attribute
     */
    public void setCategoryValueRef(javax.xml.namespace.QName categoryValueRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORYVALUEREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATEGORYVALUEREF$0);
            }
            target.setQNameValue(categoryValueRef);
        }
    }
    
    /**
     * Sets (as xml) the "categoryValueRef" attribute
     */
    public void xsetCategoryValueRef(org.apache.xmlbeans.XmlQName categoryValueRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CATEGORYVALUEREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(CATEGORYVALUEREF$0);
            }
            target.set(categoryValueRef);
        }
    }
    
    /**
     * Unsets the "categoryValueRef" attribute
     */
    public void unsetCategoryValueRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CATEGORYVALUEREF$0);
        }
    }
}

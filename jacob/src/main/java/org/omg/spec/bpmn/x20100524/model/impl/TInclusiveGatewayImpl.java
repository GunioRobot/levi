/*
 * XML Type:  tInclusiveGateway
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TInclusiveGateway
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tInclusiveGateway(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TInclusiveGatewayImpl extends org.omg.spec.bpmn.x20100524.model.impl.TGatewayImpl implements org.omg.spec.bpmn.x20100524.model.TInclusiveGateway
{
    private static final long serialVersionUID = 1L;
    
    public TInclusiveGatewayImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFAULT$0 = 
        new javax.xml.namespace.QName("", "default");
    
    
    /**
     * Gets the "default" attribute
     */
    public java.lang.String getDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "default" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(DEFAULT$0);
            return target;
        }
    }
    
    /**
     * True if has "default" attribute
     */
    public boolean isSetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULT$0) != null;
        }
    }
    
    /**
     * Sets the "default" attribute
     */
    public void setDefault(java.lang.String xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$0);
            }
            target.setStringValue(xdefault);
        }
    }
    
    /**
     * Sets (as xml) the "default" attribute
     */
    public void xsetDefault(org.apache.xmlbeans.XmlIDREF xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(DEFAULT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(DEFAULT$0);
            }
            target.set(xdefault);
        }
    }
    
    /**
     * Unsets the "default" attribute
     */
    public void unsetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULT$0);
        }
    }
}

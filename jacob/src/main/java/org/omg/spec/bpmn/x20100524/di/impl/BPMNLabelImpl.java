/*
 * XML Type:  BPMNLabel
 * Namespace: http://www.omg.org/spec/BPMN/20100524/DI
 * Java type: org.omg.spec.bpmn.x20100524.di.BPMNLabel
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.di.impl;
/**
 * An XML BPMNLabel(@http://www.omg.org/spec/BPMN/20100524/DI).
 *
 * This is a complex type.
 */
public class BPMNLabelImpl extends org.omg.spec.dd.x20100524.di.impl.LabelImpl implements org.omg.spec.bpmn.x20100524.di.BPMNLabel
{
    private static final long serialVersionUID = 1L;
    
    public BPMNLabelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABELSTYLE$0 = 
        new javax.xml.namespace.QName("", "labelStyle");
    
    
    /**
     * Gets the "labelStyle" attribute
     */
    public javax.xml.namespace.QName getLabelStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABELSTYLE$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "labelStyle" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetLabelStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(LABELSTYLE$0);
            return target;
        }
    }
    
    /**
     * True if has "labelStyle" attribute
     */
    public boolean isSetLabelStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LABELSTYLE$0) != null;
        }
    }
    
    /**
     * Sets the "labelStyle" attribute
     */
    public void setLabelStyle(javax.xml.namespace.QName labelStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABELSTYLE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABELSTYLE$0);
            }
            target.setQNameValue(labelStyle);
        }
    }
    
    /**
     * Sets (as xml) the "labelStyle" attribute
     */
    public void xsetLabelStyle(org.apache.xmlbeans.XmlQName labelStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(LABELSTYLE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(LABELSTYLE$0);
            }
            target.set(labelStyle);
        }
    }
    
    /**
     * Unsets the "labelStyle" attribute
     */
    public void unsetLabelStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LABELSTYLE$0);
        }
    }
}

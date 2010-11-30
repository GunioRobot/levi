/*
 * XML Type:  BPMNPlane
 * Namespace: http://www.omg.org/spec/BPMN/20100524/DI
 * Java type: org.omg.spec.bpmn.x20100524.di.BPMNPlane
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.di.impl;
/**
 * An XML BPMNPlane(@http://www.omg.org/spec/BPMN/20100524/DI).
 *
 * This is a complex type.
 */
public class BPMNPlaneImpl extends org.omg.spec.dd.x20100524.di.impl.PlaneImpl implements org.omg.spec.bpmn.x20100524.di.BPMNPlane
{
    private static final long serialVersionUID = 1L;
    
    public BPMNPlaneImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BPMNELEMENT$0 = 
        new javax.xml.namespace.QName("", "bpmnElement");
    
    
    /**
     * Gets the "bpmnElement" attribute
     */
    public javax.xml.namespace.QName getBpmnElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BPMNELEMENT$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "bpmnElement" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetBpmnElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(BPMNELEMENT$0);
            return target;
        }
    }
    
    /**
     * True if has "bpmnElement" attribute
     */
    public boolean isSetBpmnElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BPMNELEMENT$0) != null;
        }
    }
    
    /**
     * Sets the "bpmnElement" attribute
     */
    public void setBpmnElement(javax.xml.namespace.QName bpmnElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BPMNELEMENT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BPMNELEMENT$0);
            }
            target.setQNameValue(bpmnElement);
        }
    }
    
    /**
     * Sets (as xml) the "bpmnElement" attribute
     */
    public void xsetBpmnElement(org.apache.xmlbeans.XmlQName bpmnElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(BPMNELEMENT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(BPMNELEMENT$0);
            }
            target.set(bpmnElement);
        }
    }
    
    /**
     * Unsets the "bpmnElement" attribute
     */
    public void unsetBpmnElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BPMNELEMENT$0);
        }
    }
}

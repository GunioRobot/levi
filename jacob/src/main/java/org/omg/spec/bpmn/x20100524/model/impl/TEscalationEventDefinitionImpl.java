/*
 * XML Type:  tEscalationEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TEscalationEventDefinition
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tEscalationEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TEscalationEventDefinitionImpl extends org.omg.spec.bpmn.x20100524.model.impl.TEventDefinitionImpl implements org.omg.spec.bpmn.x20100524.model.TEscalationEventDefinition
{
    private static final long serialVersionUID = 1L;
    
    public TEscalationEventDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESCALATIONREF$0 = 
        new javax.xml.namespace.QName("", "escalationRef");
    
    
    /**
     * Gets the "escalationRef" attribute
     */
    public javax.xml.namespace.QName getEscalationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ESCALATIONREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "escalationRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetEscalationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ESCALATIONREF$0);
            return target;
        }
    }
    
    /**
     * True if has "escalationRef" attribute
     */
    public boolean isSetEscalationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ESCALATIONREF$0) != null;
        }
    }
    
    /**
     * Sets the "escalationRef" attribute
     */
    public void setEscalationRef(javax.xml.namespace.QName escalationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ESCALATIONREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ESCALATIONREF$0);
            }
            target.setQNameValue(escalationRef);
        }
    }
    
    /**
     * Sets (as xml) the "escalationRef" attribute
     */
    public void xsetEscalationRef(org.apache.xmlbeans.XmlQName escalationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ESCALATIONREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(ESCALATIONREF$0);
            }
            target.set(escalationRef);
        }
    }
    
    /**
     * Unsets the "escalationRef" attribute
     */
    public void unsetEscalationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ESCALATIONREF$0);
        }
    }
}

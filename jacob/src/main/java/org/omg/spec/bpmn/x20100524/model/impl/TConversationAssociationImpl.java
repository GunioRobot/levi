/*
 * XML Type:  tConversationAssociation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TConversationAssociation
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tConversationAssociation(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TConversationAssociationImpl extends org.omg.spec.bpmn.x20100524.model.impl.TBaseElementImpl implements org.omg.spec.bpmn.x20100524.model.TConversationAssociation
{
    private static final long serialVersionUID = 1L;
    
    public TConversationAssociationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INNERCONVERSATIONNODEREF$0 = 
        new javax.xml.namespace.QName("", "innerConversationNodeRef");
    private static final javax.xml.namespace.QName OUTERCONVERSATIONNODEREF$2 = 
        new javax.xml.namespace.QName("", "outerConversationNodeRef");
    
    
    /**
     * Gets the "innerConversationNodeRef" attribute
     */
    public javax.xml.namespace.QName getInnerConversationNodeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INNERCONVERSATIONNODEREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "innerConversationNodeRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetInnerConversationNodeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(INNERCONVERSATIONNODEREF$0);
            return target;
        }
    }
    
    /**
     * Sets the "innerConversationNodeRef" attribute
     */
    public void setInnerConversationNodeRef(javax.xml.namespace.QName innerConversationNodeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INNERCONVERSATIONNODEREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INNERCONVERSATIONNODEREF$0);
            }
            target.setQNameValue(innerConversationNodeRef);
        }
    }
    
    /**
     * Sets (as xml) the "innerConversationNodeRef" attribute
     */
    public void xsetInnerConversationNodeRef(org.apache.xmlbeans.XmlQName innerConversationNodeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(INNERCONVERSATIONNODEREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(INNERCONVERSATIONNODEREF$0);
            }
            target.set(innerConversationNodeRef);
        }
    }
    
    /**
     * Gets the "outerConversationNodeRef" attribute
     */
    public javax.xml.namespace.QName getOuterConversationNodeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTERCONVERSATIONNODEREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "outerConversationNodeRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetOuterConversationNodeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(OUTERCONVERSATIONNODEREF$2);
            return target;
        }
    }
    
    /**
     * Sets the "outerConversationNodeRef" attribute
     */
    public void setOuterConversationNodeRef(javax.xml.namespace.QName outerConversationNodeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTERCONVERSATIONNODEREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTERCONVERSATIONNODEREF$2);
            }
            target.setQNameValue(outerConversationNodeRef);
        }
    }
    
    /**
     * Sets (as xml) the "outerConversationNodeRef" attribute
     */
    public void xsetOuterConversationNodeRef(org.apache.xmlbeans.XmlQName outerConversationNodeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(OUTERCONVERSATIONNODEREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(OUTERCONVERSATIONNODEREF$2);
            }
            target.set(outerConversationNodeRef);
        }
    }
}

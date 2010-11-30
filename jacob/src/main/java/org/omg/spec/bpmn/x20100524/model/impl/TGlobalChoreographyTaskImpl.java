/*
 * XML Type:  tGlobalChoreographyTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TGlobalChoreographyTask
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tGlobalChoreographyTask(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TGlobalChoreographyTaskImpl extends org.omg.spec.bpmn.x20100524.model.impl.TChoreographyImpl implements org.omg.spec.bpmn.x20100524.model.TGlobalChoreographyTask
{
    private static final long serialVersionUID = 1L;
    
    public TGlobalChoreographyTaskImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INITIATINGPARTICIPANTREF$0 = 
        new javax.xml.namespace.QName("", "initiatingParticipantRef");
    
    
    /**
     * Gets the "initiatingParticipantRef" attribute
     */
    public javax.xml.namespace.QName getInitiatingParticipantRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INITIATINGPARTICIPANTREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "initiatingParticipantRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetInitiatingParticipantRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(INITIATINGPARTICIPANTREF$0);
            return target;
        }
    }
    
    /**
     * True if has "initiatingParticipantRef" attribute
     */
    public boolean isSetInitiatingParticipantRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INITIATINGPARTICIPANTREF$0) != null;
        }
    }
    
    /**
     * Sets the "initiatingParticipantRef" attribute
     */
    public void setInitiatingParticipantRef(javax.xml.namespace.QName initiatingParticipantRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INITIATINGPARTICIPANTREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INITIATINGPARTICIPANTREF$0);
            }
            target.setQNameValue(initiatingParticipantRef);
        }
    }
    
    /**
     * Sets (as xml) the "initiatingParticipantRef" attribute
     */
    public void xsetInitiatingParticipantRef(org.apache.xmlbeans.XmlQName initiatingParticipantRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(INITIATINGPARTICIPANTREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(INITIATINGPARTICIPANTREF$0);
            }
            target.set(initiatingParticipantRef);
        }
    }
    
    /**
     * Unsets the "initiatingParticipantRef" attribute
     */
    public void unsetInitiatingParticipantRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INITIATINGPARTICIPANTREF$0);
        }
    }
}

/*
 * XML Type:  tCallConversation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TCallConversation
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tCallConversation(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TCallConversationImpl extends org.omg.spec.bpmn.x20100524.model.impl.TConversationNodeImpl implements org.omg.spec.bpmn.x20100524.model.TCallConversation
{
    private static final long serialVersionUID = 1L;
    
    public TCallConversationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTICIPANTASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "participantAssociation");
    private static final javax.xml.namespace.QName CALLEDCOLLABORATIONREF$2 = 
        new javax.xml.namespace.QName("", "calledCollaborationRef");
    
    
    /**
     * Gets array of all "participantAssociation" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipantAssociation[] getParticipantAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANTASSOCIATION$0, targetList);
            org.omg.spec.bpmn.x20100524.model.TParticipantAssociation[] result = new org.omg.spec.bpmn.x20100524.model.TParticipantAssociation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "participantAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipantAssociation getParticipantAssociationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipantAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipantAssociation)get_store().find_element_user(PARTICIPANTASSOCIATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "participantAssociation" element
     */
    public int sizeOfParticipantAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICIPANTASSOCIATION$0);
        }
    }
    
    /**
     * Sets array of all "participantAssociation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParticipantAssociationArray(org.omg.spec.bpmn.x20100524.model.TParticipantAssociation[] participantAssociationArray)
    {
        check_orphaned();
        arraySetterHelper(participantAssociationArray, PARTICIPANTASSOCIATION$0);
    }
    
    /**
     * Sets ith "participantAssociation" element
     */
    public void setParticipantAssociationArray(int i, org.omg.spec.bpmn.x20100524.model.TParticipantAssociation participantAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipantAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipantAssociation)get_store().find_element_user(PARTICIPANTASSOCIATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(participantAssociation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participantAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipantAssociation insertNewParticipantAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipantAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipantAssociation)get_store().insert_element_user(PARTICIPANTASSOCIATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participantAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipantAssociation addNewParticipantAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipantAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipantAssociation)get_store().add_element_user(PARTICIPANTASSOCIATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "participantAssociation" element
     */
    public void removeParticipantAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICIPANTASSOCIATION$0, i);
        }
    }
    
    /**
     * Gets the "calledCollaborationRef" attribute
     */
    public javax.xml.namespace.QName getCalledCollaborationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALLEDCOLLABORATIONREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "calledCollaborationRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetCalledCollaborationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CALLEDCOLLABORATIONREF$2);
            return target;
        }
    }
    
    /**
     * True if has "calledCollaborationRef" attribute
     */
    public boolean isSetCalledCollaborationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CALLEDCOLLABORATIONREF$2) != null;
        }
    }
    
    /**
     * Sets the "calledCollaborationRef" attribute
     */
    public void setCalledCollaborationRef(javax.xml.namespace.QName calledCollaborationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALLEDCOLLABORATIONREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALLEDCOLLABORATIONREF$2);
            }
            target.setQNameValue(calledCollaborationRef);
        }
    }
    
    /**
     * Sets (as xml) the "calledCollaborationRef" attribute
     */
    public void xsetCalledCollaborationRef(org.apache.xmlbeans.XmlQName calledCollaborationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CALLEDCOLLABORATIONREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(CALLEDCOLLABORATIONREF$2);
            }
            target.set(calledCollaborationRef);
        }
    }
    
    /**
     * Unsets the "calledCollaborationRef" attribute
     */
    public void unsetCalledCollaborationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CALLEDCOLLABORATIONREF$2);
        }
    }
}

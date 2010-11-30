/*
 * XML Type:  tCallChoreography
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TCallChoreography
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tCallChoreography(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TCallChoreographyImpl extends org.omg.spec.bpmn.x20100524.model.impl.TChoreographyActivityImpl implements org.omg.spec.bpmn.x20100524.model.TCallChoreography
{
    private static final long serialVersionUID = 1L;
    
    public TCallChoreographyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTICIPANTASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "participantAssociation");
    private static final javax.xml.namespace.QName CALLEDCHOREOGRAPHYREF$2 = 
        new javax.xml.namespace.QName("", "calledChoreographyRef");
    
    
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
     * Gets the "calledChoreographyRef" attribute
     */
    public javax.xml.namespace.QName getCalledChoreographyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALLEDCHOREOGRAPHYREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "calledChoreographyRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetCalledChoreographyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CALLEDCHOREOGRAPHYREF$2);
            return target;
        }
    }
    
    /**
     * True if has "calledChoreographyRef" attribute
     */
    public boolean isSetCalledChoreographyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CALLEDCHOREOGRAPHYREF$2) != null;
        }
    }
    
    /**
     * Sets the "calledChoreographyRef" attribute
     */
    public void setCalledChoreographyRef(javax.xml.namespace.QName calledChoreographyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALLEDCHOREOGRAPHYREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALLEDCHOREOGRAPHYREF$2);
            }
            target.setQNameValue(calledChoreographyRef);
        }
    }
    
    /**
     * Sets (as xml) the "calledChoreographyRef" attribute
     */
    public void xsetCalledChoreographyRef(org.apache.xmlbeans.XmlQName calledChoreographyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CALLEDCHOREOGRAPHYREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(CALLEDCHOREOGRAPHYREF$2);
            }
            target.set(calledChoreographyRef);
        }
    }
    
    /**
     * Unsets the "calledChoreographyRef" attribute
     */
    public void unsetCalledChoreographyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CALLEDCHOREOGRAPHYREF$2);
        }
    }
}

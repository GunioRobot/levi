/*
 * XML Type:  tChoreographyActivity
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TChoreographyActivity
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tChoreographyActivity(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TChoreographyActivityImpl extends org.omg.spec.bpmn.x20100524.model.impl.TFlowNodeImpl implements org.omg.spec.bpmn.x20100524.model.TChoreographyActivity
{
    private static final long serialVersionUID = 1L;
    
    public TChoreographyActivityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTICIPANTREF$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "participantRef");
    private static final javax.xml.namespace.QName CORRELATIONKEY$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "correlationKey");
    private static final javax.xml.namespace.QName INITIATINGPARTICIPANTREF$4 = 
        new javax.xml.namespace.QName("", "initiatingParticipantRef");
    private static final javax.xml.namespace.QName LOOPTYPE$6 = 
        new javax.xml.namespace.QName("", "loopType");
    
    
    /**
     * Gets array of all "participantRef" elements
     */
    public javax.xml.namespace.QName[] getParticipantRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANTREF$0, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "participantRef" element
     */
    public javax.xml.namespace.QName getParticipantRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "participantRef" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetParticipantRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANTREF$0, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "participantRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetParticipantRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(PARTICIPANTREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "participantRef" element
     */
    public int sizeOfParticipantRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICIPANTREF$0);
        }
    }
    
    /**
     * Sets array of all "participantRef" element
     */
    public void setParticipantRefArray(javax.xml.namespace.QName[] participantRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(participantRefArray, PARTICIPANTREF$0);
        }
    }
    
    /**
     * Sets ith "participantRef" element
     */
    public void setParticipantRefArray(int i, javax.xml.namespace.QName participantRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTICIPANTREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(participantRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "participantRef" element
     */
    public void xsetParticipantRefArray(org.apache.xmlbeans.XmlQName[]participantRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(participantRefArray, PARTICIPANTREF$0);
        }
    }
    
    /**
     * Sets (as xml) ith "participantRef" element
     */
    public void xsetParticipantRefArray(int i, org.apache.xmlbeans.XmlQName participantRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(PARTICIPANTREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(participantRef);
        }
    }
    
    /**
     * Inserts the value as the ith "participantRef" element
     */
    public void insertParticipantRef(int i, javax.xml.namespace.QName participantRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PARTICIPANTREF$0, i);
            target.setQNameValue(participantRef);
        }
    }
    
    /**
     * Appends the value as the last "participantRef" element
     */
    public void addParticipantRef(javax.xml.namespace.QName participantRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTICIPANTREF$0);
            target.setQNameValue(participantRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participantRef" element
     */
    public org.apache.xmlbeans.XmlQName insertNewParticipantRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(PARTICIPANTREF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participantRef" element
     */
    public org.apache.xmlbeans.XmlQName addNewParticipantRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(PARTICIPANTREF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "participantRef" element
     */
    public void removeParticipantRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICIPANTREF$0, i);
        }
    }
    
    /**
     * Gets array of all "correlationKey" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationKey[] getCorrelationKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CORRELATIONKEY$2, targetList);
            org.omg.spec.bpmn.x20100524.model.TCorrelationKey[] result = new org.omg.spec.bpmn.x20100524.model.TCorrelationKey[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "correlationKey" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationKey getCorrelationKeyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationKey target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationKey)get_store().find_element_user(CORRELATIONKEY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "correlationKey" element
     */
    public int sizeOfCorrelationKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRELATIONKEY$2);
        }
    }
    
    /**
     * Sets array of all "correlationKey" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCorrelationKeyArray(org.omg.spec.bpmn.x20100524.model.TCorrelationKey[] correlationKeyArray)
    {
        check_orphaned();
        arraySetterHelper(correlationKeyArray, CORRELATIONKEY$2);
    }
    
    /**
     * Sets ith "correlationKey" element
     */
    public void setCorrelationKeyArray(int i, org.omg.spec.bpmn.x20100524.model.TCorrelationKey correlationKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationKey target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationKey)get_store().find_element_user(CORRELATIONKEY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(correlationKey);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "correlationKey" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationKey insertNewCorrelationKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationKey target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationKey)get_store().insert_element_user(CORRELATIONKEY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "correlationKey" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationKey addNewCorrelationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationKey target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationKey)get_store().add_element_user(CORRELATIONKEY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "correlationKey" element
     */
    public void removeCorrelationKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRELATIONKEY$2, i);
        }
    }
    
    /**
     * Gets the "initiatingParticipantRef" attribute
     */
    public javax.xml.namespace.QName getInitiatingParticipantRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INITIATINGPARTICIPANTREF$4);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(INITIATINGPARTICIPANTREF$4);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INITIATINGPARTICIPANTREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INITIATINGPARTICIPANTREF$4);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(INITIATINGPARTICIPANTREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(INITIATINGPARTICIPANTREF$4);
            }
            target.set(initiatingParticipantRef);
        }
    }
    
    /**
     * Gets the "loopType" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TChoreographyLoopType.Enum getLoopType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOOPTYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOOPTYPE$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.omg.spec.bpmn.x20100524.model.TChoreographyLoopType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "loopType" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TChoreographyLoopType xgetLoopType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TChoreographyLoopType target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TChoreographyLoopType)get_store().find_attribute_user(LOOPTYPE$6);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TChoreographyLoopType)get_default_attribute_value(LOOPTYPE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "loopType" attribute
     */
    public boolean isSetLoopType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOOPTYPE$6) != null;
        }
    }
    
    /**
     * Sets the "loopType" attribute
     */
    public void setLoopType(org.omg.spec.bpmn.x20100524.model.TChoreographyLoopType.Enum loopType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOOPTYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOOPTYPE$6);
            }
            target.setEnumValue(loopType);
        }
    }
    
    /**
     * Sets (as xml) the "loopType" attribute
     */
    public void xsetLoopType(org.omg.spec.bpmn.x20100524.model.TChoreographyLoopType loopType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TChoreographyLoopType target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TChoreographyLoopType)get_store().find_attribute_user(LOOPTYPE$6);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TChoreographyLoopType)get_store().add_attribute_user(LOOPTYPE$6);
            }
            target.set(loopType);
        }
    }
    
    /**
     * Unsets the "loopType" attribute
     */
    public void unsetLoopType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOOPTYPE$6);
        }
    }
}

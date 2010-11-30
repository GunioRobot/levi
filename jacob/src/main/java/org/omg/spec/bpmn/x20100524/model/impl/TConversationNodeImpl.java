/*
 * XML Type:  tConversationNode
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TConversationNode
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tConversationNode(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TConversationNodeImpl extends org.omg.spec.bpmn.x20100524.model.impl.TBaseElementImpl implements org.omg.spec.bpmn.x20100524.model.TConversationNode
{
    private static final long serialVersionUID = 1L;
    
    public TConversationNodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTICIPANTREF$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "participantRef");
    private static final javax.xml.namespace.QName MESSAGEFLOWREF$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "messageFlowRef");
    private static final javax.xml.namespace.QName CORRELATIONKEY$4 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "correlationKey");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    
    
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
     * Gets array of all "messageFlowRef" elements
     */
    public javax.xml.namespace.QName[] getMessageFlowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGEFLOWREF$2, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "messageFlowRef" element
     */
    public javax.xml.namespace.QName getMessageFlowRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEFLOWREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "messageFlowRef" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetMessageFlowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGEFLOWREF$2, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "messageFlowRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetMessageFlowRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(MESSAGEFLOWREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "messageFlowRef" element
     */
    public int sizeOfMessageFlowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEFLOWREF$2);
        }
    }
    
    /**
     * Sets array of all "messageFlowRef" element
     */
    public void setMessageFlowRefArray(javax.xml.namespace.QName[] messageFlowRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageFlowRefArray, MESSAGEFLOWREF$2);
        }
    }
    
    /**
     * Sets ith "messageFlowRef" element
     */
    public void setMessageFlowRefArray(int i, javax.xml.namespace.QName messageFlowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEFLOWREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(messageFlowRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "messageFlowRef" element
     */
    public void xsetMessageFlowRefArray(org.apache.xmlbeans.XmlQName[]messageFlowRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageFlowRefArray, MESSAGEFLOWREF$2);
        }
    }
    
    /**
     * Sets (as xml) ith "messageFlowRef" element
     */
    public void xsetMessageFlowRefArray(int i, org.apache.xmlbeans.XmlQName messageFlowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(MESSAGEFLOWREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageFlowRef);
        }
    }
    
    /**
     * Inserts the value as the ith "messageFlowRef" element
     */
    public void insertMessageFlowRef(int i, javax.xml.namespace.QName messageFlowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MESSAGEFLOWREF$2, i);
            target.setQNameValue(messageFlowRef);
        }
    }
    
    /**
     * Appends the value as the last "messageFlowRef" element
     */
    public void addMessageFlowRef(javax.xml.namespace.QName messageFlowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEFLOWREF$2);
            target.setQNameValue(messageFlowRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageFlowRef" element
     */
    public org.apache.xmlbeans.XmlQName insertNewMessageFlowRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(MESSAGEFLOWREF$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageFlowRef" element
     */
    public org.apache.xmlbeans.XmlQName addNewMessageFlowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(MESSAGEFLOWREF$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "messageFlowRef" element
     */
    public void removeMessageFlowRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEFLOWREF$2, i);
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
            get_store().find_all_element_users(CORRELATIONKEY$4, targetList);
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
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationKey)get_store().find_element_user(CORRELATIONKEY$4, i);
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
            return get_store().count_elements(CORRELATIONKEY$4);
        }
    }
    
    /**
     * Sets array of all "correlationKey" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCorrelationKeyArray(org.omg.spec.bpmn.x20100524.model.TCorrelationKey[] correlationKeyArray)
    {
        check_orphaned();
        arraySetterHelper(correlationKeyArray, CORRELATIONKEY$4);
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
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationKey)get_store().find_element_user(CORRELATIONKEY$4, i);
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
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationKey)get_store().insert_element_user(CORRELATIONKEY$4, i);
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
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationKey)get_store().add_element_user(CORRELATIONKEY$4);
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
            get_store().remove_element(CORRELATIONKEY$4, i);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$6) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$6);
        }
    }
}

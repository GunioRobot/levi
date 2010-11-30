/*
 * XML Type:  tThrowEvent
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TThrowEvent
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tThrowEvent(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TThrowEventImpl extends org.omg.spec.bpmn.x20100524.model.impl.TEventImpl implements org.omg.spec.bpmn.x20100524.model.TThrowEvent
{
    private static final long serialVersionUID = 1L;
    
    public TThrowEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAINPUT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataInput");
    private static final javax.xml.namespace.QName DATAINPUTASSOCIATION$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataInputAssociation");
    private static final javax.xml.namespace.QName INPUTSET$4 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "inputSet");
    private static final javax.xml.namespace.QName EVENTDEFINITION$6 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "eventDefinition");
    private static final org.apache.xmlbeans.QNameSet EVENTDEFINITION$7 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "linkEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "timerEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conditionalEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "errorEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "signalEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "compensateEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "escalationEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "terminateEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "eventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "cancelEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "messageEventDefinition"),
    });
    private static final javax.xml.namespace.QName EVENTDEFINITIONREF$8 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "eventDefinitionRef");
    
    
    /**
     * Gets array of all "dataInput" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInput[] getDataInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAINPUT$0, targetList);
            org.omg.spec.bpmn.x20100524.model.TDataInput[] result = new org.omg.spec.bpmn.x20100524.model.TDataInput[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataInput" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInput getDataInputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInput target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInput)get_store().find_element_user(DATAINPUT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataInput" element
     */
    public int sizeOfDataInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAINPUT$0);
        }
    }
    
    /**
     * Sets array of all "dataInput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDataInputArray(org.omg.spec.bpmn.x20100524.model.TDataInput[] dataInputArray)
    {
        check_orphaned();
        arraySetterHelper(dataInputArray, DATAINPUT$0);
    }
    
    /**
     * Sets ith "dataInput" element
     */
    public void setDataInputArray(int i, org.omg.spec.bpmn.x20100524.model.TDataInput dataInput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInput target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInput)get_store().find_element_user(DATAINPUT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataInput);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataInput" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInput insertNewDataInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInput target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInput)get_store().insert_element_user(DATAINPUT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataInput" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInput addNewDataInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInput target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInput)get_store().add_element_user(DATAINPUT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataInput" element
     */
    public void removeDataInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAINPUT$0, i);
        }
    }
    
    /**
     * Gets array of all "dataInputAssociation" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInputAssociation[] getDataInputAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAINPUTASSOCIATION$2, targetList);
            org.omg.spec.bpmn.x20100524.model.TDataInputAssociation[] result = new org.omg.spec.bpmn.x20100524.model.TDataInputAssociation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataInputAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInputAssociation getDataInputAssociationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInputAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInputAssociation)get_store().find_element_user(DATAINPUTASSOCIATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataInputAssociation" element
     */
    public int sizeOfDataInputAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAINPUTASSOCIATION$2);
        }
    }
    
    /**
     * Sets array of all "dataInputAssociation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDataInputAssociationArray(org.omg.spec.bpmn.x20100524.model.TDataInputAssociation[] dataInputAssociationArray)
    {
        check_orphaned();
        arraySetterHelper(dataInputAssociationArray, DATAINPUTASSOCIATION$2);
    }
    
    /**
     * Sets ith "dataInputAssociation" element
     */
    public void setDataInputAssociationArray(int i, org.omg.spec.bpmn.x20100524.model.TDataInputAssociation dataInputAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInputAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInputAssociation)get_store().find_element_user(DATAINPUTASSOCIATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataInputAssociation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataInputAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInputAssociation insertNewDataInputAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInputAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInputAssociation)get_store().insert_element_user(DATAINPUTASSOCIATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataInputAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInputAssociation addNewDataInputAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInputAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInputAssociation)get_store().add_element_user(DATAINPUTASSOCIATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataInputAssociation" element
     */
    public void removeDataInputAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAINPUTASSOCIATION$2, i);
        }
    }
    
    /**
     * Gets the "inputSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TInputSet getInputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInputSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInputSet)get_store().find_element_user(INPUTSET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "inputSet" element
     */
    public boolean isSetInputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUTSET$4) != 0;
        }
    }
    
    /**
     * Sets the "inputSet" element
     */
    public void setInputSet(org.omg.spec.bpmn.x20100524.model.TInputSet inputSet)
    {
        generatedSetterHelperImpl(inputSet, INPUTSET$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "inputSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TInputSet addNewInputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInputSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInputSet)get_store().add_element_user(INPUTSET$4);
            return target;
        }
    }
    
    /**
     * Unsets the "inputSet" element
     */
    public void unsetInputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUTSET$4, 0);
        }
    }
    
    /**
     * Gets array of all "eventDefinition" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TEventDefinition[] getEventDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENTDEFINITION$7, targetList);
            org.omg.spec.bpmn.x20100524.model.TEventDefinition[] result = new org.omg.spec.bpmn.x20100524.model.TEventDefinition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "eventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEventDefinition getEventDefinitionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEventDefinition)get_store().find_element_user(EVENTDEFINITION$7, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "eventDefinition" element
     */
    public int sizeOfEventDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTDEFINITION$7);
        }
    }
    
    /**
     * Sets array of all "eventDefinition" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEventDefinitionArray(org.omg.spec.bpmn.x20100524.model.TEventDefinition[] eventDefinitionArray)
    {
        check_orphaned();
        arraySetterHelper(eventDefinitionArray, EVENTDEFINITION$6, EVENTDEFINITION$7);
    }
    
    /**
     * Sets ith "eventDefinition" element
     */
    public void setEventDefinitionArray(int i, org.omg.spec.bpmn.x20100524.model.TEventDefinition eventDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEventDefinition)get_store().find_element_user(EVENTDEFINITION$7, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(eventDefinition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEventDefinition insertNewEventDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEventDefinition)get_store().insert_element_user(EVENTDEFINITION$7, EVENTDEFINITION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEventDefinition addNewEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEventDefinition)get_store().add_element_user(EVENTDEFINITION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "eventDefinition" element
     */
    public void removeEventDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTDEFINITION$7, i);
        }
    }
    
    /**
     * Gets array of all "eventDefinitionRef" elements
     */
    public javax.xml.namespace.QName[] getEventDefinitionRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENTDEFINITIONREF$8, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "eventDefinitionRef" element
     */
    public javax.xml.namespace.QName getEventDefinitionRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTDEFINITIONREF$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "eventDefinitionRef" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetEventDefinitionRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENTDEFINITIONREF$8, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "eventDefinitionRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetEventDefinitionRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(EVENTDEFINITIONREF$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "eventDefinitionRef" element
     */
    public int sizeOfEventDefinitionRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTDEFINITIONREF$8);
        }
    }
    
    /**
     * Sets array of all "eventDefinitionRef" element
     */
    public void setEventDefinitionRefArray(javax.xml.namespace.QName[] eventDefinitionRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eventDefinitionRefArray, EVENTDEFINITIONREF$8);
        }
    }
    
    /**
     * Sets ith "eventDefinitionRef" element
     */
    public void setEventDefinitionRefArray(int i, javax.xml.namespace.QName eventDefinitionRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTDEFINITIONREF$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(eventDefinitionRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "eventDefinitionRef" element
     */
    public void xsetEventDefinitionRefArray(org.apache.xmlbeans.XmlQName[]eventDefinitionRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eventDefinitionRefArray, EVENTDEFINITIONREF$8);
        }
    }
    
    /**
     * Sets (as xml) ith "eventDefinitionRef" element
     */
    public void xsetEventDefinitionRefArray(int i, org.apache.xmlbeans.XmlQName eventDefinitionRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(EVENTDEFINITIONREF$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(eventDefinitionRef);
        }
    }
    
    /**
     * Inserts the value as the ith "eventDefinitionRef" element
     */
    public void insertEventDefinitionRef(int i, javax.xml.namespace.QName eventDefinitionRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EVENTDEFINITIONREF$8, i);
            target.setQNameValue(eventDefinitionRef);
        }
    }
    
    /**
     * Appends the value as the last "eventDefinitionRef" element
     */
    public void addEventDefinitionRef(javax.xml.namespace.QName eventDefinitionRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTDEFINITIONREF$8);
            target.setQNameValue(eventDefinitionRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventDefinitionRef" element
     */
    public org.apache.xmlbeans.XmlQName insertNewEventDefinitionRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(EVENTDEFINITIONREF$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventDefinitionRef" element
     */
    public org.apache.xmlbeans.XmlQName addNewEventDefinitionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(EVENTDEFINITIONREF$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "eventDefinitionRef" element
     */
    public void removeEventDefinitionRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTDEFINITIONREF$8, i);
        }
    }
}

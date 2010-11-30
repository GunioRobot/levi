/*
 * XML Type:  tInputOutputSpecification
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tInputOutputSpecification(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TInputOutputSpecificationImpl extends org.omg.spec.bpmn.x20100524.model.impl.TBaseElementImpl implements org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification
{
    private static final long serialVersionUID = 1L;
    
    public TInputOutputSpecificationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAINPUT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataInput");
    private static final javax.xml.namespace.QName DATAOUTPUT$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataOutput");
    private static final javax.xml.namespace.QName INPUTSET$4 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "inputSet");
    private static final javax.xml.namespace.QName OUTPUTSET$6 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "outputSet");
    
    
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
     * Gets array of all "dataOutput" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TDataOutput[] getDataOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAOUTPUT$2, targetList);
            org.omg.spec.bpmn.x20100524.model.TDataOutput[] result = new org.omg.spec.bpmn.x20100524.model.TDataOutput[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataOutput" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataOutput getDataOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataOutput target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataOutput)get_store().find_element_user(DATAOUTPUT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataOutput" element
     */
    public int sizeOfDataOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAOUTPUT$2);
        }
    }
    
    /**
     * Sets array of all "dataOutput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDataOutputArray(org.omg.spec.bpmn.x20100524.model.TDataOutput[] dataOutputArray)
    {
        check_orphaned();
        arraySetterHelper(dataOutputArray, DATAOUTPUT$2);
    }
    
    /**
     * Sets ith "dataOutput" element
     */
    public void setDataOutputArray(int i, org.omg.spec.bpmn.x20100524.model.TDataOutput dataOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataOutput target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataOutput)get_store().find_element_user(DATAOUTPUT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataOutput);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataOutput" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataOutput insertNewDataOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataOutput target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataOutput)get_store().insert_element_user(DATAOUTPUT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataOutput" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataOutput addNewDataOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataOutput target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataOutput)get_store().add_element_user(DATAOUTPUT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataOutput" element
     */
    public void removeDataOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAOUTPUT$2, i);
        }
    }
    
    /**
     * Gets array of all "inputSet" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TInputSet[] getInputSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INPUTSET$4, targetList);
            org.omg.spec.bpmn.x20100524.model.TInputSet[] result = new org.omg.spec.bpmn.x20100524.model.TInputSet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "inputSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TInputSet getInputSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInputSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInputSet)get_store().find_element_user(INPUTSET$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "inputSet" element
     */
    public int sizeOfInputSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUTSET$4);
        }
    }
    
    /**
     * Sets array of all "inputSet" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInputSetArray(org.omg.spec.bpmn.x20100524.model.TInputSet[] inputSetArray)
    {
        check_orphaned();
        arraySetterHelper(inputSetArray, INPUTSET$4);
    }
    
    /**
     * Sets ith "inputSet" element
     */
    public void setInputSetArray(int i, org.omg.spec.bpmn.x20100524.model.TInputSet inputSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInputSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInputSet)get_store().find_element_user(INPUTSET$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(inputSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "inputSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TInputSet insertNewInputSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInputSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInputSet)get_store().insert_element_user(INPUTSET$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "inputSet" element
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
     * Removes the ith "inputSet" element
     */
    public void removeInputSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUTSET$4, i);
        }
    }
    
    /**
     * Gets array of all "outputSet" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TOutputSet[] getOutputSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTPUTSET$6, targetList);
            org.omg.spec.bpmn.x20100524.model.TOutputSet[] result = new org.omg.spec.bpmn.x20100524.model.TOutputSet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "outputSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TOutputSet getOutputSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TOutputSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TOutputSet)get_store().find_element_user(OUTPUTSET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "outputSet" element
     */
    public int sizeOfOutputSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTPUTSET$6);
        }
    }
    
    /**
     * Sets array of all "outputSet" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOutputSetArray(org.omg.spec.bpmn.x20100524.model.TOutputSet[] outputSetArray)
    {
        check_orphaned();
        arraySetterHelper(outputSetArray, OUTPUTSET$6);
    }
    
    /**
     * Sets ith "outputSet" element
     */
    public void setOutputSetArray(int i, org.omg.spec.bpmn.x20100524.model.TOutputSet outputSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TOutputSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TOutputSet)get_store().find_element_user(OUTPUTSET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(outputSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "outputSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TOutputSet insertNewOutputSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TOutputSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TOutputSet)get_store().insert_element_user(OUTPUTSET$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "outputSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TOutputSet addNewOutputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TOutputSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TOutputSet)get_store().add_element_user(OUTPUTSET$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "outputSet" element
     */
    public void removeOutputSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTPUTSET$6, i);
        }
    }
}

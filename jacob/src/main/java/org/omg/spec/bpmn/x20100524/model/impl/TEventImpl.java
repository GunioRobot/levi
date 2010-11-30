/*
 * XML Type:  tEvent
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TEvent
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tEvent(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TEventImpl extends org.omg.spec.bpmn.x20100524.model.impl.TFlowNodeImpl implements org.omg.spec.bpmn.x20100524.model.TEvent
{
    private static final long serialVersionUID = 1L;
    
    public TEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "property");
    
    
    /**
     * Gets array of all "property" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TProperty[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTY$0, targetList);
            org.omg.spec.bpmn.x20100524.model.TProperty[] result = new org.omg.spec.bpmn.x20100524.model.TProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "property" element
     */
    public org.omg.spec.bpmn.x20100524.model.TProperty getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProperty target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProperty)get_store().find_element_user(PROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "property" element
     */
    public int sizeOfPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$0);
        }
    }
    
    /**
     * Sets array of all "property" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPropertyArray(org.omg.spec.bpmn.x20100524.model.TProperty[] propertyArray)
    {
        check_orphaned();
        arraySetterHelper(propertyArray, PROPERTY$0);
    }
    
    /**
     * Sets ith "property" element
     */
    public void setPropertyArray(int i, org.omg.spec.bpmn.x20100524.model.TProperty property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProperty target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProperty)get_store().find_element_user(PROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(property);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    public org.omg.spec.bpmn.x20100524.model.TProperty insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProperty target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProperty)get_store().insert_element_user(PROPERTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    public org.omg.spec.bpmn.x20100524.model.TProperty addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProperty target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProperty)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "property" element
     */
    public void removeProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$0, i);
        }
    }
}

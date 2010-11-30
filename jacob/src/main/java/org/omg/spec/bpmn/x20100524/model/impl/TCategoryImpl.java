/*
 * XML Type:  tCategory
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TCategory
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tCategory(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TCategoryImpl extends org.omg.spec.bpmn.x20100524.model.impl.TRootElementImpl implements org.omg.spec.bpmn.x20100524.model.TCategory
{
    private static final long serialVersionUID = 1L;
    
    public TCategoryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYVALUE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "categoryValue");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets array of all "categoryValue" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TCategoryValue[] getCategoryValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYVALUE$0, targetList);
            org.omg.spec.bpmn.x20100524.model.TCategoryValue[] result = new org.omg.spec.bpmn.x20100524.model.TCategoryValue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "categoryValue" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCategoryValue getCategoryValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCategoryValue target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCategoryValue)get_store().find_element_user(CATEGORYVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "categoryValue" element
     */
    public int sizeOfCategoryValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYVALUE$0);
        }
    }
    
    /**
     * Sets array of all "categoryValue" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCategoryValueArray(org.omg.spec.bpmn.x20100524.model.TCategoryValue[] categoryValueArray)
    {
        check_orphaned();
        arraySetterHelper(categoryValueArray, CATEGORYVALUE$0);
    }
    
    /**
     * Sets ith "categoryValue" element
     */
    public void setCategoryValueArray(int i, org.omg.spec.bpmn.x20100524.model.TCategoryValue categoryValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCategoryValue target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCategoryValue)get_store().find_element_user(CATEGORYVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categoryValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "categoryValue" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCategoryValue insertNewCategoryValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCategoryValue target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCategoryValue)get_store().insert_element_user(CATEGORYVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "categoryValue" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCategoryValue addNewCategoryValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCategoryValue target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCategoryValue)get_store().add_element_user(CATEGORYVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "categoryValue" element
     */
    public void removeCategoryValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYVALUE$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
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
            return get_store().find_attribute_user(NAME$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
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
            get_store().remove_attribute(NAME$2);
        }
    }
}

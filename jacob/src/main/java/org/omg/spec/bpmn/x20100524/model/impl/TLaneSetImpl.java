/*
 * XML Type:  tLaneSet
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TLaneSet
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tLaneSet(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TLaneSetImpl extends org.omg.spec.bpmn.x20100524.model.impl.TBaseElementImpl implements org.omg.spec.bpmn.x20100524.model.TLaneSet
{
    private static final long serialVersionUID = 1L;
    
    public TLaneSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "lane");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets array of all "lane" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TLane[] getLaneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LANE$0, targetList);
            org.omg.spec.bpmn.x20100524.model.TLane[] result = new org.omg.spec.bpmn.x20100524.model.TLane[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lane" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLane getLaneArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLane target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLane)get_store().find_element_user(LANE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lane" element
     */
    public int sizeOfLaneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANE$0);
        }
    }
    
    /**
     * Sets array of all "lane" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLaneArray(org.omg.spec.bpmn.x20100524.model.TLane[] laneArray)
    {
        check_orphaned();
        arraySetterHelper(laneArray, LANE$0);
    }
    
    /**
     * Sets ith "lane" element
     */
    public void setLaneArray(int i, org.omg.spec.bpmn.x20100524.model.TLane lane)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLane target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLane)get_store().find_element_user(LANE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lane);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lane" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLane insertNewLane(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLane target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLane)get_store().insert_element_user(LANE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lane" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLane addNewLane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLane target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLane)get_store().add_element_user(LANE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "lane" element
     */
    public void removeLane(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANE$0, i);
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

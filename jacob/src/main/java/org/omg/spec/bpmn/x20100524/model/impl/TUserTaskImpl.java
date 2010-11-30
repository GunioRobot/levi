/*
 * XML Type:  tUserTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TUserTask
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tUserTask(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TUserTaskImpl extends org.omg.spec.bpmn.x20100524.model.impl.TTaskImpl implements org.omg.spec.bpmn.x20100524.model.TUserTask
{
    private static final long serialVersionUID = 1L;
    
    public TUserTaskImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERING$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "rendering");
    private static final javax.xml.namespace.QName IMPLEMENTATION$2 = 
        new javax.xml.namespace.QName("", "implementation");
    
    
    /**
     * Gets array of all "rendering" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TRendering[] getRenderingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RENDERING$0, targetList);
            org.omg.spec.bpmn.x20100524.model.TRendering[] result = new org.omg.spec.bpmn.x20100524.model.TRendering[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rendering" element
     */
    public org.omg.spec.bpmn.x20100524.model.TRendering getRenderingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TRendering target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TRendering)get_store().find_element_user(RENDERING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rendering" element
     */
    public int sizeOfRenderingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RENDERING$0);
        }
    }
    
    /**
     * Sets array of all "rendering" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRenderingArray(org.omg.spec.bpmn.x20100524.model.TRendering[] renderingArray)
    {
        check_orphaned();
        arraySetterHelper(renderingArray, RENDERING$0);
    }
    
    /**
     * Sets ith "rendering" element
     */
    public void setRenderingArray(int i, org.omg.spec.bpmn.x20100524.model.TRendering rendering)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TRendering target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TRendering)get_store().find_element_user(RENDERING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rendering);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rendering" element
     */
    public org.omg.spec.bpmn.x20100524.model.TRendering insertNewRendering(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TRendering target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TRendering)get_store().insert_element_user(RENDERING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rendering" element
     */
    public org.omg.spec.bpmn.x20100524.model.TRendering addNewRendering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TRendering target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TRendering)get_store().add_element_user(RENDERING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "rendering" element
     */
    public void removeRendering(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RENDERING$0, i);
        }
    }
    
    /**
     * Gets the "implementation" attribute
     */
    public java.lang.Object getImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPLEMENTATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IMPLEMENTATION$2);
            }
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "implementation" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TImplementation xgetImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TImplementation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TImplementation)get_store().find_attribute_user(IMPLEMENTATION$2);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TImplementation)get_default_attribute_value(IMPLEMENTATION$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "implementation" attribute
     */
    public boolean isSetImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IMPLEMENTATION$2) != null;
        }
    }
    
    /**
     * Sets the "implementation" attribute
     */
    public void setImplementation(java.lang.Object implementation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPLEMENTATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMPLEMENTATION$2);
            }
            target.setObjectValue(implementation);
        }
    }
    
    /**
     * Sets (as xml) the "implementation" attribute
     */
    public void xsetImplementation(org.omg.spec.bpmn.x20100524.model.TImplementation implementation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TImplementation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TImplementation)get_store().find_attribute_user(IMPLEMENTATION$2);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TImplementation)get_store().add_attribute_user(IMPLEMENTATION$2);
            }
            target.set(implementation);
        }
    }
    
    /**
     * Unsets the "implementation" attribute
     */
    public void unsetImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IMPLEMENTATION$2);
        }
    }
}

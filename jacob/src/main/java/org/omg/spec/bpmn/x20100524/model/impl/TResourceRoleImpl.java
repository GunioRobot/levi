/*
 * XML Type:  tResourceRole
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TResourceRole
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tResourceRole(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TResourceRoleImpl extends org.omg.spec.bpmn.x20100524.model.impl.TBaseElementImpl implements org.omg.spec.bpmn.x20100524.model.TResourceRole
{
    private static final long serialVersionUID = 1L;
    
    public TResourceRoleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEREF$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resourceRef");
    private static final javax.xml.namespace.QName RESOURCEPARAMETERBINDING$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resourceParameterBinding");
    private static final javax.xml.namespace.QName RESOURCEASSIGNMENTEXPRESSION$4 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resourceAssignmentExpression");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "resourceRef" element
     */
    public javax.xml.namespace.QName getResourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "resourceRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetResourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(RESOURCEREF$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "resourceRef" element
     */
    public boolean isSetResourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEREF$0) != 0;
        }
    }
    
    /**
     * Sets the "resourceRef" element
     */
    public void setResourceRef(javax.xml.namespace.QName resourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCEREF$0);
            }
            target.setQNameValue(resourceRef);
        }
    }
    
    /**
     * Sets (as xml) the "resourceRef" element
     */
    public void xsetResourceRef(org.apache.xmlbeans.XmlQName resourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(RESOURCEREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(RESOURCEREF$0);
            }
            target.set(resourceRef);
        }
    }
    
    /**
     * Unsets the "resourceRef" element
     */
    public void unsetResourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEREF$0, 0);
        }
    }
    
    /**
     * Gets array of all "resourceParameterBinding" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding[] getResourceParameterBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEPARAMETERBINDING$2, targetList);
            org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding[] result = new org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resourceParameterBinding" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding getResourceParameterBindingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding)get_store().find_element_user(RESOURCEPARAMETERBINDING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resourceParameterBinding" element
     */
    public int sizeOfResourceParameterBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEPARAMETERBINDING$2);
        }
    }
    
    /**
     * Sets array of all "resourceParameterBinding" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResourceParameterBindingArray(org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding[] resourceParameterBindingArray)
    {
        check_orphaned();
        arraySetterHelper(resourceParameterBindingArray, RESOURCEPARAMETERBINDING$2);
    }
    
    /**
     * Sets ith "resourceParameterBinding" element
     */
    public void setResourceParameterBindingArray(int i, org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding resourceParameterBinding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding)get_store().find_element_user(RESOURCEPARAMETERBINDING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceParameterBinding);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceParameterBinding" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding insertNewResourceParameterBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding)get_store().insert_element_user(RESOURCEPARAMETERBINDING$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceParameterBinding" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding addNewResourceParameterBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding)get_store().add_element_user(RESOURCEPARAMETERBINDING$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "resourceParameterBinding" element
     */
    public void removeResourceParameterBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEPARAMETERBINDING$2, i);
        }
    }
    
    /**
     * Gets the "resourceAssignmentExpression" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceAssignmentExpression getResourceAssignmentExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceAssignmentExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceAssignmentExpression)get_store().find_element_user(RESOURCEASSIGNMENTEXPRESSION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "resourceAssignmentExpression" element
     */
    public boolean isSetResourceAssignmentExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEASSIGNMENTEXPRESSION$4) != 0;
        }
    }
    
    /**
     * Sets the "resourceAssignmentExpression" element
     */
    public void setResourceAssignmentExpression(org.omg.spec.bpmn.x20100524.model.TResourceAssignmentExpression resourceAssignmentExpression)
    {
        generatedSetterHelperImpl(resourceAssignmentExpression, RESOURCEASSIGNMENTEXPRESSION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resourceAssignmentExpression" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceAssignmentExpression addNewResourceAssignmentExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceAssignmentExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceAssignmentExpression)get_store().add_element_user(RESOURCEASSIGNMENTEXPRESSION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "resourceAssignmentExpression" element
     */
    public void unsetResourceAssignmentExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEASSIGNMENTEXPRESSION$4, 0);
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

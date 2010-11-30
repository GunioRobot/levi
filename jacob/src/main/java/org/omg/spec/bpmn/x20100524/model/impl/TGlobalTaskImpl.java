/*
 * XML Type:  tGlobalTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TGlobalTask
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tGlobalTask(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TGlobalTaskImpl extends org.omg.spec.bpmn.x20100524.model.impl.TCallableElementImpl implements org.omg.spec.bpmn.x20100524.model.TGlobalTask
{
    private static final long serialVersionUID = 1L;
    
    public TGlobalTaskImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEROLE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resourceRole");
    private static final org.apache.xmlbeans.QNameSet RESOURCEROLE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "humanPerformer"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "performer"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "potentialOwner"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resourceRole"),
    });
    
    
    /**
     * Gets array of all "resourceRole" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceRole[] getResourceRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEROLE$1, targetList);
            org.omg.spec.bpmn.x20100524.model.TResourceRole[] result = new org.omg.spec.bpmn.x20100524.model.TResourceRole[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resourceRole" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceRole getResourceRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceRole target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceRole)get_store().find_element_user(RESOURCEROLE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resourceRole" element
     */
    public int sizeOfResourceRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEROLE$1);
        }
    }
    
    /**
     * Sets array of all "resourceRole" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResourceRoleArray(org.omg.spec.bpmn.x20100524.model.TResourceRole[] resourceRoleArray)
    {
        check_orphaned();
        arraySetterHelper(resourceRoleArray, RESOURCEROLE$0, RESOURCEROLE$1);
    }
    
    /**
     * Sets ith "resourceRole" element
     */
    public void setResourceRoleArray(int i, org.omg.spec.bpmn.x20100524.model.TResourceRole resourceRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceRole target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceRole)get_store().find_element_user(RESOURCEROLE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceRole);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceRole" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceRole insertNewResourceRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceRole target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceRole)get_store().insert_element_user(RESOURCEROLE$1, RESOURCEROLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceRole" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceRole addNewResourceRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceRole target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceRole)get_store().add_element_user(RESOURCEROLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "resourceRole" element
     */
    public void removeResourceRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEROLE$1, i);
        }
    }
}

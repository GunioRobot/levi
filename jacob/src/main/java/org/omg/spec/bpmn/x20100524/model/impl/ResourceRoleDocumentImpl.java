/*
 * An XML document type.
 * Localname: resourceRole
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ResourceRoleDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one resourceRole(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ResourceRoleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ResourceRoleDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceRoleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
     * Gets the "resourceRole" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceRole getResourceRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceRole target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceRole)get_store().find_element_user(RESOURCEROLE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resourceRole" element
     */
    public void setResourceRole(org.omg.spec.bpmn.x20100524.model.TResourceRole resourceRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceRole target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceRole)get_store().find_element_user(RESOURCEROLE$1, 0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TResourceRole)get_store().add_element_user(RESOURCEROLE$0);
            }
            target.set(resourceRole);
        }
    }
    
    /**
     * Appends and returns a new empty "resourceRole" element
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
}

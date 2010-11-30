/*
 * An XML document type.
 * Localname: resource
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ResourceDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one resource(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ResourceDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resource");
    
    
    /**
     * Gets the "resource" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResource getResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResource target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResource)get_store().find_element_user(RESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resource" element
     */
    public void setResource(org.omg.spec.bpmn.x20100524.model.TResource resource)
    {
        generatedSetterHelperImpl(resource, RESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resource" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResource addNewResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResource target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResource)get_store().add_element_user(RESOURCE$0);
            return target;
        }
    }
}

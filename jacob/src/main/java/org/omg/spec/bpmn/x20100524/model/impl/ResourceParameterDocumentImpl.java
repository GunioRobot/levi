/*
 * An XML document type.
 * Localname: resourceParameter
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ResourceParameterDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one resourceParameter(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ResourceParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ResourceParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resourceParameter");
    
    
    /**
     * Gets the "resourceParameter" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceParameter getResourceParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceParameter target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceParameter)get_store().find_element_user(RESOURCEPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resourceParameter" element
     */
    public void setResourceParameter(org.omg.spec.bpmn.x20100524.model.TResourceParameter resourceParameter)
    {
        generatedSetterHelperImpl(resourceParameter, RESOURCEPARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resourceParameter" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceParameter addNewResourceParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceParameter target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceParameter)get_store().add_element_user(RESOURCEPARAMETER$0);
            return target;
        }
    }
}

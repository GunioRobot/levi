/*
 * An XML document type.
 * Localname: resourceParameterBinding
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ResourceParameterBindingDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one resourceParameterBinding(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ResourceParameterBindingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ResourceParameterBindingDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceParameterBindingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEPARAMETERBINDING$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resourceParameterBinding");
    
    
    /**
     * Gets the "resourceParameterBinding" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding getResourceParameterBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding)get_store().find_element_user(RESOURCEPARAMETERBINDING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resourceParameterBinding" element
     */
    public void setResourceParameterBinding(org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding resourceParameterBinding)
    {
        generatedSetterHelperImpl(resourceParameterBinding, RESOURCEPARAMETERBINDING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resourceParameterBinding" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding addNewResourceParameterBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding)get_store().add_element_user(RESOURCEPARAMETERBINDING$0);
            return target;
        }
    }
}

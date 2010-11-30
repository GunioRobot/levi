/*
 * An XML document type.
 * Localname: rendering
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.RenderingDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one rendering(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class RenderingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.RenderingDocument
{
    private static final long serialVersionUID = 1L;
    
    public RenderingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERING$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "rendering");
    
    
    /**
     * Gets the "rendering" element
     */
    public org.omg.spec.bpmn.x20100524.model.TRendering getRendering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TRendering target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TRendering)get_store().find_element_user(RENDERING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rendering" element
     */
    public void setRendering(org.omg.spec.bpmn.x20100524.model.TRendering rendering)
    {
        generatedSetterHelperImpl(rendering, RENDERING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rendering" element
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
}

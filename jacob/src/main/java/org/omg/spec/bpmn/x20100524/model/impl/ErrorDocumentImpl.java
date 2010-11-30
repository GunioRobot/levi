/*
 * An XML document type.
 * Localname: error
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ErrorDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one error(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ErrorDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ErrorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "error");
    
    
    /**
     * Gets the "error" element
     */
    public org.omg.spec.bpmn.x20100524.model.TError getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TError target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TError)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "error" element
     */
    public void setError(org.omg.spec.bpmn.x20100524.model.TError error)
    {
        generatedSetterHelperImpl(error, ERROR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "error" element
     */
    public org.omg.spec.bpmn.x20100524.model.TError addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TError target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TError)get_store().add_element_user(ERROR$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: extension
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ExtensionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one extension(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ExtensionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ExtensionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtensionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENSION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "extension");
    
    
    /**
     * Gets the "extension" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExtension getExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExtension target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExtension)get_store().find_element_user(EXTENSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "extension" element
     */
    public void setExtension(org.omg.spec.bpmn.x20100524.model.TExtension extension)
    {
        generatedSetterHelperImpl(extension, EXTENSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extension" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExtension addNewExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExtension target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExtension)get_store().add_element_user(EXTENSION$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: extensionElements
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ExtensionElementsDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one extensionElements(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ExtensionElementsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ExtensionElementsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtensionElementsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENSIONELEMENTS$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "extensionElements");
    
    
    /**
     * Gets the "extensionElements" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExtensionElements getExtensionElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExtensionElements target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExtensionElements)get_store().find_element_user(EXTENSIONELEMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "extensionElements" element
     */
    public void setExtensionElements(org.omg.spec.bpmn.x20100524.model.TExtensionElements extensionElements)
    {
        generatedSetterHelperImpl(extensionElements, EXTENSIONELEMENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extensionElements" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExtensionElements addNewExtensionElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExtensionElements target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExtensionElements)get_store().add_element_user(EXTENSIONELEMENTS$0);
            return target;
        }
    }
}

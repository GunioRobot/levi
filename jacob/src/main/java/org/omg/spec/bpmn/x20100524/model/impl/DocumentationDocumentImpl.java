/*
 * An XML document type.
 * Localname: documentation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.DocumentationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one documentation(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class DocumentationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.DocumentationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocumentationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "documentation");
    
    
    /**
     * Gets the "documentation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDocumentation getDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDocumentation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDocumentation)get_store().find_element_user(DOCUMENTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "documentation" element
     */
    public void setDocumentation(org.omg.spec.bpmn.x20100524.model.TDocumentation documentation)
    {
        generatedSetterHelperImpl(documentation, DOCUMENTATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "documentation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDocumentation addNewDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDocumentation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDocumentation)get_store().add_element_user(DOCUMENTATION$0);
            return target;
        }
    }
}

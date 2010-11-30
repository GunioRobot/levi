/*
 * An XML document type.
 * Localname: definitions
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.DefinitionsDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one definitions(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class DefinitionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.DefinitionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONS$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "definitions");
    
    
    /**
     * Gets the "definitions" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDefinitions getDefinitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDefinitions target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDefinitions)get_store().find_element_user(DEFINITIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "definitions" element
     */
    public void setDefinitions(org.omg.spec.bpmn.x20100524.model.TDefinitions definitions)
    {
        generatedSetterHelperImpl(definitions, DEFINITIONS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "definitions" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDefinitions addNewDefinitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDefinitions target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDefinitions)get_store().add_element_user(DEFINITIONS$0);
            return target;
        }
    }
}

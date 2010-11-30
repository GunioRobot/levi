/*
 * An XML document type.
 * Localname: errorEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ErrorEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one errorEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ErrorEventDefinitionDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.EventDefinitionDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ErrorEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROREVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "errorEventDefinition");
    
    
    /**
     * Gets the "errorEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TErrorEventDefinition getErrorEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TErrorEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TErrorEventDefinition)get_store().find_element_user(ERROREVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "errorEventDefinition" element
     */
    public void setErrorEventDefinition(org.omg.spec.bpmn.x20100524.model.TErrorEventDefinition errorEventDefinition)
    {
        generatedSetterHelperImpl(errorEventDefinition, ERROREVENTDEFINITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "errorEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TErrorEventDefinition addNewErrorEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TErrorEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TErrorEventDefinition)get_store().add_element_user(ERROREVENTDEFINITION$0);
            return target;
        }
    }
}

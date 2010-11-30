/*
 * An XML document type.
 * Localname: terminateEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TerminateEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one terminateEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class TerminateEventDefinitionDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.EventDefinitionDocumentImpl implements org.omg.spec.bpmn.x20100524.model.TerminateEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public TerminateEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TERMINATEEVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "terminateEventDefinition");
    
    
    /**
     * Gets the "terminateEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TTerminateEventDefinition getTerminateEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TTerminateEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TTerminateEventDefinition)get_store().find_element_user(TERMINATEEVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "terminateEventDefinition" element
     */
    public void setTerminateEventDefinition(org.omg.spec.bpmn.x20100524.model.TTerminateEventDefinition terminateEventDefinition)
    {
        generatedSetterHelperImpl(terminateEventDefinition, TERMINATEEVENTDEFINITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "terminateEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TTerminateEventDefinition addNewTerminateEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TTerminateEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TTerminateEventDefinition)get_store().add_element_user(TERMINATEEVENTDEFINITION$0);
            return target;
        }
    }
}

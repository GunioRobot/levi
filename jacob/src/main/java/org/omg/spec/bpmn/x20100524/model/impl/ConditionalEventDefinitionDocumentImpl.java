/*
 * An XML document type.
 * Localname: conditionalEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ConditionalEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one conditionalEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ConditionalEventDefinitionDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.EventDefinitionDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ConditionalEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConditionalEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITIONALEVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conditionalEventDefinition");
    
    
    /**
     * Gets the "conditionalEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConditionalEventDefinition getConditionalEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConditionalEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConditionalEventDefinition)get_store().find_element_user(CONDITIONALEVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "conditionalEventDefinition" element
     */
    public void setConditionalEventDefinition(org.omg.spec.bpmn.x20100524.model.TConditionalEventDefinition conditionalEventDefinition)
    {
        generatedSetterHelperImpl(conditionalEventDefinition, CONDITIONALEVENTDEFINITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "conditionalEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConditionalEventDefinition addNewConditionalEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConditionalEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConditionalEventDefinition)get_store().add_element_user(CONDITIONALEVENTDEFINITION$0);
            return target;
        }
    }
}

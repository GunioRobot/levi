/*
 * An XML document type.
 * Localname: escalationEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.EscalationEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one escalationEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class EscalationEventDefinitionDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.EventDefinitionDocumentImpl implements org.omg.spec.bpmn.x20100524.model.EscalationEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public EscalationEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESCALATIONEVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "escalationEventDefinition");
    
    
    /**
     * Gets the "escalationEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEscalationEventDefinition getEscalationEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEscalationEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEscalationEventDefinition)get_store().find_element_user(ESCALATIONEVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "escalationEventDefinition" element
     */
    public void setEscalationEventDefinition(org.omg.spec.bpmn.x20100524.model.TEscalationEventDefinition escalationEventDefinition)
    {
        generatedSetterHelperImpl(escalationEventDefinition, ESCALATIONEVENTDEFINITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "escalationEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEscalationEventDefinition addNewEscalationEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEscalationEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEscalationEventDefinition)get_store().add_element_user(ESCALATIONEVENTDEFINITION$0);
            return target;
        }
    }
}

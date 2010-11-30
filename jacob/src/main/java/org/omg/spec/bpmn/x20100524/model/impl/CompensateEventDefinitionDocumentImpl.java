/*
 * An XML document type.
 * Localname: compensateEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.CompensateEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one compensateEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class CompensateEventDefinitionDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.EventDefinitionDocumentImpl implements org.omg.spec.bpmn.x20100524.model.CompensateEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompensateEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPENSATEEVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "compensateEventDefinition");
    
    
    /**
     * Gets the "compensateEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCompensateEventDefinition getCompensateEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCompensateEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCompensateEventDefinition)get_store().find_element_user(COMPENSATEEVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "compensateEventDefinition" element
     */
    public void setCompensateEventDefinition(org.omg.spec.bpmn.x20100524.model.TCompensateEventDefinition compensateEventDefinition)
    {
        generatedSetterHelperImpl(compensateEventDefinition, COMPENSATEEVENTDEFINITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "compensateEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCompensateEventDefinition addNewCompensateEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCompensateEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCompensateEventDefinition)get_store().add_element_user(COMPENSATEEVENTDEFINITION$0);
            return target;
        }
    }
}

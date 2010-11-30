/*
 * An XML document type.
 * Localname: complexBehaviorDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ComplexBehaviorDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one complexBehaviorDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ComplexBehaviorDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ComplexBehaviorDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ComplexBehaviorDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLEXBEHAVIORDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "complexBehaviorDefinition");
    
    
    /**
     * Gets the "complexBehaviorDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition getComplexBehaviorDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition)get_store().find_element_user(COMPLEXBEHAVIORDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "complexBehaviorDefinition" element
     */
    public void setComplexBehaviorDefinition(org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition complexBehaviorDefinition)
    {
        generatedSetterHelperImpl(complexBehaviorDefinition, COMPLEXBEHAVIORDEFINITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "complexBehaviorDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition addNewComplexBehaviorDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition)get_store().add_element_user(COMPLEXBEHAVIORDEFINITION$0);
            return target;
        }
    }
}

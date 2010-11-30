/*
 * XML Type:  tConditionalEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TConditionalEventDefinition
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tConditionalEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TConditionalEventDefinitionImpl extends org.omg.spec.bpmn.x20100524.model.impl.TEventDefinitionImpl implements org.omg.spec.bpmn.x20100524.model.TConditionalEventDefinition
{
    private static final long serialVersionUID = 1L;
    
    public TConditionalEventDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "condition");
    
    
    /**
     * Gets the "condition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression getCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().find_element_user(CONDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "condition" element
     */
    public void setCondition(org.omg.spec.bpmn.x20100524.model.TExpression condition)
    {
        generatedSetterHelperImpl(condition, CONDITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "condition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().add_element_user(CONDITION$0);
            return target;
        }
    }
}

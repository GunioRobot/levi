/*
 * XML Type:  tComplexBehaviorDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tComplexBehaviorDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TComplexBehaviorDefinitionImpl extends org.omg.spec.bpmn.x20100524.model.impl.TBaseElementImpl implements org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition
{
    private static final long serialVersionUID = 1L;
    
    public TComplexBehaviorDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "condition");
    private static final javax.xml.namespace.QName EVENT$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "event");
    
    
    /**
     * Gets the "condition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TFormalExpression getCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TFormalExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TFormalExpression)get_store().find_element_user(CONDITION$0, 0);
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
    public void setCondition(org.omg.spec.bpmn.x20100524.model.TFormalExpression condition)
    {
        generatedSetterHelperImpl(condition, CONDITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "condition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TFormalExpression addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TFormalExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TFormalExpression)get_store().add_element_user(CONDITION$0);
            return target;
        }
    }
    
    /**
     * Gets the "event" element
     */
    public org.omg.spec.bpmn.x20100524.model.TImplicitThrowEvent getEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TImplicitThrowEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TImplicitThrowEvent)get_store().find_element_user(EVENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "event" element
     */
    public boolean isSetEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENT$2) != 0;
        }
    }
    
    /**
     * Sets the "event" element
     */
    public void setEvent(org.omg.spec.bpmn.x20100524.model.TImplicitThrowEvent event)
    {
        generatedSetterHelperImpl(event, EVENT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "event" element
     */
    public org.omg.spec.bpmn.x20100524.model.TImplicitThrowEvent addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TImplicitThrowEvent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TImplicitThrowEvent)get_store().add_element_user(EVENT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "event" element
     */
    public void unsetEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENT$2, 0);
        }
    }
}

/*
 * An XML document type.
 * Localname: timerEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TimerEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one timerEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class TimerEventDefinitionDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.EventDefinitionDocumentImpl implements org.omg.spec.bpmn.x20100524.model.TimerEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimerEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEREVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "timerEventDefinition");
    
    
    /**
     * Gets the "timerEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TTimerEventDefinition getTimerEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TTimerEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TTimerEventDefinition)get_store().find_element_user(TIMEREVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "timerEventDefinition" element
     */
    public void setTimerEventDefinition(org.omg.spec.bpmn.x20100524.model.TTimerEventDefinition timerEventDefinition)
    {
        generatedSetterHelperImpl(timerEventDefinition, TIMEREVENTDEFINITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timerEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TTimerEventDefinition addNewTimerEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TTimerEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TTimerEventDefinition)get_store().add_element_user(TIMEREVENTDEFINITION$0);
            return target;
        }
    }
}

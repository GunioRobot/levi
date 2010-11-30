/*
 * XML Type:  tTimerEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TTimerEventDefinition
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tTimerEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TTimerEventDefinitionImpl extends org.omg.spec.bpmn.x20100524.model.impl.TEventDefinitionImpl implements org.omg.spec.bpmn.x20100524.model.TTimerEventDefinition
{
    private static final long serialVersionUID = 1L;
    
    public TTimerEventDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEDATE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "timeDate");
    private static final javax.xml.namespace.QName TIMEDURATION$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "timeDuration");
    private static final javax.xml.namespace.QName TIMECYCLE$4 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "timeCycle");
    
    
    /**
     * Gets the "timeDate" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression getTimeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().find_element_user(TIMEDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timeDate" element
     */
    public boolean isSetTimeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "timeDate" element
     */
    public void setTimeDate(org.omg.spec.bpmn.x20100524.model.TExpression timeDate)
    {
        generatedSetterHelperImpl(timeDate, TIMEDATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timeDate" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression addNewTimeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().add_element_user(TIMEDATE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "timeDate" element
     */
    public void unsetTimeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEDATE$0, 0);
        }
    }
    
    /**
     * Gets the "timeDuration" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression getTimeDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().find_element_user(TIMEDURATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timeDuration" element
     */
    public boolean isSetTimeDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEDURATION$2) != 0;
        }
    }
    
    /**
     * Sets the "timeDuration" element
     */
    public void setTimeDuration(org.omg.spec.bpmn.x20100524.model.TExpression timeDuration)
    {
        generatedSetterHelperImpl(timeDuration, TIMEDURATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timeDuration" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression addNewTimeDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().add_element_user(TIMEDURATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "timeDuration" element
     */
    public void unsetTimeDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEDURATION$2, 0);
        }
    }
    
    /**
     * Gets the "timeCycle" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression getTimeCycle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().find_element_user(TIMECYCLE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timeCycle" element
     */
    public boolean isSetTimeCycle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMECYCLE$4) != 0;
        }
    }
    
    /**
     * Sets the "timeCycle" element
     */
    public void setTimeCycle(org.omg.spec.bpmn.x20100524.model.TExpression timeCycle)
    {
        generatedSetterHelperImpl(timeCycle, TIMECYCLE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timeCycle" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression addNewTimeCycle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().add_element_user(TIMECYCLE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "timeCycle" element
     */
    public void unsetTimeCycle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMECYCLE$4, 0);
        }
    }
}

/*
 * An XML document type.
 * Localname: businessRuleTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.BusinessRuleTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one businessRuleTask(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class BusinessRuleTaskDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.BusinessRuleTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public BusinessRuleTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSRULETASK$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "businessRuleTask");
    
    
    /**
     * Gets the "businessRuleTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TBusinessRuleTask getBusinessRuleTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TBusinessRuleTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TBusinessRuleTask)get_store().find_element_user(BUSINESSRULETASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "businessRuleTask" element
     */
    public void setBusinessRuleTask(org.omg.spec.bpmn.x20100524.model.TBusinessRuleTask businessRuleTask)
    {
        generatedSetterHelperImpl(businessRuleTask, BUSINESSRULETASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "businessRuleTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TBusinessRuleTask addNewBusinessRuleTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TBusinessRuleTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TBusinessRuleTask)get_store().add_element_user(BUSINESSRULETASK$0);
            return target;
        }
    }
}

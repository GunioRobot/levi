/*
 * An XML document type.
 * Localname: globalBusinessRuleTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.GlobalBusinessRuleTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one globalBusinessRuleTask(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class GlobalBusinessRuleTaskDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.GlobalBusinessRuleTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public GlobalBusinessRuleTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBALBUSINESSRULETASK$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalBusinessRuleTask");
    
    
    /**
     * Gets the "globalBusinessRuleTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGlobalBusinessRuleTask getGlobalBusinessRuleTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGlobalBusinessRuleTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGlobalBusinessRuleTask)get_store().find_element_user(GLOBALBUSINESSRULETASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "globalBusinessRuleTask" element
     */
    public void setGlobalBusinessRuleTask(org.omg.spec.bpmn.x20100524.model.TGlobalBusinessRuleTask globalBusinessRuleTask)
    {
        generatedSetterHelperImpl(globalBusinessRuleTask, GLOBALBUSINESSRULETASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "globalBusinessRuleTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGlobalBusinessRuleTask addNewGlobalBusinessRuleTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGlobalBusinessRuleTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGlobalBusinessRuleTask)get_store().add_element_user(GLOBALBUSINESSRULETASK$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: manualTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ManualTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one manualTask(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ManualTaskDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ManualTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public ManualTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANUALTASK$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "manualTask");
    
    
    /**
     * Gets the "manualTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TManualTask getManualTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TManualTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TManualTask)get_store().find_element_user(MANUALTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "manualTask" element
     */
    public void setManualTask(org.omg.spec.bpmn.x20100524.model.TManualTask manualTask)
    {
        generatedSetterHelperImpl(manualTask, MANUALTASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "manualTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TManualTask addNewManualTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TManualTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TManualTask)get_store().add_element_user(MANUALTASK$0);
            return target;
        }
    }
}

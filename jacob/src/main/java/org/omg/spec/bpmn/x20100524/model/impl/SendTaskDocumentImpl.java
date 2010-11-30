/*
 * An XML document type.
 * Localname: sendTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.SendTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one sendTask(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class SendTaskDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.SendTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public SendTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDTASK$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "sendTask");
    
    
    /**
     * Gets the "sendTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TSendTask getSendTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TSendTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TSendTask)get_store().find_element_user(SENDTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sendTask" element
     */
    public void setSendTask(org.omg.spec.bpmn.x20100524.model.TSendTask sendTask)
    {
        generatedSetterHelperImpl(sendTask, SENDTASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sendTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TSendTask addNewSendTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TSendTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TSendTask)get_store().add_element_user(SENDTASK$0);
            return target;
        }
    }
}

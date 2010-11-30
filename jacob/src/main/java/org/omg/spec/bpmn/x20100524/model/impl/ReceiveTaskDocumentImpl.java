/*
 * An XML document type.
 * Localname: receiveTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ReceiveTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one receiveTask(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ReceiveTaskDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ReceiveTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReceiveTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECEIVETASK$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "receiveTask");
    
    
    /**
     * Gets the "receiveTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TReceiveTask getReceiveTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TReceiveTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TReceiveTask)get_store().find_element_user(RECEIVETASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "receiveTask" element
     */
    public void setReceiveTask(org.omg.spec.bpmn.x20100524.model.TReceiveTask receiveTask)
    {
        generatedSetterHelperImpl(receiveTask, RECEIVETASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "receiveTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TReceiveTask addNewReceiveTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TReceiveTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TReceiveTask)get_store().add_element_user(RECEIVETASK$0);
            return target;
        }
    }
}

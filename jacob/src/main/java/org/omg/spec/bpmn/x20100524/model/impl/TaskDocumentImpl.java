/*
 * An XML document type.
 * Localname: task
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one task(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class TaskDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.TaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASK$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "task");
    
    
    /**
     * Gets the "task" element
     */
    public org.omg.spec.bpmn.x20100524.model.TTask getTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TTask)get_store().find_element_user(TASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "task" element
     */
    public void setTask(org.omg.spec.bpmn.x20100524.model.TTask task)
    {
        generatedSetterHelperImpl(task, TASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "task" element
     */
    public org.omg.spec.bpmn.x20100524.model.TTask addNewTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TTask)get_store().add_element_user(TASK$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: userTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.UserTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one userTask(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class UserTaskDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.UserTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public UserTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERTASK$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "userTask");
    
    
    /**
     * Gets the "userTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TUserTask getUserTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TUserTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TUserTask)get_store().find_element_user(USERTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "userTask" element
     */
    public void setUserTask(org.omg.spec.bpmn.x20100524.model.TUserTask userTask)
    {
        generatedSetterHelperImpl(userTask, USERTASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "userTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TUserTask addNewUserTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TUserTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TUserTask)get_store().add_element_user(USERTASK$0);
            return target;
        }
    }
}

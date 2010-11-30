/*
 * An XML document type.
 * Localname: globalUserTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.GlobalUserTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one globalUserTask(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class GlobalUserTaskDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.GlobalUserTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public GlobalUserTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBALUSERTASK$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalUserTask");
    
    
    /**
     * Gets the "globalUserTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGlobalUserTask getGlobalUserTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGlobalUserTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGlobalUserTask)get_store().find_element_user(GLOBALUSERTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "globalUserTask" element
     */
    public void setGlobalUserTask(org.omg.spec.bpmn.x20100524.model.TGlobalUserTask globalUserTask)
    {
        generatedSetterHelperImpl(globalUserTask, GLOBALUSERTASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "globalUserTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGlobalUserTask addNewGlobalUserTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGlobalUserTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGlobalUserTask)get_store().add_element_user(GLOBALUSERTASK$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: globalChoreographyTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.GlobalChoreographyTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one globalChoreographyTask(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class GlobalChoreographyTaskDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.ChoreographyDocumentImpl implements org.omg.spec.bpmn.x20100524.model.GlobalChoreographyTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public GlobalChoreographyTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBALCHOREOGRAPHYTASK$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalChoreographyTask");
    
    
    /**
     * Gets the "globalChoreographyTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGlobalChoreographyTask getGlobalChoreographyTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGlobalChoreographyTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGlobalChoreographyTask)get_store().find_element_user(GLOBALCHOREOGRAPHYTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "globalChoreographyTask" element
     */
    public void setGlobalChoreographyTask(org.omg.spec.bpmn.x20100524.model.TGlobalChoreographyTask globalChoreographyTask)
    {
        generatedSetterHelperImpl(globalChoreographyTask, GLOBALCHOREOGRAPHYTASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "globalChoreographyTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGlobalChoreographyTask addNewGlobalChoreographyTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGlobalChoreographyTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGlobalChoreographyTask)get_store().add_element_user(GLOBALCHOREOGRAPHYTASK$0);
            return target;
        }
    }
}

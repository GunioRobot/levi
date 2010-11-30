/*
 * An XML document type.
 * Localname: choreographyTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ChoreographyTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one choreographyTask(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ChoreographyTaskDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ChoreographyTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public ChoreographyTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHOREOGRAPHYTASK$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "choreographyTask");
    
    
    /**
     * Gets the "choreographyTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TChoreographyTask getChoreographyTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TChoreographyTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TChoreographyTask)get_store().find_element_user(CHOREOGRAPHYTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "choreographyTask" element
     */
    public void setChoreographyTask(org.omg.spec.bpmn.x20100524.model.TChoreographyTask choreographyTask)
    {
        generatedSetterHelperImpl(choreographyTask, CHOREOGRAPHYTASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "choreographyTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TChoreographyTask addNewChoreographyTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TChoreographyTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TChoreographyTask)get_store().add_element_user(CHOREOGRAPHYTASK$0);
            return target;
        }
    }
}

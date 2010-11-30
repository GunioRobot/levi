/*
 * An XML document type.
 * Localname: globalManualTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.GlobalManualTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one globalManualTask(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class GlobalManualTaskDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.GlobalManualTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public GlobalManualTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBALMANUALTASK$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalManualTask");
    
    
    /**
     * Gets the "globalManualTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGlobalManualTask getGlobalManualTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGlobalManualTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGlobalManualTask)get_store().find_element_user(GLOBALMANUALTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "globalManualTask" element
     */
    public void setGlobalManualTask(org.omg.spec.bpmn.x20100524.model.TGlobalManualTask globalManualTask)
    {
        generatedSetterHelperImpl(globalManualTask, GLOBALMANUALTASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "globalManualTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGlobalManualTask addNewGlobalManualTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGlobalManualTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGlobalManualTask)get_store().add_element_user(GLOBALMANUALTASK$0);
            return target;
        }
    }
}

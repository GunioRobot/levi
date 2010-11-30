/*
 * An XML document type.
 * Localname: globalTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.GlobalTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one globalTask(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class GlobalTaskDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.GlobalTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public GlobalTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBALTASK$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalTask");
    
    
    /**
     * Gets the "globalTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGlobalTask getGlobalTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGlobalTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGlobalTask)get_store().find_element_user(GLOBALTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "globalTask" element
     */
    public void setGlobalTask(org.omg.spec.bpmn.x20100524.model.TGlobalTask globalTask)
    {
        generatedSetterHelperImpl(globalTask, GLOBALTASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "globalTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGlobalTask addNewGlobalTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGlobalTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGlobalTask)get_store().add_element_user(GLOBALTASK$0);
            return target;
        }
    }
}

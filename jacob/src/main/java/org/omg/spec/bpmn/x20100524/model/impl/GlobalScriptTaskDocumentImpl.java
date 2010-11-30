/*
 * An XML document type.
 * Localname: globalScriptTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.GlobalScriptTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one globalScriptTask(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class GlobalScriptTaskDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.GlobalScriptTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public GlobalScriptTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBALSCRIPTTASK$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalScriptTask");
    
    
    /**
     * Gets the "globalScriptTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGlobalScriptTask getGlobalScriptTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGlobalScriptTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGlobalScriptTask)get_store().find_element_user(GLOBALSCRIPTTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "globalScriptTask" element
     */
    public void setGlobalScriptTask(org.omg.spec.bpmn.x20100524.model.TGlobalScriptTask globalScriptTask)
    {
        generatedSetterHelperImpl(globalScriptTask, GLOBALSCRIPTTASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "globalScriptTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGlobalScriptTask addNewGlobalScriptTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGlobalScriptTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGlobalScriptTask)get_store().add_element_user(GLOBALSCRIPTTASK$0);
            return target;
        }
    }
}

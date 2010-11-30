/*
 * An XML document type.
 * Localname: scriptTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ScriptTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one scriptTask(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ScriptTaskDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ScriptTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScriptTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCRIPTTASK$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "scriptTask");
    
    
    /**
     * Gets the "scriptTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TScriptTask getScriptTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TScriptTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TScriptTask)get_store().find_element_user(SCRIPTTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "scriptTask" element
     */
    public void setScriptTask(org.omg.spec.bpmn.x20100524.model.TScriptTask scriptTask)
    {
        generatedSetterHelperImpl(scriptTask, SCRIPTTASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "scriptTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TScriptTask addNewScriptTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TScriptTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TScriptTask)get_store().add_element_user(SCRIPTTASK$0);
            return target;
        }
    }
}

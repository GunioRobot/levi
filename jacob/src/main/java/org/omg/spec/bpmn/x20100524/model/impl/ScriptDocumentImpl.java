/*
 * An XML document type.
 * Localname: script
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ScriptDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one script(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ScriptDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ScriptDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScriptDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCRIPT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "script");
    
    
    /**
     * Gets the "script" element
     */
    public org.omg.spec.bpmn.x20100524.model.TScript getScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TScript target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TScript)get_store().find_element_user(SCRIPT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "script" element
     */
    public void setScript(org.omg.spec.bpmn.x20100524.model.TScript script)
    {
        generatedSetterHelperImpl(script, SCRIPT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "script" element
     */
    public org.omg.spec.bpmn.x20100524.model.TScript addNewScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TScript target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TScript)get_store().add_element_user(SCRIPT$0);
            return target;
        }
    }
}

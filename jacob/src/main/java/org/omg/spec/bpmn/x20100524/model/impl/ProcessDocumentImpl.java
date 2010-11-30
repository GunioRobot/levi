/*
 * An XML document type.
 * Localname: process
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ProcessDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one process(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ProcessDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ProcessDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProcessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESS$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "process");
    
    
    /**
     * Gets the "process" element
     */
    public org.omg.spec.bpmn.x20100524.model.TProcess getProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProcess target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProcess)get_store().find_element_user(PROCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "process" element
     */
    public void setProcess(org.omg.spec.bpmn.x20100524.model.TProcess process)
    {
        generatedSetterHelperImpl(process, PROCESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "process" element
     */
    public org.omg.spec.bpmn.x20100524.model.TProcess addNewProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProcess target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProcess)get_store().add_element_user(PROCESS$0);
            return target;
        }
    }
}

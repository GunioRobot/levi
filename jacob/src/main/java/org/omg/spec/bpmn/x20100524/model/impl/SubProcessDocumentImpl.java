/*
 * An XML document type.
 * Localname: subProcess
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.SubProcessDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one subProcess(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class SubProcessDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.SubProcessDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubProcessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBPROCESS$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "subProcess");
    
    
    /**
     * Gets the "subProcess" element
     */
    public org.omg.spec.bpmn.x20100524.model.TSubProcess getSubProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TSubProcess target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TSubProcess)get_store().find_element_user(SUBPROCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subProcess" element
     */
    public void setSubProcess(org.omg.spec.bpmn.x20100524.model.TSubProcess subProcess)
    {
        generatedSetterHelperImpl(subProcess, SUBPROCESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subProcess" element
     */
    public org.omg.spec.bpmn.x20100524.model.TSubProcess addNewSubProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TSubProcess target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TSubProcess)get_store().add_element_user(SUBPROCESS$0);
            return target;
        }
    }
}

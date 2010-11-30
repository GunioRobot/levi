/*
 * An XML document type.
 * Localname: adHocSubProcess
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.AdHocSubProcessDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one adHocSubProcess(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class AdHocSubProcessDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.AdHocSubProcessDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdHocSubProcessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADHOCSUBPROCESS$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "adHocSubProcess");
    
    
    /**
     * Gets the "adHocSubProcess" element
     */
    public org.omg.spec.bpmn.x20100524.model.TAdHocSubProcess getAdHocSubProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TAdHocSubProcess target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TAdHocSubProcess)get_store().find_element_user(ADHOCSUBPROCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "adHocSubProcess" element
     */
    public void setAdHocSubProcess(org.omg.spec.bpmn.x20100524.model.TAdHocSubProcess adHocSubProcess)
    {
        generatedSetterHelperImpl(adHocSubProcess, ADHOCSUBPROCESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "adHocSubProcess" element
     */
    public org.omg.spec.bpmn.x20100524.model.TAdHocSubProcess addNewAdHocSubProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TAdHocSubProcess target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TAdHocSubProcess)get_store().add_element_user(ADHOCSUBPROCESS$0);
            return target;
        }
    }
}

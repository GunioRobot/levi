/*
 * An XML document type.
 * Localname: callActivity
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.CallActivityDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one callActivity(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class CallActivityDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.CallActivityDocument
{
    private static final long serialVersionUID = 1L;
    
    public CallActivityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLACTIVITY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "callActivity");
    
    
    /**
     * Gets the "callActivity" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCallActivity getCallActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCallActivity target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCallActivity)get_store().find_element_user(CALLACTIVITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "callActivity" element
     */
    public void setCallActivity(org.omg.spec.bpmn.x20100524.model.TCallActivity callActivity)
    {
        generatedSetterHelperImpl(callActivity, CALLACTIVITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "callActivity" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCallActivity addNewCallActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCallActivity target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCallActivity)get_store().add_element_user(CALLACTIVITY$0);
            return target;
        }
    }
}

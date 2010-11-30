/*
 * An XML document type.
 * Localname: callChoreography
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.CallChoreographyDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one callChoreography(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class CallChoreographyDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.CallChoreographyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CallChoreographyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLCHOREOGRAPHY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "callChoreography");
    
    
    /**
     * Gets the "callChoreography" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCallChoreography getCallChoreography()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCallChoreography target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCallChoreography)get_store().find_element_user(CALLCHOREOGRAPHY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "callChoreography" element
     */
    public void setCallChoreography(org.omg.spec.bpmn.x20100524.model.TCallChoreography callChoreography)
    {
        generatedSetterHelperImpl(callChoreography, CALLCHOREOGRAPHY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "callChoreography" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCallChoreography addNewCallChoreography()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCallChoreography target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCallChoreography)get_store().add_element_user(CALLCHOREOGRAPHY$0);
            return target;
        }
    }
}

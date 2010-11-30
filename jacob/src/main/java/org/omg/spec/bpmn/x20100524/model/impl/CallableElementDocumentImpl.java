/*
 * An XML document type.
 * Localname: callableElement
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.CallableElementDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one callableElement(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class CallableElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.CallableElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public CallableElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLABLEELEMENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "callableElement");
    
    
    /**
     * Gets the "callableElement" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCallableElement getCallableElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCallableElement target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCallableElement)get_store().find_element_user(CALLABLEELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "callableElement" element
     */
    public void setCallableElement(org.omg.spec.bpmn.x20100524.model.TCallableElement callableElement)
    {
        generatedSetterHelperImpl(callableElement, CALLABLEELEMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "callableElement" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCallableElement addNewCallableElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCallableElement target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCallableElement)get_store().add_element_user(CALLABLEELEMENT$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: signal
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.SignalDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one signal(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class SignalDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.SignalDocument
{
    private static final long serialVersionUID = 1L;
    
    public SignalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNAL$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "signal");
    
    
    /**
     * Gets the "signal" element
     */
    public org.omg.spec.bpmn.x20100524.model.TSignal getSignal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TSignal target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TSignal)get_store().find_element_user(SIGNAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "signal" element
     */
    public void setSignal(org.omg.spec.bpmn.x20100524.model.TSignal signal)
    {
        generatedSetterHelperImpl(signal, SIGNAL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "signal" element
     */
    public org.omg.spec.bpmn.x20100524.model.TSignal addNewSignal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TSignal target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TSignal)get_store().add_element_user(SIGNAL$0);
            return target;
        }
    }
}

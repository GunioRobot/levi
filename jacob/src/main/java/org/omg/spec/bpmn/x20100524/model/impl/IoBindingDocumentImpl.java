/*
 * An XML document type.
 * Localname: ioBinding
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.IoBindingDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one ioBinding(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class IoBindingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.IoBindingDocument
{
    private static final long serialVersionUID = 1L;
    
    public IoBindingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IOBINDING$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "ioBinding");
    
    
    /**
     * Gets the "ioBinding" element
     */
    public org.omg.spec.bpmn.x20100524.model.TInputOutputBinding getIoBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInputOutputBinding target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInputOutputBinding)get_store().find_element_user(IOBINDING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ioBinding" element
     */
    public void setIoBinding(org.omg.spec.bpmn.x20100524.model.TInputOutputBinding ioBinding)
    {
        generatedSetterHelperImpl(ioBinding, IOBINDING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ioBinding" element
     */
    public org.omg.spec.bpmn.x20100524.model.TInputOutputBinding addNewIoBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInputOutputBinding target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInputOutputBinding)get_store().add_element_user(IOBINDING$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: ioSpecification
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.IoSpecificationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one ioSpecification(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class IoSpecificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.IoSpecificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public IoSpecificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IOSPECIFICATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "ioSpecification");
    
    
    /**
     * Gets the "ioSpecification" element
     */
    public org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification getIoSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification)get_store().find_element_user(IOSPECIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ioSpecification" element
     */
    public void setIoSpecification(org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification ioSpecification)
    {
        generatedSetterHelperImpl(ioSpecification, IOSPECIFICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ioSpecification" element
     */
    public org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification addNewIoSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification)get_store().add_element_user(IOSPECIFICATION$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: auditing
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.AuditingDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one auditing(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class AuditingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.AuditingDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuditingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITING$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "auditing");
    
    
    /**
     * Gets the "auditing" element
     */
    public org.omg.spec.bpmn.x20100524.model.TAuditing getAuditing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TAuditing target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TAuditing)get_store().find_element_user(AUDITING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "auditing" element
     */
    public void setAuditing(org.omg.spec.bpmn.x20100524.model.TAuditing auditing)
    {
        generatedSetterHelperImpl(auditing, AUDITING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "auditing" element
     */
    public org.omg.spec.bpmn.x20100524.model.TAuditing addNewAuditing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TAuditing target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TAuditing)get_store().add_element_user(AUDITING$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: correlationKey
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.CorrelationKeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one correlationKey(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class CorrelationKeyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.CorrelationKeyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CorrelationKeyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONKEY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "correlationKey");
    
    
    /**
     * Gets the "correlationKey" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationKey getCorrelationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationKey target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationKey)get_store().find_element_user(CORRELATIONKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "correlationKey" element
     */
    public void setCorrelationKey(org.omg.spec.bpmn.x20100524.model.TCorrelationKey correlationKey)
    {
        generatedSetterHelperImpl(correlationKey, CORRELATIONKEY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "correlationKey" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationKey addNewCorrelationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationKey target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationKey)get_store().add_element_user(CORRELATIONKEY$0);
            return target;
        }
    }
}

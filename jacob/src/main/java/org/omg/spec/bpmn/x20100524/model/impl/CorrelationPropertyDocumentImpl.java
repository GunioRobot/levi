/*
 * An XML document type.
 * Localname: correlationProperty
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.CorrelationPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one correlationProperty(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class CorrelationPropertyDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.CorrelationPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CorrelationPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "correlationProperty");
    
    
    /**
     * Gets the "correlationProperty" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationProperty getCorrelationProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationProperty target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationProperty)get_store().find_element_user(CORRELATIONPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "correlationProperty" element
     */
    public void setCorrelationProperty(org.omg.spec.bpmn.x20100524.model.TCorrelationProperty correlationProperty)
    {
        generatedSetterHelperImpl(correlationProperty, CORRELATIONPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "correlationProperty" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationProperty addNewCorrelationProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationProperty target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationProperty)get_store().add_element_user(CORRELATIONPROPERTY$0);
            return target;
        }
    }
}

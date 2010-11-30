/*
 * An XML document type.
 * Localname: correlationPropertyBinding
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.CorrelationPropertyBindingDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one correlationPropertyBinding(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class CorrelationPropertyBindingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.CorrelationPropertyBindingDocument
{
    private static final long serialVersionUID = 1L;
    
    public CorrelationPropertyBindingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONPROPERTYBINDING$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "correlationPropertyBinding");
    
    
    /**
     * Gets the "correlationPropertyBinding" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyBinding getCorrelationPropertyBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyBinding target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyBinding)get_store().find_element_user(CORRELATIONPROPERTYBINDING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "correlationPropertyBinding" element
     */
    public void setCorrelationPropertyBinding(org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyBinding correlationPropertyBinding)
    {
        generatedSetterHelperImpl(correlationPropertyBinding, CORRELATIONPROPERTYBINDING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "correlationPropertyBinding" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyBinding addNewCorrelationPropertyBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyBinding target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyBinding)get_store().add_element_user(CORRELATIONPROPERTYBINDING$0);
            return target;
        }
    }
}

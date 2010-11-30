/*
 * An XML document type.
 * Localname: correlationPropertyRetrievalExpression
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.CorrelationPropertyRetrievalExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one correlationPropertyRetrievalExpression(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class CorrelationPropertyRetrievalExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.CorrelationPropertyRetrievalExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CorrelationPropertyRetrievalExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONPROPERTYRETRIEVALEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "correlationPropertyRetrievalExpression");
    
    
    /**
     * Gets the "correlationPropertyRetrievalExpression" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression getCorrelationPropertyRetrievalExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression)get_store().find_element_user(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "correlationPropertyRetrievalExpression" element
     */
    public void setCorrelationPropertyRetrievalExpression(org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression correlationPropertyRetrievalExpression)
    {
        generatedSetterHelperImpl(correlationPropertyRetrievalExpression, CORRELATIONPROPERTYRETRIEVALEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "correlationPropertyRetrievalExpression" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression addNewCorrelationPropertyRetrievalExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression)get_store().add_element_user(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0);
            return target;
        }
    }
}

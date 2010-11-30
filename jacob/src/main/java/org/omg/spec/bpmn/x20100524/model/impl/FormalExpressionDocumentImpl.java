/*
 * An XML document type.
 * Localname: formalExpression
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.FormalExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one formalExpression(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class FormalExpressionDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.ExpressionDocumentImpl implements org.omg.spec.bpmn.x20100524.model.FormalExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public FormalExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMALEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "formalExpression");
    
    
    /**
     * Gets the "formalExpression" element
     */
    public org.omg.spec.bpmn.x20100524.model.TFormalExpression getFormalExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TFormalExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TFormalExpression)get_store().find_element_user(FORMALEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "formalExpression" element
     */
    public void setFormalExpression(org.omg.spec.bpmn.x20100524.model.TFormalExpression formalExpression)
    {
        generatedSetterHelperImpl(formalExpression, FORMALEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "formalExpression" element
     */
    public org.omg.spec.bpmn.x20100524.model.TFormalExpression addNewFormalExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TFormalExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TFormalExpression)get_store().add_element_user(FORMALEXPRESSION$0);
            return target;
        }
    }
}

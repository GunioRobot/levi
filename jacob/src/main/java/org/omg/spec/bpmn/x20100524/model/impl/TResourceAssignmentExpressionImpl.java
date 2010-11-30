/*
 * XML Type:  tResourceAssignmentExpression
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TResourceAssignmentExpression
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tResourceAssignmentExpression(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TResourceAssignmentExpressionImpl extends org.omg.spec.bpmn.x20100524.model.impl.TBaseElementImpl implements org.omg.spec.bpmn.x20100524.model.TResourceAssignmentExpression
{
    private static final long serialVersionUID = 1L;
    
    public TResourceAssignmentExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPRESSION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "expression");
    private static final org.apache.xmlbeans.QNameSet EXPRESSION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "expression"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "formalExpression"),
    });
    
    
    /**
     * Gets the "expression" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression getExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().find_element_user(EXPRESSION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "expression" element
     */
    public void setExpression(org.omg.spec.bpmn.x20100524.model.TExpression expression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().find_element_user(EXPRESSION$1, 0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().add_element_user(EXPRESSION$0);
            }
            target.set(expression);
        }
    }
    
    /**
     * Appends and returns a new empty "expression" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression addNewExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().add_element_user(EXPRESSION$0);
            return target;
        }
    }
}

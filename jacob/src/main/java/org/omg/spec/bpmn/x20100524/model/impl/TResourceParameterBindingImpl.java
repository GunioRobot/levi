/*
 * XML Type:  tResourceParameterBinding
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tResourceParameterBinding(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TResourceParameterBindingImpl extends org.omg.spec.bpmn.x20100524.model.impl.TBaseElementImpl implements org.omg.spec.bpmn.x20100524.model.TResourceParameterBinding
{
    private static final long serialVersionUID = 1L;
    
    public TResourceParameterBindingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPRESSION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "expression");
    private static final org.apache.xmlbeans.QNameSet EXPRESSION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "expression"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "formalExpression"),
    });
    private static final javax.xml.namespace.QName PARAMETERREF$2 = 
        new javax.xml.namespace.QName("", "parameterRef");
    
    
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
    
    /**
     * Gets the "parameterRef" attribute
     */
    public javax.xml.namespace.QName getParameterRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "parameterRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetParameterRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PARAMETERREF$2);
            return target;
        }
    }
    
    /**
     * Sets the "parameterRef" attribute
     */
    public void setParameterRef(javax.xml.namespace.QName parameterRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARAMETERREF$2);
            }
            target.setQNameValue(parameterRef);
        }
    }
    
    /**
     * Sets (as xml) the "parameterRef" attribute
     */
    public void xsetParameterRef(org.apache.xmlbeans.XmlQName parameterRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PARAMETERREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PARAMETERREF$2);
            }
            target.set(parameterRef);
        }
    }
}

/*
 * XML Type:  tComplexGateway
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TComplexGateway
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tComplexGateway(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TComplexGatewayImpl extends org.omg.spec.bpmn.x20100524.model.impl.TGatewayImpl implements org.omg.spec.bpmn.x20100524.model.TComplexGateway
{
    private static final long serialVersionUID = 1L;
    
    public TComplexGatewayImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVATIONCONDITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "activationCondition");
    private static final javax.xml.namespace.QName DEFAULT$2 = 
        new javax.xml.namespace.QName("", "default");
    
    
    /**
     * Gets the "activationCondition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression getActivationCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().find_element_user(ACTIVATIONCONDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "activationCondition" element
     */
    public boolean isSetActivationCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVATIONCONDITION$0) != 0;
        }
    }
    
    /**
     * Sets the "activationCondition" element
     */
    public void setActivationCondition(org.omg.spec.bpmn.x20100524.model.TExpression activationCondition)
    {
        generatedSetterHelperImpl(activationCondition, ACTIVATIONCONDITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "activationCondition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression addNewActivationCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().add_element_user(ACTIVATIONCONDITION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "activationCondition" element
     */
    public void unsetActivationCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVATIONCONDITION$0, 0);
        }
    }
    
    /**
     * Gets the "default" attribute
     */
    public java.lang.String getDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "default" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(DEFAULT$2);
            return target;
        }
    }
    
    /**
     * True if has "default" attribute
     */
    public boolean isSetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULT$2) != null;
        }
    }
    
    /**
     * Sets the "default" attribute
     */
    public void setDefault(java.lang.String xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$2);
            }
            target.setStringValue(xdefault);
        }
    }
    
    /**
     * Sets (as xml) the "default" attribute
     */
    public void xsetDefault(org.apache.xmlbeans.XmlIDREF xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(DEFAULT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(DEFAULT$2);
            }
            target.set(xdefault);
        }
    }
    
    /**
     * Unsets the "default" attribute
     */
    public void unsetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULT$2);
        }
    }
}

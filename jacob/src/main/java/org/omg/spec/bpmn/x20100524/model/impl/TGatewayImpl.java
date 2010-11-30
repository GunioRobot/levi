/*
 * XML Type:  tGateway
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TGateway
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tGateway(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TGatewayImpl extends org.omg.spec.bpmn.x20100524.model.impl.TFlowNodeImpl implements org.omg.spec.bpmn.x20100524.model.TGateway
{
    private static final long serialVersionUID = 1L;
    
    public TGatewayImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GATEWAYDIRECTION$0 = 
        new javax.xml.namespace.QName("", "gatewayDirection");
    
    
    /**
     * Gets the "gatewayDirection" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TGatewayDirection.Enum getGatewayDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GATEWAYDIRECTION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GATEWAYDIRECTION$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.omg.spec.bpmn.x20100524.model.TGatewayDirection.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "gatewayDirection" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TGatewayDirection xgetGatewayDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGatewayDirection target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGatewayDirection)get_store().find_attribute_user(GATEWAYDIRECTION$0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TGatewayDirection)get_default_attribute_value(GATEWAYDIRECTION$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "gatewayDirection" attribute
     */
    public boolean isSetGatewayDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GATEWAYDIRECTION$0) != null;
        }
    }
    
    /**
     * Sets the "gatewayDirection" attribute
     */
    public void setGatewayDirection(org.omg.spec.bpmn.x20100524.model.TGatewayDirection.Enum gatewayDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GATEWAYDIRECTION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GATEWAYDIRECTION$0);
            }
            target.setEnumValue(gatewayDirection);
        }
    }
    
    /**
     * Sets (as xml) the "gatewayDirection" attribute
     */
    public void xsetGatewayDirection(org.omg.spec.bpmn.x20100524.model.TGatewayDirection gatewayDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGatewayDirection target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGatewayDirection)get_store().find_attribute_user(GATEWAYDIRECTION$0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TGatewayDirection)get_store().add_attribute_user(GATEWAYDIRECTION$0);
            }
            target.set(gatewayDirection);
        }
    }
    
    /**
     * Unsets the "gatewayDirection" attribute
     */
    public void unsetGatewayDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GATEWAYDIRECTION$0);
        }
    }
}

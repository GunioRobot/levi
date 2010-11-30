/*
 * An XML document type.
 * Localname: gateway
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.GatewayDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one gateway(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class GatewayDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.GatewayDocument
{
    private static final long serialVersionUID = 1L;
    
    public GatewayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GATEWAY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "gateway");
    
    
    /**
     * Gets the "gateway" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGateway getGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGateway target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGateway)get_store().find_element_user(GATEWAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "gateway" element
     */
    public void setGateway(org.omg.spec.bpmn.x20100524.model.TGateway gateway)
    {
        generatedSetterHelperImpl(gateway, GATEWAY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "gateway" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGateway addNewGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGateway target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGateway)get_store().add_element_user(GATEWAY$0);
            return target;
        }
    }
}

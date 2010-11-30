/*
 * An XML document type.
 * Localname: exclusiveGateway
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ExclusiveGatewayDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one exclusiveGateway(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ExclusiveGatewayDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ExclusiveGatewayDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExclusiveGatewayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCLUSIVEGATEWAY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "exclusiveGateway");
    
    
    /**
     * Gets the "exclusiveGateway" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExclusiveGateway getExclusiveGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExclusiveGateway target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExclusiveGateway)get_store().find_element_user(EXCLUSIVEGATEWAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "exclusiveGateway" element
     */
    public void setExclusiveGateway(org.omg.spec.bpmn.x20100524.model.TExclusiveGateway exclusiveGateway)
    {
        generatedSetterHelperImpl(exclusiveGateway, EXCLUSIVEGATEWAY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exclusiveGateway" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExclusiveGateway addNewExclusiveGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExclusiveGateway target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExclusiveGateway)get_store().add_element_user(EXCLUSIVEGATEWAY$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: inclusiveGateway
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.InclusiveGatewayDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one inclusiveGateway(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class InclusiveGatewayDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.InclusiveGatewayDocument
{
    private static final long serialVersionUID = 1L;
    
    public InclusiveGatewayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUSIVEGATEWAY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "inclusiveGateway");
    
    
    /**
     * Gets the "inclusiveGateway" element
     */
    public org.omg.spec.bpmn.x20100524.model.TInclusiveGateway getInclusiveGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInclusiveGateway target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInclusiveGateway)get_store().find_element_user(INCLUSIVEGATEWAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "inclusiveGateway" element
     */
    public void setInclusiveGateway(org.omg.spec.bpmn.x20100524.model.TInclusiveGateway inclusiveGateway)
    {
        generatedSetterHelperImpl(inclusiveGateway, INCLUSIVEGATEWAY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "inclusiveGateway" element
     */
    public org.omg.spec.bpmn.x20100524.model.TInclusiveGateway addNewInclusiveGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInclusiveGateway target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInclusiveGateway)get_store().add_element_user(INCLUSIVEGATEWAY$0);
            return target;
        }
    }
}

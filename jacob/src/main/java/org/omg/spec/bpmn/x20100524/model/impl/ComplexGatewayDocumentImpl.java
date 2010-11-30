/*
 * An XML document type.
 * Localname: complexGateway
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ComplexGatewayDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one complexGateway(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ComplexGatewayDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ComplexGatewayDocument
{
    private static final long serialVersionUID = 1L;
    
    public ComplexGatewayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLEXGATEWAY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "complexGateway");
    
    
    /**
     * Gets the "complexGateway" element
     */
    public org.omg.spec.bpmn.x20100524.model.TComplexGateway getComplexGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TComplexGateway target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TComplexGateway)get_store().find_element_user(COMPLEXGATEWAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "complexGateway" element
     */
    public void setComplexGateway(org.omg.spec.bpmn.x20100524.model.TComplexGateway complexGateway)
    {
        generatedSetterHelperImpl(complexGateway, COMPLEXGATEWAY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "complexGateway" element
     */
    public org.omg.spec.bpmn.x20100524.model.TComplexGateway addNewComplexGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TComplexGateway target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TComplexGateway)get_store().add_element_user(COMPLEXGATEWAY$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: parallelGateway
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ParallelGatewayDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one parallelGateway(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ParallelGatewayDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ParallelGatewayDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParallelGatewayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARALLELGATEWAY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "parallelGateway");
    
    
    /**
     * Gets the "parallelGateway" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParallelGateway getParallelGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParallelGateway target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParallelGateway)get_store().find_element_user(PARALLELGATEWAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "parallelGateway" element
     */
    public void setParallelGateway(org.omg.spec.bpmn.x20100524.model.TParallelGateway parallelGateway)
    {
        generatedSetterHelperImpl(parallelGateway, PARALLELGATEWAY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "parallelGateway" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParallelGateway addNewParallelGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParallelGateway target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParallelGateway)get_store().add_element_user(PARALLELGATEWAY$0);
            return target;
        }
    }
}

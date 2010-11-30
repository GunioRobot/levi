/*
 * An XML document type.
 * Localname: endPoint
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.EndPointDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one endPoint(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class EndPointDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.EndPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public EndPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDPOINT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "endPoint");
    
    
    /**
     * Gets the "endPoint" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEndPoint getEndPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEndPoint target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEndPoint)get_store().find_element_user(ENDPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "endPoint" element
     */
    public void setEndPoint(org.omg.spec.bpmn.x20100524.model.TEndPoint endPoint)
    {
        generatedSetterHelperImpl(endPoint, ENDPOINT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "endPoint" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEndPoint addNewEndPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEndPoint target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEndPoint)get_store().add_element_user(ENDPOINT$0);
            return target;
        }
    }
}

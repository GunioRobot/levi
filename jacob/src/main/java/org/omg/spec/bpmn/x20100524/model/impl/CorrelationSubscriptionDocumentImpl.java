/*
 * An XML document type.
 * Localname: correlationSubscription
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.CorrelationSubscriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one correlationSubscription(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class CorrelationSubscriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.CorrelationSubscriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CorrelationSubscriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONSUBSCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "correlationSubscription");
    
    
    /**
     * Gets the "correlationSubscription" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription getCorrelationSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription)get_store().find_element_user(CORRELATIONSUBSCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "correlationSubscription" element
     */
    public void setCorrelationSubscription(org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription correlationSubscription)
    {
        generatedSetterHelperImpl(correlationSubscription, CORRELATIONSUBSCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "correlationSubscription" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription addNewCorrelationSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription)get_store().add_element_user(CORRELATIONSUBSCRIPTION$0);
            return target;
        }
    }
}

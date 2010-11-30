/*
 * An XML document type.
 * Localname: escalation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.EscalationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one escalation(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class EscalationDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.EscalationDocument
{
    private static final long serialVersionUID = 1L;
    
    public EscalationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESCALATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "escalation");
    
    
    /**
     * Gets the "escalation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEscalation getEscalation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEscalation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEscalation)get_store().find_element_user(ESCALATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "escalation" element
     */
    public void setEscalation(org.omg.spec.bpmn.x20100524.model.TEscalation escalation)
    {
        generatedSetterHelperImpl(escalation, ESCALATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "escalation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TEscalation addNewEscalation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEscalation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEscalation)get_store().add_element_user(ESCALATION$0);
            return target;
        }
    }
}

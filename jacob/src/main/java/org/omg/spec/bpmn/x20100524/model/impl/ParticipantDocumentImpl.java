/*
 * An XML document type.
 * Localname: participant
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ParticipantDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one participant(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ParticipantDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ParticipantDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParticipantDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTICIPANT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "participant");
    
    
    /**
     * Gets the "participant" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipant getParticipant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipant target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipant)get_store().find_element_user(PARTICIPANT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "participant" element
     */
    public void setParticipant(org.omg.spec.bpmn.x20100524.model.TParticipant participant)
    {
        generatedSetterHelperImpl(participant, PARTICIPANT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "participant" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipant addNewParticipant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipant target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipant)get_store().add_element_user(PARTICIPANT$0);
            return target;
        }
    }
}

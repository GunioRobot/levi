/*
 * An XML document type.
 * Localname: participantAssociation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ParticipantAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one participantAssociation(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ParticipantAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ParticipantAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParticipantAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTICIPANTASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "participantAssociation");
    
    
    /**
     * Gets the "participantAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipantAssociation getParticipantAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipantAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipantAssociation)get_store().find_element_user(PARTICIPANTASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "participantAssociation" element
     */
    public void setParticipantAssociation(org.omg.spec.bpmn.x20100524.model.TParticipantAssociation participantAssociation)
    {
        generatedSetterHelperImpl(participantAssociation, PARTICIPANTASSOCIATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "participantAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipantAssociation addNewParticipantAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipantAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipantAssociation)get_store().add_element_user(PARTICIPANTASSOCIATION$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: participantMultiplicity
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ParticipantMultiplicityDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one participantMultiplicity(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ParticipantMultiplicityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ParticipantMultiplicityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParticipantMultiplicityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTICIPANTMULTIPLICITY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "participantMultiplicity");
    
    
    /**
     * Gets the "participantMultiplicity" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipantMultiplicity getParticipantMultiplicity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipantMultiplicity target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipantMultiplicity)get_store().find_element_user(PARTICIPANTMULTIPLICITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "participantMultiplicity" element
     */
    public void setParticipantMultiplicity(org.omg.spec.bpmn.x20100524.model.TParticipantMultiplicity participantMultiplicity)
    {
        generatedSetterHelperImpl(participantMultiplicity, PARTICIPANTMULTIPLICITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "participantMultiplicity" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipantMultiplicity addNewParticipantMultiplicity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipantMultiplicity target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipantMultiplicity)get_store().add_element_user(PARTICIPANTMULTIPLICITY$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: potentialOwner
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.PotentialOwnerDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one potentialOwner(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class PotentialOwnerDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.PerformerDocumentImpl implements org.omg.spec.bpmn.x20100524.model.PotentialOwnerDocument
{
    private static final long serialVersionUID = 1L;
    
    public PotentialOwnerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POTENTIALOWNER$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "potentialOwner");
    
    
    /**
     * Gets the "potentialOwner" element
     */
    public org.omg.spec.bpmn.x20100524.model.TPotentialOwner getPotentialOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TPotentialOwner target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TPotentialOwner)get_store().find_element_user(POTENTIALOWNER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "potentialOwner" element
     */
    public void setPotentialOwner(org.omg.spec.bpmn.x20100524.model.TPotentialOwner potentialOwner)
    {
        generatedSetterHelperImpl(potentialOwner, POTENTIALOWNER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "potentialOwner" element
     */
    public org.omg.spec.bpmn.x20100524.model.TPotentialOwner addNewPotentialOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TPotentialOwner target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TPotentialOwner)get_store().add_element_user(POTENTIALOWNER$0);
            return target;
        }
    }
}

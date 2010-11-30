/*
 * An XML document type.
 * Localname: choreography
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ChoreographyDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one choreography(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ChoreographyDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.CollaborationDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ChoreographyDocument
{
    private static final long serialVersionUID = 1L;
    
    public ChoreographyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHOREOGRAPHY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "choreography");
    private static final org.apache.xmlbeans.QNameSet CHOREOGRAPHY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "choreography"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalChoreographyTask"),
    });
    
    
    /**
     * Gets the "choreography" element
     */
    public org.omg.spec.bpmn.x20100524.model.TChoreography getChoreography()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TChoreography target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TChoreography)get_store().find_element_user(CHOREOGRAPHY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "choreography" element
     */
    public void setChoreography(org.omg.spec.bpmn.x20100524.model.TChoreography choreography)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TChoreography target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TChoreography)get_store().find_element_user(CHOREOGRAPHY$1, 0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TChoreography)get_store().add_element_user(CHOREOGRAPHY$0);
            }
            target.set(choreography);
        }
    }
    
    /**
     * Appends and returns a new empty "choreography" element
     */
    public org.omg.spec.bpmn.x20100524.model.TChoreography addNewChoreography()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TChoreography target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TChoreography)get_store().add_element_user(CHOREOGRAPHY$0);
            return target;
        }
    }
}

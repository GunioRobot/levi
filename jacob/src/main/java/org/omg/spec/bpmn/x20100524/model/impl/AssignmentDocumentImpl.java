/*
 * An XML document type.
 * Localname: assignment
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.AssignmentDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one assignment(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class AssignmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.AssignmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public AssignmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSIGNMENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "assignment");
    
    
    /**
     * Gets the "assignment" element
     */
    public org.omg.spec.bpmn.x20100524.model.TAssignment getAssignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TAssignment target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TAssignment)get_store().find_element_user(ASSIGNMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "assignment" element
     */
    public void setAssignment(org.omg.spec.bpmn.x20100524.model.TAssignment assignment)
    {
        generatedSetterHelperImpl(assignment, ASSIGNMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "assignment" element
     */
    public org.omg.spec.bpmn.x20100524.model.TAssignment addNewAssignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TAssignment target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TAssignment)get_store().add_element_user(ASSIGNMENT$0);
            return target;
        }
    }
}

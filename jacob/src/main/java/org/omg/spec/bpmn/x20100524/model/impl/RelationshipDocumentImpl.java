/*
 * An XML document type.
 * Localname: relationship
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.RelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one relationship(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class RelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.RelationshipDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIP$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "relationship");
    
    
    /**
     * Gets the "relationship" element
     */
    public org.omg.spec.bpmn.x20100524.model.TRelationship getRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TRelationship target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TRelationship)get_store().find_element_user(RELATIONSHIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "relationship" element
     */
    public void setRelationship(org.omg.spec.bpmn.x20100524.model.TRelationship relationship)
    {
        generatedSetterHelperImpl(relationship, RELATIONSHIP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relationship" element
     */
    public org.omg.spec.bpmn.x20100524.model.TRelationship addNewRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TRelationship target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TRelationship)get_store().add_element_user(RELATIONSHIP$0);
            return target;
        }
    }
}

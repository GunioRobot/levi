/*
 * An XML document type.
 * Localname: collaboration
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.CollaborationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one collaboration(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class CollaborationDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.CollaborationDocument
{
    private static final long serialVersionUID = 1L;
    
    public CollaborationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLLABORATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "collaboration");
    private static final org.apache.xmlbeans.QNameSet COLLABORATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "collaboration"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "choreography"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalConversation"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalChoreographyTask"),
    });
    
    
    /**
     * Gets the "collaboration" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCollaboration getCollaboration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCollaboration target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCollaboration)get_store().find_element_user(COLLABORATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "collaboration" element
     */
    public void setCollaboration(org.omg.spec.bpmn.x20100524.model.TCollaboration collaboration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCollaboration target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCollaboration)get_store().find_element_user(COLLABORATION$1, 0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TCollaboration)get_store().add_element_user(COLLABORATION$0);
            }
            target.set(collaboration);
        }
    }
    
    /**
     * Appends and returns a new empty "collaboration" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCollaboration addNewCollaboration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCollaboration target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCollaboration)get_store().add_element_user(COLLABORATION$0);
            return target;
        }
    }
}

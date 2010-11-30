/*
 * An XML document type.
 * Localname: performer
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.PerformerDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one performer(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class PerformerDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.ResourceRoleDocumentImpl implements org.omg.spec.bpmn.x20100524.model.PerformerDocument
{
    private static final long serialVersionUID = 1L;
    
    public PerformerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERFORMER$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "performer");
    private static final org.apache.xmlbeans.QNameSet PERFORMER$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "humanPerformer"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "performer"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "potentialOwner"),
    });
    
    
    /**
     * Gets the "performer" element
     */
    public org.omg.spec.bpmn.x20100524.model.TPerformer getPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TPerformer target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TPerformer)get_store().find_element_user(PERFORMER$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "performer" element
     */
    public void setPerformer(org.omg.spec.bpmn.x20100524.model.TPerformer performer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TPerformer target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TPerformer)get_store().find_element_user(PERFORMER$1, 0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TPerformer)get_store().add_element_user(PERFORMER$0);
            }
            target.set(performer);
        }
    }
    
    /**
     * Appends and returns a new empty "performer" element
     */
    public org.omg.spec.bpmn.x20100524.model.TPerformer addNewPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TPerformer target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TPerformer)get_store().add_element_user(PERFORMER$0);
            return target;
        }
    }
}

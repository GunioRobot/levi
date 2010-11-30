/*
 * An XML document type.
 * Localname: artifact
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ArtifactDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one artifact(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ArtifactDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ArtifactDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArtifactDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARTIFACT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "artifact");
    private static final org.apache.xmlbeans.QNameSet ARTIFACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "artifact"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "association"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "textAnnotation"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "group"),
    });
    
    
    /**
     * Gets the "artifact" element
     */
    public org.omg.spec.bpmn.x20100524.model.TArtifact getArtifact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TArtifact target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TArtifact)get_store().find_element_user(ARTIFACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "artifact" element
     */
    public void setArtifact(org.omg.spec.bpmn.x20100524.model.TArtifact artifact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TArtifact target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TArtifact)get_store().find_element_user(ARTIFACT$1, 0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TArtifact)get_store().add_element_user(ARTIFACT$0);
            }
            target.set(artifact);
        }
    }
    
    /**
     * Appends and returns a new empty "artifact" element
     */
    public org.omg.spec.bpmn.x20100524.model.TArtifact addNewArtifact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TArtifact target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TArtifact)get_store().add_element_user(ARTIFACT$0);
            return target;
        }
    }
}

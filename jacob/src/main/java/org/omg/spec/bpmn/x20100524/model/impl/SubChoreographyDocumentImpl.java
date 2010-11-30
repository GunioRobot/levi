/*
 * An XML document type.
 * Localname: subChoreography
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.SubChoreographyDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one subChoreography(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class SubChoreographyDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.SubChoreographyDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubChoreographyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBCHOREOGRAPHY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "subChoreography");
    
    
    /**
     * Gets the "subChoreography" element
     */
    public org.omg.spec.bpmn.x20100524.model.TSubChoreography getSubChoreography()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TSubChoreography target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TSubChoreography)get_store().find_element_user(SUBCHOREOGRAPHY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subChoreography" element
     */
    public void setSubChoreography(org.omg.spec.bpmn.x20100524.model.TSubChoreography subChoreography)
    {
        generatedSetterHelperImpl(subChoreography, SUBCHOREOGRAPHY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subChoreography" element
     */
    public org.omg.spec.bpmn.x20100524.model.TSubChoreography addNewSubChoreography()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TSubChoreography target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TSubChoreography)get_store().add_element_user(SUBCHOREOGRAPHY$0);
            return target;
        }
    }
}

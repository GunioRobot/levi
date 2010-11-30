/*
 * An XML document type.
 * Localname: LabeledEdge
 * Namespace: http://www.omg.org/spec/DD/20100524/DI
 * Java type: org.omg.spec.dd.x20100524.di.LabeledEdgeDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.di.impl;
/**
 * A document containing one LabeledEdge(@http://www.omg.org/spec/DD/20100524/DI) element.
 *
 * This is a complex type.
 */
public class LabeledEdgeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.di.LabeledEdgeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LabeledEdgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABELEDEDGE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DI", "LabeledEdge");
    
    
    /**
     * Gets the "LabeledEdge" element
     */
    public org.omg.spec.dd.x20100524.di.LabeledEdge getLabeledEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.LabeledEdge target = null;
            target = (org.omg.spec.dd.x20100524.di.LabeledEdge)get_store().find_element_user(LABELEDEDGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LabeledEdge" element
     */
    public void setLabeledEdge(org.omg.spec.dd.x20100524.di.LabeledEdge labeledEdge)
    {
        generatedSetterHelperImpl(labeledEdge, LABELEDEDGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LabeledEdge" element
     */
    public org.omg.spec.dd.x20100524.di.LabeledEdge addNewLabeledEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.LabeledEdge target = null;
            target = (org.omg.spec.dd.x20100524.di.LabeledEdge)get_store().add_element_user(LABELEDEDGE$0);
            return target;
        }
    }
}

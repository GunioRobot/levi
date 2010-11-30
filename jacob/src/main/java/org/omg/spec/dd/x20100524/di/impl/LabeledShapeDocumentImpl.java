/*
 * An XML document type.
 * Localname: LabeledShape
 * Namespace: http://www.omg.org/spec/DD/20100524/DI
 * Java type: org.omg.spec.dd.x20100524.di.LabeledShapeDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.di.impl;
/**
 * A document containing one LabeledShape(@http://www.omg.org/spec/DD/20100524/DI) element.
 *
 * This is a complex type.
 */
public class LabeledShapeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.di.LabeledShapeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LabeledShapeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABELEDSHAPE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DI", "LabeledShape");
    
    
    /**
     * Gets the "LabeledShape" element
     */
    public org.omg.spec.dd.x20100524.di.LabeledShape getLabeledShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.LabeledShape target = null;
            target = (org.omg.spec.dd.x20100524.di.LabeledShape)get_store().find_element_user(LABELEDSHAPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LabeledShape" element
     */
    public void setLabeledShape(org.omg.spec.dd.x20100524.di.LabeledShape labeledShape)
    {
        generatedSetterHelperImpl(labeledShape, LABELEDSHAPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LabeledShape" element
     */
    public org.omg.spec.dd.x20100524.di.LabeledShape addNewLabeledShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.LabeledShape target = null;
            target = (org.omg.spec.dd.x20100524.di.LabeledShape)get_store().add_element_user(LABELEDSHAPE$0);
            return target;
        }
    }
}

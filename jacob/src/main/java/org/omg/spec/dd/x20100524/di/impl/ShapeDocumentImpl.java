/*
 * An XML document type.
 * Localname: Shape
 * Namespace: http://www.omg.org/spec/DD/20100524/DI
 * Java type: org.omg.spec.dd.x20100524.di.ShapeDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.di.impl;
/**
 * A document containing one Shape(@http://www.omg.org/spec/DD/20100524/DI) element.
 *
 * This is a complex type.
 */
public class ShapeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.di.ShapeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShapeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHAPE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DI", "Shape");
    
    
    /**
     * Gets the "Shape" element
     */
    public org.omg.spec.dd.x20100524.di.Shape getShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.Shape target = null;
            target = (org.omg.spec.dd.x20100524.di.Shape)get_store().find_element_user(SHAPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Shape" element
     */
    public void setShape(org.omg.spec.dd.x20100524.di.Shape shape)
    {
        generatedSetterHelperImpl(shape, SHAPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Shape" element
     */
    public org.omg.spec.dd.x20100524.di.Shape addNewShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.Shape target = null;
            target = (org.omg.spec.dd.x20100524.di.Shape)get_store().add_element_user(SHAPE$0);
            return target;
        }
    }
}

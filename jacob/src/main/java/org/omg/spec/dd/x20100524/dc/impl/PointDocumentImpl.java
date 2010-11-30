/*
 * An XML document type.
 * Localname: Point
 * Namespace: http://www.omg.org/spec/DD/20100524/DC
 * Java type: org.omg.spec.dd.x20100524.dc.PointDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.dc.impl;
/**
 * A document containing one Point(@http://www.omg.org/spec/DD/20100524/DC) element.
 *
 * This is a complex type.
 */
public class PointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.dc.PointDocument
{
    private static final long serialVersionUID = 1L;
    
    public PointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DC", "Point");
    
    
    /**
     * Gets the "Point" element
     */
    public org.omg.spec.dd.x20100524.dc.Point getPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.dc.Point target = null;
            target = (org.omg.spec.dd.x20100524.dc.Point)get_store().find_element_user(POINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Point" element
     */
    public void setPoint(org.omg.spec.dd.x20100524.dc.Point point)
    {
        generatedSetterHelperImpl(point, POINT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Point" element
     */
    public org.omg.spec.dd.x20100524.dc.Point addNewPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.dc.Point target = null;
            target = (org.omg.spec.dd.x20100524.dc.Point)get_store().add_element_user(POINT$0);
            return target;
        }
    }
}

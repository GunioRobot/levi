/*
 * An XML document type.
 * Localname: Plane
 * Namespace: http://www.omg.org/spec/DD/20100524/DI
 * Java type: org.omg.spec.dd.x20100524.di.PlaneDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.di.impl;
/**
 * A document containing one Plane(@http://www.omg.org/spec/DD/20100524/DI) element.
 *
 * This is a complex type.
 */
public class PlaneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.di.PlaneDocument
{
    private static final long serialVersionUID = 1L;
    
    public PlaneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLANE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DI", "Plane");
    
    
    /**
     * Gets the "Plane" element
     */
    public org.omg.spec.dd.x20100524.di.Plane getPlane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.Plane target = null;
            target = (org.omg.spec.dd.x20100524.di.Plane)get_store().find_element_user(PLANE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Plane" element
     */
    public void setPlane(org.omg.spec.dd.x20100524.di.Plane plane)
    {
        generatedSetterHelperImpl(plane, PLANE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Plane" element
     */
    public org.omg.spec.dd.x20100524.di.Plane addNewPlane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.Plane target = null;
            target = (org.omg.spec.dd.x20100524.di.Plane)get_store().add_element_user(PLANE$0);
            return target;
        }
    }
}

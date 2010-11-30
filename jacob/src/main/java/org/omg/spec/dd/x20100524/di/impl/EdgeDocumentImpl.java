/*
 * An XML document type.
 * Localname: Edge
 * Namespace: http://www.omg.org/spec/DD/20100524/DI
 * Java type: org.omg.spec.dd.x20100524.di.EdgeDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.di.impl;
/**
 * A document containing one Edge(@http://www.omg.org/spec/DD/20100524/DI) element.
 *
 * This is a complex type.
 */
public class EdgeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.di.EdgeDocument
{
    private static final long serialVersionUID = 1L;
    
    public EdgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EDGE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DI", "Edge");
    
    
    /**
     * Gets the "Edge" element
     */
    public org.omg.spec.dd.x20100524.di.Edge getEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.Edge target = null;
            target = (org.omg.spec.dd.x20100524.di.Edge)get_store().find_element_user(EDGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Edge" element
     */
    public void setEdge(org.omg.spec.dd.x20100524.di.Edge edge)
    {
        generatedSetterHelperImpl(edge, EDGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Edge" element
     */
    public org.omg.spec.dd.x20100524.di.Edge addNewEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.Edge target = null;
            target = (org.omg.spec.dd.x20100524.di.Edge)get_store().add_element_user(EDGE$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: Style
 * Namespace: http://www.omg.org/spec/DD/20100524/DI
 * Java type: org.omg.spec.dd.x20100524.di.StyleDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.di.impl;
/**
 * A document containing one Style(@http://www.omg.org/spec/DD/20100524/DI) element.
 *
 * This is a complex type.
 */
public class StyleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.di.StyleDocument
{
    private static final long serialVersionUID = 1L;
    
    public StyleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DI", "Style");
    
    
    /**
     * Gets the "Style" element
     */
    public org.omg.spec.dd.x20100524.di.Style getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.Style target = null;
            target = (org.omg.spec.dd.x20100524.di.Style)get_store().find_element_user(STYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Style" element
     */
    public void setStyle(org.omg.spec.dd.x20100524.di.Style style)
    {
        generatedSetterHelperImpl(style, STYLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Style" element
     */
    public org.omg.spec.dd.x20100524.di.Style addNewStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.Style target = null;
            target = (org.omg.spec.dd.x20100524.di.Style)get_store().add_element_user(STYLE$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: Font
 * Namespace: http://www.omg.org/spec/DD/20100524/DC
 * Java type: org.omg.spec.dd.x20100524.dc.FontDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.dc.impl;
/**
 * A document containing one Font(@http://www.omg.org/spec/DD/20100524/DC) element.
 *
 * This is a complex type.
 */
public class FontDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.dc.FontDocument
{
    private static final long serialVersionUID = 1L;
    
    public FontDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FONT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DC", "Font");
    
    
    /**
     * Gets the "Font" element
     */
    public org.omg.spec.dd.x20100524.dc.Font getFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.dc.Font target = null;
            target = (org.omg.spec.dd.x20100524.dc.Font)get_store().find_element_user(FONT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Font" element
     */
    public void setFont(org.omg.spec.dd.x20100524.dc.Font font)
    {
        generatedSetterHelperImpl(font, FONT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Font" element
     */
    public org.omg.spec.dd.x20100524.dc.Font addNewFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.dc.Font target = null;
            target = (org.omg.spec.dd.x20100524.dc.Font)get_store().add_element_user(FONT$0);
            return target;
        }
    }
}

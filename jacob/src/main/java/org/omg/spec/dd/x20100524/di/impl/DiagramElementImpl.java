/*
 * XML Type:  DiagramElement
 * Namespace: http://www.omg.org/spec/DD/20100524/DI
 * Java type: org.omg.spec.dd.x20100524.di.DiagramElement
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.di.impl;
/**
 * An XML DiagramElement(@http://www.omg.org/spec/DD/20100524/DI).
 *
 * This is a complex type.
 */
public class DiagramElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.di.DiagramElement
{
    private static final long serialVersionUID = 1L;
    
    public DiagramElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENSION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DI", "extension");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "extension" element
     */
    public org.omg.spec.dd.x20100524.di.DiagramElement.Extension getExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.DiagramElement.Extension target = null;
            target = (org.omg.spec.dd.x20100524.di.DiagramElement.Extension)get_store().find_element_user(EXTENSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extension" element
     */
    public boolean isSetExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENSION$0) != 0;
        }
    }
    
    /**
     * Sets the "extension" element
     */
    public void setExtension(org.omg.spec.dd.x20100524.di.DiagramElement.Extension extension)
    {
        generatedSetterHelperImpl(extension, EXTENSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extension" element
     */
    public org.omg.spec.dd.x20100524.di.DiagramElement.Extension addNewExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.DiagramElement.Extension target = null;
            target = (org.omg.spec.dd.x20100524.di.DiagramElement.Extension)get_store().add_element_user(EXTENSION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "extension" element
     */
    public void unsetExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENSION$0, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$2);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$2) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$2);
        }
    }
    /**
     * An XML extension(@http://www.omg.org/spec/DD/20100524/DI).
     *
     * This is a complex type.
     */
    public static class ExtensionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.di.DiagramElement.Extension
    {
        private static final long serialVersionUID = 1L;
        
        public ExtensionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}

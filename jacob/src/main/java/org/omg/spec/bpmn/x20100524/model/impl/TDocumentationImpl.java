/*
 * XML Type:  tDocumentation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TDocumentation
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tDocumentation(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TDocumentationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.TDocumentation
{
    private static final long serialVersionUID = 1L;
    
    public TDocumentationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName TEXTFORMAT$2 = 
        new javax.xml.namespace.QName("", "textFormat");
    
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$0);
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
            return get_store().find_attribute_user(ID$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$0);
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
            get_store().remove_attribute(ID$0);
        }
    }
    
    /**
     * Gets the "textFormat" attribute
     */
    public java.lang.String getTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTFORMAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TEXTFORMAT$2);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "textFormat" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTFORMAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(TEXTFORMAT$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "textFormat" attribute
     */
    public boolean isSetTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTFORMAT$2) != null;
        }
    }
    
    /**
     * Sets the "textFormat" attribute
     */
    public void setTextFormat(java.lang.String textFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTFORMAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTFORMAT$2);
            }
            target.setStringValue(textFormat);
        }
    }
    
    /**
     * Sets (as xml) the "textFormat" attribute
     */
    public void xsetTextFormat(org.apache.xmlbeans.XmlString textFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTFORMAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTFORMAT$2);
            }
            target.set(textFormat);
        }
    }
    
    /**
     * Unsets the "textFormat" attribute
     */
    public void unsetTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTFORMAT$2);
        }
    }
}

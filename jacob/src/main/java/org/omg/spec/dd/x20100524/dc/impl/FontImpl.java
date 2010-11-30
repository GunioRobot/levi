/*
 * XML Type:  Font
 * Namespace: http://www.omg.org/spec/DD/20100524/DC
 * Java type: org.omg.spec.dd.x20100524.dc.Font
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.dc.impl;
/**
 * An XML Font(@http://www.omg.org/spec/DD/20100524/DC).
 *
 * This is a complex type.
 */
public class FontImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.dc.Font
{
    private static final long serialVersionUID = 1L;
    
    public FontImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName SIZE$2 = 
        new javax.xml.namespace.QName("", "size");
    private static final javax.xml.namespace.QName ISBOLD$4 = 
        new javax.xml.namespace.QName("", "isBold");
    private static final javax.xml.namespace.QName ISITALIC$6 = 
        new javax.xml.namespace.QName("", "isItalic");
    private static final javax.xml.namespace.QName ISUNDERLINE$8 = 
        new javax.xml.namespace.QName("", "isUnderline");
    private static final javax.xml.namespace.QName ISSTRIKETHROUGH$10 = 
        new javax.xml.namespace.QName("", "isStrikeThrough");
    
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$0) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$0);
        }
    }
    
    /**
     * Gets the "size" attribute
     */
    public double getSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$2);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "size" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SIZE$2);
            return target;
        }
    }
    
    /**
     * True if has "size" attribute
     */
    public boolean isSetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SIZE$2) != null;
        }
    }
    
    /**
     * Sets the "size" attribute
     */
    public void setSize(double size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIZE$2);
            }
            target.setDoubleValue(size);
        }
    }
    
    /**
     * Sets (as xml) the "size" attribute
     */
    public void xsetSize(org.apache.xmlbeans.XmlDouble size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SIZE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SIZE$2);
            }
            target.set(size);
        }
    }
    
    /**
     * Unsets the "size" attribute
     */
    public void unsetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SIZE$2);
        }
    }
    
    /**
     * Gets the "isBold" attribute
     */
    public boolean getIsBold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISBOLD$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isBold" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsBold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISBOLD$4);
            return target;
        }
    }
    
    /**
     * True if has "isBold" attribute
     */
    public boolean isSetIsBold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISBOLD$4) != null;
        }
    }
    
    /**
     * Sets the "isBold" attribute
     */
    public void setIsBold(boolean isBold)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISBOLD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISBOLD$4);
            }
            target.setBooleanValue(isBold);
        }
    }
    
    /**
     * Sets (as xml) the "isBold" attribute
     */
    public void xsetIsBold(org.apache.xmlbeans.XmlBoolean isBold)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISBOLD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISBOLD$4);
            }
            target.set(isBold);
        }
    }
    
    /**
     * Unsets the "isBold" attribute
     */
    public void unsetIsBold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISBOLD$4);
        }
    }
    
    /**
     * Gets the "isItalic" attribute
     */
    public boolean getIsItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISITALIC$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isItalic" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISITALIC$6);
            return target;
        }
    }
    
    /**
     * True if has "isItalic" attribute
     */
    public boolean isSetIsItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISITALIC$6) != null;
        }
    }
    
    /**
     * Sets the "isItalic" attribute
     */
    public void setIsItalic(boolean isItalic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISITALIC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISITALIC$6);
            }
            target.setBooleanValue(isItalic);
        }
    }
    
    /**
     * Sets (as xml) the "isItalic" attribute
     */
    public void xsetIsItalic(org.apache.xmlbeans.XmlBoolean isItalic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISITALIC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISITALIC$6);
            }
            target.set(isItalic);
        }
    }
    
    /**
     * Unsets the "isItalic" attribute
     */
    public void unsetIsItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISITALIC$6);
        }
    }
    
    /**
     * Gets the "isUnderline" attribute
     */
    public boolean getIsUnderline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISUNDERLINE$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isUnderline" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsUnderline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISUNDERLINE$8);
            return target;
        }
    }
    
    /**
     * True if has "isUnderline" attribute
     */
    public boolean isSetIsUnderline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISUNDERLINE$8) != null;
        }
    }
    
    /**
     * Sets the "isUnderline" attribute
     */
    public void setIsUnderline(boolean isUnderline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISUNDERLINE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISUNDERLINE$8);
            }
            target.setBooleanValue(isUnderline);
        }
    }
    
    /**
     * Sets (as xml) the "isUnderline" attribute
     */
    public void xsetIsUnderline(org.apache.xmlbeans.XmlBoolean isUnderline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISUNDERLINE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISUNDERLINE$8);
            }
            target.set(isUnderline);
        }
    }
    
    /**
     * Unsets the "isUnderline" attribute
     */
    public void unsetIsUnderline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISUNDERLINE$8);
        }
    }
    
    /**
     * Gets the "isStrikeThrough" attribute
     */
    public boolean getIsStrikeThrough()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSTRIKETHROUGH$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isStrikeThrough" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsStrikeThrough()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISSTRIKETHROUGH$10);
            return target;
        }
    }
    
    /**
     * True if has "isStrikeThrough" attribute
     */
    public boolean isSetIsStrikeThrough()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISSTRIKETHROUGH$10) != null;
        }
    }
    
    /**
     * Sets the "isStrikeThrough" attribute
     */
    public void setIsStrikeThrough(boolean isStrikeThrough)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSTRIKETHROUGH$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISSTRIKETHROUGH$10);
            }
            target.setBooleanValue(isStrikeThrough);
        }
    }
    
    /**
     * Sets (as xml) the "isStrikeThrough" attribute
     */
    public void xsetIsStrikeThrough(org.apache.xmlbeans.XmlBoolean isStrikeThrough)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISSTRIKETHROUGH$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISSTRIKETHROUGH$10);
            }
            target.set(isStrikeThrough);
        }
    }
    
    /**
     * Unsets the "isStrikeThrough" attribute
     */
    public void unsetIsStrikeThrough()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISSTRIKETHROUGH$10);
        }
    }
}

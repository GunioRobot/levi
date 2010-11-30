/*
 * XML Type:  Point
 * Namespace: http://www.omg.org/spec/DD/20100524/DC
 * Java type: org.omg.spec.dd.x20100524.dc.Point
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.dc.impl;
/**
 * An XML Point(@http://www.omg.org/spec/DD/20100524/DC).
 *
 * This is a complex type.
 */
public class PointImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.dc.Point
{
    private static final long serialVersionUID = 1L;
    
    public PointImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName X$0 = 
        new javax.xml.namespace.QName("", "x");
    private static final javax.xml.namespace.QName Y$2 = 
        new javax.xml.namespace.QName("", "y");
    
    
    /**
     * Gets the "x" attribute
     */
    public double getX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(X$0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "x" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(X$0);
            return target;
        }
    }
    
    /**
     * Sets the "x" attribute
     */
    public void setX(double x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(X$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(X$0);
            }
            target.setDoubleValue(x);
        }
    }
    
    /**
     * Sets (as xml) the "x" attribute
     */
    public void xsetX(org.apache.xmlbeans.XmlDouble x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(X$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(X$0);
            }
            target.set(x);
        }
    }
    
    /**
     * Gets the "y" attribute
     */
    public double getY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(Y$2);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "y" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(Y$2);
            return target;
        }
    }
    
    /**
     * Sets the "y" attribute
     */
    public void setY(double y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(Y$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(Y$2);
            }
            target.setDoubleValue(y);
        }
    }
    
    /**
     * Sets (as xml) the "y" attribute
     */
    public void xsetY(org.apache.xmlbeans.XmlDouble y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(Y$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(Y$2);
            }
            target.set(y);
        }
    }
}

/*
 * XML Type:  Diagram
 * Namespace: http://www.omg.org/spec/DD/20100524/DI
 * Java type: org.omg.spec.dd.x20100524.di.Diagram
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.di.impl;
/**
 * An XML Diagram(@http://www.omg.org/spec/DD/20100524/DI).
 *
 * This is a complex type.
 */
public class DiagramImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.di.Diagram
{
    private static final long serialVersionUID = 1L;
    
    public DiagramImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName DOCUMENTATION$2 = 
        new javax.xml.namespace.QName("", "documentation");
    private static final javax.xml.namespace.QName RESOLUTION$4 = 
        new javax.xml.namespace.QName("", "resolution");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    
    
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
     * Gets the "documentation" attribute
     */
    public java.lang.String getDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCUMENTATION$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "documentation" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOCUMENTATION$2);
            return target;
        }
    }
    
    /**
     * True if has "documentation" attribute
     */
    public boolean isSetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DOCUMENTATION$2) != null;
        }
    }
    
    /**
     * Sets the "documentation" attribute
     */
    public void setDocumentation(java.lang.String documentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCUMENTATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOCUMENTATION$2);
            }
            target.setStringValue(documentation);
        }
    }
    
    /**
     * Sets (as xml) the "documentation" attribute
     */
    public void xsetDocumentation(org.apache.xmlbeans.XmlString documentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOCUMENTATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DOCUMENTATION$2);
            }
            target.set(documentation);
        }
    }
    
    /**
     * Unsets the "documentation" attribute
     */
    public void unsetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DOCUMENTATION$2);
        }
    }
    
    /**
     * Gets the "resolution" attribute
     */
    public double getResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOLUTION$4);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "resolution" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESOLUTION$4);
            return target;
        }
    }
    
    /**
     * True if has "resolution" attribute
     */
    public boolean isSetResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESOLUTION$4) != null;
        }
    }
    
    /**
     * Sets the "resolution" attribute
     */
    public void setResolution(double resolution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOLUTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESOLUTION$4);
            }
            target.setDoubleValue(resolution);
        }
    }
    
    /**
     * Sets (as xml) the "resolution" attribute
     */
    public void xsetResolution(org.apache.xmlbeans.XmlDouble resolution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESOLUTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESOLUTION$4);
            }
            target.set(resolution);
        }
    }
    
    /**
     * Unsets the "resolution" attribute
     */
    public void unsetResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESOLUTION$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
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
            return get_store().find_attribute_user(ID$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
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
            get_store().remove_attribute(ID$6);
        }
    }
}

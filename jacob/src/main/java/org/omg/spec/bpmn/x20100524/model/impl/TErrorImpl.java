/*
 * XML Type:  tError
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TError
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tError(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TErrorImpl extends org.omg.spec.bpmn.x20100524.model.impl.TRootElementImpl implements org.omg.spec.bpmn.x20100524.model.TError
{
    private static final long serialVersionUID = 1L;
    
    public TErrorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName ERRORCODE$2 = 
        new javax.xml.namespace.QName("", "errorCode");
    private static final javax.xml.namespace.QName STRUCTUREREF$4 = 
        new javax.xml.namespace.QName("", "structureRef");
    
    
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
     * Gets the "errorCode" attribute
     */
    public java.lang.String getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORCODE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorCode" attribute
     */
    public org.apache.xmlbeans.XmlString xgetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORCODE$2);
            return target;
        }
    }
    
    /**
     * True if has "errorCode" attribute
     */
    public boolean isSetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ERRORCODE$2) != null;
        }
    }
    
    /**
     * Sets the "errorCode" attribute
     */
    public void setErrorCode(java.lang.String errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORCODE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORCODE$2);
            }
            target.setStringValue(errorCode);
        }
    }
    
    /**
     * Sets (as xml) the "errorCode" attribute
     */
    public void xsetErrorCode(org.apache.xmlbeans.XmlString errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORCODE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORCODE$2);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Unsets the "errorCode" attribute
     */
    public void unsetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ERRORCODE$2);
        }
    }
    
    /**
     * Gets the "structureRef" attribute
     */
    public javax.xml.namespace.QName getStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTUREREF$4);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "structureRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(STRUCTUREREF$4);
            return target;
        }
    }
    
    /**
     * True if has "structureRef" attribute
     */
    public boolean isSetStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STRUCTUREREF$4) != null;
        }
    }
    
    /**
     * Sets the "structureRef" attribute
     */
    public void setStructureRef(javax.xml.namespace.QName structureRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTUREREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRUCTUREREF$4);
            }
            target.setQNameValue(structureRef);
        }
    }
    
    /**
     * Sets (as xml) the "structureRef" attribute
     */
    public void xsetStructureRef(org.apache.xmlbeans.XmlQName structureRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(STRUCTUREREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(STRUCTUREREF$4);
            }
            target.set(structureRef);
        }
    }
    
    /**
     * Unsets the "structureRef" attribute
     */
    public void unsetStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STRUCTUREREF$4);
        }
    }
}

/*
 * XML Type:  tEscalation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TEscalation
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tEscalation(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TEscalationImpl extends org.omg.spec.bpmn.x20100524.model.impl.TRootElementImpl implements org.omg.spec.bpmn.x20100524.model.TEscalation
{
    private static final long serialVersionUID = 1L;
    
    public TEscalationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName ESCALATIONCODE$2 = 
        new javax.xml.namespace.QName("", "escalationCode");
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
     * Gets the "escalationCode" attribute
     */
    public java.lang.String getEscalationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ESCALATIONCODE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "escalationCode" attribute
     */
    public org.apache.xmlbeans.XmlString xgetEscalationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ESCALATIONCODE$2);
            return target;
        }
    }
    
    /**
     * True if has "escalationCode" attribute
     */
    public boolean isSetEscalationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ESCALATIONCODE$2) != null;
        }
    }
    
    /**
     * Sets the "escalationCode" attribute
     */
    public void setEscalationCode(java.lang.String escalationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ESCALATIONCODE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ESCALATIONCODE$2);
            }
            target.setStringValue(escalationCode);
        }
    }
    
    /**
     * Sets (as xml) the "escalationCode" attribute
     */
    public void xsetEscalationCode(org.apache.xmlbeans.XmlString escalationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ESCALATIONCODE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ESCALATIONCODE$2);
            }
            target.set(escalationCode);
        }
    }
    
    /**
     * Unsets the "escalationCode" attribute
     */
    public void unsetEscalationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ESCALATIONCODE$2);
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

/*
 * XML Type:  tAssociation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TAssociation
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tAssociation(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TAssociationImpl extends org.omg.spec.bpmn.x20100524.model.impl.TArtifactImpl implements org.omg.spec.bpmn.x20100524.model.TAssociation
{
    private static final long serialVersionUID = 1L;
    
    public TAssociationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEREF$0 = 
        new javax.xml.namespace.QName("", "sourceRef");
    private static final javax.xml.namespace.QName TARGETREF$2 = 
        new javax.xml.namespace.QName("", "targetRef");
    private static final javax.xml.namespace.QName ASSOCIATIONDIRECTION$4 = 
        new javax.xml.namespace.QName("", "associationDirection");
    
    
    /**
     * Gets the "sourceRef" attribute
     */
    public javax.xml.namespace.QName getSourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetSourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(SOURCEREF$0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceRef" attribute
     */
    public void setSourceRef(javax.xml.namespace.QName sourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCEREF$0);
            }
            target.setQNameValue(sourceRef);
        }
    }
    
    /**
     * Sets (as xml) the "sourceRef" attribute
     */
    public void xsetSourceRef(org.apache.xmlbeans.XmlQName sourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(SOURCEREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(SOURCEREF$0);
            }
            target.set(sourceRef);
        }
    }
    
    /**
     * Gets the "targetRef" attribute
     */
    public javax.xml.namespace.QName getTargetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetTargetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TARGETREF$2);
            return target;
        }
    }
    
    /**
     * Sets the "targetRef" attribute
     */
    public void setTargetRef(javax.xml.namespace.QName targetRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETREF$2);
            }
            target.setQNameValue(targetRef);
        }
    }
    
    /**
     * Sets (as xml) the "targetRef" attribute
     */
    public void xsetTargetRef(org.apache.xmlbeans.XmlQName targetRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TARGETREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(TARGETREF$2);
            }
            target.set(targetRef);
        }
    }
    
    /**
     * Gets the "associationDirection" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TAssociationDirection.Enum getAssociationDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSOCIATIONDIRECTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ASSOCIATIONDIRECTION$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.omg.spec.bpmn.x20100524.model.TAssociationDirection.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "associationDirection" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TAssociationDirection xgetAssociationDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TAssociationDirection target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TAssociationDirection)get_store().find_attribute_user(ASSOCIATIONDIRECTION$4);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TAssociationDirection)get_default_attribute_value(ASSOCIATIONDIRECTION$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "associationDirection" attribute
     */
    public boolean isSetAssociationDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ASSOCIATIONDIRECTION$4) != null;
        }
    }
    
    /**
     * Sets the "associationDirection" attribute
     */
    public void setAssociationDirection(org.omg.spec.bpmn.x20100524.model.TAssociationDirection.Enum associationDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSOCIATIONDIRECTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASSOCIATIONDIRECTION$4);
            }
            target.setEnumValue(associationDirection);
        }
    }
    
    /**
     * Sets (as xml) the "associationDirection" attribute
     */
    public void xsetAssociationDirection(org.omg.spec.bpmn.x20100524.model.TAssociationDirection associationDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TAssociationDirection target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TAssociationDirection)get_store().find_attribute_user(ASSOCIATIONDIRECTION$4);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TAssociationDirection)get_store().add_attribute_user(ASSOCIATIONDIRECTION$4);
            }
            target.set(associationDirection);
        }
    }
    
    /**
     * Unsets the "associationDirection" attribute
     */
    public void unsetAssociationDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ASSOCIATIONDIRECTION$4);
        }
    }
}

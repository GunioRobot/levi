/*
 * XML Type:  tItemDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TItemDefinition
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tItemDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TItemDefinitionImpl extends org.omg.spec.bpmn.x20100524.model.impl.TRootElementImpl implements org.omg.spec.bpmn.x20100524.model.TItemDefinition
{
    private static final long serialVersionUID = 1L;
    
    public TItemDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTUREREF$0 = 
        new javax.xml.namespace.QName("", "structureRef");
    private static final javax.xml.namespace.QName ISCOLLECTION$2 = 
        new javax.xml.namespace.QName("", "isCollection");
    private static final javax.xml.namespace.QName ITEMKIND$4 = 
        new javax.xml.namespace.QName("", "itemKind");
    
    
    /**
     * Gets the "structureRef" attribute
     */
    public javax.xml.namespace.QName getStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTUREREF$0);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(STRUCTUREREF$0);
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
            return get_store().find_attribute_user(STRUCTUREREF$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTUREREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRUCTUREREF$0);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(STRUCTUREREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(STRUCTUREREF$0);
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
            get_store().remove_attribute(STRUCTUREREF$0);
        }
    }
    
    /**
     * Gets the "isCollection" attribute
     */
    public boolean getIsCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCOLLECTION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISCOLLECTION$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isCollection" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCOLLECTION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISCOLLECTION$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "isCollection" attribute
     */
    public boolean isSetIsCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISCOLLECTION$2) != null;
        }
    }
    
    /**
     * Sets the "isCollection" attribute
     */
    public void setIsCollection(boolean isCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCOLLECTION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISCOLLECTION$2);
            }
            target.setBooleanValue(isCollection);
        }
    }
    
    /**
     * Sets (as xml) the "isCollection" attribute
     */
    public void xsetIsCollection(org.apache.xmlbeans.XmlBoolean isCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCOLLECTION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISCOLLECTION$2);
            }
            target.set(isCollection);
        }
    }
    
    /**
     * Unsets the "isCollection" attribute
     */
    public void unsetIsCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISCOLLECTION$2);
        }
    }
    
    /**
     * Gets the "itemKind" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TItemKind.Enum getItemKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMKIND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ITEMKIND$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.omg.spec.bpmn.x20100524.model.TItemKind.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "itemKind" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TItemKind xgetItemKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TItemKind target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TItemKind)get_store().find_attribute_user(ITEMKIND$4);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TItemKind)get_default_attribute_value(ITEMKIND$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "itemKind" attribute
     */
    public boolean isSetItemKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ITEMKIND$4) != null;
        }
    }
    
    /**
     * Sets the "itemKind" attribute
     */
    public void setItemKind(org.omg.spec.bpmn.x20100524.model.TItemKind.Enum itemKind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMKIND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ITEMKIND$4);
            }
            target.setEnumValue(itemKind);
        }
    }
    
    /**
     * Sets (as xml) the "itemKind" attribute
     */
    public void xsetItemKind(org.omg.spec.bpmn.x20100524.model.TItemKind itemKind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TItemKind target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TItemKind)get_store().find_attribute_user(ITEMKIND$4);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TItemKind)get_store().add_attribute_user(ITEMKIND$4);
            }
            target.set(itemKind);
        }
    }
    
    /**
     * Unsets the "itemKind" attribute
     */
    public void unsetItemKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ITEMKIND$4);
        }
    }
}

/*
 * XML Type:  tBaseElement
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TBaseElement
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tBaseElement(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TBaseElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.TBaseElement
{
    private static final long serialVersionUID = 1L;
    
    public TBaseElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "documentation");
    private static final javax.xml.namespace.QName EXTENSIONELEMENTS$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "extensionElements");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets array of all "documentation" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TDocumentation[] getDocumentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCUMENTATION$0, targetList);
            org.omg.spec.bpmn.x20100524.model.TDocumentation[] result = new org.omg.spec.bpmn.x20100524.model.TDocumentation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "documentation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDocumentation getDocumentationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDocumentation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDocumentation)get_store().find_element_user(DOCUMENTATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "documentation" element
     */
    public int sizeOfDocumentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTATION$0);
        }
    }
    
    /**
     * Sets array of all "documentation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDocumentationArray(org.omg.spec.bpmn.x20100524.model.TDocumentation[] documentationArray)
    {
        check_orphaned();
        arraySetterHelper(documentationArray, DOCUMENTATION$0);
    }
    
    /**
     * Sets ith "documentation" element
     */
    public void setDocumentationArray(int i, org.omg.spec.bpmn.x20100524.model.TDocumentation documentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDocumentation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDocumentation)get_store().find_element_user(DOCUMENTATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(documentation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDocumentation insertNewDocumentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDocumentation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDocumentation)get_store().insert_element_user(DOCUMENTATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDocumentation addNewDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDocumentation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDocumentation)get_store().add_element_user(DOCUMENTATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "documentation" element
     */
    public void removeDocumentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTATION$0, i);
        }
    }
    
    /**
     * Gets the "extensionElements" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExtensionElements getExtensionElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExtensionElements target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExtensionElements)get_store().find_element_user(EXTENSIONELEMENTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extensionElements" element
     */
    public boolean isSetExtensionElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENSIONELEMENTS$2) != 0;
        }
    }
    
    /**
     * Sets the "extensionElements" element
     */
    public void setExtensionElements(org.omg.spec.bpmn.x20100524.model.TExtensionElements extensionElements)
    {
        generatedSetterHelperImpl(extensionElements, EXTENSIONELEMENTS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extensionElements" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExtensionElements addNewExtensionElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExtensionElements target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExtensionElements)get_store().add_element_user(EXTENSIONELEMENTS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "extensionElements" element
     */
    public void unsetExtensionElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENSIONELEMENTS$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
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
            return get_store().find_attribute_user(ID$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
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
            get_store().remove_attribute(ID$4);
        }
    }
}

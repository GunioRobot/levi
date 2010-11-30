/*
 * XML Type:  tLinkEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TLinkEventDefinition
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tLinkEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TLinkEventDefinitionImpl extends org.omg.spec.bpmn.x20100524.model.impl.TEventDefinitionImpl implements org.omg.spec.bpmn.x20100524.model.TLinkEventDefinition
{
    private static final long serialVersionUID = 1L;
    
    public TLinkEventDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "source");
    private static final javax.xml.namespace.QName TARGET$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "target");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets array of all "source" elements
     */
    public javax.xml.namespace.QName[] getSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCE$0, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "source" element
     */
    public javax.xml.namespace.QName getSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "source" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCE$0, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "source" element
     */
    public org.apache.xmlbeans.XmlQName xgetSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "source" element
     */
    public int sizeOfSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$0);
        }
    }
    
    /**
     * Sets array of all "source" element
     */
    public void setSourceArray(javax.xml.namespace.QName[] sourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sourceArray, SOURCE$0);
        }
    }
    
    /**
     * Sets ith "source" element
     */
    public void setSourceArray(int i, javax.xml.namespace.QName source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(source);
        }
    }
    
    /**
     * Sets (as xml) array of all "source" element
     */
    public void xsetSourceArray(org.apache.xmlbeans.XmlQName[]sourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sourceArray, SOURCE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "source" element
     */
    public void xsetSourceArray(int i, org.apache.xmlbeans.XmlQName source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(source);
        }
    }
    
    /**
     * Inserts the value as the ith "source" element
     */
    public void insertSource(int i, javax.xml.namespace.QName source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SOURCE$0, i);
            target.setQNameValue(source);
        }
    }
    
    /**
     * Appends the value as the last "source" element
     */
    public void addSource(javax.xml.namespace.QName source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$0);
            target.setQNameValue(source);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "source" element
     */
    public org.apache.xmlbeans.XmlQName insertNewSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(SOURCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "source" element
     */
    public org.apache.xmlbeans.XmlQName addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(SOURCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "source" element
     */
    public void removeSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$0, i);
        }
    }
    
    /**
     * Gets the "target" element
     */
    public javax.xml.namespace.QName getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "target" element
     */
    public org.apache.xmlbeans.XmlQName xgetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(TARGET$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "target" element
     */
    public boolean isSetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGET$2) != 0;
        }
    }
    
    /**
     * Sets the "target" element
     */
    public void setTarget(javax.xml.namespace.QName targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGET$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGET$2);
            }
            target.setQNameValue(targetValue);
        }
    }
    
    /**
     * Sets (as xml) the "target" element
     */
    public void xsetTarget(org.apache.xmlbeans.XmlQName targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(TARGET$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(TARGET$2);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Unsets the "target" element
     */
    public void unsetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGET$2, 0);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
            }
            target.set(name);
        }
    }
}

/*
 * XML Type:  tCorrelationProperty
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TCorrelationProperty
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tCorrelationProperty(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TCorrelationPropertyImpl extends org.omg.spec.bpmn.x20100524.model.impl.TRootElementImpl implements org.omg.spec.bpmn.x20100524.model.TCorrelationProperty
{
    private static final long serialVersionUID = 1L;
    
    public TCorrelationPropertyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONPROPERTYRETRIEVALEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "correlationPropertyRetrievalExpression");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets array of all "correlationPropertyRetrievalExpression" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression[] getCorrelationPropertyRetrievalExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0, targetList);
            org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression[] result = new org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "correlationPropertyRetrievalExpression" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression getCorrelationPropertyRetrievalExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression)get_store().find_element_user(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "correlationPropertyRetrievalExpression" element
     */
    public int sizeOfCorrelationPropertyRetrievalExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0);
        }
    }
    
    /**
     * Sets array of all "correlationPropertyRetrievalExpression" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCorrelationPropertyRetrievalExpressionArray(org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression[] correlationPropertyRetrievalExpressionArray)
    {
        check_orphaned();
        arraySetterHelper(correlationPropertyRetrievalExpressionArray, CORRELATIONPROPERTYRETRIEVALEXPRESSION$0);
    }
    
    /**
     * Sets ith "correlationPropertyRetrievalExpression" element
     */
    public void setCorrelationPropertyRetrievalExpressionArray(int i, org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression correlationPropertyRetrievalExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression)get_store().find_element_user(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(correlationPropertyRetrievalExpression);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "correlationPropertyRetrievalExpression" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression insertNewCorrelationPropertyRetrievalExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression)get_store().insert_element_user(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "correlationPropertyRetrievalExpression" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression addNewCorrelationPropertyRetrievalExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyRetrievalExpression)get_store().add_element_user(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "correlationPropertyRetrievalExpression" element
     */
    public void removeCorrelationPropertyRetrievalExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRELATIONPROPERTYRETRIEVALEXPRESSION$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
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
            return get_store().find_attribute_user(NAME$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
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
            get_store().remove_attribute(NAME$2);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public javax.xml.namespace.QName getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$4) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(javax.xml.namespace.QName type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setQNameValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlQName type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$4);
        }
    }
}

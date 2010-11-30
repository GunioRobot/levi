/*
 * XML Type:  tLane
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TLane
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tLane(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TLaneImpl extends org.omg.spec.bpmn.x20100524.model.impl.TBaseElementImpl implements org.omg.spec.bpmn.x20100524.model.TLane
{
    private static final long serialVersionUID = 1L;
    
    public TLaneImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTITIONELEMENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "partitionElement");
    private static final javax.xml.namespace.QName FLOWNODEREF$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "flowNodeRef");
    private static final javax.xml.namespace.QName CHILDLANESET$4 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "childLaneSet");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName PARTITIONELEMENTREF$8 = 
        new javax.xml.namespace.QName("", "partitionElementRef");
    
    
    /**
     * Gets the "partitionElement" element
     */
    public org.omg.spec.bpmn.x20100524.model.TBaseElement getPartitionElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TBaseElement target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TBaseElement)get_store().find_element_user(PARTITIONELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "partitionElement" element
     */
    public boolean isSetPartitionElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTITIONELEMENT$0) != 0;
        }
    }
    
    /**
     * Sets the "partitionElement" element
     */
    public void setPartitionElement(org.omg.spec.bpmn.x20100524.model.TBaseElement partitionElement)
    {
        generatedSetterHelperImpl(partitionElement, PARTITIONELEMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "partitionElement" element
     */
    public org.omg.spec.bpmn.x20100524.model.TBaseElement addNewPartitionElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TBaseElement target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TBaseElement)get_store().add_element_user(PARTITIONELEMENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "partitionElement" element
     */
    public void unsetPartitionElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTITIONELEMENT$0, 0);
        }
    }
    
    /**
     * Gets array of all "flowNodeRef" elements
     */
    public java.lang.String[] getFlowNodeRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLOWNODEREF$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "flowNodeRef" element
     */
    public java.lang.String getFlowNodeRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOWNODEREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "flowNodeRef" elements
     */
    public org.apache.xmlbeans.XmlIDREF[] xgetFlowNodeRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLOWNODEREF$2, targetList);
            org.apache.xmlbeans.XmlIDREF[] result = new org.apache.xmlbeans.XmlIDREF[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "flowNodeRef" element
     */
    public org.apache.xmlbeans.XmlIDREF xgetFlowNodeRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(FLOWNODEREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "flowNodeRef" element
     */
    public int sizeOfFlowNodeRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLOWNODEREF$2);
        }
    }
    
    /**
     * Sets array of all "flowNodeRef" element
     */
    public void setFlowNodeRefArray(java.lang.String[] flowNodeRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(flowNodeRefArray, FLOWNODEREF$2);
        }
    }
    
    /**
     * Sets ith "flowNodeRef" element
     */
    public void setFlowNodeRefArray(int i, java.lang.String flowNodeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOWNODEREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(flowNodeRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "flowNodeRef" element
     */
    public void xsetFlowNodeRefArray(org.apache.xmlbeans.XmlIDREF[]flowNodeRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(flowNodeRefArray, FLOWNODEREF$2);
        }
    }
    
    /**
     * Sets (as xml) ith "flowNodeRef" element
     */
    public void xsetFlowNodeRefArray(int i, org.apache.xmlbeans.XmlIDREF flowNodeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(FLOWNODEREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(flowNodeRef);
        }
    }
    
    /**
     * Inserts the value as the ith "flowNodeRef" element
     */
    public void insertFlowNodeRef(int i, java.lang.String flowNodeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FLOWNODEREF$2, i);
            target.setStringValue(flowNodeRef);
        }
    }
    
    /**
     * Appends the value as the last "flowNodeRef" element
     */
    public void addFlowNodeRef(java.lang.String flowNodeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLOWNODEREF$2);
            target.setStringValue(flowNodeRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "flowNodeRef" element
     */
    public org.apache.xmlbeans.XmlIDREF insertNewFlowNodeRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().insert_element_user(FLOWNODEREF$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "flowNodeRef" element
     */
    public org.apache.xmlbeans.XmlIDREF addNewFlowNodeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().add_element_user(FLOWNODEREF$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "flowNodeRef" element
     */
    public void removeFlowNodeRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLOWNODEREF$2, i);
        }
    }
    
    /**
     * Gets the "childLaneSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLaneSet getChildLaneSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLaneSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLaneSet)get_store().find_element_user(CHILDLANESET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "childLaneSet" element
     */
    public boolean isSetChildLaneSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHILDLANESET$4) != 0;
        }
    }
    
    /**
     * Sets the "childLaneSet" element
     */
    public void setChildLaneSet(org.omg.spec.bpmn.x20100524.model.TLaneSet childLaneSet)
    {
        generatedSetterHelperImpl(childLaneSet, CHILDLANESET$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "childLaneSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLaneSet addNewChildLaneSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLaneSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLaneSet)get_store().add_element_user(CHILDLANESET$4);
            return target;
        }
    }
    
    /**
     * Unsets the "childLaneSet" element
     */
    public void unsetChildLaneSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHILDLANESET$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
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
            return get_store().find_attribute_user(NAME$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
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
            get_store().remove_attribute(NAME$6);
        }
    }
    
    /**
     * Gets the "partitionElementRef" attribute
     */
    public javax.xml.namespace.QName getPartitionElementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTITIONELEMENTREF$8);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "partitionElementRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetPartitionElementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PARTITIONELEMENTREF$8);
            return target;
        }
    }
    
    /**
     * True if has "partitionElementRef" attribute
     */
    public boolean isSetPartitionElementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARTITIONELEMENTREF$8) != null;
        }
    }
    
    /**
     * Sets the "partitionElementRef" attribute
     */
    public void setPartitionElementRef(javax.xml.namespace.QName partitionElementRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTITIONELEMENTREF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTITIONELEMENTREF$8);
            }
            target.setQNameValue(partitionElementRef);
        }
    }
    
    /**
     * Sets (as xml) the "partitionElementRef" attribute
     */
    public void xsetPartitionElementRef(org.apache.xmlbeans.XmlQName partitionElementRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PARTITIONELEMENTREF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PARTITIONELEMENTREF$8);
            }
            target.set(partitionElementRef);
        }
    }
    
    /**
     * Unsets the "partitionElementRef" attribute
     */
    public void unsetPartitionElementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARTITIONELEMENTREF$8);
        }
    }
}

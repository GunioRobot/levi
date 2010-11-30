/*
 * XML Type:  tActivity
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TActivity
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tActivity(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TActivityImpl extends org.omg.spec.bpmn.x20100524.model.impl.TFlowNodeImpl implements org.omg.spec.bpmn.x20100524.model.TActivity
{
    private static final long serialVersionUID = 1L;
    
    public TActivityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IOSPECIFICATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "ioSpecification");
    private static final javax.xml.namespace.QName PROPERTY$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "property");
    private static final javax.xml.namespace.QName DATAINPUTASSOCIATION$4 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataInputAssociation");
    private static final javax.xml.namespace.QName DATAOUTPUTASSOCIATION$6 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataOutputAssociation");
    private static final javax.xml.namespace.QName RESOURCEROLE$8 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resourceRole");
    private static final org.apache.xmlbeans.QNameSet RESOURCEROLE$9 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "humanPerformer"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "performer"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "potentialOwner"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resourceRole"),
    });
    private static final javax.xml.namespace.QName LOOPCHARACTERISTICS$10 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "loopCharacteristics");
    private static final org.apache.xmlbeans.QNameSet LOOPCHARACTERISTICS$11 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "multiInstanceLoopCharacteristics"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "standardLoopCharacteristics"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "loopCharacteristics"),
    });
    private static final javax.xml.namespace.QName ISFORCOMPENSATION$12 = 
        new javax.xml.namespace.QName("", "isForCompensation");
    private static final javax.xml.namespace.QName STARTQUANTITY$14 = 
        new javax.xml.namespace.QName("", "startQuantity");
    private static final javax.xml.namespace.QName COMPLETIONQUANTITY$16 = 
        new javax.xml.namespace.QName("", "completionQuantity");
    private static final javax.xml.namespace.QName DEFAULT$18 = 
        new javax.xml.namespace.QName("", "default");
    
    
    /**
     * Gets the "ioSpecification" element
     */
    public org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification getIoSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification)get_store().find_element_user(IOSPECIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ioSpecification" element
     */
    public boolean isSetIoSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IOSPECIFICATION$0) != 0;
        }
    }
    
    /**
     * Sets the "ioSpecification" element
     */
    public void setIoSpecification(org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification ioSpecification)
    {
        generatedSetterHelperImpl(ioSpecification, IOSPECIFICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ioSpecification" element
     */
    public org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification addNewIoSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification)get_store().add_element_user(IOSPECIFICATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ioSpecification" element
     */
    public void unsetIoSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IOSPECIFICATION$0, 0);
        }
    }
    
    /**
     * Gets array of all "property" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TProperty[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTY$2, targetList);
            org.omg.spec.bpmn.x20100524.model.TProperty[] result = new org.omg.spec.bpmn.x20100524.model.TProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "property" element
     */
    public org.omg.spec.bpmn.x20100524.model.TProperty getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProperty target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProperty)get_store().find_element_user(PROPERTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "property" element
     */
    public int sizeOfPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$2);
        }
    }
    
    /**
     * Sets array of all "property" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPropertyArray(org.omg.spec.bpmn.x20100524.model.TProperty[] propertyArray)
    {
        check_orphaned();
        arraySetterHelper(propertyArray, PROPERTY$2);
    }
    
    /**
     * Sets ith "property" element
     */
    public void setPropertyArray(int i, org.omg.spec.bpmn.x20100524.model.TProperty property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProperty target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProperty)get_store().find_element_user(PROPERTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(property);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    public org.omg.spec.bpmn.x20100524.model.TProperty insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProperty target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProperty)get_store().insert_element_user(PROPERTY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    public org.omg.spec.bpmn.x20100524.model.TProperty addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProperty target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProperty)get_store().add_element_user(PROPERTY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "property" element
     */
    public void removeProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$2, i);
        }
    }
    
    /**
     * Gets array of all "dataInputAssociation" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInputAssociation[] getDataInputAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAINPUTASSOCIATION$4, targetList);
            org.omg.spec.bpmn.x20100524.model.TDataInputAssociation[] result = new org.omg.spec.bpmn.x20100524.model.TDataInputAssociation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataInputAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInputAssociation getDataInputAssociationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInputAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInputAssociation)get_store().find_element_user(DATAINPUTASSOCIATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataInputAssociation" element
     */
    public int sizeOfDataInputAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAINPUTASSOCIATION$4);
        }
    }
    
    /**
     * Sets array of all "dataInputAssociation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDataInputAssociationArray(org.omg.spec.bpmn.x20100524.model.TDataInputAssociation[] dataInputAssociationArray)
    {
        check_orphaned();
        arraySetterHelper(dataInputAssociationArray, DATAINPUTASSOCIATION$4);
    }
    
    /**
     * Sets ith "dataInputAssociation" element
     */
    public void setDataInputAssociationArray(int i, org.omg.spec.bpmn.x20100524.model.TDataInputAssociation dataInputAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInputAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInputAssociation)get_store().find_element_user(DATAINPUTASSOCIATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataInputAssociation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataInputAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInputAssociation insertNewDataInputAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInputAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInputAssociation)get_store().insert_element_user(DATAINPUTASSOCIATION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataInputAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInputAssociation addNewDataInputAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInputAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInputAssociation)get_store().add_element_user(DATAINPUTASSOCIATION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataInputAssociation" element
     */
    public void removeDataInputAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAINPUTASSOCIATION$4, i);
        }
    }
    
    /**
     * Gets array of all "dataOutputAssociation" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation[] getDataOutputAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAOUTPUTASSOCIATION$6, targetList);
            org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation[] result = new org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataOutputAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation getDataOutputAssociationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation)get_store().find_element_user(DATAOUTPUTASSOCIATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataOutputAssociation" element
     */
    public int sizeOfDataOutputAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAOUTPUTASSOCIATION$6);
        }
    }
    
    /**
     * Sets array of all "dataOutputAssociation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDataOutputAssociationArray(org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation[] dataOutputAssociationArray)
    {
        check_orphaned();
        arraySetterHelper(dataOutputAssociationArray, DATAOUTPUTASSOCIATION$6);
    }
    
    /**
     * Sets ith "dataOutputAssociation" element
     */
    public void setDataOutputAssociationArray(int i, org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation dataOutputAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation)get_store().find_element_user(DATAOUTPUTASSOCIATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataOutputAssociation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataOutputAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation insertNewDataOutputAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation)get_store().insert_element_user(DATAOUTPUTASSOCIATION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataOutputAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation addNewDataOutputAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation)get_store().add_element_user(DATAOUTPUTASSOCIATION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataOutputAssociation" element
     */
    public void removeDataOutputAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAOUTPUTASSOCIATION$6, i);
        }
    }
    
    /**
     * Gets array of all "resourceRole" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceRole[] getResourceRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEROLE$9, targetList);
            org.omg.spec.bpmn.x20100524.model.TResourceRole[] result = new org.omg.spec.bpmn.x20100524.model.TResourceRole[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resourceRole" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceRole getResourceRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceRole target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceRole)get_store().find_element_user(RESOURCEROLE$9, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resourceRole" element
     */
    public int sizeOfResourceRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEROLE$9);
        }
    }
    
    /**
     * Sets array of all "resourceRole" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResourceRoleArray(org.omg.spec.bpmn.x20100524.model.TResourceRole[] resourceRoleArray)
    {
        check_orphaned();
        arraySetterHelper(resourceRoleArray, RESOURCEROLE$8, RESOURCEROLE$9);
    }
    
    /**
     * Sets ith "resourceRole" element
     */
    public void setResourceRoleArray(int i, org.omg.spec.bpmn.x20100524.model.TResourceRole resourceRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceRole target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceRole)get_store().find_element_user(RESOURCEROLE$9, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceRole);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceRole" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceRole insertNewResourceRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceRole target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceRole)get_store().insert_element_user(RESOURCEROLE$9, RESOURCEROLE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceRole" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceRole addNewResourceRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceRole target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceRole)get_store().add_element_user(RESOURCEROLE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "resourceRole" element
     */
    public void removeResourceRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEROLE$9, i);
        }
    }
    
    /**
     * Gets the "loopCharacteristics" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics getLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics)get_store().find_element_user(LOOPCHARACTERISTICS$11, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "loopCharacteristics" element
     */
    public boolean isSetLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOOPCHARACTERISTICS$11) != 0;
        }
    }
    
    /**
     * Sets the "loopCharacteristics" element
     */
    public void setLoopCharacteristics(org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics loopCharacteristics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics)get_store().find_element_user(LOOPCHARACTERISTICS$11, 0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics)get_store().add_element_user(LOOPCHARACTERISTICS$10);
            }
            target.set(loopCharacteristics);
        }
    }
    
    /**
     * Appends and returns a new empty "loopCharacteristics" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics addNewLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics)get_store().add_element_user(LOOPCHARACTERISTICS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "loopCharacteristics" element
     */
    public void unsetLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOOPCHARACTERISTICS$11, 0);
        }
    }
    
    /**
     * Gets the "isForCompensation" attribute
     */
    public boolean getIsForCompensation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISFORCOMPENSATION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISFORCOMPENSATION$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isForCompensation" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsForCompensation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISFORCOMPENSATION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISFORCOMPENSATION$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "isForCompensation" attribute
     */
    public boolean isSetIsForCompensation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISFORCOMPENSATION$12) != null;
        }
    }
    
    /**
     * Sets the "isForCompensation" attribute
     */
    public void setIsForCompensation(boolean isForCompensation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISFORCOMPENSATION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISFORCOMPENSATION$12);
            }
            target.setBooleanValue(isForCompensation);
        }
    }
    
    /**
     * Sets (as xml) the "isForCompensation" attribute
     */
    public void xsetIsForCompensation(org.apache.xmlbeans.XmlBoolean isForCompensation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISFORCOMPENSATION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISFORCOMPENSATION$12);
            }
            target.set(isForCompensation);
        }
    }
    
    /**
     * Unsets the "isForCompensation" attribute
     */
    public void unsetIsForCompensation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISFORCOMPENSATION$12);
        }
    }
    
    /**
     * Gets the "startQuantity" attribute
     */
    public java.math.BigInteger getStartQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTQUANTITY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STARTQUANTITY$14);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "startQuantity" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetStartQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(STARTQUANTITY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(STARTQUANTITY$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "startQuantity" attribute
     */
    public boolean isSetStartQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTQUANTITY$14) != null;
        }
    }
    
    /**
     * Sets the "startQuantity" attribute
     */
    public void setStartQuantity(java.math.BigInteger startQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTQUANTITY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTQUANTITY$14);
            }
            target.setBigIntegerValue(startQuantity);
        }
    }
    
    /**
     * Sets (as xml) the "startQuantity" attribute
     */
    public void xsetStartQuantity(org.apache.xmlbeans.XmlInteger startQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(STARTQUANTITY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(STARTQUANTITY$14);
            }
            target.set(startQuantity);
        }
    }
    
    /**
     * Unsets the "startQuantity" attribute
     */
    public void unsetStartQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTQUANTITY$14);
        }
    }
    
    /**
     * Gets the "completionQuantity" attribute
     */
    public java.math.BigInteger getCompletionQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPLETIONQUANTITY$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COMPLETIONQUANTITY$16);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "completionQuantity" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetCompletionQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COMPLETIONQUANTITY$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(COMPLETIONQUANTITY$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "completionQuantity" attribute
     */
    public boolean isSetCompletionQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMPLETIONQUANTITY$16) != null;
        }
    }
    
    /**
     * Sets the "completionQuantity" attribute
     */
    public void setCompletionQuantity(java.math.BigInteger completionQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPLETIONQUANTITY$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPLETIONQUANTITY$16);
            }
            target.setBigIntegerValue(completionQuantity);
        }
    }
    
    /**
     * Sets (as xml) the "completionQuantity" attribute
     */
    public void xsetCompletionQuantity(org.apache.xmlbeans.XmlInteger completionQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COMPLETIONQUANTITY$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(COMPLETIONQUANTITY$16);
            }
            target.set(completionQuantity);
        }
    }
    
    /**
     * Unsets the "completionQuantity" attribute
     */
    public void unsetCompletionQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMPLETIONQUANTITY$16);
        }
    }
    
    /**
     * Gets the "default" attribute
     */
    public java.lang.String getDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "default" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(DEFAULT$18);
            return target;
        }
    }
    
    /**
     * True if has "default" attribute
     */
    public boolean isSetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULT$18) != null;
        }
    }
    
    /**
     * Sets the "default" attribute
     */
    public void setDefault(java.lang.String xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$18);
            }
            target.setStringValue(xdefault);
        }
    }
    
    /**
     * Sets (as xml) the "default" attribute
     */
    public void xsetDefault(org.apache.xmlbeans.XmlIDREF xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(DEFAULT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(DEFAULT$18);
            }
            target.set(xdefault);
        }
    }
    
    /**
     * Unsets the "default" attribute
     */
    public void unsetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULT$18);
        }
    }
}

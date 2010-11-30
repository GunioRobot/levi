/*
 * XML Type:  tDataAssociation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TDataAssociation
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tDataAssociation(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TDataAssociationImpl extends org.omg.spec.bpmn.x20100524.model.impl.TBaseElementImpl implements org.omg.spec.bpmn.x20100524.model.TDataAssociation
{
    private static final long serialVersionUID = 1L;
    
    public TDataAssociationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEREF$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "sourceRef");
    private static final javax.xml.namespace.QName TARGETREF$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "targetRef");
    private static final javax.xml.namespace.QName TRANSFORMATION$4 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "transformation");
    private static final javax.xml.namespace.QName ASSIGNMENT$6 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "assignment");
    
    
    /**
     * Gets array of all "sourceRef" elements
     */
    public java.lang.String[] getSourceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCEREF$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "sourceRef" element
     */
    public java.lang.String getSourceRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "sourceRef" elements
     */
    public org.apache.xmlbeans.XmlIDREF[] xgetSourceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCEREF$0, targetList);
            org.apache.xmlbeans.XmlIDREF[] result = new org.apache.xmlbeans.XmlIDREF[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "sourceRef" element
     */
    public org.apache.xmlbeans.XmlIDREF xgetSourceRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(SOURCEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sourceRef" element
     */
    public int sizeOfSourceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEREF$0);
        }
    }
    
    /**
     * Sets array of all "sourceRef" element
     */
    public void setSourceRefArray(java.lang.String[] sourceRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sourceRefArray, SOURCEREF$0);
        }
    }
    
    /**
     * Sets ith "sourceRef" element
     */
    public void setSourceRefArray(int i, java.lang.String sourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(sourceRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "sourceRef" element
     */
    public void xsetSourceRefArray(org.apache.xmlbeans.XmlIDREF[]sourceRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sourceRefArray, SOURCEREF$0);
        }
    }
    
    /**
     * Sets (as xml) ith "sourceRef" element
     */
    public void xsetSourceRefArray(int i, org.apache.xmlbeans.XmlIDREF sourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(SOURCEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sourceRef);
        }
    }
    
    /**
     * Inserts the value as the ith "sourceRef" element
     */
    public void insertSourceRef(int i, java.lang.String sourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SOURCEREF$0, i);
            target.setStringValue(sourceRef);
        }
    }
    
    /**
     * Appends the value as the last "sourceRef" element
     */
    public void addSourceRef(java.lang.String sourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEREF$0);
            target.setStringValue(sourceRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sourceRef" element
     */
    public org.apache.xmlbeans.XmlIDREF insertNewSourceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().insert_element_user(SOURCEREF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sourceRef" element
     */
    public org.apache.xmlbeans.XmlIDREF addNewSourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().add_element_user(SOURCEREF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "sourceRef" element
     */
    public void removeSourceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEREF$0, i);
        }
    }
    
    /**
     * Gets the "targetRef" element
     */
    public java.lang.String getTargetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetRef" element
     */
    public org.apache.xmlbeans.XmlIDREF xgetTargetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(TARGETREF$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "targetRef" element
     */
    public void setTargetRef(java.lang.String targetRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETREF$2);
            }
            target.setStringValue(targetRef);
        }
    }
    
    /**
     * Sets (as xml) the "targetRef" element
     */
    public void xsetTargetRef(org.apache.xmlbeans.XmlIDREF targetRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(TARGETREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_element_user(TARGETREF$2);
            }
            target.set(targetRef);
        }
    }
    
    /**
     * Gets the "transformation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TFormalExpression getTransformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TFormalExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TFormalExpression)get_store().find_element_user(TRANSFORMATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "transformation" element
     */
    public boolean isSetTransformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSFORMATION$4) != 0;
        }
    }
    
    /**
     * Sets the "transformation" element
     */
    public void setTransformation(org.omg.spec.bpmn.x20100524.model.TFormalExpression transformation)
    {
        generatedSetterHelperImpl(transformation, TRANSFORMATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "transformation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TFormalExpression addNewTransformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TFormalExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TFormalExpression)get_store().add_element_user(TRANSFORMATION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "transformation" element
     */
    public void unsetTransformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSFORMATION$4, 0);
        }
    }
    
    /**
     * Gets array of all "assignment" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TAssignment[] getAssignmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ASSIGNMENT$6, targetList);
            org.omg.spec.bpmn.x20100524.model.TAssignment[] result = new org.omg.spec.bpmn.x20100524.model.TAssignment[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "assignment" element
     */
    public org.omg.spec.bpmn.x20100524.model.TAssignment getAssignmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TAssignment target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TAssignment)get_store().find_element_user(ASSIGNMENT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "assignment" element
     */
    public int sizeOfAssignmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSIGNMENT$6);
        }
    }
    
    /**
     * Sets array of all "assignment" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAssignmentArray(org.omg.spec.bpmn.x20100524.model.TAssignment[] assignmentArray)
    {
        check_orphaned();
        arraySetterHelper(assignmentArray, ASSIGNMENT$6);
    }
    
    /**
     * Sets ith "assignment" element
     */
    public void setAssignmentArray(int i, org.omg.spec.bpmn.x20100524.model.TAssignment assignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TAssignment target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TAssignment)get_store().find_element_user(ASSIGNMENT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(assignment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "assignment" element
     */
    public org.omg.spec.bpmn.x20100524.model.TAssignment insertNewAssignment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TAssignment target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TAssignment)get_store().insert_element_user(ASSIGNMENT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "assignment" element
     */
    public org.omg.spec.bpmn.x20100524.model.TAssignment addNewAssignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TAssignment target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TAssignment)get_store().add_element_user(ASSIGNMENT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "assignment" element
     */
    public void removeAssignment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSIGNMENT$6, i);
        }
    }
}

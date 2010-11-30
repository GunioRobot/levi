/*
 * XML Type:  Plane
 * Namespace: http://www.omg.org/spec/DD/20100524/DI
 * Java type: org.omg.spec.dd.x20100524.di.Plane
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.di.impl;
/**
 * An XML Plane(@http://www.omg.org/spec/DD/20100524/DI).
 *
 * This is a complex type.
 */
public class PlaneImpl extends org.omg.spec.dd.x20100524.di.impl.NodeImpl implements org.omg.spec.dd.x20100524.di.Plane
{
    private static final long serialVersionUID = 1L;
    
    public PlaneImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIAGRAMELEMENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DI", "DiagramElement");
    private static final org.apache.xmlbeans.QNameSet DIAGRAMELEMENT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNEdge"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNShape"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DI", "DiagramElement"),
    });
    
    
    /**
     * Gets array of all "DiagramElement" elements
     */
    public org.omg.spec.dd.x20100524.di.DiagramElement[] getDiagramElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIAGRAMELEMENT$1, targetList);
            org.omg.spec.dd.x20100524.di.DiagramElement[] result = new org.omg.spec.dd.x20100524.di.DiagramElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DiagramElement" element
     */
    public org.omg.spec.dd.x20100524.di.DiagramElement getDiagramElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.DiagramElement target = null;
            target = (org.omg.spec.dd.x20100524.di.DiagramElement)get_store().find_element_user(DIAGRAMELEMENT$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DiagramElement" element
     */
    public int sizeOfDiagramElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIAGRAMELEMENT$1);
        }
    }
    
    /**
     * Sets array of all "DiagramElement" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDiagramElementArray(org.omg.spec.dd.x20100524.di.DiagramElement[] diagramElementArray)
    {
        check_orphaned();
        arraySetterHelper(diagramElementArray, DIAGRAMELEMENT$0, DIAGRAMELEMENT$1);
    }
    
    /**
     * Sets ith "DiagramElement" element
     */
    public void setDiagramElementArray(int i, org.omg.spec.dd.x20100524.di.DiagramElement diagramElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.DiagramElement target = null;
            target = (org.omg.spec.dd.x20100524.di.DiagramElement)get_store().find_element_user(DIAGRAMELEMENT$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(diagramElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DiagramElement" element
     */
    public org.omg.spec.dd.x20100524.di.DiagramElement insertNewDiagramElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.DiagramElement target = null;
            target = (org.omg.spec.dd.x20100524.di.DiagramElement)get_store().insert_element_user(DIAGRAMELEMENT$1, DIAGRAMELEMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DiagramElement" element
     */
    public org.omg.spec.dd.x20100524.di.DiagramElement addNewDiagramElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.DiagramElement target = null;
            target = (org.omg.spec.dd.x20100524.di.DiagramElement)get_store().add_element_user(DIAGRAMELEMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DiagramElement" element
     */
    public void removeDiagramElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIAGRAMELEMENT$1, i);
        }
    }
}

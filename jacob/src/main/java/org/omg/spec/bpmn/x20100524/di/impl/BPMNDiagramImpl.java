/*
 * XML Type:  BPMNDiagram
 * Namespace: http://www.omg.org/spec/BPMN/20100524/DI
 * Java type: org.omg.spec.bpmn.x20100524.di.BPMNDiagram
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.di.impl;
/**
 * An XML BPMNDiagram(@http://www.omg.org/spec/BPMN/20100524/DI).
 *
 * This is a complex type.
 */
public class BPMNDiagramImpl extends org.omg.spec.dd.x20100524.di.impl.DiagramImpl implements org.omg.spec.bpmn.x20100524.di.BPMNDiagram
{
    private static final long serialVersionUID = 1L;
    
    public BPMNDiagramImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BPMNPLANE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNPlane");
    private static final javax.xml.namespace.QName BPMNLABELSTYLE$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNLabelStyle");
    
    
    /**
     * Gets the "BPMNPlane" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNPlane getBPMNPlane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNPlane target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNPlane)get_store().find_element_user(BPMNPLANE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BPMNPlane" element
     */
    public void setBPMNPlane(org.omg.spec.bpmn.x20100524.di.BPMNPlane bpmnPlane)
    {
        generatedSetterHelperImpl(bpmnPlane, BPMNPLANE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BPMNPlane" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNPlane addNewBPMNPlane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNPlane target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNPlane)get_store().add_element_user(BPMNPLANE$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "BPMNLabelStyle" elements
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle[] getBPMNLabelStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BPMNLABELSTYLE$2, targetList);
            org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle[] result = new org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "BPMNLabelStyle" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle getBPMNLabelStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle)get_store().find_element_user(BPMNLABELSTYLE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "BPMNLabelStyle" element
     */
    public int sizeOfBPMNLabelStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BPMNLABELSTYLE$2);
        }
    }
    
    /**
     * Sets array of all "BPMNLabelStyle" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBPMNLabelStyleArray(org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle[] bpmnLabelStyleArray)
    {
        check_orphaned();
        arraySetterHelper(bpmnLabelStyleArray, BPMNLABELSTYLE$2);
    }
    
    /**
     * Sets ith "BPMNLabelStyle" element
     */
    public void setBPMNLabelStyleArray(int i, org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle bpmnLabelStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle)get_store().find_element_user(BPMNLABELSTYLE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bpmnLabelStyle);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BPMNLabelStyle" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle insertNewBPMNLabelStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle)get_store().insert_element_user(BPMNLABELSTYLE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BPMNLabelStyle" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle addNewBPMNLabelStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle)get_store().add_element_user(BPMNLABELSTYLE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "BPMNLabelStyle" element
     */
    public void removeBPMNLabelStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BPMNLABELSTYLE$2, i);
        }
    }
}

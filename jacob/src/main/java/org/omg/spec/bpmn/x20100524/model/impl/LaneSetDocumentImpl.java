/*
 * An XML document type.
 * Localname: laneSet
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.LaneSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one laneSet(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class LaneSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.LaneSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public LaneSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANESET$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "laneSet");
    
    
    /**
     * Gets the "laneSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLaneSet getLaneSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLaneSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLaneSet)get_store().find_element_user(LANESET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "laneSet" element
     */
    public void setLaneSet(org.omg.spec.bpmn.x20100524.model.TLaneSet laneSet)
    {
        generatedSetterHelperImpl(laneSet, LANESET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "laneSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLaneSet addNewLaneSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLaneSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLaneSet)get_store().add_element_user(LANESET$0);
            return target;
        }
    }
}

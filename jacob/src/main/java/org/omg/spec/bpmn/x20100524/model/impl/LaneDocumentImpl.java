/*
 * An XML document type.
 * Localname: lane
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.LaneDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one lane(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class LaneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.LaneDocument
{
    private static final long serialVersionUID = 1L;
    
    public LaneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "lane");
    
    
    /**
     * Gets the "lane" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLane getLane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLane target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLane)get_store().find_element_user(LANE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lane" element
     */
    public void setLane(org.omg.spec.bpmn.x20100524.model.TLane lane)
    {
        generatedSetterHelperImpl(lane, LANE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "lane" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLane addNewLane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLane target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLane)get_store().add_element_user(LANE$0);
            return target;
        }
    }
}

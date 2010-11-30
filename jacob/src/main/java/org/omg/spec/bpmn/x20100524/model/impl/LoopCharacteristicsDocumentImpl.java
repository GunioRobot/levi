/*
 * An XML document type.
 * Localname: loopCharacteristics
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.LoopCharacteristicsDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one loopCharacteristics(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class LoopCharacteristicsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.LoopCharacteristicsDocument
{
    private static final long serialVersionUID = 1L;
    
    public LoopCharacteristicsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOOPCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "loopCharacteristics");
    private static final org.apache.xmlbeans.QNameSet LOOPCHARACTERISTICS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "multiInstanceLoopCharacteristics"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "standardLoopCharacteristics"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "loopCharacteristics"),
    });
    
    
    /**
     * Gets the "loopCharacteristics" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics getLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics)get_store().find_element_user(LOOPCHARACTERISTICS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics)get_store().find_element_user(LOOPCHARACTERISTICS$1, 0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics)get_store().add_element_user(LOOPCHARACTERISTICS$0);
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
            target = (org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics)get_store().add_element_user(LOOPCHARACTERISTICS$0);
            return target;
        }
    }
}

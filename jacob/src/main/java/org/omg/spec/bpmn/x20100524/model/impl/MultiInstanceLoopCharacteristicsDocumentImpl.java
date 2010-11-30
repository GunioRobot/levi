/*
 * An XML document type.
 * Localname: multiInstanceLoopCharacteristics
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.MultiInstanceLoopCharacteristicsDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one multiInstanceLoopCharacteristics(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class MultiInstanceLoopCharacteristicsDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.LoopCharacteristicsDocumentImpl implements org.omg.spec.bpmn.x20100524.model.MultiInstanceLoopCharacteristicsDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiInstanceLoopCharacteristicsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIINSTANCELOOPCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "multiInstanceLoopCharacteristics");
    
    
    /**
     * Gets the "multiInstanceLoopCharacteristics" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics getMultiInstanceLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics)get_store().find_element_user(MULTIINSTANCELOOPCHARACTERISTICS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiInstanceLoopCharacteristics" element
     */
    public void setMultiInstanceLoopCharacteristics(org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics multiInstanceLoopCharacteristics)
    {
        generatedSetterHelperImpl(multiInstanceLoopCharacteristics, MULTIINSTANCELOOPCHARACTERISTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiInstanceLoopCharacteristics" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics addNewMultiInstanceLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics)get_store().add_element_user(MULTIINSTANCELOOPCHARACTERISTICS$0);
            return target;
        }
    }
}

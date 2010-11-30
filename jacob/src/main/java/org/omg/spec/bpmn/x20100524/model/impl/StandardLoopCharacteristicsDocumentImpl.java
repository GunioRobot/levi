/*
 * An XML document type.
 * Localname: standardLoopCharacteristics
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.StandardLoopCharacteristicsDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one standardLoopCharacteristics(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class StandardLoopCharacteristicsDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.LoopCharacteristicsDocumentImpl implements org.omg.spec.bpmn.x20100524.model.StandardLoopCharacteristicsDocument
{
    private static final long serialVersionUID = 1L;
    
    public StandardLoopCharacteristicsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STANDARDLOOPCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "standardLoopCharacteristics");
    
    
    /**
     * Gets the "standardLoopCharacteristics" element
     */
    public org.omg.spec.bpmn.x20100524.model.TStandardLoopCharacteristics getStandardLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TStandardLoopCharacteristics target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TStandardLoopCharacteristics)get_store().find_element_user(STANDARDLOOPCHARACTERISTICS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "standardLoopCharacteristics" element
     */
    public void setStandardLoopCharacteristics(org.omg.spec.bpmn.x20100524.model.TStandardLoopCharacteristics standardLoopCharacteristics)
    {
        generatedSetterHelperImpl(standardLoopCharacteristics, STANDARDLOOPCHARACTERISTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "standardLoopCharacteristics" element
     */
    public org.omg.spec.bpmn.x20100524.model.TStandardLoopCharacteristics addNewStandardLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TStandardLoopCharacteristics target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TStandardLoopCharacteristics)get_store().add_element_user(STANDARDLOOPCHARACTERISTICS$0);
            return target;
        }
    }
}

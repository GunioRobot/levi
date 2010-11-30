/*
 * An XML document type.
 * Localname: signalEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.SignalEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one signalEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class SignalEventDefinitionDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.EventDefinitionDocumentImpl implements org.omg.spec.bpmn.x20100524.model.SignalEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public SignalEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNALEVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "signalEventDefinition");
    
    
    /**
     * Gets the "signalEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TSignalEventDefinition getSignalEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TSignalEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TSignalEventDefinition)get_store().find_element_user(SIGNALEVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "signalEventDefinition" element
     */
    public void setSignalEventDefinition(org.omg.spec.bpmn.x20100524.model.TSignalEventDefinition signalEventDefinition)
    {
        generatedSetterHelperImpl(signalEventDefinition, SIGNALEVENTDEFINITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "signalEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TSignalEventDefinition addNewSignalEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TSignalEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TSignalEventDefinition)get_store().add_element_user(SIGNALEVENTDEFINITION$0);
            return target;
        }
    }
}

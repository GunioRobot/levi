/*
 * An XML document type.
 * Localname: cancelEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.CancelEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one cancelEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class CancelEventDefinitionDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.EventDefinitionDocumentImpl implements org.omg.spec.bpmn.x20100524.model.CancelEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CancelEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANCELEVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "cancelEventDefinition");
    
    
    /**
     * Gets the "cancelEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCancelEventDefinition getCancelEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCancelEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCancelEventDefinition)get_store().find_element_user(CANCELEVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cancelEventDefinition" element
     */
    public void setCancelEventDefinition(org.omg.spec.bpmn.x20100524.model.TCancelEventDefinition cancelEventDefinition)
    {
        generatedSetterHelperImpl(cancelEventDefinition, CANCELEVENTDEFINITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cancelEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCancelEventDefinition addNewCancelEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCancelEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCancelEventDefinition)get_store().add_element_user(CANCELEVENTDEFINITION$0);
            return target;
        }
    }
}

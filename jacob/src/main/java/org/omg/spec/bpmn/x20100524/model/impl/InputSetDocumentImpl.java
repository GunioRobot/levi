/*
 * An XML document type.
 * Localname: inputSet
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.InputSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one inputSet(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class InputSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.InputSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public InputSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INPUTSET$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "inputSet");
    
    
    /**
     * Gets the "inputSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TInputSet getInputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInputSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInputSet)get_store().find_element_user(INPUTSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "inputSet" element
     */
    public void setInputSet(org.omg.spec.bpmn.x20100524.model.TInputSet inputSet)
    {
        generatedSetterHelperImpl(inputSet, INPUTSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "inputSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TInputSet addNewInputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInputSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInputSet)get_store().add_element_user(INPUTSET$0);
            return target;
        }
    }
}

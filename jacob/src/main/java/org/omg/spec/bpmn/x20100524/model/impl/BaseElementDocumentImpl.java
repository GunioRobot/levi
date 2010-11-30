/*
 * An XML document type.
 * Localname: baseElement
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.BaseElementDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one baseElement(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class BaseElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.BaseElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public BaseElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASEELEMENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "baseElement");
    
    
    /**
     * Gets the "baseElement" element
     */
    public org.omg.spec.bpmn.x20100524.model.TBaseElement getBaseElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TBaseElement target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TBaseElement)get_store().find_element_user(BASEELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baseElement" element
     */
    public void setBaseElement(org.omg.spec.bpmn.x20100524.model.TBaseElement baseElement)
    {
        generatedSetterHelperImpl(baseElement, BASEELEMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "baseElement" element
     */
    public org.omg.spec.bpmn.x20100524.model.TBaseElement addNewBaseElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TBaseElement target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TBaseElement)get_store().add_element_user(BASEELEMENT$0);
            return target;
        }
    }
}

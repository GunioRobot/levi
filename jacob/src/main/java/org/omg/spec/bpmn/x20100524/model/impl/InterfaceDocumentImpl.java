/*
 * An XML document type.
 * Localname: interface
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.InterfaceDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one interface(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class InterfaceDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.InterfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public InterfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERFACE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "interface");
    
    
    /**
     * Gets the "interface" element
     */
    public org.omg.spec.bpmn.x20100524.model.TInterface getInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInterface target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInterface)get_store().find_element_user(INTERFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "interface" element
     */
    public void setInterface(org.omg.spec.bpmn.x20100524.model.TInterface xinterface)
    {
        generatedSetterHelperImpl(xinterface, INTERFACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "interface" element
     */
    public org.omg.spec.bpmn.x20100524.model.TInterface addNewInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TInterface target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TInterface)get_store().add_element_user(INTERFACE$0);
            return target;
        }
    }
}

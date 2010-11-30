/*
 * An XML document type.
 * Localname: text
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TextDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one text(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class TextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.TextDocument
{
    private static final long serialVersionUID = 1L;
    
    public TextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "text");
    
    
    /**
     * Gets the "text" element
     */
    public org.omg.spec.bpmn.x20100524.model.TText getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TText target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TText)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(org.omg.spec.bpmn.x20100524.model.TText text)
    {
        generatedSetterHelperImpl(text, TEXT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "text" element
     */
    public org.omg.spec.bpmn.x20100524.model.TText addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TText target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TText)get_store().add_element_user(TEXT$0);
            return target;
        }
    }
}

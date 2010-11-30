/*
 * XML Type:  tTextAnnotation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TTextAnnotation
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tTextAnnotation(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TTextAnnotationImpl extends org.omg.spec.bpmn.x20100524.model.impl.TArtifactImpl implements org.omg.spec.bpmn.x20100524.model.TTextAnnotation
{
    private static final long serialVersionUID = 1L;
    
    public TTextAnnotationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "text");
    private static final javax.xml.namespace.QName TEXTFORMAT$2 = 
        new javax.xml.namespace.QName("", "textFormat");
    
    
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
     * True if has "text" element
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$0) != 0;
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
    
    /**
     * Unsets the "text" element
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$0, 0);
        }
    }
    
    /**
     * Gets the "textFormat" attribute
     */
    public java.lang.String getTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTFORMAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TEXTFORMAT$2);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "textFormat" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTFORMAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(TEXTFORMAT$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "textFormat" attribute
     */
    public boolean isSetTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTFORMAT$2) != null;
        }
    }
    
    /**
     * Sets the "textFormat" attribute
     */
    public void setTextFormat(java.lang.String textFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTFORMAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTFORMAT$2);
            }
            target.setStringValue(textFormat);
        }
    }
    
    /**
     * Sets (as xml) the "textFormat" attribute
     */
    public void xsetTextFormat(org.apache.xmlbeans.XmlString textFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTFORMAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTFORMAT$2);
            }
            target.set(textFormat);
        }
    }
    
    /**
     * Unsets the "textFormat" attribute
     */
    public void unsetTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTFORMAT$2);
        }
    }
}

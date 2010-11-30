/*
 * XML Type:  BPMNLabelStyle
 * Namespace: http://www.omg.org/spec/BPMN/20100524/DI
 * Java type: org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.di.impl;
/**
 * An XML BPMNLabelStyle(@http://www.omg.org/spec/BPMN/20100524/DI).
 *
 * This is a complex type.
 */
public class BPMNLabelStyleImpl extends org.omg.spec.dd.x20100524.di.impl.StyleImpl implements org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle
{
    private static final long serialVersionUID = 1L;
    
    public BPMNLabelStyleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FONT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DC", "Font");
    
    
    /**
     * Gets the "Font" element
     */
    public org.omg.spec.dd.x20100524.dc.Font getFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.dc.Font target = null;
            target = (org.omg.spec.dd.x20100524.dc.Font)get_store().find_element_user(FONT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Font" element
     */
    public void setFont(org.omg.spec.dd.x20100524.dc.Font font)
    {
        generatedSetterHelperImpl(font, FONT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Font" element
     */
    public org.omg.spec.dd.x20100524.dc.Font addNewFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.dc.Font target = null;
            target = (org.omg.spec.dd.x20100524.dc.Font)get_store().add_element_user(FONT$0);
            return target;
        }
    }
}

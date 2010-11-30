/*
 * An XML document type.
 * Localname: BPMNLabelStyle
 * Namespace: http://www.omg.org/spec/BPMN/20100524/DI
 * Java type: org.omg.spec.bpmn.x20100524.di.BPMNLabelStyleDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.di.impl;
/**
 * A document containing one BPMNLabelStyle(@http://www.omg.org/spec/BPMN/20100524/DI) element.
 *
 * This is a complex type.
 */
public class BPMNLabelStyleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.di.BPMNLabelStyleDocument
{
    private static final long serialVersionUID = 1L;
    
    public BPMNLabelStyleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BPMNLABELSTYLE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNLabelStyle");
    
    
    /**
     * Gets the "BPMNLabelStyle" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle getBPMNLabelStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle)get_store().find_element_user(BPMNLABELSTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BPMNLabelStyle" element
     */
    public void setBPMNLabelStyle(org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle bpmnLabelStyle)
    {
        generatedSetterHelperImpl(bpmnLabelStyle, BPMNLABELSTYLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BPMNLabelStyle" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle addNewBPMNLabelStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle)get_store().add_element_user(BPMNLABELSTYLE$0);
            return target;
        }
    }
}

/*
 * XML Type:  BPMNEdge
 * Namespace: http://www.omg.org/spec/BPMN/20100524/DI
 * Java type: org.omg.spec.bpmn.x20100524.di.BPMNEdge
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.di.impl;
/**
 * An XML BPMNEdge(@http://www.omg.org/spec/BPMN/20100524/DI).
 *
 * This is a complex type.
 */
public class BPMNEdgeImpl extends org.omg.spec.dd.x20100524.di.impl.LabeledEdgeImpl implements org.omg.spec.bpmn.x20100524.di.BPMNEdge
{
    private static final long serialVersionUID = 1L;
    
    public BPMNEdgeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BPMNLABEL$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNLabel");
    private static final javax.xml.namespace.QName BPMNELEMENT$2 = 
        new javax.xml.namespace.QName("", "bpmnElement");
    private static final javax.xml.namespace.QName SOURCEELEMENT$4 = 
        new javax.xml.namespace.QName("", "sourceElement");
    private static final javax.xml.namespace.QName TARGETELEMENT$6 = 
        new javax.xml.namespace.QName("", "targetElement");
    private static final javax.xml.namespace.QName MESSAGEVISIBLEKIND$8 = 
        new javax.xml.namespace.QName("", "messageVisibleKind");
    
    
    /**
     * Gets the "BPMNLabel" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNLabel getBPMNLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNLabel target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNLabel)get_store().find_element_user(BPMNLABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BPMNLabel" element
     */
    public boolean isSetBPMNLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BPMNLABEL$0) != 0;
        }
    }
    
    /**
     * Sets the "BPMNLabel" element
     */
    public void setBPMNLabel(org.omg.spec.bpmn.x20100524.di.BPMNLabel bpmnLabel)
    {
        generatedSetterHelperImpl(bpmnLabel, BPMNLABEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BPMNLabel" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNLabel addNewBPMNLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNLabel target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNLabel)get_store().add_element_user(BPMNLABEL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "BPMNLabel" element
     */
    public void unsetBPMNLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BPMNLABEL$0, 0);
        }
    }
    
    /**
     * Gets the "bpmnElement" attribute
     */
    public javax.xml.namespace.QName getBpmnElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BPMNELEMENT$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "bpmnElement" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetBpmnElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(BPMNELEMENT$2);
            return target;
        }
    }
    
    /**
     * True if has "bpmnElement" attribute
     */
    public boolean isSetBpmnElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BPMNELEMENT$2) != null;
        }
    }
    
    /**
     * Sets the "bpmnElement" attribute
     */
    public void setBpmnElement(javax.xml.namespace.QName bpmnElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BPMNELEMENT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BPMNELEMENT$2);
            }
            target.setQNameValue(bpmnElement);
        }
    }
    
    /**
     * Sets (as xml) the "bpmnElement" attribute
     */
    public void xsetBpmnElement(org.apache.xmlbeans.XmlQName bpmnElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(BPMNELEMENT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(BPMNELEMENT$2);
            }
            target.set(bpmnElement);
        }
    }
    
    /**
     * Unsets the "bpmnElement" attribute
     */
    public void unsetBpmnElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BPMNELEMENT$2);
        }
    }
    
    /**
     * Gets the "sourceElement" attribute
     */
    public javax.xml.namespace.QName getSourceElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEELEMENT$4);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceElement" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetSourceElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(SOURCEELEMENT$4);
            return target;
        }
    }
    
    /**
     * True if has "sourceElement" attribute
     */
    public boolean isSetSourceElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOURCEELEMENT$4) != null;
        }
    }
    
    /**
     * Sets the "sourceElement" attribute
     */
    public void setSourceElement(javax.xml.namespace.QName sourceElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEELEMENT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCEELEMENT$4);
            }
            target.setQNameValue(sourceElement);
        }
    }
    
    /**
     * Sets (as xml) the "sourceElement" attribute
     */
    public void xsetSourceElement(org.apache.xmlbeans.XmlQName sourceElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(SOURCEELEMENT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(SOURCEELEMENT$4);
            }
            target.set(sourceElement);
        }
    }
    
    /**
     * Unsets the "sourceElement" attribute
     */
    public void unsetSourceElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOURCEELEMENT$4);
        }
    }
    
    /**
     * Gets the "targetElement" attribute
     */
    public javax.xml.namespace.QName getTargetElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETELEMENT$6);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetElement" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetTargetElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TARGETELEMENT$6);
            return target;
        }
    }
    
    /**
     * True if has "targetElement" attribute
     */
    public boolean isSetTargetElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TARGETELEMENT$6) != null;
        }
    }
    
    /**
     * Sets the "targetElement" attribute
     */
    public void setTargetElement(javax.xml.namespace.QName targetElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETELEMENT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETELEMENT$6);
            }
            target.setQNameValue(targetElement);
        }
    }
    
    /**
     * Sets (as xml) the "targetElement" attribute
     */
    public void xsetTargetElement(org.apache.xmlbeans.XmlQName targetElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TARGETELEMENT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(TARGETELEMENT$6);
            }
            target.set(targetElement);
        }
    }
    
    /**
     * Unsets the "targetElement" attribute
     */
    public void unsetTargetElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TARGETELEMENT$6);
        }
    }
    
    /**
     * Gets the "messageVisibleKind" attribute
     */
    public org.omg.spec.bpmn.x20100524.di.MessageVisibleKind.Enum getMessageVisibleKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGEVISIBLEKIND$8);
            if (target == null)
            {
                return null;
            }
            return (org.omg.spec.bpmn.x20100524.di.MessageVisibleKind.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageVisibleKind" attribute
     */
    public org.omg.spec.bpmn.x20100524.di.MessageVisibleKind xgetMessageVisibleKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.MessageVisibleKind target = null;
            target = (org.omg.spec.bpmn.x20100524.di.MessageVisibleKind)get_store().find_attribute_user(MESSAGEVISIBLEKIND$8);
            return target;
        }
    }
    
    /**
     * True if has "messageVisibleKind" attribute
     */
    public boolean isSetMessageVisibleKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MESSAGEVISIBLEKIND$8) != null;
        }
    }
    
    /**
     * Sets the "messageVisibleKind" attribute
     */
    public void setMessageVisibleKind(org.omg.spec.bpmn.x20100524.di.MessageVisibleKind.Enum messageVisibleKind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGEVISIBLEKIND$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGEVISIBLEKIND$8);
            }
            target.setEnumValue(messageVisibleKind);
        }
    }
    
    /**
     * Sets (as xml) the "messageVisibleKind" attribute
     */
    public void xsetMessageVisibleKind(org.omg.spec.bpmn.x20100524.di.MessageVisibleKind messageVisibleKind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.MessageVisibleKind target = null;
            target = (org.omg.spec.bpmn.x20100524.di.MessageVisibleKind)get_store().find_attribute_user(MESSAGEVISIBLEKIND$8);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.di.MessageVisibleKind)get_store().add_attribute_user(MESSAGEVISIBLEKIND$8);
            }
            target.set(messageVisibleKind);
        }
    }
    
    /**
     * Unsets the "messageVisibleKind" attribute
     */
    public void unsetMessageVisibleKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MESSAGEVISIBLEKIND$8);
        }
    }
}

/*
 * XML Type:  BPMNShape
 * Namespace: http://www.omg.org/spec/BPMN/20100524/DI
 * Java type: org.omg.spec.bpmn.x20100524.di.BPMNShape
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.di.impl;
/**
 * An XML BPMNShape(@http://www.omg.org/spec/BPMN/20100524/DI).
 *
 * This is a complex type.
 */
public class BPMNShapeImpl extends org.omg.spec.dd.x20100524.di.impl.LabeledShapeImpl implements org.omg.spec.bpmn.x20100524.di.BPMNShape
{
    private static final long serialVersionUID = 1L;
    
    public BPMNShapeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BPMNLABEL$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNLabel");
    private static final javax.xml.namespace.QName BPMNELEMENT$2 = 
        new javax.xml.namespace.QName("", "bpmnElement");
    private static final javax.xml.namespace.QName ISHORIZONTAL$4 = 
        new javax.xml.namespace.QName("", "isHorizontal");
    private static final javax.xml.namespace.QName ISEXPANDED$6 = 
        new javax.xml.namespace.QName("", "isExpanded");
    private static final javax.xml.namespace.QName ISMARKERVISIBLE$8 = 
        new javax.xml.namespace.QName("", "isMarkerVisible");
    private static final javax.xml.namespace.QName ISMESSAGEVISIBLE$10 = 
        new javax.xml.namespace.QName("", "isMessageVisible");
    private static final javax.xml.namespace.QName PARTICIPANTBANDKIND$12 = 
        new javax.xml.namespace.QName("", "participantBandKind");
    private static final javax.xml.namespace.QName CHOREOGRAPHYACTIVITYSHAPE$14 = 
        new javax.xml.namespace.QName("", "choreographyActivityShape");
    
    
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
     * Gets the "isHorizontal" attribute
     */
    public boolean getIsHorizontal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISHORIZONTAL$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isHorizontal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsHorizontal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISHORIZONTAL$4);
            return target;
        }
    }
    
    /**
     * True if has "isHorizontal" attribute
     */
    public boolean isSetIsHorizontal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISHORIZONTAL$4) != null;
        }
    }
    
    /**
     * Sets the "isHorizontal" attribute
     */
    public void setIsHorizontal(boolean isHorizontal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISHORIZONTAL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISHORIZONTAL$4);
            }
            target.setBooleanValue(isHorizontal);
        }
    }
    
    /**
     * Sets (as xml) the "isHorizontal" attribute
     */
    public void xsetIsHorizontal(org.apache.xmlbeans.XmlBoolean isHorizontal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISHORIZONTAL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISHORIZONTAL$4);
            }
            target.set(isHorizontal);
        }
    }
    
    /**
     * Unsets the "isHorizontal" attribute
     */
    public void unsetIsHorizontal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISHORIZONTAL$4);
        }
    }
    
    /**
     * Gets the "isExpanded" attribute
     */
    public boolean getIsExpanded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISEXPANDED$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isExpanded" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsExpanded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISEXPANDED$6);
            return target;
        }
    }
    
    /**
     * True if has "isExpanded" attribute
     */
    public boolean isSetIsExpanded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISEXPANDED$6) != null;
        }
    }
    
    /**
     * Sets the "isExpanded" attribute
     */
    public void setIsExpanded(boolean isExpanded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISEXPANDED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISEXPANDED$6);
            }
            target.setBooleanValue(isExpanded);
        }
    }
    
    /**
     * Sets (as xml) the "isExpanded" attribute
     */
    public void xsetIsExpanded(org.apache.xmlbeans.XmlBoolean isExpanded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISEXPANDED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISEXPANDED$6);
            }
            target.set(isExpanded);
        }
    }
    
    /**
     * Unsets the "isExpanded" attribute
     */
    public void unsetIsExpanded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISEXPANDED$6);
        }
    }
    
    /**
     * Gets the "isMarkerVisible" attribute
     */
    public boolean getIsMarkerVisible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISMARKERVISIBLE$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isMarkerVisible" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsMarkerVisible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISMARKERVISIBLE$8);
            return target;
        }
    }
    
    /**
     * True if has "isMarkerVisible" attribute
     */
    public boolean isSetIsMarkerVisible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISMARKERVISIBLE$8) != null;
        }
    }
    
    /**
     * Sets the "isMarkerVisible" attribute
     */
    public void setIsMarkerVisible(boolean isMarkerVisible)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISMARKERVISIBLE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISMARKERVISIBLE$8);
            }
            target.setBooleanValue(isMarkerVisible);
        }
    }
    
    /**
     * Sets (as xml) the "isMarkerVisible" attribute
     */
    public void xsetIsMarkerVisible(org.apache.xmlbeans.XmlBoolean isMarkerVisible)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISMARKERVISIBLE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISMARKERVISIBLE$8);
            }
            target.set(isMarkerVisible);
        }
    }
    
    /**
     * Unsets the "isMarkerVisible" attribute
     */
    public void unsetIsMarkerVisible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISMARKERVISIBLE$8);
        }
    }
    
    /**
     * Gets the "isMessageVisible" attribute
     */
    public boolean getIsMessageVisible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISMESSAGEVISIBLE$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isMessageVisible" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsMessageVisible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISMESSAGEVISIBLE$10);
            return target;
        }
    }
    
    /**
     * True if has "isMessageVisible" attribute
     */
    public boolean isSetIsMessageVisible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISMESSAGEVISIBLE$10) != null;
        }
    }
    
    /**
     * Sets the "isMessageVisible" attribute
     */
    public void setIsMessageVisible(boolean isMessageVisible)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISMESSAGEVISIBLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISMESSAGEVISIBLE$10);
            }
            target.setBooleanValue(isMessageVisible);
        }
    }
    
    /**
     * Sets (as xml) the "isMessageVisible" attribute
     */
    public void xsetIsMessageVisible(org.apache.xmlbeans.XmlBoolean isMessageVisible)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISMESSAGEVISIBLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISMESSAGEVISIBLE$10);
            }
            target.set(isMessageVisible);
        }
    }
    
    /**
     * Unsets the "isMessageVisible" attribute
     */
    public void unsetIsMessageVisible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISMESSAGEVISIBLE$10);
        }
    }
    
    /**
     * Gets the "participantBandKind" attribute
     */
    public org.omg.spec.bpmn.x20100524.di.ParticipantBandKind.Enum getParticipantBandKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTICIPANTBANDKIND$12);
            if (target == null)
            {
                return null;
            }
            return (org.omg.spec.bpmn.x20100524.di.ParticipantBandKind.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "participantBandKind" attribute
     */
    public org.omg.spec.bpmn.x20100524.di.ParticipantBandKind xgetParticipantBandKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.ParticipantBandKind target = null;
            target = (org.omg.spec.bpmn.x20100524.di.ParticipantBandKind)get_store().find_attribute_user(PARTICIPANTBANDKIND$12);
            return target;
        }
    }
    
    /**
     * True if has "participantBandKind" attribute
     */
    public boolean isSetParticipantBandKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARTICIPANTBANDKIND$12) != null;
        }
    }
    
    /**
     * Sets the "participantBandKind" attribute
     */
    public void setParticipantBandKind(org.omg.spec.bpmn.x20100524.di.ParticipantBandKind.Enum participantBandKind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTICIPANTBANDKIND$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTICIPANTBANDKIND$12);
            }
            target.setEnumValue(participantBandKind);
        }
    }
    
    /**
     * Sets (as xml) the "participantBandKind" attribute
     */
    public void xsetParticipantBandKind(org.omg.spec.bpmn.x20100524.di.ParticipantBandKind participantBandKind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.ParticipantBandKind target = null;
            target = (org.omg.spec.bpmn.x20100524.di.ParticipantBandKind)get_store().find_attribute_user(PARTICIPANTBANDKIND$12);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.di.ParticipantBandKind)get_store().add_attribute_user(PARTICIPANTBANDKIND$12);
            }
            target.set(participantBandKind);
        }
    }
    
    /**
     * Unsets the "participantBandKind" attribute
     */
    public void unsetParticipantBandKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARTICIPANTBANDKIND$12);
        }
    }
    
    /**
     * Gets the "choreographyActivityShape" attribute
     */
    public javax.xml.namespace.QName getChoreographyActivityShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHOREOGRAPHYACTIVITYSHAPE$14);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "choreographyActivityShape" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetChoreographyActivityShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CHOREOGRAPHYACTIVITYSHAPE$14);
            return target;
        }
    }
    
    /**
     * True if has "choreographyActivityShape" attribute
     */
    public boolean isSetChoreographyActivityShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHOREOGRAPHYACTIVITYSHAPE$14) != null;
        }
    }
    
    /**
     * Sets the "choreographyActivityShape" attribute
     */
    public void setChoreographyActivityShape(javax.xml.namespace.QName choreographyActivityShape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHOREOGRAPHYACTIVITYSHAPE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHOREOGRAPHYACTIVITYSHAPE$14);
            }
            target.setQNameValue(choreographyActivityShape);
        }
    }
    
    /**
     * Sets (as xml) the "choreographyActivityShape" attribute
     */
    public void xsetChoreographyActivityShape(org.apache.xmlbeans.XmlQName choreographyActivityShape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CHOREOGRAPHYACTIVITYSHAPE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(CHOREOGRAPHYACTIVITYSHAPE$14);
            }
            target.set(choreographyActivityShape);
        }
    }
    
    /**
     * Unsets the "choreographyActivityShape" attribute
     */
    public void unsetChoreographyActivityShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHOREOGRAPHYACTIVITYSHAPE$14);
        }
    }
}

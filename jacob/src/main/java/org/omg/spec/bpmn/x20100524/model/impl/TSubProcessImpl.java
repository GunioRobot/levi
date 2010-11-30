/*
 * XML Type:  tSubProcess
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TSubProcess
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tSubProcess(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TSubProcessImpl extends org.omg.spec.bpmn.x20100524.model.impl.TActivityImpl implements org.omg.spec.bpmn.x20100524.model.TSubProcess
{
    private static final long serialVersionUID = 1L;
    
    public TSubProcessImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANESET$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "laneSet");
    private static final javax.xml.namespace.QName FLOWELEMENT$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "flowElement");
    private static final org.apache.xmlbeans.QNameSet FLOWELEMENT$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "complexGateway"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "manualTask"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "boundaryEvent"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataObjectReference"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "sendTask"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "choreographyTask"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "transaction"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "sequenceFlow"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "scriptTask"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "callChoreography"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "userTask"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "parallelGateway"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "serviceTask"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "intermediateThrowEvent"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "subChoreography"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "event"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "receiveTask"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "businessRuleTask"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "flowElement"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataObject"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "implicitThrowEvent"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "inclusiveGateway"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "task"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "intermediateCatchEvent"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "adHocSubProcess"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "exclusiveGateway"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataStoreReference"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "endEvent"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "startEvent"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "subProcess"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "callActivity"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "eventBasedGateway"),
    });
    private static final javax.xml.namespace.QName ARTIFACT$4 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "artifact");
    private static final org.apache.xmlbeans.QNameSet ARTIFACT$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "artifact"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "association"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "textAnnotation"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "group"),
    });
    private static final javax.xml.namespace.QName TRIGGEREDBYEVENT$6 = 
        new javax.xml.namespace.QName("", "triggeredByEvent");
    
    
    /**
     * Gets array of all "laneSet" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TLaneSet[] getLaneSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LANESET$0, targetList);
            org.omg.spec.bpmn.x20100524.model.TLaneSet[] result = new org.omg.spec.bpmn.x20100524.model.TLaneSet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "laneSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLaneSet getLaneSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLaneSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLaneSet)get_store().find_element_user(LANESET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "laneSet" element
     */
    public int sizeOfLaneSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANESET$0);
        }
    }
    
    /**
     * Sets array of all "laneSet" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLaneSetArray(org.omg.spec.bpmn.x20100524.model.TLaneSet[] laneSetArray)
    {
        check_orphaned();
        arraySetterHelper(laneSetArray, LANESET$0);
    }
    
    /**
     * Sets ith "laneSet" element
     */
    public void setLaneSetArray(int i, org.omg.spec.bpmn.x20100524.model.TLaneSet laneSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLaneSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLaneSet)get_store().find_element_user(LANESET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(laneSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "laneSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLaneSet insertNewLaneSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLaneSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLaneSet)get_store().insert_element_user(LANESET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "laneSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLaneSet addNewLaneSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLaneSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLaneSet)get_store().add_element_user(LANESET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "laneSet" element
     */
    public void removeLaneSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANESET$0, i);
        }
    }
    
    /**
     * Gets array of all "flowElement" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TFlowElement[] getFlowElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLOWELEMENT$3, targetList);
            org.omg.spec.bpmn.x20100524.model.TFlowElement[] result = new org.omg.spec.bpmn.x20100524.model.TFlowElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "flowElement" element
     */
    public org.omg.spec.bpmn.x20100524.model.TFlowElement getFlowElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TFlowElement target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TFlowElement)get_store().find_element_user(FLOWELEMENT$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "flowElement" element
     */
    public int sizeOfFlowElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLOWELEMENT$3);
        }
    }
    
    /**
     * Sets array of all "flowElement" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFlowElementArray(org.omg.spec.bpmn.x20100524.model.TFlowElement[] flowElementArray)
    {
        check_orphaned();
        arraySetterHelper(flowElementArray, FLOWELEMENT$2, FLOWELEMENT$3);
    }
    
    /**
     * Sets ith "flowElement" element
     */
    public void setFlowElementArray(int i, org.omg.spec.bpmn.x20100524.model.TFlowElement flowElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TFlowElement target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TFlowElement)get_store().find_element_user(FLOWELEMENT$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(flowElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "flowElement" element
     */
    public org.omg.spec.bpmn.x20100524.model.TFlowElement insertNewFlowElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TFlowElement target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TFlowElement)get_store().insert_element_user(FLOWELEMENT$3, FLOWELEMENT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "flowElement" element
     */
    public org.omg.spec.bpmn.x20100524.model.TFlowElement addNewFlowElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TFlowElement target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TFlowElement)get_store().add_element_user(FLOWELEMENT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "flowElement" element
     */
    public void removeFlowElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLOWELEMENT$3, i);
        }
    }
    
    /**
     * Gets array of all "artifact" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TArtifact[] getArtifactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARTIFACT$5, targetList);
            org.omg.spec.bpmn.x20100524.model.TArtifact[] result = new org.omg.spec.bpmn.x20100524.model.TArtifact[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "artifact" element
     */
    public org.omg.spec.bpmn.x20100524.model.TArtifact getArtifactArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TArtifact target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TArtifact)get_store().find_element_user(ARTIFACT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "artifact" element
     */
    public int sizeOfArtifactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARTIFACT$5);
        }
    }
    
    /**
     * Sets array of all "artifact" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArtifactArray(org.omg.spec.bpmn.x20100524.model.TArtifact[] artifactArray)
    {
        check_orphaned();
        arraySetterHelper(artifactArray, ARTIFACT$4, ARTIFACT$5);
    }
    
    /**
     * Sets ith "artifact" element
     */
    public void setArtifactArray(int i, org.omg.spec.bpmn.x20100524.model.TArtifact artifact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TArtifact target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TArtifact)get_store().find_element_user(ARTIFACT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(artifact);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "artifact" element
     */
    public org.omg.spec.bpmn.x20100524.model.TArtifact insertNewArtifact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TArtifact target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TArtifact)get_store().insert_element_user(ARTIFACT$5, ARTIFACT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "artifact" element
     */
    public org.omg.spec.bpmn.x20100524.model.TArtifact addNewArtifact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TArtifact target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TArtifact)get_store().add_element_user(ARTIFACT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "artifact" element
     */
    public void removeArtifact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARTIFACT$5, i);
        }
    }
    
    /**
     * Gets the "triggeredByEvent" attribute
     */
    public boolean getTriggeredByEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRIGGEREDBYEVENT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TRIGGEREDBYEVENT$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "triggeredByEvent" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTriggeredByEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRIGGEREDBYEVENT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TRIGGEREDBYEVENT$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "triggeredByEvent" attribute
     */
    public boolean isSetTriggeredByEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TRIGGEREDBYEVENT$6) != null;
        }
    }
    
    /**
     * Sets the "triggeredByEvent" attribute
     */
    public void setTriggeredByEvent(boolean triggeredByEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRIGGEREDBYEVENT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRIGGEREDBYEVENT$6);
            }
            target.setBooleanValue(triggeredByEvent);
        }
    }
    
    /**
     * Sets (as xml) the "triggeredByEvent" attribute
     */
    public void xsetTriggeredByEvent(org.apache.xmlbeans.XmlBoolean triggeredByEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRIGGEREDBYEVENT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TRIGGEREDBYEVENT$6);
            }
            target.set(triggeredByEvent);
        }
    }
    
    /**
     * Unsets the "triggeredByEvent" attribute
     */
    public void unsetTriggeredByEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TRIGGEREDBYEVENT$6);
        }
    }
}

/*
 * XML Type:  tProcess
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TProcess
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tProcess(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TProcessImpl extends org.omg.spec.bpmn.x20100524.model.impl.TCallableElementImpl implements org.omg.spec.bpmn.x20100524.model.TProcess
{
    private static final long serialVersionUID = 1L;
    
    public TProcessImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITING$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "auditing");
    private static final javax.xml.namespace.QName MONITORING$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "monitoring");
    private static final javax.xml.namespace.QName PROPERTY$4 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "property");
    private static final javax.xml.namespace.QName LANESET$6 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "laneSet");
    private static final javax.xml.namespace.QName FLOWELEMENT$8 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "flowElement");
    private static final org.apache.xmlbeans.QNameSet FLOWELEMENT$9 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
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
    private static final javax.xml.namespace.QName ARTIFACT$10 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "artifact");
    private static final org.apache.xmlbeans.QNameSet ARTIFACT$11 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "artifact"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "association"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "textAnnotation"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "group"),
    });
    private static final javax.xml.namespace.QName RESOURCEROLE$12 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resourceRole");
    private static final org.apache.xmlbeans.QNameSet RESOURCEROLE$13 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "humanPerformer"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "performer"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "potentialOwner"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resourceRole"),
    });
    private static final javax.xml.namespace.QName CORRELATIONSUBSCRIPTION$14 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "correlationSubscription");
    private static final javax.xml.namespace.QName SUPPORTS$16 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "supports");
    private static final javax.xml.namespace.QName PROCESSTYPE$18 = 
        new javax.xml.namespace.QName("", "processType");
    private static final javax.xml.namespace.QName ISCLOSED$20 = 
        new javax.xml.namespace.QName("", "isClosed");
    private static final javax.xml.namespace.QName ISEXECUTABLE$22 = 
        new javax.xml.namespace.QName("", "isExecutable");
    private static final javax.xml.namespace.QName DEFINITIONALCOLLABORATIONREF$24 = 
        new javax.xml.namespace.QName("", "definitionalCollaborationRef");
    
    
    /**
     * Gets the "auditing" element
     */
    public org.omg.spec.bpmn.x20100524.model.TAuditing getAuditing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TAuditing target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TAuditing)get_store().find_element_user(AUDITING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "auditing" element
     */
    public boolean isSetAuditing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUDITING$0) != 0;
        }
    }
    
    /**
     * Sets the "auditing" element
     */
    public void setAuditing(org.omg.spec.bpmn.x20100524.model.TAuditing auditing)
    {
        generatedSetterHelperImpl(auditing, AUDITING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "auditing" element
     */
    public org.omg.spec.bpmn.x20100524.model.TAuditing addNewAuditing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TAuditing target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TAuditing)get_store().add_element_user(AUDITING$0);
            return target;
        }
    }
    
    /**
     * Unsets the "auditing" element
     */
    public void unsetAuditing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUDITING$0, 0);
        }
    }
    
    /**
     * Gets the "monitoring" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMonitoring getMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMonitoring target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMonitoring)get_store().find_element_user(MONITORING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "monitoring" element
     */
    public boolean isSetMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MONITORING$2) != 0;
        }
    }
    
    /**
     * Sets the "monitoring" element
     */
    public void setMonitoring(org.omg.spec.bpmn.x20100524.model.TMonitoring monitoring)
    {
        generatedSetterHelperImpl(monitoring, MONITORING$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "monitoring" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMonitoring addNewMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMonitoring target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMonitoring)get_store().add_element_user(MONITORING$2);
            return target;
        }
    }
    
    /**
     * Unsets the "monitoring" element
     */
    public void unsetMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MONITORING$2, 0);
        }
    }
    
    /**
     * Gets array of all "property" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TProperty[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTY$4, targetList);
            org.omg.spec.bpmn.x20100524.model.TProperty[] result = new org.omg.spec.bpmn.x20100524.model.TProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "property" element
     */
    public org.omg.spec.bpmn.x20100524.model.TProperty getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProperty target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProperty)get_store().find_element_user(PROPERTY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "property" element
     */
    public int sizeOfPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$4);
        }
    }
    
    /**
     * Sets array of all "property" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPropertyArray(org.omg.spec.bpmn.x20100524.model.TProperty[] propertyArray)
    {
        check_orphaned();
        arraySetterHelper(propertyArray, PROPERTY$4);
    }
    
    /**
     * Sets ith "property" element
     */
    public void setPropertyArray(int i, org.omg.spec.bpmn.x20100524.model.TProperty property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProperty target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProperty)get_store().find_element_user(PROPERTY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(property);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    public org.omg.spec.bpmn.x20100524.model.TProperty insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProperty target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProperty)get_store().insert_element_user(PROPERTY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    public org.omg.spec.bpmn.x20100524.model.TProperty addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProperty target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProperty)get_store().add_element_user(PROPERTY$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "property" element
     */
    public void removeProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$4, i);
        }
    }
    
    /**
     * Gets array of all "laneSet" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TLaneSet[] getLaneSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LANESET$6, targetList);
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
            target = (org.omg.spec.bpmn.x20100524.model.TLaneSet)get_store().find_element_user(LANESET$6, i);
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
            return get_store().count_elements(LANESET$6);
        }
    }
    
    /**
     * Sets array of all "laneSet" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLaneSetArray(org.omg.spec.bpmn.x20100524.model.TLaneSet[] laneSetArray)
    {
        check_orphaned();
        arraySetterHelper(laneSetArray, LANESET$6);
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
            target = (org.omg.spec.bpmn.x20100524.model.TLaneSet)get_store().find_element_user(LANESET$6, i);
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
            target = (org.omg.spec.bpmn.x20100524.model.TLaneSet)get_store().insert_element_user(LANESET$6, i);
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
            target = (org.omg.spec.bpmn.x20100524.model.TLaneSet)get_store().add_element_user(LANESET$6);
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
            get_store().remove_element(LANESET$6, i);
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
            get_store().find_all_element_users(FLOWELEMENT$9, targetList);
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
            target = (org.omg.spec.bpmn.x20100524.model.TFlowElement)get_store().find_element_user(FLOWELEMENT$9, i);
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
            return get_store().count_elements(FLOWELEMENT$9);
        }
    }
    
    /**
     * Sets array of all "flowElement" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFlowElementArray(org.omg.spec.bpmn.x20100524.model.TFlowElement[] flowElementArray)
    {
        check_orphaned();
        arraySetterHelper(flowElementArray, FLOWELEMENT$8, FLOWELEMENT$9);
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
            target = (org.omg.spec.bpmn.x20100524.model.TFlowElement)get_store().find_element_user(FLOWELEMENT$9, i);
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
            target = (org.omg.spec.bpmn.x20100524.model.TFlowElement)get_store().insert_element_user(FLOWELEMENT$9, FLOWELEMENT$8, i);
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
            target = (org.omg.spec.bpmn.x20100524.model.TFlowElement)get_store().add_element_user(FLOWELEMENT$8);
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
            get_store().remove_element(FLOWELEMENT$9, i);
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
            get_store().find_all_element_users(ARTIFACT$11, targetList);
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
            target = (org.omg.spec.bpmn.x20100524.model.TArtifact)get_store().find_element_user(ARTIFACT$11, i);
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
            return get_store().count_elements(ARTIFACT$11);
        }
    }
    
    /**
     * Sets array of all "artifact" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArtifactArray(org.omg.spec.bpmn.x20100524.model.TArtifact[] artifactArray)
    {
        check_orphaned();
        arraySetterHelper(artifactArray, ARTIFACT$10, ARTIFACT$11);
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
            target = (org.omg.spec.bpmn.x20100524.model.TArtifact)get_store().find_element_user(ARTIFACT$11, i);
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
            target = (org.omg.spec.bpmn.x20100524.model.TArtifact)get_store().insert_element_user(ARTIFACT$11, ARTIFACT$10, i);
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
            target = (org.omg.spec.bpmn.x20100524.model.TArtifact)get_store().add_element_user(ARTIFACT$10);
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
            get_store().remove_element(ARTIFACT$11, i);
        }
    }
    
    /**
     * Gets array of all "resourceRole" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceRole[] getResourceRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEROLE$13, targetList);
            org.omg.spec.bpmn.x20100524.model.TResourceRole[] result = new org.omg.spec.bpmn.x20100524.model.TResourceRole[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resourceRole" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceRole getResourceRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceRole target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceRole)get_store().find_element_user(RESOURCEROLE$13, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resourceRole" element
     */
    public int sizeOfResourceRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEROLE$13);
        }
    }
    
    /**
     * Sets array of all "resourceRole" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResourceRoleArray(org.omg.spec.bpmn.x20100524.model.TResourceRole[] resourceRoleArray)
    {
        check_orphaned();
        arraySetterHelper(resourceRoleArray, RESOURCEROLE$12, RESOURCEROLE$13);
    }
    
    /**
     * Sets ith "resourceRole" element
     */
    public void setResourceRoleArray(int i, org.omg.spec.bpmn.x20100524.model.TResourceRole resourceRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceRole target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceRole)get_store().find_element_user(RESOURCEROLE$13, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceRole);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceRole" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceRole insertNewResourceRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceRole target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceRole)get_store().insert_element_user(RESOURCEROLE$13, RESOURCEROLE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceRole" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceRole addNewResourceRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceRole target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceRole)get_store().add_element_user(RESOURCEROLE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "resourceRole" element
     */
    public void removeResourceRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEROLE$13, i);
        }
    }
    
    /**
     * Gets array of all "correlationSubscription" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription[] getCorrelationSubscriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CORRELATIONSUBSCRIPTION$14, targetList);
            org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription[] result = new org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "correlationSubscription" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription getCorrelationSubscriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription)get_store().find_element_user(CORRELATIONSUBSCRIPTION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "correlationSubscription" element
     */
    public int sizeOfCorrelationSubscriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRELATIONSUBSCRIPTION$14);
        }
    }
    
    /**
     * Sets array of all "correlationSubscription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCorrelationSubscriptionArray(org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription[] correlationSubscriptionArray)
    {
        check_orphaned();
        arraySetterHelper(correlationSubscriptionArray, CORRELATIONSUBSCRIPTION$14);
    }
    
    /**
     * Sets ith "correlationSubscription" element
     */
    public void setCorrelationSubscriptionArray(int i, org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription correlationSubscription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription)get_store().find_element_user(CORRELATIONSUBSCRIPTION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(correlationSubscription);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "correlationSubscription" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription insertNewCorrelationSubscription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription)get_store().insert_element_user(CORRELATIONSUBSCRIPTION$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "correlationSubscription" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription addNewCorrelationSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationSubscription)get_store().add_element_user(CORRELATIONSUBSCRIPTION$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "correlationSubscription" element
     */
    public void removeCorrelationSubscription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRELATIONSUBSCRIPTION$14, i);
        }
    }
    
    /**
     * Gets array of all "supports" elements
     */
    public javax.xml.namespace.QName[] getSupportsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPORTS$16, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "supports" element
     */
    public javax.xml.namespace.QName getSupportsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "supports" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetSupportsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPORTS$16, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "supports" element
     */
    public org.apache.xmlbeans.XmlQName xgetSupportsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SUPPORTS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "supports" element
     */
    public int sizeOfSupportsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTS$16);
        }
    }
    
    /**
     * Sets array of all "supports" element
     */
    public void setSupportsArray(javax.xml.namespace.QName[] supportsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(supportsArray, SUPPORTS$16);
        }
    }
    
    /**
     * Sets ith "supports" element
     */
    public void setSupportsArray(int i, javax.xml.namespace.QName supports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(supports);
        }
    }
    
    /**
     * Sets (as xml) array of all "supports" element
     */
    public void xsetSupportsArray(org.apache.xmlbeans.XmlQName[]supportsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(supportsArray, SUPPORTS$16);
        }
    }
    
    /**
     * Sets (as xml) ith "supports" element
     */
    public void xsetSupportsArray(int i, org.apache.xmlbeans.XmlQName supports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SUPPORTS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(supports);
        }
    }
    
    /**
     * Inserts the value as the ith "supports" element
     */
    public void insertSupports(int i, javax.xml.namespace.QName supports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SUPPORTS$16, i);
            target.setQNameValue(supports);
        }
    }
    
    /**
     * Appends the value as the last "supports" element
     */
    public void addSupports(javax.xml.namespace.QName supports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPORTS$16);
            target.setQNameValue(supports);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "supports" element
     */
    public org.apache.xmlbeans.XmlQName insertNewSupports(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(SUPPORTS$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "supports" element
     */
    public org.apache.xmlbeans.XmlQName addNewSupports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(SUPPORTS$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "supports" element
     */
    public void removeSupports(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTS$16, i);
        }
    }
    
    /**
     * Gets the "processType" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TProcessType.Enum getProcessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROCESSTYPE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROCESSTYPE$18);
            }
            if (target == null)
            {
                return null;
            }
            return (org.omg.spec.bpmn.x20100524.model.TProcessType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "processType" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TProcessType xgetProcessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProcessType target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProcessType)get_store().find_attribute_user(PROCESSTYPE$18);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TProcessType)get_default_attribute_value(PROCESSTYPE$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "processType" attribute
     */
    public boolean isSetProcessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROCESSTYPE$18) != null;
        }
    }
    
    /**
     * Sets the "processType" attribute
     */
    public void setProcessType(org.omg.spec.bpmn.x20100524.model.TProcessType.Enum processType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROCESSTYPE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROCESSTYPE$18);
            }
            target.setEnumValue(processType);
        }
    }
    
    /**
     * Sets (as xml) the "processType" attribute
     */
    public void xsetProcessType(org.omg.spec.bpmn.x20100524.model.TProcessType processType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProcessType target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProcessType)get_store().find_attribute_user(PROCESSTYPE$18);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TProcessType)get_store().add_attribute_user(PROCESSTYPE$18);
            }
            target.set(processType);
        }
    }
    
    /**
     * Unsets the "processType" attribute
     */
    public void unsetProcessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROCESSTYPE$18);
        }
    }
    
    /**
     * Gets the "isClosed" attribute
     */
    public boolean getIsClosed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCLOSED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISCLOSED$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isClosed" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsClosed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCLOSED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISCLOSED$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "isClosed" attribute
     */
    public boolean isSetIsClosed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISCLOSED$20) != null;
        }
    }
    
    /**
     * Sets the "isClosed" attribute
     */
    public void setIsClosed(boolean isClosed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCLOSED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISCLOSED$20);
            }
            target.setBooleanValue(isClosed);
        }
    }
    
    /**
     * Sets (as xml) the "isClosed" attribute
     */
    public void xsetIsClosed(org.apache.xmlbeans.XmlBoolean isClosed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCLOSED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISCLOSED$20);
            }
            target.set(isClosed);
        }
    }
    
    /**
     * Unsets the "isClosed" attribute
     */
    public void unsetIsClosed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISCLOSED$20);
        }
    }
    
    /**
     * Gets the "isExecutable" attribute
     */
    public boolean getIsExecutable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISEXECUTABLE$22);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isExecutable" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsExecutable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISEXECUTABLE$22);
            return target;
        }
    }
    
    /**
     * True if has "isExecutable" attribute
     */
    public boolean isSetIsExecutable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISEXECUTABLE$22) != null;
        }
    }
    
    /**
     * Sets the "isExecutable" attribute
     */
    public void setIsExecutable(boolean isExecutable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISEXECUTABLE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISEXECUTABLE$22);
            }
            target.setBooleanValue(isExecutable);
        }
    }
    
    /**
     * Sets (as xml) the "isExecutable" attribute
     */
    public void xsetIsExecutable(org.apache.xmlbeans.XmlBoolean isExecutable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISEXECUTABLE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISEXECUTABLE$22);
            }
            target.set(isExecutable);
        }
    }
    
    /**
     * Unsets the "isExecutable" attribute
     */
    public void unsetIsExecutable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISEXECUTABLE$22);
        }
    }
    
    /**
     * Gets the "definitionalCollaborationRef" attribute
     */
    public javax.xml.namespace.QName getDefinitionalCollaborationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFINITIONALCOLLABORATIONREF$24);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "definitionalCollaborationRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetDefinitionalCollaborationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(DEFINITIONALCOLLABORATIONREF$24);
            return target;
        }
    }
    
    /**
     * True if has "definitionalCollaborationRef" attribute
     */
    public boolean isSetDefinitionalCollaborationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFINITIONALCOLLABORATIONREF$24) != null;
        }
    }
    
    /**
     * Sets the "definitionalCollaborationRef" attribute
     */
    public void setDefinitionalCollaborationRef(javax.xml.namespace.QName definitionalCollaborationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFINITIONALCOLLABORATIONREF$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFINITIONALCOLLABORATIONREF$24);
            }
            target.setQNameValue(definitionalCollaborationRef);
        }
    }
    
    /**
     * Sets (as xml) the "definitionalCollaborationRef" attribute
     */
    public void xsetDefinitionalCollaborationRef(org.apache.xmlbeans.XmlQName definitionalCollaborationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(DEFINITIONALCOLLABORATIONREF$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(DEFINITIONALCOLLABORATIONREF$24);
            }
            target.set(definitionalCollaborationRef);
        }
    }
    
    /**
     * Unsets the "definitionalCollaborationRef" attribute
     */
    public void unsetDefinitionalCollaborationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFINITIONALCOLLABORATIONREF$24);
        }
    }
}

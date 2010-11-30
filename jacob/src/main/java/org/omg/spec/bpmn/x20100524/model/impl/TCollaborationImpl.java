/*
 * XML Type:  tCollaboration
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TCollaboration
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tCollaboration(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TCollaborationImpl extends org.omg.spec.bpmn.x20100524.model.impl.TRootElementImpl implements org.omg.spec.bpmn.x20100524.model.TCollaboration
{
    private static final long serialVersionUID = 1L;
    
    public TCollaborationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTICIPANT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "participant");
    private static final javax.xml.namespace.QName MESSAGEFLOW$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "messageFlow");
    private static final javax.xml.namespace.QName ARTIFACT$4 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "artifact");
    private static final org.apache.xmlbeans.QNameSet ARTIFACT$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "artifact"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "association"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "textAnnotation"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "group"),
    });
    private static final javax.xml.namespace.QName CONVERSATIONNODE$6 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conversationNode");
    private static final org.apache.xmlbeans.QNameSet CONVERSATIONNODE$7 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conversationNode"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "callConversation"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conversation"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "subConversation"),
    });
    private static final javax.xml.namespace.QName CONVERSATIONASSOCIATION$8 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conversationAssociation");
    private static final javax.xml.namespace.QName PARTICIPANTASSOCIATION$10 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "participantAssociation");
    private static final javax.xml.namespace.QName MESSAGEFLOWASSOCIATION$12 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "messageFlowAssociation");
    private static final javax.xml.namespace.QName CORRELATIONKEY$14 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "correlationKey");
    private static final javax.xml.namespace.QName CHOREOGRAPHYREF$16 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "choreographyRef");
    private static final javax.xml.namespace.QName CONVERSATIONLINK$18 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conversationLink");
    private static final javax.xml.namespace.QName NAME$20 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName ISCLOSED$22 = 
        new javax.xml.namespace.QName("", "isClosed");
    
    
    /**
     * Gets array of all "participant" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipant[] getParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANT$0, targetList);
            org.omg.spec.bpmn.x20100524.model.TParticipant[] result = new org.omg.spec.bpmn.x20100524.model.TParticipant[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "participant" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipant getParticipantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipant target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipant)get_store().find_element_user(PARTICIPANT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "participant" element
     */
    public int sizeOfParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICIPANT$0);
        }
    }
    
    /**
     * Sets array of all "participant" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParticipantArray(org.omg.spec.bpmn.x20100524.model.TParticipant[] participantArray)
    {
        check_orphaned();
        arraySetterHelper(participantArray, PARTICIPANT$0);
    }
    
    /**
     * Sets ith "participant" element
     */
    public void setParticipantArray(int i, org.omg.spec.bpmn.x20100524.model.TParticipant participant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipant target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipant)get_store().find_element_user(PARTICIPANT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(participant);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipant insertNewParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipant target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipant)get_store().insert_element_user(PARTICIPANT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipant addNewParticipant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipant target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipant)get_store().add_element_user(PARTICIPANT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "participant" element
     */
    public void removeParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICIPANT$0, i);
        }
    }
    
    /**
     * Gets array of all "messageFlow" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TMessageFlow[] getMessageFlowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGEFLOW$2, targetList);
            org.omg.spec.bpmn.x20100524.model.TMessageFlow[] result = new org.omg.spec.bpmn.x20100524.model.TMessageFlow[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "messageFlow" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMessageFlow getMessageFlowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMessageFlow target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMessageFlow)get_store().find_element_user(MESSAGEFLOW$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "messageFlow" element
     */
    public int sizeOfMessageFlowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEFLOW$2);
        }
    }
    
    /**
     * Sets array of all "messageFlow" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMessageFlowArray(org.omg.spec.bpmn.x20100524.model.TMessageFlow[] messageFlowArray)
    {
        check_orphaned();
        arraySetterHelper(messageFlowArray, MESSAGEFLOW$2);
    }
    
    /**
     * Sets ith "messageFlow" element
     */
    public void setMessageFlowArray(int i, org.omg.spec.bpmn.x20100524.model.TMessageFlow messageFlow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMessageFlow target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMessageFlow)get_store().find_element_user(MESSAGEFLOW$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageFlow);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageFlow" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMessageFlow insertNewMessageFlow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMessageFlow target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMessageFlow)get_store().insert_element_user(MESSAGEFLOW$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageFlow" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMessageFlow addNewMessageFlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMessageFlow target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMessageFlow)get_store().add_element_user(MESSAGEFLOW$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "messageFlow" element
     */
    public void removeMessageFlow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEFLOW$2, i);
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
     * Gets array of all "conversationNode" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationNode[] getConversationNodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONVERSATIONNODE$7, targetList);
            org.omg.spec.bpmn.x20100524.model.TConversationNode[] result = new org.omg.spec.bpmn.x20100524.model.TConversationNode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "conversationNode" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationNode getConversationNodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationNode target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationNode)get_store().find_element_user(CONVERSATIONNODE$7, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "conversationNode" element
     */
    public int sizeOfConversationNodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONVERSATIONNODE$7);
        }
    }
    
    /**
     * Sets array of all "conversationNode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setConversationNodeArray(org.omg.spec.bpmn.x20100524.model.TConversationNode[] conversationNodeArray)
    {
        check_orphaned();
        arraySetterHelper(conversationNodeArray, CONVERSATIONNODE$6, CONVERSATIONNODE$7);
    }
    
    /**
     * Sets ith "conversationNode" element
     */
    public void setConversationNodeArray(int i, org.omg.spec.bpmn.x20100524.model.TConversationNode conversationNode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationNode target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationNode)get_store().find_element_user(CONVERSATIONNODE$7, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conversationNode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conversationNode" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationNode insertNewConversationNode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationNode target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationNode)get_store().insert_element_user(CONVERSATIONNODE$7, CONVERSATIONNODE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conversationNode" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationNode addNewConversationNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationNode target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationNode)get_store().add_element_user(CONVERSATIONNODE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "conversationNode" element
     */
    public void removeConversationNode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONVERSATIONNODE$7, i);
        }
    }
    
    /**
     * Gets array of all "conversationAssociation" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationAssociation[] getConversationAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONVERSATIONASSOCIATION$8, targetList);
            org.omg.spec.bpmn.x20100524.model.TConversationAssociation[] result = new org.omg.spec.bpmn.x20100524.model.TConversationAssociation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "conversationAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationAssociation getConversationAssociationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationAssociation)get_store().find_element_user(CONVERSATIONASSOCIATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "conversationAssociation" element
     */
    public int sizeOfConversationAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONVERSATIONASSOCIATION$8);
        }
    }
    
    /**
     * Sets array of all "conversationAssociation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setConversationAssociationArray(org.omg.spec.bpmn.x20100524.model.TConversationAssociation[] conversationAssociationArray)
    {
        check_orphaned();
        arraySetterHelper(conversationAssociationArray, CONVERSATIONASSOCIATION$8);
    }
    
    /**
     * Sets ith "conversationAssociation" element
     */
    public void setConversationAssociationArray(int i, org.omg.spec.bpmn.x20100524.model.TConversationAssociation conversationAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationAssociation)get_store().find_element_user(CONVERSATIONASSOCIATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conversationAssociation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conversationAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationAssociation insertNewConversationAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationAssociation)get_store().insert_element_user(CONVERSATIONASSOCIATION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conversationAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationAssociation addNewConversationAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationAssociation)get_store().add_element_user(CONVERSATIONASSOCIATION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "conversationAssociation" element
     */
    public void removeConversationAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONVERSATIONASSOCIATION$8, i);
        }
    }
    
    /**
     * Gets array of all "participantAssociation" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipantAssociation[] getParticipantAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANTASSOCIATION$10, targetList);
            org.omg.spec.bpmn.x20100524.model.TParticipantAssociation[] result = new org.omg.spec.bpmn.x20100524.model.TParticipantAssociation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "participantAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipantAssociation getParticipantAssociationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipantAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipantAssociation)get_store().find_element_user(PARTICIPANTASSOCIATION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "participantAssociation" element
     */
    public int sizeOfParticipantAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICIPANTASSOCIATION$10);
        }
    }
    
    /**
     * Sets array of all "participantAssociation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParticipantAssociationArray(org.omg.spec.bpmn.x20100524.model.TParticipantAssociation[] participantAssociationArray)
    {
        check_orphaned();
        arraySetterHelper(participantAssociationArray, PARTICIPANTASSOCIATION$10);
    }
    
    /**
     * Sets ith "participantAssociation" element
     */
    public void setParticipantAssociationArray(int i, org.omg.spec.bpmn.x20100524.model.TParticipantAssociation participantAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipantAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipantAssociation)get_store().find_element_user(PARTICIPANTASSOCIATION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(participantAssociation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participantAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipantAssociation insertNewParticipantAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipantAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipantAssociation)get_store().insert_element_user(PARTICIPANTASSOCIATION$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participantAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TParticipantAssociation addNewParticipantAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TParticipantAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TParticipantAssociation)get_store().add_element_user(PARTICIPANTASSOCIATION$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "participantAssociation" element
     */
    public void removeParticipantAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICIPANTASSOCIATION$10, i);
        }
    }
    
    /**
     * Gets array of all "messageFlowAssociation" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation[] getMessageFlowAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGEFLOWASSOCIATION$12, targetList);
            org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation[] result = new org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "messageFlowAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation getMessageFlowAssociationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation)get_store().find_element_user(MESSAGEFLOWASSOCIATION$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "messageFlowAssociation" element
     */
    public int sizeOfMessageFlowAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEFLOWASSOCIATION$12);
        }
    }
    
    /**
     * Sets array of all "messageFlowAssociation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMessageFlowAssociationArray(org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation[] messageFlowAssociationArray)
    {
        check_orphaned();
        arraySetterHelper(messageFlowAssociationArray, MESSAGEFLOWASSOCIATION$12);
    }
    
    /**
     * Sets ith "messageFlowAssociation" element
     */
    public void setMessageFlowAssociationArray(int i, org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation messageFlowAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation)get_store().find_element_user(MESSAGEFLOWASSOCIATION$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageFlowAssociation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageFlowAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation insertNewMessageFlowAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation)get_store().insert_element_user(MESSAGEFLOWASSOCIATION$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageFlowAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation addNewMessageFlowAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation)get_store().add_element_user(MESSAGEFLOWASSOCIATION$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "messageFlowAssociation" element
     */
    public void removeMessageFlowAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEFLOWASSOCIATION$12, i);
        }
    }
    
    /**
     * Gets array of all "correlationKey" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationKey[] getCorrelationKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CORRELATIONKEY$14, targetList);
            org.omg.spec.bpmn.x20100524.model.TCorrelationKey[] result = new org.omg.spec.bpmn.x20100524.model.TCorrelationKey[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "correlationKey" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationKey getCorrelationKeyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationKey target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationKey)get_store().find_element_user(CORRELATIONKEY$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "correlationKey" element
     */
    public int sizeOfCorrelationKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRELATIONKEY$14);
        }
    }
    
    /**
     * Sets array of all "correlationKey" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCorrelationKeyArray(org.omg.spec.bpmn.x20100524.model.TCorrelationKey[] correlationKeyArray)
    {
        check_orphaned();
        arraySetterHelper(correlationKeyArray, CORRELATIONKEY$14);
    }
    
    /**
     * Sets ith "correlationKey" element
     */
    public void setCorrelationKeyArray(int i, org.omg.spec.bpmn.x20100524.model.TCorrelationKey correlationKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationKey target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationKey)get_store().find_element_user(CORRELATIONKEY$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(correlationKey);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "correlationKey" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationKey insertNewCorrelationKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationKey target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationKey)get_store().insert_element_user(CORRELATIONKEY$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "correlationKey" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCorrelationKey addNewCorrelationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCorrelationKey target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCorrelationKey)get_store().add_element_user(CORRELATIONKEY$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "correlationKey" element
     */
    public void removeCorrelationKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRELATIONKEY$14, i);
        }
    }
    
    /**
     * Gets array of all "choreographyRef" elements
     */
    public javax.xml.namespace.QName[] getChoreographyRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHOREOGRAPHYREF$16, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "choreographyRef" element
     */
    public javax.xml.namespace.QName getChoreographyRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHOREOGRAPHYREF$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "choreographyRef" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetChoreographyRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHOREOGRAPHYREF$16, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "choreographyRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetChoreographyRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(CHOREOGRAPHYREF$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "choreographyRef" element
     */
    public int sizeOfChoreographyRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHOREOGRAPHYREF$16);
        }
    }
    
    /**
     * Sets array of all "choreographyRef" element
     */
    public void setChoreographyRefArray(javax.xml.namespace.QName[] choreographyRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(choreographyRefArray, CHOREOGRAPHYREF$16);
        }
    }
    
    /**
     * Sets ith "choreographyRef" element
     */
    public void setChoreographyRefArray(int i, javax.xml.namespace.QName choreographyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHOREOGRAPHYREF$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(choreographyRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "choreographyRef" element
     */
    public void xsetChoreographyRefArray(org.apache.xmlbeans.XmlQName[]choreographyRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(choreographyRefArray, CHOREOGRAPHYREF$16);
        }
    }
    
    /**
     * Sets (as xml) ith "choreographyRef" element
     */
    public void xsetChoreographyRefArray(int i, org.apache.xmlbeans.XmlQName choreographyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(CHOREOGRAPHYREF$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(choreographyRef);
        }
    }
    
    /**
     * Inserts the value as the ith "choreographyRef" element
     */
    public void insertChoreographyRef(int i, javax.xml.namespace.QName choreographyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CHOREOGRAPHYREF$16, i);
            target.setQNameValue(choreographyRef);
        }
    }
    
    /**
     * Appends the value as the last "choreographyRef" element
     */
    public void addChoreographyRef(javax.xml.namespace.QName choreographyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHOREOGRAPHYREF$16);
            target.setQNameValue(choreographyRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "choreographyRef" element
     */
    public org.apache.xmlbeans.XmlQName insertNewChoreographyRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(CHOREOGRAPHYREF$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "choreographyRef" element
     */
    public org.apache.xmlbeans.XmlQName addNewChoreographyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(CHOREOGRAPHYREF$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "choreographyRef" element
     */
    public void removeChoreographyRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHOREOGRAPHYREF$16, i);
        }
    }
    
    /**
     * Gets array of all "conversationLink" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationLink[] getConversationLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONVERSATIONLINK$18, targetList);
            org.omg.spec.bpmn.x20100524.model.TConversationLink[] result = new org.omg.spec.bpmn.x20100524.model.TConversationLink[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "conversationLink" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationLink getConversationLinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationLink target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationLink)get_store().find_element_user(CONVERSATIONLINK$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "conversationLink" element
     */
    public int sizeOfConversationLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONVERSATIONLINK$18);
        }
    }
    
    /**
     * Sets array of all "conversationLink" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setConversationLinkArray(org.omg.spec.bpmn.x20100524.model.TConversationLink[] conversationLinkArray)
    {
        check_orphaned();
        arraySetterHelper(conversationLinkArray, CONVERSATIONLINK$18);
    }
    
    /**
     * Sets ith "conversationLink" element
     */
    public void setConversationLinkArray(int i, org.omg.spec.bpmn.x20100524.model.TConversationLink conversationLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationLink target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationLink)get_store().find_element_user(CONVERSATIONLINK$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conversationLink);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conversationLink" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationLink insertNewConversationLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationLink target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationLink)get_store().insert_element_user(CONVERSATIONLINK$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conversationLink" element
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationLink addNewConversationLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TConversationLink target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TConversationLink)get_store().add_element_user(CONVERSATIONLINK$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "conversationLink" element
     */
    public void removeConversationLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONVERSATIONLINK$18, i);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$20);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$20) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$20);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$20);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCLOSED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISCLOSED$22);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCLOSED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISCLOSED$22);
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
            return get_store().find_attribute_user(ISCLOSED$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCLOSED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISCLOSED$22);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCLOSED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISCLOSED$22);
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
            get_store().remove_attribute(ISCLOSED$22);
        }
    }
}

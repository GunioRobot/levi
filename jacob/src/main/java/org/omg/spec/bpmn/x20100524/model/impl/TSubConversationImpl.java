/*
 * XML Type:  tSubConversation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TSubConversation
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tSubConversation(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TSubConversationImpl extends org.omg.spec.bpmn.x20100524.model.impl.TConversationNodeImpl implements org.omg.spec.bpmn.x20100524.model.TSubConversation
{
    private static final long serialVersionUID = 1L;
    
    public TSubConversationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSATIONNODE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conversationNode");
    private static final org.apache.xmlbeans.QNameSet CONVERSATIONNODE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conversationNode"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "callConversation"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conversation"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "subConversation"),
    });
    
    
    /**
     * Gets array of all "conversationNode" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TConversationNode[] getConversationNodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONVERSATIONNODE$1, targetList);
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
            target = (org.omg.spec.bpmn.x20100524.model.TConversationNode)get_store().find_element_user(CONVERSATIONNODE$1, i);
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
            return get_store().count_elements(CONVERSATIONNODE$1);
        }
    }
    
    /**
     * Sets array of all "conversationNode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setConversationNodeArray(org.omg.spec.bpmn.x20100524.model.TConversationNode[] conversationNodeArray)
    {
        check_orphaned();
        arraySetterHelper(conversationNodeArray, CONVERSATIONNODE$0, CONVERSATIONNODE$1);
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
            target = (org.omg.spec.bpmn.x20100524.model.TConversationNode)get_store().find_element_user(CONVERSATIONNODE$1, i);
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
            target = (org.omg.spec.bpmn.x20100524.model.TConversationNode)get_store().insert_element_user(CONVERSATIONNODE$1, CONVERSATIONNODE$0, i);
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
            target = (org.omg.spec.bpmn.x20100524.model.TConversationNode)get_store().add_element_user(CONVERSATIONNODE$0);
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
            get_store().remove_element(CONVERSATIONNODE$1, i);
        }
    }
}

/*
 * An XML document type.
 * Localname: transaction
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TransactionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one transaction(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class TransactionDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.TransactionDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransactionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "transaction");
    
    
    /**
     * Gets the "transaction" element
     */
    public org.omg.spec.bpmn.x20100524.model.TTransaction getTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TTransaction target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TTransaction)get_store().find_element_user(TRANSACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "transaction" element
     */
    public void setTransaction(org.omg.spec.bpmn.x20100524.model.TTransaction transaction)
    {
        generatedSetterHelperImpl(transaction, TRANSACTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "transaction" element
     */
    public org.omg.spec.bpmn.x20100524.model.TTransaction addNewTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TTransaction target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TTransaction)get_store().add_element_user(TRANSACTION$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: operation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.OperationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one operation(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class OperationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.OperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "operation");
    
    
    /**
     * Gets the "operation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TOperation getOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TOperation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TOperation)get_store().find_element_user(OPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operation" element
     */
    public void setOperation(org.omg.spec.bpmn.x20100524.model.TOperation operation)
    {
        generatedSetterHelperImpl(operation, OPERATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "operation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TOperation addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TOperation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TOperation)get_store().add_element_user(OPERATION$0);
            return target;
        }
    }
}

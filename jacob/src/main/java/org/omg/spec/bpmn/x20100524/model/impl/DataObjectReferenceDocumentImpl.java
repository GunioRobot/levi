/*
 * An XML document type.
 * Localname: dataObjectReference
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.DataObjectReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one dataObjectReference(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class DataObjectReferenceDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.DataObjectReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataObjectReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOBJECTREFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataObjectReference");
    
    
    /**
     * Gets the "dataObjectReference" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataObjectReference getDataObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataObjectReference target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataObjectReference)get_store().find_element_user(DATAOBJECTREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataObjectReference" element
     */
    public void setDataObjectReference(org.omg.spec.bpmn.x20100524.model.TDataObjectReference dataObjectReference)
    {
        generatedSetterHelperImpl(dataObjectReference, DATAOBJECTREFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataObjectReference" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataObjectReference addNewDataObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataObjectReference target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataObjectReference)get_store().add_element_user(DATAOBJECTREFERENCE$0);
            return target;
        }
    }
}

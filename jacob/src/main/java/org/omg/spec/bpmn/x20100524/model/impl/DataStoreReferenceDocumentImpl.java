/*
 * An XML document type.
 * Localname: dataStoreReference
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.DataStoreReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one dataStoreReference(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class DataStoreReferenceDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.DataStoreReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataStoreReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASTOREREFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataStoreReference");
    
    
    /**
     * Gets the "dataStoreReference" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataStoreReference getDataStoreReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataStoreReference target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataStoreReference)get_store().find_element_user(DATASTOREREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataStoreReference" element
     */
    public void setDataStoreReference(org.omg.spec.bpmn.x20100524.model.TDataStoreReference dataStoreReference)
    {
        generatedSetterHelperImpl(dataStoreReference, DATASTOREREFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataStoreReference" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataStoreReference addNewDataStoreReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataStoreReference target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataStoreReference)get_store().add_element_user(DATASTOREREFERENCE$0);
            return target;
        }
    }
}

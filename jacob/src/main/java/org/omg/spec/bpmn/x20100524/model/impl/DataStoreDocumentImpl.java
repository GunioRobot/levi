/*
 * An XML document type.
 * Localname: dataStore
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.DataStoreDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one dataStore(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class DataStoreDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.DataStoreDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataStoreDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASTORE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataStore");
    
    
    /**
     * Gets the "dataStore" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataStore getDataStore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataStore target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataStore)get_store().find_element_user(DATASTORE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataStore" element
     */
    public void setDataStore(org.omg.spec.bpmn.x20100524.model.TDataStore dataStore)
    {
        generatedSetterHelperImpl(dataStore, DATASTORE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataStore" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataStore addNewDataStore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataStore target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataStore)get_store().add_element_user(DATASTORE$0);
            return target;
        }
    }
}

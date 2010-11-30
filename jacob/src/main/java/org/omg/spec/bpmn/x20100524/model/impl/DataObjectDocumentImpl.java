/*
 * An XML document type.
 * Localname: dataObject
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.DataObjectDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one dataObject(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class DataObjectDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.DataObjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOBJECT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataObject");
    
    
    /**
     * Gets the "dataObject" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataObject getDataObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataObject target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataObject)get_store().find_element_user(DATAOBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataObject" element
     */
    public void setDataObject(org.omg.spec.bpmn.x20100524.model.TDataObject dataObject)
    {
        generatedSetterHelperImpl(dataObject, DATAOBJECT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataObject" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataObject addNewDataObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataObject target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataObject)get_store().add_element_user(DATAOBJECT$0);
            return target;
        }
    }
}

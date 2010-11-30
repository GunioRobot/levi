/*
 * An XML document type.
 * Localname: dataState
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.DataStateDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one dataState(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class DataStateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.DataStateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataStateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASTATE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataState");
    
    
    /**
     * Gets the "dataState" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataState getDataState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataState target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataState)get_store().find_element_user(DATASTATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataState" element
     */
    public void setDataState(org.omg.spec.bpmn.x20100524.model.TDataState dataState)
    {
        generatedSetterHelperImpl(dataState, DATASTATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataState" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataState addNewDataState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataState target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataState)get_store().add_element_user(DATASTATE$0);
            return target;
        }
    }
}

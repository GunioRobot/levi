/*
 * An XML document type.
 * Localname: dataInput
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.DataInputDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one dataInput(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class DataInputDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.DataInputDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataInputDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAINPUT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataInput");
    
    
    /**
     * Gets the "dataInput" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInput getDataInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInput target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInput)get_store().find_element_user(DATAINPUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataInput" element
     */
    public void setDataInput(org.omg.spec.bpmn.x20100524.model.TDataInput dataInput)
    {
        generatedSetterHelperImpl(dataInput, DATAINPUT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataInput" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInput addNewDataInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInput target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInput)get_store().add_element_user(DATAINPUT$0);
            return target;
        }
    }
}

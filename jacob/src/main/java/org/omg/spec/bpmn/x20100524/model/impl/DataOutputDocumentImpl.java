/*
 * An XML document type.
 * Localname: dataOutput
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.DataOutputDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one dataOutput(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class DataOutputDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.DataOutputDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataOutputDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOUTPUT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataOutput");
    
    
    /**
     * Gets the "dataOutput" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataOutput getDataOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataOutput target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataOutput)get_store().find_element_user(DATAOUTPUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataOutput" element
     */
    public void setDataOutput(org.omg.spec.bpmn.x20100524.model.TDataOutput dataOutput)
    {
        generatedSetterHelperImpl(dataOutput, DATAOUTPUT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataOutput" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataOutput addNewDataOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataOutput target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataOutput)get_store().add_element_user(DATAOUTPUT$0);
            return target;
        }
    }
}

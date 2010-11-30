/*
 * An XML document type.
 * Localname: dataInputAssociation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.DataInputAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one dataInputAssociation(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class DataInputAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.DataInputAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataInputAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAINPUTASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataInputAssociation");
    
    
    /**
     * Gets the "dataInputAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInputAssociation getDataInputAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInputAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInputAssociation)get_store().find_element_user(DATAINPUTASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataInputAssociation" element
     */
    public void setDataInputAssociation(org.omg.spec.bpmn.x20100524.model.TDataInputAssociation dataInputAssociation)
    {
        generatedSetterHelperImpl(dataInputAssociation, DATAINPUTASSOCIATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataInputAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInputAssociation addNewDataInputAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInputAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInputAssociation)get_store().add_element_user(DATAINPUTASSOCIATION$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: dataAssociation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.DataAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one dataAssociation(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class DataAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.DataAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataAssociation");
    
    
    /**
     * Gets the "dataAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataAssociation getDataAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataAssociation)get_store().find_element_user(DATAASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataAssociation" element
     */
    public void setDataAssociation(org.omg.spec.bpmn.x20100524.model.TDataAssociation dataAssociation)
    {
        generatedSetterHelperImpl(dataAssociation, DATAASSOCIATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataAssociation addNewDataAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataAssociation)get_store().add_element_user(DATAASSOCIATION$0);
            return target;
        }
    }
}

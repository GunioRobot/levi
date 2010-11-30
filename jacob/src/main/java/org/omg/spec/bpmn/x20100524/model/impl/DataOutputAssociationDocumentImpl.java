/*
 * An XML document type.
 * Localname: dataOutputAssociation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.DataOutputAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one dataOutputAssociation(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class DataOutputAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.DataOutputAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataOutputAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOUTPUTASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataOutputAssociation");
    
    
    /**
     * Gets the "dataOutputAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation getDataOutputAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation)get_store().find_element_user(DATAOUTPUTASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataOutputAssociation" element
     */
    public void setDataOutputAssociation(org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation dataOutputAssociation)
    {
        generatedSetterHelperImpl(dataOutputAssociation, DATAOUTPUTASSOCIATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataOutputAssociation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation addNewDataOutputAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataOutputAssociation)get_store().add_element_user(DATAOUTPUTASSOCIATION$0);
            return target;
        }
    }
}

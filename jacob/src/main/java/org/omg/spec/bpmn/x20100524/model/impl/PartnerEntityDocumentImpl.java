/*
 * An XML document type.
 * Localname: partnerEntity
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.PartnerEntityDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one partnerEntity(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class PartnerEntityDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.PartnerEntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public PartnerEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTNERENTITY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "partnerEntity");
    
    
    /**
     * Gets the "partnerEntity" element
     */
    public org.omg.spec.bpmn.x20100524.model.TPartnerEntity getPartnerEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TPartnerEntity target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TPartnerEntity)get_store().find_element_user(PARTNERENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "partnerEntity" element
     */
    public void setPartnerEntity(org.omg.spec.bpmn.x20100524.model.TPartnerEntity partnerEntity)
    {
        generatedSetterHelperImpl(partnerEntity, PARTNERENTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "partnerEntity" element
     */
    public org.omg.spec.bpmn.x20100524.model.TPartnerEntity addNewPartnerEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TPartnerEntity target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TPartnerEntity)get_store().add_element_user(PARTNERENTITY$0);
            return target;
        }
    }
}

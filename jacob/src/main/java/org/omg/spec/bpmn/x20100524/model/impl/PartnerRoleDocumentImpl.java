/*
 * An XML document type.
 * Localname: partnerRole
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.PartnerRoleDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one partnerRole(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class PartnerRoleDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.PartnerRoleDocument
{
    private static final long serialVersionUID = 1L;
    
    public PartnerRoleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTNERROLE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "partnerRole");
    
    
    /**
     * Gets the "partnerRole" element
     */
    public org.omg.spec.bpmn.x20100524.model.TPartnerRole getPartnerRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TPartnerRole target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TPartnerRole)get_store().find_element_user(PARTNERROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "partnerRole" element
     */
    public void setPartnerRole(org.omg.spec.bpmn.x20100524.model.TPartnerRole partnerRole)
    {
        generatedSetterHelperImpl(partnerRole, PARTNERROLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "partnerRole" element
     */
    public org.omg.spec.bpmn.x20100524.model.TPartnerRole addNewPartnerRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TPartnerRole target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TPartnerRole)get_store().add_element_user(PARTNERROLE$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: linkEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.LinkEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one linkEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class LinkEventDefinitionDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.EventDefinitionDocumentImpl implements org.omg.spec.bpmn.x20100524.model.LinkEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public LinkEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKEVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "linkEventDefinition");
    
    
    /**
     * Gets the "linkEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLinkEventDefinition getLinkEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLinkEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLinkEventDefinition)get_store().find_element_user(LINKEVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "linkEventDefinition" element
     */
    public void setLinkEventDefinition(org.omg.spec.bpmn.x20100524.model.TLinkEventDefinition linkEventDefinition)
    {
        generatedSetterHelperImpl(linkEventDefinition, LINKEVENTDEFINITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "linkEventDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TLinkEventDefinition addNewLinkEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TLinkEventDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TLinkEventDefinition)get_store().add_element_user(LINKEVENTDEFINITION$0);
            return target;
        }
    }
}

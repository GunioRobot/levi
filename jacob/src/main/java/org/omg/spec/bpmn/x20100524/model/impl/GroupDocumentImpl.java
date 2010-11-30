/*
 * An XML document type.
 * Localname: group
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one group(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class GroupDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.ArtifactDocumentImpl implements org.omg.spec.bpmn.x20100524.model.GroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUP$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "group");
    
    
    /**
     * Gets the "group" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGroup getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGroup target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGroup)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "group" element
     */
    public void setGroup(org.omg.spec.bpmn.x20100524.model.TGroup group)
    {
        generatedSetterHelperImpl(group, GROUP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "group" element
     */
    public org.omg.spec.bpmn.x20100524.model.TGroup addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TGroup target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TGroup)get_store().add_element_user(GROUP$0);
            return target;
        }
    }
}

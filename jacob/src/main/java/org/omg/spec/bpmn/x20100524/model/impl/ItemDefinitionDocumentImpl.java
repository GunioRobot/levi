/*
 * An XML document type.
 * Localname: itemDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ItemDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one itemDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ItemDefinitionDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ItemDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ItemDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEMDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "itemDefinition");
    
    
    /**
     * Gets the "itemDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TItemDefinition getItemDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TItemDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TItemDefinition)get_store().find_element_user(ITEMDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "itemDefinition" element
     */
    public void setItemDefinition(org.omg.spec.bpmn.x20100524.model.TItemDefinition itemDefinition)
    {
        generatedSetterHelperImpl(itemDefinition, ITEMDEFINITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "itemDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TItemDefinition addNewItemDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TItemDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TItemDefinition)get_store().add_element_user(ITEMDEFINITION$0);
            return target;
        }
    }
}

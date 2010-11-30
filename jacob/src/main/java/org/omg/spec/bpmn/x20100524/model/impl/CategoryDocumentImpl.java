/*
 * An XML document type.
 * Localname: category
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.CategoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one category(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class CategoryDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.RootElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.CategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "category");
    
    
    /**
     * Gets the "category" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCategory getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCategory target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCategory)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "category" element
     */
    public void setCategory(org.omg.spec.bpmn.x20100524.model.TCategory category)
    {
        generatedSetterHelperImpl(category, CATEGORY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "category" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCategory addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCategory target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCategory)get_store().add_element_user(CATEGORY$0);
            return target;
        }
    }
}

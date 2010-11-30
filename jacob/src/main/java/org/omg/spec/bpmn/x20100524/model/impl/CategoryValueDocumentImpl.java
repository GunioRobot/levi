/*
 * An XML document type.
 * Localname: categoryValue
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.CategoryValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one categoryValue(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class CategoryValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.CategoryValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYVALUE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "categoryValue");
    
    
    /**
     * Gets the "categoryValue" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCategoryValue getCategoryValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCategoryValue target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCategoryValue)get_store().find_element_user(CATEGORYVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "categoryValue" element
     */
    public void setCategoryValue(org.omg.spec.bpmn.x20100524.model.TCategoryValue categoryValue)
    {
        generatedSetterHelperImpl(categoryValue, CATEGORYVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "categoryValue" element
     */
    public org.omg.spec.bpmn.x20100524.model.TCategoryValue addNewCategoryValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TCategoryValue target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TCategoryValue)get_store().add_element_user(CATEGORYVALUE$0);
            return target;
        }
    }
}

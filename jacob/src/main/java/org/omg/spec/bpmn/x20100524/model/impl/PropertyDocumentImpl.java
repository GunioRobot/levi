/*
 * An XML document type.
 * Localname: property
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.PropertyDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one property(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class PropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.PropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "property");
    
    
    /**
     * Gets the "property" element
     */
    public org.omg.spec.bpmn.x20100524.model.TProperty getProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProperty target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProperty)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "property" element
     */
    public void setProperty(org.omg.spec.bpmn.x20100524.model.TProperty property)
    {
        generatedSetterHelperImpl(property, PROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "property" element
     */
    public org.omg.spec.bpmn.x20100524.model.TProperty addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TProperty target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TProperty)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
}

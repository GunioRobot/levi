/*
 * An XML document type.
 * Localname: Label
 * Namespace: http://www.omg.org/spec/DD/20100524/DI
 * Java type: org.omg.spec.dd.x20100524.di.LabelDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.di.impl;
/**
 * A document containing one Label(@http://www.omg.org/spec/DD/20100524/DI) element.
 *
 * This is a complex type.
 */
public class LabelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.di.LabelDocument
{
    private static final long serialVersionUID = 1L;
    
    public LabelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABEL$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DI", "Label");
    
    
    /**
     * Gets the "Label" element
     */
    public org.omg.spec.dd.x20100524.di.Label getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.Label target = null;
            target = (org.omg.spec.dd.x20100524.di.Label)get_store().find_element_user(LABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Label" element
     */
    public void setLabel(org.omg.spec.dd.x20100524.di.Label label)
    {
        generatedSetterHelperImpl(label, LABEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Label" element
     */
    public org.omg.spec.dd.x20100524.di.Label addNewLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.Label target = null;
            target = (org.omg.spec.dd.x20100524.di.Label)get_store().add_element_user(LABEL$0);
            return target;
        }
    }
}

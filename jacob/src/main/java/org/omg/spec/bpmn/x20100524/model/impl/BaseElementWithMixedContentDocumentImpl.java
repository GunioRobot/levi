/*
 * An XML document type.
 * Localname: baseElementWithMixedContent
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.BaseElementWithMixedContentDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one baseElementWithMixedContent(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class BaseElementWithMixedContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.BaseElementWithMixedContentDocument
{
    private static final long serialVersionUID = 1L;
    
    public BaseElementWithMixedContentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASEELEMENTWITHMIXEDCONTENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "baseElementWithMixedContent");
    
    
    /**
     * Gets the "baseElementWithMixedContent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TBaseElementWithMixedContent getBaseElementWithMixedContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TBaseElementWithMixedContent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TBaseElementWithMixedContent)get_store().find_element_user(BASEELEMENTWITHMIXEDCONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baseElementWithMixedContent" element
     */
    public void setBaseElementWithMixedContent(org.omg.spec.bpmn.x20100524.model.TBaseElementWithMixedContent baseElementWithMixedContent)
    {
        generatedSetterHelperImpl(baseElementWithMixedContent, BASEELEMENTWITHMIXEDCONTENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "baseElementWithMixedContent" element
     */
    public org.omg.spec.bpmn.x20100524.model.TBaseElementWithMixedContent addNewBaseElementWithMixedContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TBaseElementWithMixedContent target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TBaseElementWithMixedContent)get_store().add_element_user(BASEELEMENTWITHMIXEDCONTENT$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: textAnnotation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TextAnnotationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one textAnnotation(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class TextAnnotationDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.ArtifactDocumentImpl implements org.omg.spec.bpmn.x20100524.model.TextAnnotationDocument
{
    private static final long serialVersionUID = 1L;
    
    public TextAnnotationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTANNOTATION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "textAnnotation");
    
    
    /**
     * Gets the "textAnnotation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TTextAnnotation getTextAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TTextAnnotation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TTextAnnotation)get_store().find_element_user(TEXTANNOTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "textAnnotation" element
     */
    public void setTextAnnotation(org.omg.spec.bpmn.x20100524.model.TTextAnnotation textAnnotation)
    {
        generatedSetterHelperImpl(textAnnotation, TEXTANNOTATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "textAnnotation" element
     */
    public org.omg.spec.bpmn.x20100524.model.TTextAnnotation addNewTextAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TTextAnnotation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TTextAnnotation)get_store().add_element_user(TEXTANNOTATION$0);
            return target;
        }
    }
}

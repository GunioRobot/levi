/*
 * An XML document type.
 * Localname: outputSet
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.OutputSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one outputSet(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class OutputSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.OutputSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public OutputSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTPUTSET$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "outputSet");
    
    
    /**
     * Gets the "outputSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TOutputSet getOutputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TOutputSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TOutputSet)get_store().find_element_user(OUTPUTSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "outputSet" element
     */
    public void setOutputSet(org.omg.spec.bpmn.x20100524.model.TOutputSet outputSet)
    {
        generatedSetterHelperImpl(outputSet, OUTPUTSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "outputSet" element
     */
    public org.omg.spec.bpmn.x20100524.model.TOutputSet addNewOutputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TOutputSet target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TOutputSet)get_store().add_element_user(OUTPUTSET$0);
            return target;
        }
    }
}

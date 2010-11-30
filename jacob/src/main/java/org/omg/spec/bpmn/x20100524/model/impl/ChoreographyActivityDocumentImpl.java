/*
 * An XML document type.
 * Localname: choreographyActivity
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ChoreographyActivityDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one choreographyActivity(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ChoreographyActivityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ChoreographyActivityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ChoreographyActivityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHOREOGRAPHYACTIVITY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "choreographyActivity");
    
    
    /**
     * Gets the "choreographyActivity" element
     */
    public org.omg.spec.bpmn.x20100524.model.TChoreographyActivity getChoreographyActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TChoreographyActivity target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TChoreographyActivity)get_store().find_element_user(CHOREOGRAPHYACTIVITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "choreographyActivity" element
     */
    public void setChoreographyActivity(org.omg.spec.bpmn.x20100524.model.TChoreographyActivity choreographyActivity)
    {
        generatedSetterHelperImpl(choreographyActivity, CHOREOGRAPHYACTIVITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "choreographyActivity" element
     */
    public org.omg.spec.bpmn.x20100524.model.TChoreographyActivity addNewChoreographyActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TChoreographyActivity target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TChoreographyActivity)get_store().add_element_user(CHOREOGRAPHYACTIVITY$0);
            return target;
        }
    }
}

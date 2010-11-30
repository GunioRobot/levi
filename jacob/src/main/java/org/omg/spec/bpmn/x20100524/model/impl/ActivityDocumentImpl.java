/*
 * An XML document type.
 * Localname: activity
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ActivityDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one activity(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ActivityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ActivityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActivityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "activity");
    
    
    /**
     * Gets the "activity" element
     */
    public org.omg.spec.bpmn.x20100524.model.TActivity getActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TActivity target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TActivity)get_store().find_element_user(ACTIVITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "activity" element
     */
    public void setActivity(org.omg.spec.bpmn.x20100524.model.TActivity activity)
    {
        generatedSetterHelperImpl(activity, ACTIVITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "activity" element
     */
    public org.omg.spec.bpmn.x20100524.model.TActivity addNewActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TActivity target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TActivity)get_store().add_element_user(ACTIVITY$0);
            return target;
        }
    }
}

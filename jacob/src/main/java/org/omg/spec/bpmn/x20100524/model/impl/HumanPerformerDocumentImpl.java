/*
 * An XML document type.
 * Localname: humanPerformer
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.HumanPerformerDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one humanPerformer(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class HumanPerformerDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.PerformerDocumentImpl implements org.omg.spec.bpmn.x20100524.model.HumanPerformerDocument
{
    private static final long serialVersionUID = 1L;
    
    public HumanPerformerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HUMANPERFORMER$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "humanPerformer");
    
    
    /**
     * Gets the "humanPerformer" element
     */
    public org.omg.spec.bpmn.x20100524.model.THumanPerformer getHumanPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.THumanPerformer target = null;
            target = (org.omg.spec.bpmn.x20100524.model.THumanPerformer)get_store().find_element_user(HUMANPERFORMER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "humanPerformer" element
     */
    public void setHumanPerformer(org.omg.spec.bpmn.x20100524.model.THumanPerformer humanPerformer)
    {
        generatedSetterHelperImpl(humanPerformer, HUMANPERFORMER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "humanPerformer" element
     */
    public org.omg.spec.bpmn.x20100524.model.THumanPerformer addNewHumanPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.THumanPerformer target = null;
            target = (org.omg.spec.bpmn.x20100524.model.THumanPerformer)get_store().add_element_user(HUMANPERFORMER$0);
            return target;
        }
    }
}

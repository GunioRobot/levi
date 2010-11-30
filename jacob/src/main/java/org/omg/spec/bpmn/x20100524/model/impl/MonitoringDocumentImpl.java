/*
 * An XML document type.
 * Localname: monitoring
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.MonitoringDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one monitoring(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class MonitoringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.MonitoringDocument
{
    private static final long serialVersionUID = 1L;
    
    public MonitoringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MONITORING$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "monitoring");
    
    
    /**
     * Gets the "monitoring" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMonitoring getMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMonitoring target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMonitoring)get_store().find_element_user(MONITORING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "monitoring" element
     */
    public void setMonitoring(org.omg.spec.bpmn.x20100524.model.TMonitoring monitoring)
    {
        generatedSetterHelperImpl(monitoring, MONITORING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "monitoring" element
     */
    public org.omg.spec.bpmn.x20100524.model.TMonitoring addNewMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMonitoring target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMonitoring)get_store().add_element_user(MONITORING$0);
            return target;
        }
    }
}

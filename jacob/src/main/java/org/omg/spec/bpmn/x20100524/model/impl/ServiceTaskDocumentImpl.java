/*
 * An XML document type.
 * Localname: serviceTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ServiceTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one serviceTask(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ServiceTaskDocumentImpl extends org.omg.spec.bpmn.x20100524.model.impl.FlowElementDocumentImpl implements org.omg.spec.bpmn.x20100524.model.ServiceTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICETASK$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "serviceTask");
    
    
    /**
     * Gets the "serviceTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TServiceTask getServiceTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TServiceTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TServiceTask)get_store().find_element_user(SERVICETASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "serviceTask" element
     */
    public void setServiceTask(org.omg.spec.bpmn.x20100524.model.TServiceTask serviceTask)
    {
        generatedSetterHelperImpl(serviceTask, SERVICETASK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "serviceTask" element
     */
    public org.omg.spec.bpmn.x20100524.model.TServiceTask addNewServiceTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TServiceTask target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TServiceTask)get_store().add_element_user(SERVICETASK$0);
            return target;
        }
    }
}

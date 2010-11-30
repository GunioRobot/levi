/*
 * XML Type:  tCorrelationPropertyBinding
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyBinding
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tCorrelationPropertyBinding(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TCorrelationPropertyBindingImpl extends org.omg.spec.bpmn.x20100524.model.impl.TBaseElementImpl implements org.omg.spec.bpmn.x20100524.model.TCorrelationPropertyBinding
{
    private static final long serialVersionUID = 1L;
    
    public TCorrelationPropertyBindingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAPATH$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataPath");
    private static final javax.xml.namespace.QName CORRELATIONPROPERTYREF$2 = 
        new javax.xml.namespace.QName("", "correlationPropertyRef");
    
    
    /**
     * Gets the "dataPath" element
     */
    public org.omg.spec.bpmn.x20100524.model.TFormalExpression getDataPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TFormalExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TFormalExpression)get_store().find_element_user(DATAPATH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataPath" element
     */
    public void setDataPath(org.omg.spec.bpmn.x20100524.model.TFormalExpression dataPath)
    {
        generatedSetterHelperImpl(dataPath, DATAPATH$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataPath" element
     */
    public org.omg.spec.bpmn.x20100524.model.TFormalExpression addNewDataPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TFormalExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TFormalExpression)get_store().add_element_user(DATAPATH$0);
            return target;
        }
    }
    
    /**
     * Gets the "correlationPropertyRef" attribute
     */
    public javax.xml.namespace.QName getCorrelationPropertyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CORRELATIONPROPERTYREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "correlationPropertyRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetCorrelationPropertyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CORRELATIONPROPERTYREF$2);
            return target;
        }
    }
    
    /**
     * Sets the "correlationPropertyRef" attribute
     */
    public void setCorrelationPropertyRef(javax.xml.namespace.QName correlationPropertyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CORRELATIONPROPERTYREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CORRELATIONPROPERTYREF$2);
            }
            target.setQNameValue(correlationPropertyRef);
        }
    }
    
    /**
     * Sets (as xml) the "correlationPropertyRef" attribute
     */
    public void xsetCorrelationPropertyRef(org.apache.xmlbeans.XmlQName correlationPropertyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CORRELATIONPROPERTYREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(CORRELATIONPROPERTYREF$2);
            }
            target.set(correlationPropertyRef);
        }
    }
}

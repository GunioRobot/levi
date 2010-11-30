/*
 * XML Type:  tSequenceFlow
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TSequenceFlow
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tSequenceFlow(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TSequenceFlowImpl extends org.omg.spec.bpmn.x20100524.model.impl.TFlowElementImpl implements org.omg.spec.bpmn.x20100524.model.TSequenceFlow
{
    private static final long serialVersionUID = 1L;
    
    public TSequenceFlowImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITIONEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conditionExpression");
    private static final javax.xml.namespace.QName SOURCEREF$2 = 
        new javax.xml.namespace.QName("", "sourceRef");
    private static final javax.xml.namespace.QName TARGETREF$4 = 
        new javax.xml.namespace.QName("", "targetRef");
    private static final javax.xml.namespace.QName ISIMMEDIATE$6 = 
        new javax.xml.namespace.QName("", "isImmediate");
    
    
    /**
     * Gets the "conditionExpression" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression getConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().find_element_user(CONDITIONEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "conditionExpression" element
     */
    public boolean isSetConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITIONEXPRESSION$0) != 0;
        }
    }
    
    /**
     * Sets the "conditionExpression" element
     */
    public void setConditionExpression(org.omg.spec.bpmn.x20100524.model.TExpression conditionExpression)
    {
        generatedSetterHelperImpl(conditionExpression, CONDITIONEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "conditionExpression" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression addNewConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().add_element_user(CONDITIONEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "conditionExpression" element
     */
    public void unsetConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITIONEXPRESSION$0, 0);
        }
    }
    
    /**
     * Gets the "sourceRef" attribute
     */
    public java.lang.String getSourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceRef" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetSourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(SOURCEREF$2);
            return target;
        }
    }
    
    /**
     * Sets the "sourceRef" attribute
     */
    public void setSourceRef(java.lang.String sourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCEREF$2);
            }
            target.setStringValue(sourceRef);
        }
    }
    
    /**
     * Sets (as xml) the "sourceRef" attribute
     */
    public void xsetSourceRef(org.apache.xmlbeans.XmlIDREF sourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(SOURCEREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(SOURCEREF$2);
            }
            target.set(sourceRef);
        }
    }
    
    /**
     * Gets the "targetRef" attribute
     */
    public java.lang.String getTargetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETREF$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetRef" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetTargetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(TARGETREF$4);
            return target;
        }
    }
    
    /**
     * Sets the "targetRef" attribute
     */
    public void setTargetRef(java.lang.String targetRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETREF$4);
            }
            target.setStringValue(targetRef);
        }
    }
    
    /**
     * Sets (as xml) the "targetRef" attribute
     */
    public void xsetTargetRef(org.apache.xmlbeans.XmlIDREF targetRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(TARGETREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(TARGETREF$4);
            }
            target.set(targetRef);
        }
    }
    
    /**
     * Gets the "isImmediate" attribute
     */
    public boolean getIsImmediate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISIMMEDIATE$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isImmediate" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsImmediate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISIMMEDIATE$6);
            return target;
        }
    }
    
    /**
     * True if has "isImmediate" attribute
     */
    public boolean isSetIsImmediate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISIMMEDIATE$6) != null;
        }
    }
    
    /**
     * Sets the "isImmediate" attribute
     */
    public void setIsImmediate(boolean isImmediate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISIMMEDIATE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISIMMEDIATE$6);
            }
            target.setBooleanValue(isImmediate);
        }
    }
    
    /**
     * Sets (as xml) the "isImmediate" attribute
     */
    public void xsetIsImmediate(org.apache.xmlbeans.XmlBoolean isImmediate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISIMMEDIATE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISIMMEDIATE$6);
            }
            target.set(isImmediate);
        }
    }
    
    /**
     * Unsets the "isImmediate" attribute
     */
    public void unsetIsImmediate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISIMMEDIATE$6);
        }
    }
}

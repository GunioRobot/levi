/*
 * XML Type:  tScriptTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TScriptTask
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tScriptTask(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TScriptTaskImpl extends org.omg.spec.bpmn.x20100524.model.impl.TTaskImpl implements org.omg.spec.bpmn.x20100524.model.TScriptTask
{
    private static final long serialVersionUID = 1L;
    
    public TScriptTaskImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCRIPT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "script");
    private static final javax.xml.namespace.QName SCRIPTFORMAT$2 = 
        new javax.xml.namespace.QName("", "scriptFormat");
    
    
    /**
     * Gets the "script" element
     */
    public org.omg.spec.bpmn.x20100524.model.TScript getScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TScript target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TScript)get_store().find_element_user(SCRIPT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "script" element
     */
    public boolean isSetScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCRIPT$0) != 0;
        }
    }
    
    /**
     * Sets the "script" element
     */
    public void setScript(org.omg.spec.bpmn.x20100524.model.TScript script)
    {
        generatedSetterHelperImpl(script, SCRIPT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "script" element
     */
    public org.omg.spec.bpmn.x20100524.model.TScript addNewScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TScript target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TScript)get_store().add_element_user(SCRIPT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "script" element
     */
    public void unsetScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCRIPT$0, 0);
        }
    }
    
    /**
     * Gets the "scriptFormat" attribute
     */
    public java.lang.String getScriptFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCRIPTFORMAT$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scriptFormat" attribute
     */
    public org.apache.xmlbeans.XmlString xgetScriptFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCRIPTFORMAT$2);
            return target;
        }
    }
    
    /**
     * True if has "scriptFormat" attribute
     */
    public boolean isSetScriptFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCRIPTFORMAT$2) != null;
        }
    }
    
    /**
     * Sets the "scriptFormat" attribute
     */
    public void setScriptFormat(java.lang.String scriptFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCRIPTFORMAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCRIPTFORMAT$2);
            }
            target.setStringValue(scriptFormat);
        }
    }
    
    /**
     * Sets (as xml) the "scriptFormat" attribute
     */
    public void xsetScriptFormat(org.apache.xmlbeans.XmlString scriptFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCRIPTFORMAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCRIPTFORMAT$2);
            }
            target.set(scriptFormat);
        }
    }
    
    /**
     * Unsets the "scriptFormat" attribute
     */
    public void unsetScriptFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCRIPTFORMAT$2);
        }
    }
}

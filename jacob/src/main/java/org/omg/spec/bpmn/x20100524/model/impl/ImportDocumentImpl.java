/*
 * An XML document type.
 * Localname: import
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ImportDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one import(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ImportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ImportDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "import");
    
    
    /**
     * Gets the "import" element
     */
    public org.omg.spec.bpmn.x20100524.model.TImport getImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TImport target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TImport)get_store().find_element_user(IMPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "import" element
     */
    public void setImport(org.omg.spec.bpmn.x20100524.model.TImport ximport)
    {
        generatedSetterHelperImpl(ximport, IMPORT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "import" element
     */
    public org.omg.spec.bpmn.x20100524.model.TImport addNewImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TImport target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TImport)get_store().add_element_user(IMPORT$0);
            return target;
        }
    }
}

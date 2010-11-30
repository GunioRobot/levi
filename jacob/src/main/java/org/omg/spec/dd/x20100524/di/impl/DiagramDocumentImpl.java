/*
 * An XML document type.
 * Localname: Diagram
 * Namespace: http://www.omg.org/spec/DD/20100524/DI
 * Java type: org.omg.spec.dd.x20100524.di.DiagramDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.di.impl;
/**
 * A document containing one Diagram(@http://www.omg.org/spec/DD/20100524/DI) element.
 *
 * This is a complex type.
 */
public class DiagramDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.di.DiagramDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiagramDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIAGRAM$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DI", "Diagram");
    
    
    /**
     * Gets the "Diagram" element
     */
    public org.omg.spec.dd.x20100524.di.Diagram getDiagram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.Diagram target = null;
            target = (org.omg.spec.dd.x20100524.di.Diagram)get_store().find_element_user(DIAGRAM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Diagram" element
     */
    public void setDiagram(org.omg.spec.dd.x20100524.di.Diagram diagram)
    {
        generatedSetterHelperImpl(diagram, DIAGRAM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Diagram" element
     */
    public org.omg.spec.dd.x20100524.di.Diagram addNewDiagram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.Diagram target = null;
            target = (org.omg.spec.dd.x20100524.di.Diagram)get_store().add_element_user(DIAGRAM$0);
            return target;
        }
    }
}

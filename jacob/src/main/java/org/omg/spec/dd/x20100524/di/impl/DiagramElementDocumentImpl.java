/*
 * An XML document type.
 * Localname: DiagramElement
 * Namespace: http://www.omg.org/spec/DD/20100524/DI
 * Java type: org.omg.spec.dd.x20100524.di.DiagramElementDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.di.impl;
/**
 * A document containing one DiagramElement(@http://www.omg.org/spec/DD/20100524/DI) element.
 *
 * This is a complex type.
 */
public class DiagramElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.di.DiagramElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiagramElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIAGRAMELEMENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DI", "DiagramElement");
    private static final org.apache.xmlbeans.QNameSet DIAGRAMELEMENT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNEdge"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNShape"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DI", "DiagramElement"),
    });
    
    
    /**
     * Gets the "DiagramElement" element
     */
    public org.omg.spec.dd.x20100524.di.DiagramElement getDiagramElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.DiagramElement target = null;
            target = (org.omg.spec.dd.x20100524.di.DiagramElement)get_store().find_element_user(DIAGRAMELEMENT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DiagramElement" element
     */
    public void setDiagramElement(org.omg.spec.dd.x20100524.di.DiagramElement diagramElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.DiagramElement target = null;
            target = (org.omg.spec.dd.x20100524.di.DiagramElement)get_store().find_element_user(DIAGRAMELEMENT$1, 0);
            if (target == null)
            {
                target = (org.omg.spec.dd.x20100524.di.DiagramElement)get_store().add_element_user(DIAGRAMELEMENT$0);
            }
            target.set(diagramElement);
        }
    }
    
    /**
     * Appends and returns a new empty "DiagramElement" element
     */
    public org.omg.spec.dd.x20100524.di.DiagramElement addNewDiagramElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.DiagramElement target = null;
            target = (org.omg.spec.dd.x20100524.di.DiagramElement)get_store().add_element_user(DIAGRAMELEMENT$0);
            return target;
        }
    }
}

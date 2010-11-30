/*
 * An XML document type.
 * Localname: Node
 * Namespace: http://www.omg.org/spec/DD/20100524/DI
 * Java type: org.omg.spec.dd.x20100524.di.NodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.di.impl;
/**
 * A document containing one Node(@http://www.omg.org/spec/DD/20100524/DI) element.
 *
 * This is a complex type.
 */
public class NodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.dd.x20100524.di.NodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public NodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NODE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DI", "Node");
    
    
    /**
     * Gets the "Node" element
     */
    public org.omg.spec.dd.x20100524.di.Node getNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.Node target = null;
            target = (org.omg.spec.dd.x20100524.di.Node)get_store().find_element_user(NODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Node" element
     */
    public void setNode(org.omg.spec.dd.x20100524.di.Node node)
    {
        generatedSetterHelperImpl(node, NODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Node" element
     */
    public org.omg.spec.dd.x20100524.di.Node addNewNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.di.Node target = null;
            target = (org.omg.spec.dd.x20100524.di.Node)get_store().add_element_user(NODE$0);
            return target;
        }
    }
}

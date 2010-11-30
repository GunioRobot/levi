/*
 * An XML document type.
 * Localname: resourceAssignmentExpression
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.ResourceAssignmentExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * A document containing one resourceAssignmentExpression(@http://www.omg.org/spec/BPMN/20100524/MODEL) element.
 *
 * This is a complex type.
 */
public class ResourceAssignmentExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.ResourceAssignmentExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceAssignmentExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEASSIGNMENTEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resourceAssignmentExpression");
    
    
    /**
     * Gets the "resourceAssignmentExpression" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceAssignmentExpression getResourceAssignmentExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceAssignmentExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceAssignmentExpression)get_store().find_element_user(RESOURCEASSIGNMENTEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resourceAssignmentExpression" element
     */
    public void setResourceAssignmentExpression(org.omg.spec.bpmn.x20100524.model.TResourceAssignmentExpression resourceAssignmentExpression)
    {
        generatedSetterHelperImpl(resourceAssignmentExpression, RESOURCEASSIGNMENTEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resourceAssignmentExpression" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceAssignmentExpression addNewResourceAssignmentExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceAssignmentExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceAssignmentExpression)get_store().add_element_user(RESOURCEASSIGNMENTEXPRESSION$0);
            return target;
        }
    }
}

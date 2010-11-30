/*
 * XML Type:  tImplementation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TImplementation
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tImplementation(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlAnyURI
 *     org.omg.spec.bpmn.x20100524.model.TImplementation$Member
 */
public class TImplementationImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.omg.spec.bpmn.x20100524.model.TImplementation, org.apache.xmlbeans.XmlAnyURI, org.omg.spec.bpmn.x20100524.model.TImplementation.Member
{
    private static final long serialVersionUID = 1L;
    
    public TImplementationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected TImplementationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.omg.spec.bpmn.x20100524.model.TImplementation$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.omg.spec.bpmn.x20100524.model.TImplementation.Member
    {
        private static final long serialVersionUID = 1L;
        
        public MemberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}

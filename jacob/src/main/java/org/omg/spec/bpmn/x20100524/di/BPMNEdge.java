/*
 * XML Type:  BPMNEdge
 * Namespace: http://www.omg.org/spec/BPMN/20100524/DI
 * Java type: org.omg.spec.bpmn.x20100524.di.BPMNEdge
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.di;


/**
 * An XML BPMNEdge(@http://www.omg.org/spec/BPMN/20100524/DI).
 *
 * This is a complex type.
 */
public interface BPMNEdge extends org.omg.spec.dd.x20100524.di.LabeledEdge
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BPMNEdge.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s274511477EA18E924A610889C839BA0F").resolveHandle("bpmnedge48b6type");
    
    /**
     * Gets the "BPMNLabel" element
     */
    org.omg.spec.bpmn.x20100524.di.BPMNLabel getBPMNLabel();
    
    /**
     * True if has "BPMNLabel" element
     */
    boolean isSetBPMNLabel();
    
    /**
     * Sets the "BPMNLabel" element
     */
    void setBPMNLabel(org.omg.spec.bpmn.x20100524.di.BPMNLabel bpmnLabel);
    
    /**
     * Appends and returns a new empty "BPMNLabel" element
     */
    org.omg.spec.bpmn.x20100524.di.BPMNLabel addNewBPMNLabel();
    
    /**
     * Unsets the "BPMNLabel" element
     */
    void unsetBPMNLabel();
    
    /**
     * Gets the "bpmnElement" attribute
     */
    javax.xml.namespace.QName getBpmnElement();
    
    /**
     * Gets (as xml) the "bpmnElement" attribute
     */
    org.apache.xmlbeans.XmlQName xgetBpmnElement();
    
    /**
     * True if has "bpmnElement" attribute
     */
    boolean isSetBpmnElement();
    
    /**
     * Sets the "bpmnElement" attribute
     */
    void setBpmnElement(javax.xml.namespace.QName bpmnElement);
    
    /**
     * Sets (as xml) the "bpmnElement" attribute
     */
    void xsetBpmnElement(org.apache.xmlbeans.XmlQName bpmnElement);
    
    /**
     * Unsets the "bpmnElement" attribute
     */
    void unsetBpmnElement();
    
    /**
     * Gets the "sourceElement" attribute
     */
    javax.xml.namespace.QName getSourceElement();
    
    /**
     * Gets (as xml) the "sourceElement" attribute
     */
    org.apache.xmlbeans.XmlQName xgetSourceElement();
    
    /**
     * True if has "sourceElement" attribute
     */
    boolean isSetSourceElement();
    
    /**
     * Sets the "sourceElement" attribute
     */
    void setSourceElement(javax.xml.namespace.QName sourceElement);
    
    /**
     * Sets (as xml) the "sourceElement" attribute
     */
    void xsetSourceElement(org.apache.xmlbeans.XmlQName sourceElement);
    
    /**
     * Unsets the "sourceElement" attribute
     */
    void unsetSourceElement();
    
    /**
     * Gets the "targetElement" attribute
     */
    javax.xml.namespace.QName getTargetElement();
    
    /**
     * Gets (as xml) the "targetElement" attribute
     */
    org.apache.xmlbeans.XmlQName xgetTargetElement();
    
    /**
     * True if has "targetElement" attribute
     */
    boolean isSetTargetElement();
    
    /**
     * Sets the "targetElement" attribute
     */
    void setTargetElement(javax.xml.namespace.QName targetElement);
    
    /**
     * Sets (as xml) the "targetElement" attribute
     */
    void xsetTargetElement(org.apache.xmlbeans.XmlQName targetElement);
    
    /**
     * Unsets the "targetElement" attribute
     */
    void unsetTargetElement();
    
    /**
     * Gets the "messageVisibleKind" attribute
     */
    org.omg.spec.bpmn.x20100524.di.MessageVisibleKind.Enum getMessageVisibleKind();
    
    /**
     * Gets (as xml) the "messageVisibleKind" attribute
     */
    org.omg.spec.bpmn.x20100524.di.MessageVisibleKind xgetMessageVisibleKind();
    
    /**
     * True if has "messageVisibleKind" attribute
     */
    boolean isSetMessageVisibleKind();
    
    /**
     * Sets the "messageVisibleKind" attribute
     */
    void setMessageVisibleKind(org.omg.spec.bpmn.x20100524.di.MessageVisibleKind.Enum messageVisibleKind);
    
    /**
     * Sets (as xml) the "messageVisibleKind" attribute
     */
    void xsetMessageVisibleKind(org.omg.spec.bpmn.x20100524.di.MessageVisibleKind messageVisibleKind);
    
    /**
     * Unsets the "messageVisibleKind" attribute
     */
    void unsetMessageVisibleKind();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge newInstance() {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.di.BPMNEdge parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNEdge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

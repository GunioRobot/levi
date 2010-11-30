/*
 * XML Type:  BPMNLabel
 * Namespace: http://www.omg.org/spec/BPMN/20100524/DI
 * Java type: org.omg.spec.bpmn.x20100524.di.BPMNLabel
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.di;


/**
 * An XML BPMNLabel(@http://www.omg.org/spec/BPMN/20100524/DI).
 *
 * This is a complex type.
 */
public interface BPMNLabel extends org.omg.spec.dd.x20100524.di.Label
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BPMNLabel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s274511477EA18E924A610889C839BA0F").resolveHandle("bpmnlabel1d4ftype");
    
    /**
     * Gets the "labelStyle" attribute
     */
    javax.xml.namespace.QName getLabelStyle();
    
    /**
     * Gets (as xml) the "labelStyle" attribute
     */
    org.apache.xmlbeans.XmlQName xgetLabelStyle();
    
    /**
     * True if has "labelStyle" attribute
     */
    boolean isSetLabelStyle();
    
    /**
     * Sets the "labelStyle" attribute
     */
    void setLabelStyle(javax.xml.namespace.QName labelStyle);
    
    /**
     * Sets (as xml) the "labelStyle" attribute
     */
    void xsetLabelStyle(org.apache.xmlbeans.XmlQName labelStyle);
    
    /**
     * Unsets the "labelStyle" attribute
     */
    void unsetLabelStyle();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel newInstance() {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.di.BPMNLabel parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

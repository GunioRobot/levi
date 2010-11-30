/*
 * XML Type:  BPMNDiagram
 * Namespace: http://www.omg.org/spec/BPMN/20100524/DI
 * Java type: org.omg.spec.bpmn.x20100524.di.BPMNDiagram
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.di;


/**
 * An XML BPMNDiagram(@http://www.omg.org/spec/BPMN/20100524/DI).
 *
 * This is a complex type.
 */
public interface BPMNDiagram extends org.omg.spec.dd.x20100524.di.Diagram
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BPMNDiagram.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s274511477EA18E924A610889C839BA0F").resolveHandle("bpmndiagramd450type");
    
    /**
     * Gets the "BPMNPlane" element
     */
    org.omg.spec.bpmn.x20100524.di.BPMNPlane getBPMNPlane();
    
    /**
     * Sets the "BPMNPlane" element
     */
    void setBPMNPlane(org.omg.spec.bpmn.x20100524.di.BPMNPlane bpmnPlane);
    
    /**
     * Appends and returns a new empty "BPMNPlane" element
     */
    org.omg.spec.bpmn.x20100524.di.BPMNPlane addNewBPMNPlane();
    
    /**
     * Gets array of all "BPMNLabelStyle" elements
     */
    org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle[] getBPMNLabelStyleArray();
    
    /**
     * Gets ith "BPMNLabelStyle" element
     */
    org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle getBPMNLabelStyleArray(int i);
    
    /**
     * Returns number of "BPMNLabelStyle" element
     */
    int sizeOfBPMNLabelStyleArray();
    
    /**
     * Sets array of all "BPMNLabelStyle" element
     */
    void setBPMNLabelStyleArray(org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle[] bpmnLabelStyleArray);
    
    /**
     * Sets ith "BPMNLabelStyle" element
     */
    void setBPMNLabelStyleArray(int i, org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle bpmnLabelStyle);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BPMNLabelStyle" element
     */
    org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle insertNewBPMNLabelStyle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BPMNLabelStyle" element
     */
    org.omg.spec.bpmn.x20100524.di.BPMNLabelStyle addNewBPMNLabelStyle();
    
    /**
     * Removes the ith "BPMNLabelStyle" element
     */
    void removeBPMNLabelStyle(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram newInstance() {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.di.BPMNDiagram parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNDiagram) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

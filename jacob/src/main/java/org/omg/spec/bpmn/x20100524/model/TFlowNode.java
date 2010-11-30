/*
 * XML Type:  tFlowNode
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TFlowNode
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model;


/**
 * An XML tFlowNode(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public interface TFlowNode extends org.omg.spec.bpmn.x20100524.model.TFlowElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TFlowNode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s274511477EA18E924A610889C839BA0F").resolveHandle("tflownoded69etype");
    
    /**
     * Gets array of all "incoming" elements
     */
    javax.xml.namespace.QName[] getIncomingArray();
    
    /**
     * Gets ith "incoming" element
     */
    javax.xml.namespace.QName getIncomingArray(int i);
    
    /**
     * Gets (as xml) array of all "incoming" elements
     */
    org.apache.xmlbeans.XmlQName[] xgetIncomingArray();
    
    /**
     * Gets (as xml) ith "incoming" element
     */
    org.apache.xmlbeans.XmlQName xgetIncomingArray(int i);
    
    /**
     * Returns number of "incoming" element
     */
    int sizeOfIncomingArray();
    
    /**
     * Sets array of all "incoming" element
     */
    void setIncomingArray(javax.xml.namespace.QName[] incomingArray);
    
    /**
     * Sets ith "incoming" element
     */
    void setIncomingArray(int i, javax.xml.namespace.QName incoming);
    
    /**
     * Sets (as xml) array of all "incoming" element
     */
    void xsetIncomingArray(org.apache.xmlbeans.XmlQName[] incomingArray);
    
    /**
     * Sets (as xml) ith "incoming" element
     */
    void xsetIncomingArray(int i, org.apache.xmlbeans.XmlQName incoming);
    
    /**
     * Inserts the value as the ith "incoming" element
     */
    void insertIncoming(int i, javax.xml.namespace.QName incoming);
    
    /**
     * Appends the value as the last "incoming" element
     */
    void addIncoming(javax.xml.namespace.QName incoming);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "incoming" element
     */
    org.apache.xmlbeans.XmlQName insertNewIncoming(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "incoming" element
     */
    org.apache.xmlbeans.XmlQName addNewIncoming();
    
    /**
     * Removes the ith "incoming" element
     */
    void removeIncoming(int i);
    
    /**
     * Gets array of all "outgoing" elements
     */
    javax.xml.namespace.QName[] getOutgoingArray();
    
    /**
     * Gets ith "outgoing" element
     */
    javax.xml.namespace.QName getOutgoingArray(int i);
    
    /**
     * Gets (as xml) array of all "outgoing" elements
     */
    org.apache.xmlbeans.XmlQName[] xgetOutgoingArray();
    
    /**
     * Gets (as xml) ith "outgoing" element
     */
    org.apache.xmlbeans.XmlQName xgetOutgoingArray(int i);
    
    /**
     * Returns number of "outgoing" element
     */
    int sizeOfOutgoingArray();
    
    /**
     * Sets array of all "outgoing" element
     */
    void setOutgoingArray(javax.xml.namespace.QName[] outgoingArray);
    
    /**
     * Sets ith "outgoing" element
     */
    void setOutgoingArray(int i, javax.xml.namespace.QName outgoing);
    
    /**
     * Sets (as xml) array of all "outgoing" element
     */
    void xsetOutgoingArray(org.apache.xmlbeans.XmlQName[] outgoingArray);
    
    /**
     * Sets (as xml) ith "outgoing" element
     */
    void xsetOutgoingArray(int i, org.apache.xmlbeans.XmlQName outgoing);
    
    /**
     * Inserts the value as the ith "outgoing" element
     */
    void insertOutgoing(int i, javax.xml.namespace.QName outgoing);
    
    /**
     * Appends the value as the last "outgoing" element
     */
    void addOutgoing(javax.xml.namespace.QName outgoing);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "outgoing" element
     */
    org.apache.xmlbeans.XmlQName insertNewOutgoing(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "outgoing" element
     */
    org.apache.xmlbeans.XmlQName addNewOutgoing();
    
    /**
     * Removes the ith "outgoing" element
     */
    void removeOutgoing(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode newInstance() {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TFlowNode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TFlowNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

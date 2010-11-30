/*
 * XML Type:  tExtension
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TExtension
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model;


/**
 * An XML tExtension(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public interface TExtension extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TExtension.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s274511477EA18E924A610889C839BA0F").resolveHandle("textension95d7type");
    
    /**
     * Gets array of all "documentation" elements
     */
    org.omg.spec.bpmn.x20100524.model.TDocumentation[] getDocumentationArray();
    
    /**
     * Gets ith "documentation" element
     */
    org.omg.spec.bpmn.x20100524.model.TDocumentation getDocumentationArray(int i);
    
    /**
     * Returns number of "documentation" element
     */
    int sizeOfDocumentationArray();
    
    /**
     * Sets array of all "documentation" element
     */
    void setDocumentationArray(org.omg.spec.bpmn.x20100524.model.TDocumentation[] documentationArray);
    
    /**
     * Sets ith "documentation" element
     */
    void setDocumentationArray(int i, org.omg.spec.bpmn.x20100524.model.TDocumentation documentation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentation" element
     */
    org.omg.spec.bpmn.x20100524.model.TDocumentation insertNewDocumentation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentation" element
     */
    org.omg.spec.bpmn.x20100524.model.TDocumentation addNewDocumentation();
    
    /**
     * Removes the ith "documentation" element
     */
    void removeDocumentation(int i);
    
    /**
     * Gets the "definition" attribute
     */
    javax.xml.namespace.QName getDefinition();
    
    /**
     * Gets (as xml) the "definition" attribute
     */
    org.apache.xmlbeans.XmlQName xgetDefinition();
    
    /**
     * True if has "definition" attribute
     */
    boolean isSetDefinition();
    
    /**
     * Sets the "definition" attribute
     */
    void setDefinition(javax.xml.namespace.QName definition);
    
    /**
     * Sets (as xml) the "definition" attribute
     */
    void xsetDefinition(org.apache.xmlbeans.XmlQName definition);
    
    /**
     * Unsets the "definition" attribute
     */
    void unsetDefinition();
    
    /**
     * Gets the "mustUnderstand" attribute
     */
    boolean getMustUnderstand();
    
    /**
     * Gets (as xml) the "mustUnderstand" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMustUnderstand();
    
    /**
     * True if has "mustUnderstand" attribute
     */
    boolean isSetMustUnderstand();
    
    /**
     * Sets the "mustUnderstand" attribute
     */
    void setMustUnderstand(boolean mustUnderstand);
    
    /**
     * Sets (as xml) the "mustUnderstand" attribute
     */
    void xsetMustUnderstand(org.apache.xmlbeans.XmlBoolean mustUnderstand);
    
    /**
     * Unsets the "mustUnderstand" attribute
     */
    void unsetMustUnderstand();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.spec.bpmn.x20100524.model.TExtension newInstance() {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TExtension newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.spec.bpmn.x20100524.model.TExtension parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TExtension parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.spec.bpmn.x20100524.model.TExtension parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TExtension parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TExtension parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TExtension parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TExtension parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TExtension parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TExtension parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TExtension parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TExtension parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TExtension parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TExtension parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TExtension parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TExtension parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TExtension parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

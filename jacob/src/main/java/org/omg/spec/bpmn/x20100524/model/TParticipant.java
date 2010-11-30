/*
 * XML Type:  tParticipant
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TParticipant
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model;


/**
 * An XML tParticipant(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public interface TParticipant extends org.omg.spec.bpmn.x20100524.model.TBaseElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TParticipant.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s274511477EA18E924A610889C839BA0F").resolveHandle("tparticipantb98btype");
    
    /**
     * Gets array of all "interfaceRef" elements
     */
    javax.xml.namespace.QName[] getInterfaceRefArray();
    
    /**
     * Gets ith "interfaceRef" element
     */
    javax.xml.namespace.QName getInterfaceRefArray(int i);
    
    /**
     * Gets (as xml) array of all "interfaceRef" elements
     */
    org.apache.xmlbeans.XmlQName[] xgetInterfaceRefArray();
    
    /**
     * Gets (as xml) ith "interfaceRef" element
     */
    org.apache.xmlbeans.XmlQName xgetInterfaceRefArray(int i);
    
    /**
     * Returns number of "interfaceRef" element
     */
    int sizeOfInterfaceRefArray();
    
    /**
     * Sets array of all "interfaceRef" element
     */
    void setInterfaceRefArray(javax.xml.namespace.QName[] interfaceRefArray);
    
    /**
     * Sets ith "interfaceRef" element
     */
    void setInterfaceRefArray(int i, javax.xml.namespace.QName interfaceRef);
    
    /**
     * Sets (as xml) array of all "interfaceRef" element
     */
    void xsetInterfaceRefArray(org.apache.xmlbeans.XmlQName[] interfaceRefArray);
    
    /**
     * Sets (as xml) ith "interfaceRef" element
     */
    void xsetInterfaceRefArray(int i, org.apache.xmlbeans.XmlQName interfaceRef);
    
    /**
     * Inserts the value as the ith "interfaceRef" element
     */
    void insertInterfaceRef(int i, javax.xml.namespace.QName interfaceRef);
    
    /**
     * Appends the value as the last "interfaceRef" element
     */
    void addInterfaceRef(javax.xml.namespace.QName interfaceRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interfaceRef" element
     */
    org.apache.xmlbeans.XmlQName insertNewInterfaceRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interfaceRef" element
     */
    org.apache.xmlbeans.XmlQName addNewInterfaceRef();
    
    /**
     * Removes the ith "interfaceRef" element
     */
    void removeInterfaceRef(int i);
    
    /**
     * Gets array of all "endPointRef" elements
     */
    javax.xml.namespace.QName[] getEndPointRefArray();
    
    /**
     * Gets ith "endPointRef" element
     */
    javax.xml.namespace.QName getEndPointRefArray(int i);
    
    /**
     * Gets (as xml) array of all "endPointRef" elements
     */
    org.apache.xmlbeans.XmlQName[] xgetEndPointRefArray();
    
    /**
     * Gets (as xml) ith "endPointRef" element
     */
    org.apache.xmlbeans.XmlQName xgetEndPointRefArray(int i);
    
    /**
     * Returns number of "endPointRef" element
     */
    int sizeOfEndPointRefArray();
    
    /**
     * Sets array of all "endPointRef" element
     */
    void setEndPointRefArray(javax.xml.namespace.QName[] endPointRefArray);
    
    /**
     * Sets ith "endPointRef" element
     */
    void setEndPointRefArray(int i, javax.xml.namespace.QName endPointRef);
    
    /**
     * Sets (as xml) array of all "endPointRef" element
     */
    void xsetEndPointRefArray(org.apache.xmlbeans.XmlQName[] endPointRefArray);
    
    /**
     * Sets (as xml) ith "endPointRef" element
     */
    void xsetEndPointRefArray(int i, org.apache.xmlbeans.XmlQName endPointRef);
    
    /**
     * Inserts the value as the ith "endPointRef" element
     */
    void insertEndPointRef(int i, javax.xml.namespace.QName endPointRef);
    
    /**
     * Appends the value as the last "endPointRef" element
     */
    void addEndPointRef(javax.xml.namespace.QName endPointRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "endPointRef" element
     */
    org.apache.xmlbeans.XmlQName insertNewEndPointRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "endPointRef" element
     */
    org.apache.xmlbeans.XmlQName addNewEndPointRef();
    
    /**
     * Removes the ith "endPointRef" element
     */
    void removeEndPointRef(int i);
    
    /**
     * Gets the "participantMultiplicity" element
     */
    org.omg.spec.bpmn.x20100524.model.TParticipantMultiplicity getParticipantMultiplicity();
    
    /**
     * True if has "participantMultiplicity" element
     */
    boolean isSetParticipantMultiplicity();
    
    /**
     * Sets the "participantMultiplicity" element
     */
    void setParticipantMultiplicity(org.omg.spec.bpmn.x20100524.model.TParticipantMultiplicity participantMultiplicity);
    
    /**
     * Appends and returns a new empty "participantMultiplicity" element
     */
    org.omg.spec.bpmn.x20100524.model.TParticipantMultiplicity addNewParticipantMultiplicity();
    
    /**
     * Unsets the "participantMultiplicity" element
     */
    void unsetParticipantMultiplicity();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "processRef" attribute
     */
    javax.xml.namespace.QName getProcessRef();
    
    /**
     * Gets (as xml) the "processRef" attribute
     */
    org.apache.xmlbeans.XmlQName xgetProcessRef();
    
    /**
     * True if has "processRef" attribute
     */
    boolean isSetProcessRef();
    
    /**
     * Sets the "processRef" attribute
     */
    void setProcessRef(javax.xml.namespace.QName processRef);
    
    /**
     * Sets (as xml) the "processRef" attribute
     */
    void xsetProcessRef(org.apache.xmlbeans.XmlQName processRef);
    
    /**
     * Unsets the "processRef" attribute
     */
    void unsetProcessRef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.spec.bpmn.x20100524.model.TParticipant newInstance() {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TParticipant newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.spec.bpmn.x20100524.model.TParticipant parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TParticipant parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.spec.bpmn.x20100524.model.TParticipant parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TParticipant parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TParticipant parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TParticipant parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TParticipant parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TParticipant parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TParticipant parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TParticipant parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TParticipant parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TParticipant parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TParticipant parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TParticipant parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TParticipant parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TParticipant parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TParticipant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

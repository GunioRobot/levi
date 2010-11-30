/*
 * XML Type:  tDataAssociation
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TDataAssociation
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model;


/**
 * An XML tDataAssociation(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public interface TDataAssociation extends org.omg.spec.bpmn.x20100524.model.TBaseElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TDataAssociation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s274511477EA18E924A610889C839BA0F").resolveHandle("tdataassociationc84ftype");
    
    /**
     * Gets array of all "sourceRef" elements
     */
    java.lang.String[] getSourceRefArray();
    
    /**
     * Gets ith "sourceRef" element
     */
    java.lang.String getSourceRefArray(int i);
    
    /**
     * Gets (as xml) array of all "sourceRef" elements
     */
    org.apache.xmlbeans.XmlIDREF[] xgetSourceRefArray();
    
    /**
     * Gets (as xml) ith "sourceRef" element
     */
    org.apache.xmlbeans.XmlIDREF xgetSourceRefArray(int i);
    
    /**
     * Returns number of "sourceRef" element
     */
    int sizeOfSourceRefArray();
    
    /**
     * Sets array of all "sourceRef" element
     */
    void setSourceRefArray(java.lang.String[] sourceRefArray);
    
    /**
     * Sets ith "sourceRef" element
     */
    void setSourceRefArray(int i, java.lang.String sourceRef);
    
    /**
     * Sets (as xml) array of all "sourceRef" element
     */
    void xsetSourceRefArray(org.apache.xmlbeans.XmlIDREF[] sourceRefArray);
    
    /**
     * Sets (as xml) ith "sourceRef" element
     */
    void xsetSourceRefArray(int i, org.apache.xmlbeans.XmlIDREF sourceRef);
    
    /**
     * Inserts the value as the ith "sourceRef" element
     */
    void insertSourceRef(int i, java.lang.String sourceRef);
    
    /**
     * Appends the value as the last "sourceRef" element
     */
    void addSourceRef(java.lang.String sourceRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sourceRef" element
     */
    org.apache.xmlbeans.XmlIDREF insertNewSourceRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sourceRef" element
     */
    org.apache.xmlbeans.XmlIDREF addNewSourceRef();
    
    /**
     * Removes the ith "sourceRef" element
     */
    void removeSourceRef(int i);
    
    /**
     * Gets the "targetRef" element
     */
    java.lang.String getTargetRef();
    
    /**
     * Gets (as xml) the "targetRef" element
     */
    org.apache.xmlbeans.XmlIDREF xgetTargetRef();
    
    /**
     * Sets the "targetRef" element
     */
    void setTargetRef(java.lang.String targetRef);
    
    /**
     * Sets (as xml) the "targetRef" element
     */
    void xsetTargetRef(org.apache.xmlbeans.XmlIDREF targetRef);
    
    /**
     * Gets the "transformation" element
     */
    org.omg.spec.bpmn.x20100524.model.TFormalExpression getTransformation();
    
    /**
     * True if has "transformation" element
     */
    boolean isSetTransformation();
    
    /**
     * Sets the "transformation" element
     */
    void setTransformation(org.omg.spec.bpmn.x20100524.model.TFormalExpression transformation);
    
    /**
     * Appends and returns a new empty "transformation" element
     */
    org.omg.spec.bpmn.x20100524.model.TFormalExpression addNewTransformation();
    
    /**
     * Unsets the "transformation" element
     */
    void unsetTransformation();
    
    /**
     * Gets array of all "assignment" elements
     */
    org.omg.spec.bpmn.x20100524.model.TAssignment[] getAssignmentArray();
    
    /**
     * Gets ith "assignment" element
     */
    org.omg.spec.bpmn.x20100524.model.TAssignment getAssignmentArray(int i);
    
    /**
     * Returns number of "assignment" element
     */
    int sizeOfAssignmentArray();
    
    /**
     * Sets array of all "assignment" element
     */
    void setAssignmentArray(org.omg.spec.bpmn.x20100524.model.TAssignment[] assignmentArray);
    
    /**
     * Sets ith "assignment" element
     */
    void setAssignmentArray(int i, org.omg.spec.bpmn.x20100524.model.TAssignment assignment);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "assignment" element
     */
    org.omg.spec.bpmn.x20100524.model.TAssignment insertNewAssignment(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "assignment" element
     */
    org.omg.spec.bpmn.x20100524.model.TAssignment addNewAssignment();
    
    /**
     * Removes the ith "assignment" element
     */
    void removeAssignment(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation newInstance() {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TDataAssociation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TDataAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

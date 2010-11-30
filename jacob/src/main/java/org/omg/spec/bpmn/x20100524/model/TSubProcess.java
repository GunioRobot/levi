/*
 * XML Type:  tSubProcess
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TSubProcess
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model;


/**
 * An XML tSubProcess(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public interface TSubProcess extends org.omg.spec.bpmn.x20100524.model.TActivity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TSubProcess.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s274511477EA18E924A610889C839BA0F").resolveHandle("tsubprocess411dtype");
    
    /**
     * Gets array of all "laneSet" elements
     */
    org.omg.spec.bpmn.x20100524.model.TLaneSet[] getLaneSetArray();
    
    /**
     * Gets ith "laneSet" element
     */
    org.omg.spec.bpmn.x20100524.model.TLaneSet getLaneSetArray(int i);
    
    /**
     * Returns number of "laneSet" element
     */
    int sizeOfLaneSetArray();
    
    /**
     * Sets array of all "laneSet" element
     */
    void setLaneSetArray(org.omg.spec.bpmn.x20100524.model.TLaneSet[] laneSetArray);
    
    /**
     * Sets ith "laneSet" element
     */
    void setLaneSetArray(int i, org.omg.spec.bpmn.x20100524.model.TLaneSet laneSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "laneSet" element
     */
    org.omg.spec.bpmn.x20100524.model.TLaneSet insertNewLaneSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "laneSet" element
     */
    org.omg.spec.bpmn.x20100524.model.TLaneSet addNewLaneSet();
    
    /**
     * Removes the ith "laneSet" element
     */
    void removeLaneSet(int i);
    
    /**
     * Gets array of all "flowElement" elements
     */
    org.omg.spec.bpmn.x20100524.model.TFlowElement[] getFlowElementArray();
    
    /**
     * Gets ith "flowElement" element
     */
    org.omg.spec.bpmn.x20100524.model.TFlowElement getFlowElementArray(int i);
    
    /**
     * Returns number of "flowElement" element
     */
    int sizeOfFlowElementArray();
    
    /**
     * Sets array of all "flowElement" element
     */
    void setFlowElementArray(org.omg.spec.bpmn.x20100524.model.TFlowElement[] flowElementArray);
    
    /**
     * Sets ith "flowElement" element
     */
    void setFlowElementArray(int i, org.omg.spec.bpmn.x20100524.model.TFlowElement flowElement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "flowElement" element
     */
    org.omg.spec.bpmn.x20100524.model.TFlowElement insertNewFlowElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "flowElement" element
     */
    org.omg.spec.bpmn.x20100524.model.TFlowElement addNewFlowElement();
    
    /**
     * Removes the ith "flowElement" element
     */
    void removeFlowElement(int i);
    
    /**
     * Gets array of all "artifact" elements
     */
    org.omg.spec.bpmn.x20100524.model.TArtifact[] getArtifactArray();
    
    /**
     * Gets ith "artifact" element
     */
    org.omg.spec.bpmn.x20100524.model.TArtifact getArtifactArray(int i);
    
    /**
     * Returns number of "artifact" element
     */
    int sizeOfArtifactArray();
    
    /**
     * Sets array of all "artifact" element
     */
    void setArtifactArray(org.omg.spec.bpmn.x20100524.model.TArtifact[] artifactArray);
    
    /**
     * Sets ith "artifact" element
     */
    void setArtifactArray(int i, org.omg.spec.bpmn.x20100524.model.TArtifact artifact);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "artifact" element
     */
    org.omg.spec.bpmn.x20100524.model.TArtifact insertNewArtifact(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "artifact" element
     */
    org.omg.spec.bpmn.x20100524.model.TArtifact addNewArtifact();
    
    /**
     * Removes the ith "artifact" element
     */
    void removeArtifact(int i);
    
    /**
     * Gets the "triggeredByEvent" attribute
     */
    boolean getTriggeredByEvent();
    
    /**
     * Gets (as xml) the "triggeredByEvent" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetTriggeredByEvent();
    
    /**
     * True if has "triggeredByEvent" attribute
     */
    boolean isSetTriggeredByEvent();
    
    /**
     * Sets the "triggeredByEvent" attribute
     */
    void setTriggeredByEvent(boolean triggeredByEvent);
    
    /**
     * Sets (as xml) the "triggeredByEvent" attribute
     */
    void xsetTriggeredByEvent(org.apache.xmlbeans.XmlBoolean triggeredByEvent);
    
    /**
     * Unsets the "triggeredByEvent" attribute
     */
    void unsetTriggeredByEvent();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess newInstance() {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TSubProcess parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TSubProcess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

/*
 * XML Type:  BPMNShape
 * Namespace: http://www.omg.org/spec/BPMN/20100524/DI
 * Java type: org.omg.spec.bpmn.x20100524.di.BPMNShape
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.di;


/**
 * An XML BPMNShape(@http://www.omg.org/spec/BPMN/20100524/DI).
 *
 * This is a complex type.
 */
public interface BPMNShape extends org.omg.spec.dd.x20100524.di.LabeledShape
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BPMNShape.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s274511477EA18E924A610889C839BA0F").resolveHandle("bpmnshape3342type");
    
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
     * Gets the "isHorizontal" attribute
     */
    boolean getIsHorizontal();
    
    /**
     * Gets (as xml) the "isHorizontal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsHorizontal();
    
    /**
     * True if has "isHorizontal" attribute
     */
    boolean isSetIsHorizontal();
    
    /**
     * Sets the "isHorizontal" attribute
     */
    void setIsHorizontal(boolean isHorizontal);
    
    /**
     * Sets (as xml) the "isHorizontal" attribute
     */
    void xsetIsHorizontal(org.apache.xmlbeans.XmlBoolean isHorizontal);
    
    /**
     * Unsets the "isHorizontal" attribute
     */
    void unsetIsHorizontal();
    
    /**
     * Gets the "isExpanded" attribute
     */
    boolean getIsExpanded();
    
    /**
     * Gets (as xml) the "isExpanded" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsExpanded();
    
    /**
     * True if has "isExpanded" attribute
     */
    boolean isSetIsExpanded();
    
    /**
     * Sets the "isExpanded" attribute
     */
    void setIsExpanded(boolean isExpanded);
    
    /**
     * Sets (as xml) the "isExpanded" attribute
     */
    void xsetIsExpanded(org.apache.xmlbeans.XmlBoolean isExpanded);
    
    /**
     * Unsets the "isExpanded" attribute
     */
    void unsetIsExpanded();
    
    /**
     * Gets the "isMarkerVisible" attribute
     */
    boolean getIsMarkerVisible();
    
    /**
     * Gets (as xml) the "isMarkerVisible" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsMarkerVisible();
    
    /**
     * True if has "isMarkerVisible" attribute
     */
    boolean isSetIsMarkerVisible();
    
    /**
     * Sets the "isMarkerVisible" attribute
     */
    void setIsMarkerVisible(boolean isMarkerVisible);
    
    /**
     * Sets (as xml) the "isMarkerVisible" attribute
     */
    void xsetIsMarkerVisible(org.apache.xmlbeans.XmlBoolean isMarkerVisible);
    
    /**
     * Unsets the "isMarkerVisible" attribute
     */
    void unsetIsMarkerVisible();
    
    /**
     * Gets the "isMessageVisible" attribute
     */
    boolean getIsMessageVisible();
    
    /**
     * Gets (as xml) the "isMessageVisible" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsMessageVisible();
    
    /**
     * True if has "isMessageVisible" attribute
     */
    boolean isSetIsMessageVisible();
    
    /**
     * Sets the "isMessageVisible" attribute
     */
    void setIsMessageVisible(boolean isMessageVisible);
    
    /**
     * Sets (as xml) the "isMessageVisible" attribute
     */
    void xsetIsMessageVisible(org.apache.xmlbeans.XmlBoolean isMessageVisible);
    
    /**
     * Unsets the "isMessageVisible" attribute
     */
    void unsetIsMessageVisible();
    
    /**
     * Gets the "participantBandKind" attribute
     */
    org.omg.spec.bpmn.x20100524.di.ParticipantBandKind.Enum getParticipantBandKind();
    
    /**
     * Gets (as xml) the "participantBandKind" attribute
     */
    org.omg.spec.bpmn.x20100524.di.ParticipantBandKind xgetParticipantBandKind();
    
    /**
     * True if has "participantBandKind" attribute
     */
    boolean isSetParticipantBandKind();
    
    /**
     * Sets the "participantBandKind" attribute
     */
    void setParticipantBandKind(org.omg.spec.bpmn.x20100524.di.ParticipantBandKind.Enum participantBandKind);
    
    /**
     * Sets (as xml) the "participantBandKind" attribute
     */
    void xsetParticipantBandKind(org.omg.spec.bpmn.x20100524.di.ParticipantBandKind participantBandKind);
    
    /**
     * Unsets the "participantBandKind" attribute
     */
    void unsetParticipantBandKind();
    
    /**
     * Gets the "choreographyActivityShape" attribute
     */
    javax.xml.namespace.QName getChoreographyActivityShape();
    
    /**
     * Gets (as xml) the "choreographyActivityShape" attribute
     */
    org.apache.xmlbeans.XmlQName xgetChoreographyActivityShape();
    
    /**
     * True if has "choreographyActivityShape" attribute
     */
    boolean isSetChoreographyActivityShape();
    
    /**
     * Sets the "choreographyActivityShape" attribute
     */
    void setChoreographyActivityShape(javax.xml.namespace.QName choreographyActivityShape);
    
    /**
     * Sets (as xml) the "choreographyActivityShape" attribute
     */
    void xsetChoreographyActivityShape(org.apache.xmlbeans.XmlQName choreographyActivityShape);
    
    /**
     * Unsets the "choreographyActivityShape" attribute
     */
    void unsetChoreographyActivityShape();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape newInstance() {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.di.BPMNShape parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.di.BPMNShape) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

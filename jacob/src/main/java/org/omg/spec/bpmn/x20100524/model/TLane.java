/*
 * XML Type:  tLane
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TLane
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model;


/**
 * An XML tLane(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public interface TLane extends org.omg.spec.bpmn.x20100524.model.TBaseElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TLane.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s274511477EA18E924A610889C839BA0F").resolveHandle("tlane2fbatype");
    
    /**
     * Gets the "partitionElement" element
     */
    org.omg.spec.bpmn.x20100524.model.TBaseElement getPartitionElement();
    
    /**
     * True if has "partitionElement" element
     */
    boolean isSetPartitionElement();
    
    /**
     * Sets the "partitionElement" element
     */
    void setPartitionElement(org.omg.spec.bpmn.x20100524.model.TBaseElement partitionElement);
    
    /**
     * Appends and returns a new empty "partitionElement" element
     */
    org.omg.spec.bpmn.x20100524.model.TBaseElement addNewPartitionElement();
    
    /**
     * Unsets the "partitionElement" element
     */
    void unsetPartitionElement();
    
    /**
     * Gets array of all "flowNodeRef" elements
     */
    java.lang.String[] getFlowNodeRefArray();
    
    /**
     * Gets ith "flowNodeRef" element
     */
    java.lang.String getFlowNodeRefArray(int i);
    
    /**
     * Gets (as xml) array of all "flowNodeRef" elements
     */
    org.apache.xmlbeans.XmlIDREF[] xgetFlowNodeRefArray();
    
    /**
     * Gets (as xml) ith "flowNodeRef" element
     */
    org.apache.xmlbeans.XmlIDREF xgetFlowNodeRefArray(int i);
    
    /**
     * Returns number of "flowNodeRef" element
     */
    int sizeOfFlowNodeRefArray();
    
    /**
     * Sets array of all "flowNodeRef" element
     */
    void setFlowNodeRefArray(java.lang.String[] flowNodeRefArray);
    
    /**
     * Sets ith "flowNodeRef" element
     */
    void setFlowNodeRefArray(int i, java.lang.String flowNodeRef);
    
    /**
     * Sets (as xml) array of all "flowNodeRef" element
     */
    void xsetFlowNodeRefArray(org.apache.xmlbeans.XmlIDREF[] flowNodeRefArray);
    
    /**
     * Sets (as xml) ith "flowNodeRef" element
     */
    void xsetFlowNodeRefArray(int i, org.apache.xmlbeans.XmlIDREF flowNodeRef);
    
    /**
     * Inserts the value as the ith "flowNodeRef" element
     */
    void insertFlowNodeRef(int i, java.lang.String flowNodeRef);
    
    /**
     * Appends the value as the last "flowNodeRef" element
     */
    void addFlowNodeRef(java.lang.String flowNodeRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "flowNodeRef" element
     */
    org.apache.xmlbeans.XmlIDREF insertNewFlowNodeRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "flowNodeRef" element
     */
    org.apache.xmlbeans.XmlIDREF addNewFlowNodeRef();
    
    /**
     * Removes the ith "flowNodeRef" element
     */
    void removeFlowNodeRef(int i);
    
    /**
     * Gets the "childLaneSet" element
     */
    org.omg.spec.bpmn.x20100524.model.TLaneSet getChildLaneSet();
    
    /**
     * True if has "childLaneSet" element
     */
    boolean isSetChildLaneSet();
    
    /**
     * Sets the "childLaneSet" element
     */
    void setChildLaneSet(org.omg.spec.bpmn.x20100524.model.TLaneSet childLaneSet);
    
    /**
     * Appends and returns a new empty "childLaneSet" element
     */
    org.omg.spec.bpmn.x20100524.model.TLaneSet addNewChildLaneSet();
    
    /**
     * Unsets the "childLaneSet" element
     */
    void unsetChildLaneSet();
    
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
     * Gets the "partitionElementRef" attribute
     */
    javax.xml.namespace.QName getPartitionElementRef();
    
    /**
     * Gets (as xml) the "partitionElementRef" attribute
     */
    org.apache.xmlbeans.XmlQName xgetPartitionElementRef();
    
    /**
     * True if has "partitionElementRef" attribute
     */
    boolean isSetPartitionElementRef();
    
    /**
     * Sets the "partitionElementRef" attribute
     */
    void setPartitionElementRef(javax.xml.namespace.QName partitionElementRef);
    
    /**
     * Sets (as xml) the "partitionElementRef" attribute
     */
    void xsetPartitionElementRef(org.apache.xmlbeans.XmlQName partitionElementRef);
    
    /**
     * Unsets the "partitionElementRef" attribute
     */
    void unsetPartitionElementRef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.spec.bpmn.x20100524.model.TLane newInstance() {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TLane newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.spec.bpmn.x20100524.model.TLane parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TLane parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.spec.bpmn.x20100524.model.TLane parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TLane parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TLane parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TLane parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TLane parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TLane parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TLane parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TLane parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TLane parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TLane parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TLane parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TLane parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TLane parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TLane parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TLane) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

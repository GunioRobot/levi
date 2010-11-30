/*
 * XML Type:  tThrowEvent
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TThrowEvent
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model;


/**
 * An XML tThrowEvent(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public interface TThrowEvent extends org.omg.spec.bpmn.x20100524.model.TEvent
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TThrowEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s274511477EA18E924A610889C839BA0F").resolveHandle("tthroweventf8e2type");
    
    /**
     * Gets array of all "dataInput" elements
     */
    org.omg.spec.bpmn.x20100524.model.TDataInput[] getDataInputArray();
    
    /**
     * Gets ith "dataInput" element
     */
    org.omg.spec.bpmn.x20100524.model.TDataInput getDataInputArray(int i);
    
    /**
     * Returns number of "dataInput" element
     */
    int sizeOfDataInputArray();
    
    /**
     * Sets array of all "dataInput" element
     */
    void setDataInputArray(org.omg.spec.bpmn.x20100524.model.TDataInput[] dataInputArray);
    
    /**
     * Sets ith "dataInput" element
     */
    void setDataInputArray(int i, org.omg.spec.bpmn.x20100524.model.TDataInput dataInput);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataInput" element
     */
    org.omg.spec.bpmn.x20100524.model.TDataInput insertNewDataInput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataInput" element
     */
    org.omg.spec.bpmn.x20100524.model.TDataInput addNewDataInput();
    
    /**
     * Removes the ith "dataInput" element
     */
    void removeDataInput(int i);
    
    /**
     * Gets array of all "dataInputAssociation" elements
     */
    org.omg.spec.bpmn.x20100524.model.TDataInputAssociation[] getDataInputAssociationArray();
    
    /**
     * Gets ith "dataInputAssociation" element
     */
    org.omg.spec.bpmn.x20100524.model.TDataInputAssociation getDataInputAssociationArray(int i);
    
    /**
     * Returns number of "dataInputAssociation" element
     */
    int sizeOfDataInputAssociationArray();
    
    /**
     * Sets array of all "dataInputAssociation" element
     */
    void setDataInputAssociationArray(org.omg.spec.bpmn.x20100524.model.TDataInputAssociation[] dataInputAssociationArray);
    
    /**
     * Sets ith "dataInputAssociation" element
     */
    void setDataInputAssociationArray(int i, org.omg.spec.bpmn.x20100524.model.TDataInputAssociation dataInputAssociation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataInputAssociation" element
     */
    org.omg.spec.bpmn.x20100524.model.TDataInputAssociation insertNewDataInputAssociation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataInputAssociation" element
     */
    org.omg.spec.bpmn.x20100524.model.TDataInputAssociation addNewDataInputAssociation();
    
    /**
     * Removes the ith "dataInputAssociation" element
     */
    void removeDataInputAssociation(int i);
    
    /**
     * Gets the "inputSet" element
     */
    org.omg.spec.bpmn.x20100524.model.TInputSet getInputSet();
    
    /**
     * True if has "inputSet" element
     */
    boolean isSetInputSet();
    
    /**
     * Sets the "inputSet" element
     */
    void setInputSet(org.omg.spec.bpmn.x20100524.model.TInputSet inputSet);
    
    /**
     * Appends and returns a new empty "inputSet" element
     */
    org.omg.spec.bpmn.x20100524.model.TInputSet addNewInputSet();
    
    /**
     * Unsets the "inputSet" element
     */
    void unsetInputSet();
    
    /**
     * Gets array of all "eventDefinition" elements
     */
    org.omg.spec.bpmn.x20100524.model.TEventDefinition[] getEventDefinitionArray();
    
    /**
     * Gets ith "eventDefinition" element
     */
    org.omg.spec.bpmn.x20100524.model.TEventDefinition getEventDefinitionArray(int i);
    
    /**
     * Returns number of "eventDefinition" element
     */
    int sizeOfEventDefinitionArray();
    
    /**
     * Sets array of all "eventDefinition" element
     */
    void setEventDefinitionArray(org.omg.spec.bpmn.x20100524.model.TEventDefinition[] eventDefinitionArray);
    
    /**
     * Sets ith "eventDefinition" element
     */
    void setEventDefinitionArray(int i, org.omg.spec.bpmn.x20100524.model.TEventDefinition eventDefinition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventDefinition" element
     */
    org.omg.spec.bpmn.x20100524.model.TEventDefinition insertNewEventDefinition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventDefinition" element
     */
    org.omg.spec.bpmn.x20100524.model.TEventDefinition addNewEventDefinition();
    
    /**
     * Removes the ith "eventDefinition" element
     */
    void removeEventDefinition(int i);
    
    /**
     * Gets array of all "eventDefinitionRef" elements
     */
    javax.xml.namespace.QName[] getEventDefinitionRefArray();
    
    /**
     * Gets ith "eventDefinitionRef" element
     */
    javax.xml.namespace.QName getEventDefinitionRefArray(int i);
    
    /**
     * Gets (as xml) array of all "eventDefinitionRef" elements
     */
    org.apache.xmlbeans.XmlQName[] xgetEventDefinitionRefArray();
    
    /**
     * Gets (as xml) ith "eventDefinitionRef" element
     */
    org.apache.xmlbeans.XmlQName xgetEventDefinitionRefArray(int i);
    
    /**
     * Returns number of "eventDefinitionRef" element
     */
    int sizeOfEventDefinitionRefArray();
    
    /**
     * Sets array of all "eventDefinitionRef" element
     */
    void setEventDefinitionRefArray(javax.xml.namespace.QName[] eventDefinitionRefArray);
    
    /**
     * Sets ith "eventDefinitionRef" element
     */
    void setEventDefinitionRefArray(int i, javax.xml.namespace.QName eventDefinitionRef);
    
    /**
     * Sets (as xml) array of all "eventDefinitionRef" element
     */
    void xsetEventDefinitionRefArray(org.apache.xmlbeans.XmlQName[] eventDefinitionRefArray);
    
    /**
     * Sets (as xml) ith "eventDefinitionRef" element
     */
    void xsetEventDefinitionRefArray(int i, org.apache.xmlbeans.XmlQName eventDefinitionRef);
    
    /**
     * Inserts the value as the ith "eventDefinitionRef" element
     */
    void insertEventDefinitionRef(int i, javax.xml.namespace.QName eventDefinitionRef);
    
    /**
     * Appends the value as the last "eventDefinitionRef" element
     */
    void addEventDefinitionRef(javax.xml.namespace.QName eventDefinitionRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventDefinitionRef" element
     */
    org.apache.xmlbeans.XmlQName insertNewEventDefinitionRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventDefinitionRef" element
     */
    org.apache.xmlbeans.XmlQName addNewEventDefinitionRef();
    
    /**
     * Removes the ith "eventDefinitionRef" element
     */
    void removeEventDefinitionRef(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent newInstance() {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TThrowEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TThrowEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

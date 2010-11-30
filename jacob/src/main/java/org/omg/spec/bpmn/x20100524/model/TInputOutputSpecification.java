/*
 * XML Type:  tInputOutputSpecification
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model;


/**
 * An XML tInputOutputSpecification(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public interface TInputOutputSpecification extends org.omg.spec.bpmn.x20100524.model.TBaseElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TInputOutputSpecification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s274511477EA18E924A610889C839BA0F").resolveHandle("tinputoutputspecification91a6type");
    
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
     * Gets array of all "dataOutput" elements
     */
    org.omg.spec.bpmn.x20100524.model.TDataOutput[] getDataOutputArray();
    
    /**
     * Gets ith "dataOutput" element
     */
    org.omg.spec.bpmn.x20100524.model.TDataOutput getDataOutputArray(int i);
    
    /**
     * Returns number of "dataOutput" element
     */
    int sizeOfDataOutputArray();
    
    /**
     * Sets array of all "dataOutput" element
     */
    void setDataOutputArray(org.omg.spec.bpmn.x20100524.model.TDataOutput[] dataOutputArray);
    
    /**
     * Sets ith "dataOutput" element
     */
    void setDataOutputArray(int i, org.omg.spec.bpmn.x20100524.model.TDataOutput dataOutput);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataOutput" element
     */
    org.omg.spec.bpmn.x20100524.model.TDataOutput insertNewDataOutput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataOutput" element
     */
    org.omg.spec.bpmn.x20100524.model.TDataOutput addNewDataOutput();
    
    /**
     * Removes the ith "dataOutput" element
     */
    void removeDataOutput(int i);
    
    /**
     * Gets array of all "inputSet" elements
     */
    org.omg.spec.bpmn.x20100524.model.TInputSet[] getInputSetArray();
    
    /**
     * Gets ith "inputSet" element
     */
    org.omg.spec.bpmn.x20100524.model.TInputSet getInputSetArray(int i);
    
    /**
     * Returns number of "inputSet" element
     */
    int sizeOfInputSetArray();
    
    /**
     * Sets array of all "inputSet" element
     */
    void setInputSetArray(org.omg.spec.bpmn.x20100524.model.TInputSet[] inputSetArray);
    
    /**
     * Sets ith "inputSet" element
     */
    void setInputSetArray(int i, org.omg.spec.bpmn.x20100524.model.TInputSet inputSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "inputSet" element
     */
    org.omg.spec.bpmn.x20100524.model.TInputSet insertNewInputSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "inputSet" element
     */
    org.omg.spec.bpmn.x20100524.model.TInputSet addNewInputSet();
    
    /**
     * Removes the ith "inputSet" element
     */
    void removeInputSet(int i);
    
    /**
     * Gets array of all "outputSet" elements
     */
    org.omg.spec.bpmn.x20100524.model.TOutputSet[] getOutputSetArray();
    
    /**
     * Gets ith "outputSet" element
     */
    org.omg.spec.bpmn.x20100524.model.TOutputSet getOutputSetArray(int i);
    
    /**
     * Returns number of "outputSet" element
     */
    int sizeOfOutputSetArray();
    
    /**
     * Sets array of all "outputSet" element
     */
    void setOutputSetArray(org.omg.spec.bpmn.x20100524.model.TOutputSet[] outputSetArray);
    
    /**
     * Sets ith "outputSet" element
     */
    void setOutputSetArray(int i, org.omg.spec.bpmn.x20100524.model.TOutputSet outputSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "outputSet" element
     */
    org.omg.spec.bpmn.x20100524.model.TOutputSet insertNewOutputSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "outputSet" element
     */
    org.omg.spec.bpmn.x20100524.model.TOutputSet addNewOutputSet();
    
    /**
     * Removes the ith "outputSet" element
     */
    void removeOutputSet(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification newInstance() {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TInputOutputSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

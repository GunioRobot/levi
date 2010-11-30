/*
 * XML Type:  tMultiInstanceLoopCharacteristics
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model;


/**
 * An XML tMultiInstanceLoopCharacteristics(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public interface TMultiInstanceLoopCharacteristics extends org.omg.spec.bpmn.x20100524.model.TLoopCharacteristics
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TMultiInstanceLoopCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s274511477EA18E924A610889C839BA0F").resolveHandle("tmultiinstanceloopcharacteristicsb774type");
    
    /**
     * Gets the "loopCardinality" element
     */
    org.omg.spec.bpmn.x20100524.model.TExpression getLoopCardinality();
    
    /**
     * True if has "loopCardinality" element
     */
    boolean isSetLoopCardinality();
    
    /**
     * Sets the "loopCardinality" element
     */
    void setLoopCardinality(org.omg.spec.bpmn.x20100524.model.TExpression loopCardinality);
    
    /**
     * Appends and returns a new empty "loopCardinality" element
     */
    org.omg.spec.bpmn.x20100524.model.TExpression addNewLoopCardinality();
    
    /**
     * Unsets the "loopCardinality" element
     */
    void unsetLoopCardinality();
    
    /**
     * Gets the "loopDataInputRef" element
     */
    javax.xml.namespace.QName getLoopDataInputRef();
    
    /**
     * Gets (as xml) the "loopDataInputRef" element
     */
    org.apache.xmlbeans.XmlQName xgetLoopDataInputRef();
    
    /**
     * True if has "loopDataInputRef" element
     */
    boolean isSetLoopDataInputRef();
    
    /**
     * Sets the "loopDataInputRef" element
     */
    void setLoopDataInputRef(javax.xml.namespace.QName loopDataInputRef);
    
    /**
     * Sets (as xml) the "loopDataInputRef" element
     */
    void xsetLoopDataInputRef(org.apache.xmlbeans.XmlQName loopDataInputRef);
    
    /**
     * Unsets the "loopDataInputRef" element
     */
    void unsetLoopDataInputRef();
    
    /**
     * Gets the "loopDataOutputRef" element
     */
    javax.xml.namespace.QName getLoopDataOutputRef();
    
    /**
     * Gets (as xml) the "loopDataOutputRef" element
     */
    org.apache.xmlbeans.XmlQName xgetLoopDataOutputRef();
    
    /**
     * True if has "loopDataOutputRef" element
     */
    boolean isSetLoopDataOutputRef();
    
    /**
     * Sets the "loopDataOutputRef" element
     */
    void setLoopDataOutputRef(javax.xml.namespace.QName loopDataOutputRef);
    
    /**
     * Sets (as xml) the "loopDataOutputRef" element
     */
    void xsetLoopDataOutputRef(org.apache.xmlbeans.XmlQName loopDataOutputRef);
    
    /**
     * Unsets the "loopDataOutputRef" element
     */
    void unsetLoopDataOutputRef();
    
    /**
     * Gets the "inputDataItem" element
     */
    org.omg.spec.bpmn.x20100524.model.TDataInput getInputDataItem();
    
    /**
     * True if has "inputDataItem" element
     */
    boolean isSetInputDataItem();
    
    /**
     * Sets the "inputDataItem" element
     */
    void setInputDataItem(org.omg.spec.bpmn.x20100524.model.TDataInput inputDataItem);
    
    /**
     * Appends and returns a new empty "inputDataItem" element
     */
    org.omg.spec.bpmn.x20100524.model.TDataInput addNewInputDataItem();
    
    /**
     * Unsets the "inputDataItem" element
     */
    void unsetInputDataItem();
    
    /**
     * Gets the "outputDataItem" element
     */
    org.omg.spec.bpmn.x20100524.model.TDataOutput getOutputDataItem();
    
    /**
     * True if has "outputDataItem" element
     */
    boolean isSetOutputDataItem();
    
    /**
     * Sets the "outputDataItem" element
     */
    void setOutputDataItem(org.omg.spec.bpmn.x20100524.model.TDataOutput outputDataItem);
    
    /**
     * Appends and returns a new empty "outputDataItem" element
     */
    org.omg.spec.bpmn.x20100524.model.TDataOutput addNewOutputDataItem();
    
    /**
     * Unsets the "outputDataItem" element
     */
    void unsetOutputDataItem();
    
    /**
     * Gets array of all "complexBehaviorDefinition" elements
     */
    org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition[] getComplexBehaviorDefinitionArray();
    
    /**
     * Gets ith "complexBehaviorDefinition" element
     */
    org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition getComplexBehaviorDefinitionArray(int i);
    
    /**
     * Returns number of "complexBehaviorDefinition" element
     */
    int sizeOfComplexBehaviorDefinitionArray();
    
    /**
     * Sets array of all "complexBehaviorDefinition" element
     */
    void setComplexBehaviorDefinitionArray(org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition[] complexBehaviorDefinitionArray);
    
    /**
     * Sets ith "complexBehaviorDefinition" element
     */
    void setComplexBehaviorDefinitionArray(int i, org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition complexBehaviorDefinition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "complexBehaviorDefinition" element
     */
    org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition insertNewComplexBehaviorDefinition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "complexBehaviorDefinition" element
     */
    org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition addNewComplexBehaviorDefinition();
    
    /**
     * Removes the ith "complexBehaviorDefinition" element
     */
    void removeComplexBehaviorDefinition(int i);
    
    /**
     * Gets the "completionCondition" element
     */
    org.omg.spec.bpmn.x20100524.model.TExpression getCompletionCondition();
    
    /**
     * True if has "completionCondition" element
     */
    boolean isSetCompletionCondition();
    
    /**
     * Sets the "completionCondition" element
     */
    void setCompletionCondition(org.omg.spec.bpmn.x20100524.model.TExpression completionCondition);
    
    /**
     * Appends and returns a new empty "completionCondition" element
     */
    org.omg.spec.bpmn.x20100524.model.TExpression addNewCompletionCondition();
    
    /**
     * Unsets the "completionCondition" element
     */
    void unsetCompletionCondition();
    
    /**
     * Gets the "isSequential" attribute
     */
    boolean getIsSequential();
    
    /**
     * Gets (as xml) the "isSequential" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsSequential();
    
    /**
     * True if has "isSequential" attribute
     */
    boolean isSetIsSequential();
    
    /**
     * Sets the "isSequential" attribute
     */
    void setIsSequential(boolean isSequential);
    
    /**
     * Sets (as xml) the "isSequential" attribute
     */
    void xsetIsSequential(org.apache.xmlbeans.XmlBoolean isSequential);
    
    /**
     * Unsets the "isSequential" attribute
     */
    void unsetIsSequential();
    
    /**
     * Gets the "behavior" attribute
     */
    org.omg.spec.bpmn.x20100524.model.TMultiInstanceFlowCondition.Enum getBehavior();
    
    /**
     * Gets (as xml) the "behavior" attribute
     */
    org.omg.spec.bpmn.x20100524.model.TMultiInstanceFlowCondition xgetBehavior();
    
    /**
     * True if has "behavior" attribute
     */
    boolean isSetBehavior();
    
    /**
     * Sets the "behavior" attribute
     */
    void setBehavior(org.omg.spec.bpmn.x20100524.model.TMultiInstanceFlowCondition.Enum behavior);
    
    /**
     * Sets (as xml) the "behavior" attribute
     */
    void xsetBehavior(org.omg.spec.bpmn.x20100524.model.TMultiInstanceFlowCondition behavior);
    
    /**
     * Unsets the "behavior" attribute
     */
    void unsetBehavior();
    
    /**
     * Gets the "oneBehaviorEventRef" attribute
     */
    javax.xml.namespace.QName getOneBehaviorEventRef();
    
    /**
     * Gets (as xml) the "oneBehaviorEventRef" attribute
     */
    org.apache.xmlbeans.XmlQName xgetOneBehaviorEventRef();
    
    /**
     * True if has "oneBehaviorEventRef" attribute
     */
    boolean isSetOneBehaviorEventRef();
    
    /**
     * Sets the "oneBehaviorEventRef" attribute
     */
    void setOneBehaviorEventRef(javax.xml.namespace.QName oneBehaviorEventRef);
    
    /**
     * Sets (as xml) the "oneBehaviorEventRef" attribute
     */
    void xsetOneBehaviorEventRef(org.apache.xmlbeans.XmlQName oneBehaviorEventRef);
    
    /**
     * Unsets the "oneBehaviorEventRef" attribute
     */
    void unsetOneBehaviorEventRef();
    
    /**
     * Gets the "noneBehaviorEventRef" attribute
     */
    javax.xml.namespace.QName getNoneBehaviorEventRef();
    
    /**
     * Gets (as xml) the "noneBehaviorEventRef" attribute
     */
    org.apache.xmlbeans.XmlQName xgetNoneBehaviorEventRef();
    
    /**
     * True if has "noneBehaviorEventRef" attribute
     */
    boolean isSetNoneBehaviorEventRef();
    
    /**
     * Sets the "noneBehaviorEventRef" attribute
     */
    void setNoneBehaviorEventRef(javax.xml.namespace.QName noneBehaviorEventRef);
    
    /**
     * Sets (as xml) the "noneBehaviorEventRef" attribute
     */
    void xsetNoneBehaviorEventRef(org.apache.xmlbeans.XmlQName noneBehaviorEventRef);
    
    /**
     * Unsets the "noneBehaviorEventRef" attribute
     */
    void unsetNoneBehaviorEventRef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics newInstance() {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

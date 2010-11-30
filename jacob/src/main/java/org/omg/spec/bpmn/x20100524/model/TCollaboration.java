/*
 * XML Type:  tCollaboration
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TCollaboration
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model;


/**
 * An XML tCollaboration(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public interface TCollaboration extends org.omg.spec.bpmn.x20100524.model.TRootElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TCollaboration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s274511477EA18E924A610889C839BA0F").resolveHandle("tcollaboration305dtype");
    
    /**
     * Gets array of all "participant" elements
     */
    org.omg.spec.bpmn.x20100524.model.TParticipant[] getParticipantArray();
    
    /**
     * Gets ith "participant" element
     */
    org.omg.spec.bpmn.x20100524.model.TParticipant getParticipantArray(int i);
    
    /**
     * Returns number of "participant" element
     */
    int sizeOfParticipantArray();
    
    /**
     * Sets array of all "participant" element
     */
    void setParticipantArray(org.omg.spec.bpmn.x20100524.model.TParticipant[] participantArray);
    
    /**
     * Sets ith "participant" element
     */
    void setParticipantArray(int i, org.omg.spec.bpmn.x20100524.model.TParticipant participant);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    org.omg.spec.bpmn.x20100524.model.TParticipant insertNewParticipant(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    org.omg.spec.bpmn.x20100524.model.TParticipant addNewParticipant();
    
    /**
     * Removes the ith "participant" element
     */
    void removeParticipant(int i);
    
    /**
     * Gets array of all "messageFlow" elements
     */
    org.omg.spec.bpmn.x20100524.model.TMessageFlow[] getMessageFlowArray();
    
    /**
     * Gets ith "messageFlow" element
     */
    org.omg.spec.bpmn.x20100524.model.TMessageFlow getMessageFlowArray(int i);
    
    /**
     * Returns number of "messageFlow" element
     */
    int sizeOfMessageFlowArray();
    
    /**
     * Sets array of all "messageFlow" element
     */
    void setMessageFlowArray(org.omg.spec.bpmn.x20100524.model.TMessageFlow[] messageFlowArray);
    
    /**
     * Sets ith "messageFlow" element
     */
    void setMessageFlowArray(int i, org.omg.spec.bpmn.x20100524.model.TMessageFlow messageFlow);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageFlow" element
     */
    org.omg.spec.bpmn.x20100524.model.TMessageFlow insertNewMessageFlow(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageFlow" element
     */
    org.omg.spec.bpmn.x20100524.model.TMessageFlow addNewMessageFlow();
    
    /**
     * Removes the ith "messageFlow" element
     */
    void removeMessageFlow(int i);
    
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
     * Gets array of all "conversationNode" elements
     */
    org.omg.spec.bpmn.x20100524.model.TConversationNode[] getConversationNodeArray();
    
    /**
     * Gets ith "conversationNode" element
     */
    org.omg.spec.bpmn.x20100524.model.TConversationNode getConversationNodeArray(int i);
    
    /**
     * Returns number of "conversationNode" element
     */
    int sizeOfConversationNodeArray();
    
    /**
     * Sets array of all "conversationNode" element
     */
    void setConversationNodeArray(org.omg.spec.bpmn.x20100524.model.TConversationNode[] conversationNodeArray);
    
    /**
     * Sets ith "conversationNode" element
     */
    void setConversationNodeArray(int i, org.omg.spec.bpmn.x20100524.model.TConversationNode conversationNode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conversationNode" element
     */
    org.omg.spec.bpmn.x20100524.model.TConversationNode insertNewConversationNode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conversationNode" element
     */
    org.omg.spec.bpmn.x20100524.model.TConversationNode addNewConversationNode();
    
    /**
     * Removes the ith "conversationNode" element
     */
    void removeConversationNode(int i);
    
    /**
     * Gets array of all "conversationAssociation" elements
     */
    org.omg.spec.bpmn.x20100524.model.TConversationAssociation[] getConversationAssociationArray();
    
    /**
     * Gets ith "conversationAssociation" element
     */
    org.omg.spec.bpmn.x20100524.model.TConversationAssociation getConversationAssociationArray(int i);
    
    /**
     * Returns number of "conversationAssociation" element
     */
    int sizeOfConversationAssociationArray();
    
    /**
     * Sets array of all "conversationAssociation" element
     */
    void setConversationAssociationArray(org.omg.spec.bpmn.x20100524.model.TConversationAssociation[] conversationAssociationArray);
    
    /**
     * Sets ith "conversationAssociation" element
     */
    void setConversationAssociationArray(int i, org.omg.spec.bpmn.x20100524.model.TConversationAssociation conversationAssociation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conversationAssociation" element
     */
    org.omg.spec.bpmn.x20100524.model.TConversationAssociation insertNewConversationAssociation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conversationAssociation" element
     */
    org.omg.spec.bpmn.x20100524.model.TConversationAssociation addNewConversationAssociation();
    
    /**
     * Removes the ith "conversationAssociation" element
     */
    void removeConversationAssociation(int i);
    
    /**
     * Gets array of all "participantAssociation" elements
     */
    org.omg.spec.bpmn.x20100524.model.TParticipantAssociation[] getParticipantAssociationArray();
    
    /**
     * Gets ith "participantAssociation" element
     */
    org.omg.spec.bpmn.x20100524.model.TParticipantAssociation getParticipantAssociationArray(int i);
    
    /**
     * Returns number of "participantAssociation" element
     */
    int sizeOfParticipantAssociationArray();
    
    /**
     * Sets array of all "participantAssociation" element
     */
    void setParticipantAssociationArray(org.omg.spec.bpmn.x20100524.model.TParticipantAssociation[] participantAssociationArray);
    
    /**
     * Sets ith "participantAssociation" element
     */
    void setParticipantAssociationArray(int i, org.omg.spec.bpmn.x20100524.model.TParticipantAssociation participantAssociation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participantAssociation" element
     */
    org.omg.spec.bpmn.x20100524.model.TParticipantAssociation insertNewParticipantAssociation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participantAssociation" element
     */
    org.omg.spec.bpmn.x20100524.model.TParticipantAssociation addNewParticipantAssociation();
    
    /**
     * Removes the ith "participantAssociation" element
     */
    void removeParticipantAssociation(int i);
    
    /**
     * Gets array of all "messageFlowAssociation" elements
     */
    org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation[] getMessageFlowAssociationArray();
    
    /**
     * Gets ith "messageFlowAssociation" element
     */
    org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation getMessageFlowAssociationArray(int i);
    
    /**
     * Returns number of "messageFlowAssociation" element
     */
    int sizeOfMessageFlowAssociationArray();
    
    /**
     * Sets array of all "messageFlowAssociation" element
     */
    void setMessageFlowAssociationArray(org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation[] messageFlowAssociationArray);
    
    /**
     * Sets ith "messageFlowAssociation" element
     */
    void setMessageFlowAssociationArray(int i, org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation messageFlowAssociation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageFlowAssociation" element
     */
    org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation insertNewMessageFlowAssociation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageFlowAssociation" element
     */
    org.omg.spec.bpmn.x20100524.model.TMessageFlowAssociation addNewMessageFlowAssociation();
    
    /**
     * Removes the ith "messageFlowAssociation" element
     */
    void removeMessageFlowAssociation(int i);
    
    /**
     * Gets array of all "correlationKey" elements
     */
    org.omg.spec.bpmn.x20100524.model.TCorrelationKey[] getCorrelationKeyArray();
    
    /**
     * Gets ith "correlationKey" element
     */
    org.omg.spec.bpmn.x20100524.model.TCorrelationKey getCorrelationKeyArray(int i);
    
    /**
     * Returns number of "correlationKey" element
     */
    int sizeOfCorrelationKeyArray();
    
    /**
     * Sets array of all "correlationKey" element
     */
    void setCorrelationKeyArray(org.omg.spec.bpmn.x20100524.model.TCorrelationKey[] correlationKeyArray);
    
    /**
     * Sets ith "correlationKey" element
     */
    void setCorrelationKeyArray(int i, org.omg.spec.bpmn.x20100524.model.TCorrelationKey correlationKey);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "correlationKey" element
     */
    org.omg.spec.bpmn.x20100524.model.TCorrelationKey insertNewCorrelationKey(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "correlationKey" element
     */
    org.omg.spec.bpmn.x20100524.model.TCorrelationKey addNewCorrelationKey();
    
    /**
     * Removes the ith "correlationKey" element
     */
    void removeCorrelationKey(int i);
    
    /**
     * Gets array of all "choreographyRef" elements
     */
    javax.xml.namespace.QName[] getChoreographyRefArray();
    
    /**
     * Gets ith "choreographyRef" element
     */
    javax.xml.namespace.QName getChoreographyRefArray(int i);
    
    /**
     * Gets (as xml) array of all "choreographyRef" elements
     */
    org.apache.xmlbeans.XmlQName[] xgetChoreographyRefArray();
    
    /**
     * Gets (as xml) ith "choreographyRef" element
     */
    org.apache.xmlbeans.XmlQName xgetChoreographyRefArray(int i);
    
    /**
     * Returns number of "choreographyRef" element
     */
    int sizeOfChoreographyRefArray();
    
    /**
     * Sets array of all "choreographyRef" element
     */
    void setChoreographyRefArray(javax.xml.namespace.QName[] choreographyRefArray);
    
    /**
     * Sets ith "choreographyRef" element
     */
    void setChoreographyRefArray(int i, javax.xml.namespace.QName choreographyRef);
    
    /**
     * Sets (as xml) array of all "choreographyRef" element
     */
    void xsetChoreographyRefArray(org.apache.xmlbeans.XmlQName[] choreographyRefArray);
    
    /**
     * Sets (as xml) ith "choreographyRef" element
     */
    void xsetChoreographyRefArray(int i, org.apache.xmlbeans.XmlQName choreographyRef);
    
    /**
     * Inserts the value as the ith "choreographyRef" element
     */
    void insertChoreographyRef(int i, javax.xml.namespace.QName choreographyRef);
    
    /**
     * Appends the value as the last "choreographyRef" element
     */
    void addChoreographyRef(javax.xml.namespace.QName choreographyRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "choreographyRef" element
     */
    org.apache.xmlbeans.XmlQName insertNewChoreographyRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "choreographyRef" element
     */
    org.apache.xmlbeans.XmlQName addNewChoreographyRef();
    
    /**
     * Removes the ith "choreographyRef" element
     */
    void removeChoreographyRef(int i);
    
    /**
     * Gets array of all "conversationLink" elements
     */
    org.omg.spec.bpmn.x20100524.model.TConversationLink[] getConversationLinkArray();
    
    /**
     * Gets ith "conversationLink" element
     */
    org.omg.spec.bpmn.x20100524.model.TConversationLink getConversationLinkArray(int i);
    
    /**
     * Returns number of "conversationLink" element
     */
    int sizeOfConversationLinkArray();
    
    /**
     * Sets array of all "conversationLink" element
     */
    void setConversationLinkArray(org.omg.spec.bpmn.x20100524.model.TConversationLink[] conversationLinkArray);
    
    /**
     * Sets ith "conversationLink" element
     */
    void setConversationLinkArray(int i, org.omg.spec.bpmn.x20100524.model.TConversationLink conversationLink);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conversationLink" element
     */
    org.omg.spec.bpmn.x20100524.model.TConversationLink insertNewConversationLink(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conversationLink" element
     */
    org.omg.spec.bpmn.x20100524.model.TConversationLink addNewConversationLink();
    
    /**
     * Removes the ith "conversationLink" element
     */
    void removeConversationLink(int i);
    
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
     * Gets the "isClosed" attribute
     */
    boolean getIsClosed();
    
    /**
     * Gets (as xml) the "isClosed" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsClosed();
    
    /**
     * True if has "isClosed" attribute
     */
    boolean isSetIsClosed();
    
    /**
     * Sets the "isClosed" attribute
     */
    void setIsClosed(boolean isClosed);
    
    /**
     * Sets (as xml) the "isClosed" attribute
     */
    void xsetIsClosed(org.apache.xmlbeans.XmlBoolean isClosed);
    
    /**
     * Unsets the "isClosed" attribute
     */
    void unsetIsClosed();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration newInstance() {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.bpmn.x20100524.model.TCollaboration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.bpmn.x20100524.model.TCollaboration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

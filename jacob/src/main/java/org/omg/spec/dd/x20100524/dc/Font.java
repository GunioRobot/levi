/*
 * XML Type:  Font
 * Namespace: http://www.omg.org/spec/DD/20100524/DC
 * Java type: org.omg.spec.dd.x20100524.dc.Font
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.dc;


/**
 * An XML Font(@http://www.omg.org/spec/DD/20100524/DC).
 *
 * This is a complex type.
 */
public interface Font extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Font.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s274511477EA18E924A610889C839BA0F").resolveHandle("fontbd3etype");
    
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
     * Gets the "size" attribute
     */
    double getSize();
    
    /**
     * Gets (as xml) the "size" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetSize();
    
    /**
     * True if has "size" attribute
     */
    boolean isSetSize();
    
    /**
     * Sets the "size" attribute
     */
    void setSize(double size);
    
    /**
     * Sets (as xml) the "size" attribute
     */
    void xsetSize(org.apache.xmlbeans.XmlDouble size);
    
    /**
     * Unsets the "size" attribute
     */
    void unsetSize();
    
    /**
     * Gets the "isBold" attribute
     */
    boolean getIsBold();
    
    /**
     * Gets (as xml) the "isBold" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsBold();
    
    /**
     * True if has "isBold" attribute
     */
    boolean isSetIsBold();
    
    /**
     * Sets the "isBold" attribute
     */
    void setIsBold(boolean isBold);
    
    /**
     * Sets (as xml) the "isBold" attribute
     */
    void xsetIsBold(org.apache.xmlbeans.XmlBoolean isBold);
    
    /**
     * Unsets the "isBold" attribute
     */
    void unsetIsBold();
    
    /**
     * Gets the "isItalic" attribute
     */
    boolean getIsItalic();
    
    /**
     * Gets (as xml) the "isItalic" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsItalic();
    
    /**
     * True if has "isItalic" attribute
     */
    boolean isSetIsItalic();
    
    /**
     * Sets the "isItalic" attribute
     */
    void setIsItalic(boolean isItalic);
    
    /**
     * Sets (as xml) the "isItalic" attribute
     */
    void xsetIsItalic(org.apache.xmlbeans.XmlBoolean isItalic);
    
    /**
     * Unsets the "isItalic" attribute
     */
    void unsetIsItalic();
    
    /**
     * Gets the "isUnderline" attribute
     */
    boolean getIsUnderline();
    
    /**
     * Gets (as xml) the "isUnderline" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsUnderline();
    
    /**
     * True if has "isUnderline" attribute
     */
    boolean isSetIsUnderline();
    
    /**
     * Sets the "isUnderline" attribute
     */
    void setIsUnderline(boolean isUnderline);
    
    /**
     * Sets (as xml) the "isUnderline" attribute
     */
    void xsetIsUnderline(org.apache.xmlbeans.XmlBoolean isUnderline);
    
    /**
     * Unsets the "isUnderline" attribute
     */
    void unsetIsUnderline();
    
    /**
     * Gets the "isStrikeThrough" attribute
     */
    boolean getIsStrikeThrough();
    
    /**
     * Gets (as xml) the "isStrikeThrough" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsStrikeThrough();
    
    /**
     * True if has "isStrikeThrough" attribute
     */
    boolean isSetIsStrikeThrough();
    
    /**
     * Sets the "isStrikeThrough" attribute
     */
    void setIsStrikeThrough(boolean isStrikeThrough);
    
    /**
     * Sets (as xml) the "isStrikeThrough" attribute
     */
    void xsetIsStrikeThrough(org.apache.xmlbeans.XmlBoolean isStrikeThrough);
    
    /**
     * Unsets the "isStrikeThrough" attribute
     */
    void unsetIsStrikeThrough();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.spec.dd.x20100524.dc.Font newInstance() {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.spec.dd.x20100524.dc.Font newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.spec.dd.x20100524.dc.Font parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.spec.dd.x20100524.dc.Font parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.spec.dd.x20100524.dc.Font parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.spec.dd.x20100524.dc.Font parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.spec.dd.x20100524.dc.Font parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.spec.dd.x20100524.dc.Font parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.spec.dd.x20100524.dc.Font parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.spec.dd.x20100524.dc.Font parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.spec.dd.x20100524.dc.Font parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.spec.dd.x20100524.dc.Font parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.spec.dd.x20100524.dc.Font parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.spec.dd.x20100524.dc.Font parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.spec.dd.x20100524.dc.Font parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.spec.dd.x20100524.dc.Font parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.dd.x20100524.dc.Font parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.dd.x20100524.dc.Font parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.dd.x20100524.dc.Font) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

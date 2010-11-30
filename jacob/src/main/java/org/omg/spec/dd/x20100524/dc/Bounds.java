/*
 * XML Type:  Bounds
 * Namespace: http://www.omg.org/spec/DD/20100524/DC
 * Java type: org.omg.spec.dd.x20100524.dc.Bounds
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.dc;


/**
 * An XML Bounds(@http://www.omg.org/spec/DD/20100524/DC).
 *
 * This is a complex type.
 */
public interface Bounds extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bounds.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s274511477EA18E924A610889C839BA0F").resolveHandle("bounds7258type");
    
    /**
     * Gets the "x" attribute
     */
    double getX();
    
    /**
     * Gets (as xml) the "x" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetX();
    
    /**
     * Sets the "x" attribute
     */
    void setX(double x);
    
    /**
     * Sets (as xml) the "x" attribute
     */
    void xsetX(org.apache.xmlbeans.XmlDouble x);
    
    /**
     * Gets the "y" attribute
     */
    double getY();
    
    /**
     * Gets (as xml) the "y" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetY();
    
    /**
     * Sets the "y" attribute
     */
    void setY(double y);
    
    /**
     * Sets (as xml) the "y" attribute
     */
    void xsetY(org.apache.xmlbeans.XmlDouble y);
    
    /**
     * Gets the "width" attribute
     */
    double getWidth();
    
    /**
     * Gets (as xml) the "width" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetWidth();
    
    /**
     * Sets the "width" attribute
     */
    void setWidth(double width);
    
    /**
     * Sets (as xml) the "width" attribute
     */
    void xsetWidth(org.apache.xmlbeans.XmlDouble width);
    
    /**
     * Gets the "height" attribute
     */
    double getHeight();
    
    /**
     * Gets (as xml) the "height" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetHeight();
    
    /**
     * Sets the "height" attribute
     */
    void setHeight(double height);
    
    /**
     * Sets (as xml) the "height" attribute
     */
    void xsetHeight(org.apache.xmlbeans.XmlDouble height);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.spec.dd.x20100524.dc.Bounds newInstance() {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.spec.dd.x20100524.dc.Bounds newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.spec.dd.x20100524.dc.Bounds parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.spec.dd.x20100524.dc.Bounds parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.spec.dd.x20100524.dc.Bounds parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.spec.dd.x20100524.dc.Bounds parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.spec.dd.x20100524.dc.Bounds parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.spec.dd.x20100524.dc.Bounds parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.spec.dd.x20100524.dc.Bounds parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.spec.dd.x20100524.dc.Bounds parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.spec.dd.x20100524.dc.Bounds parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.spec.dd.x20100524.dc.Bounds parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.spec.dd.x20100524.dc.Bounds parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.spec.dd.x20100524.dc.Bounds parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.spec.dd.x20100524.dc.Bounds parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.spec.dd.x20100524.dc.Bounds parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.dd.x20100524.dc.Bounds parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.spec.dd.x20100524.dc.Bounds parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.spec.dd.x20100524.dc.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

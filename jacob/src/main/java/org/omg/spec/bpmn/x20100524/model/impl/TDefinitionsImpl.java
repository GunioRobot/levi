/*
 * XML Type:  tDefinitions
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TDefinitions
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tDefinitions(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TDefinitionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.spec.bpmn.x20100524.model.TDefinitions
{
    private static final long serialVersionUID = 1L;
    
    public TDefinitionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "import");
    private static final javax.xml.namespace.QName EXTENSION$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "extension");
    private static final javax.xml.namespace.QName ROOTELEMENT$4 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "rootElement");
    private static final org.apache.xmlbeans.QNameSet ROOTELEMENT$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "timerEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "collaboration"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "choreography"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalChoreographyTask"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalBusinessRuleTask"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "signal"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "cancelEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "partnerEntity"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataStore"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "errorEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "partnerRole"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "signalEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalConversation"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "rootElement"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "eventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "linkEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalTask"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "error"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "itemDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resource"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "escalationEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "interface"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "correlationProperty"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "message"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalUserTask"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "process"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "conditionalEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "category"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalManualTask"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "endPoint"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "compensateEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "escalation"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "terminateEventDefinition"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "globalScriptTask"),
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "messageEventDefinition"),
    });
    private static final javax.xml.namespace.QName BPMNDIAGRAM$6 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNDiagram");
    private static final javax.xml.namespace.QName RELATIONSHIP$8 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "relationship");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName NAME$12 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName TARGETNAMESPACE$14 = 
        new javax.xml.namespace.QName("", "targetNamespace");
    private static final javax.xml.namespace.QName EXPRESSIONLANGUAGE$16 = 
        new javax.xml.namespace.QName("", "expressionLanguage");
    private static final javax.xml.namespace.QName TYPELANGUAGE$18 = 
        new javax.xml.namespace.QName("", "typeLanguage");
    private static final javax.xml.namespace.QName EXPORTER$20 = 
        new javax.xml.namespace.QName("", "exporter");
    private static final javax.xml.namespace.QName EXPORTERVERSION$22 = 
        new javax.xml.namespace.QName("", "exporterVersion");
    
    
    /**
     * Gets array of all "import" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TImport[] getImportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMPORT$0, targetList);
            org.omg.spec.bpmn.x20100524.model.TImport[] result = new org.omg.spec.bpmn.x20100524.model.TImport[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "import" element
     */
    public org.omg.spec.bpmn.x20100524.model.TImport getImportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TImport target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TImport)get_store().find_element_user(IMPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "import" element
     */
    public int sizeOfImportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORT$0);
        }
    }
    
    /**
     * Sets array of all "import" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setImportArray(org.omg.spec.bpmn.x20100524.model.TImport[] ximportArray)
    {
        check_orphaned();
        arraySetterHelper(ximportArray, IMPORT$0);
    }
    
    /**
     * Sets ith "import" element
     */
    public void setImportArray(int i, org.omg.spec.bpmn.x20100524.model.TImport ximport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TImport target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TImport)get_store().find_element_user(IMPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ximport);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "import" element
     */
    public org.omg.spec.bpmn.x20100524.model.TImport insertNewImport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TImport target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TImport)get_store().insert_element_user(IMPORT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "import" element
     */
    public org.omg.spec.bpmn.x20100524.model.TImport addNewImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TImport target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TImport)get_store().add_element_user(IMPORT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "import" element
     */
    public void removeImport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORT$0, i);
        }
    }
    
    /**
     * Gets array of all "extension" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TExtension[] getExtensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTENSION$2, targetList);
            org.omg.spec.bpmn.x20100524.model.TExtension[] result = new org.omg.spec.bpmn.x20100524.model.TExtension[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "extension" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExtension getExtensionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExtension target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExtension)get_store().find_element_user(EXTENSION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "extension" element
     */
    public int sizeOfExtensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENSION$2);
        }
    }
    
    /**
     * Sets array of all "extension" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setExtensionArray(org.omg.spec.bpmn.x20100524.model.TExtension[] extensionArray)
    {
        check_orphaned();
        arraySetterHelper(extensionArray, EXTENSION$2);
    }
    
    /**
     * Sets ith "extension" element
     */
    public void setExtensionArray(int i, org.omg.spec.bpmn.x20100524.model.TExtension extension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExtension target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExtension)get_store().find_element_user(EXTENSION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(extension);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extension" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExtension insertNewExtension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExtension target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExtension)get_store().insert_element_user(EXTENSION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extension" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExtension addNewExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExtension target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExtension)get_store().add_element_user(EXTENSION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "extension" element
     */
    public void removeExtension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENSION$2, i);
        }
    }
    
    /**
     * Gets array of all "rootElement" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TRootElement[] getRootElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROOTELEMENT$5, targetList);
            org.omg.spec.bpmn.x20100524.model.TRootElement[] result = new org.omg.spec.bpmn.x20100524.model.TRootElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rootElement" element
     */
    public org.omg.spec.bpmn.x20100524.model.TRootElement getRootElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TRootElement target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TRootElement)get_store().find_element_user(ROOTELEMENT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rootElement" element
     */
    public int sizeOfRootElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROOTELEMENT$5);
        }
    }
    
    /**
     * Sets array of all "rootElement" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRootElementArray(org.omg.spec.bpmn.x20100524.model.TRootElement[] rootElementArray)
    {
        check_orphaned();
        arraySetterHelper(rootElementArray, ROOTELEMENT$4, ROOTELEMENT$5);
    }
    
    /**
     * Sets ith "rootElement" element
     */
    public void setRootElementArray(int i, org.omg.spec.bpmn.x20100524.model.TRootElement rootElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TRootElement target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TRootElement)get_store().find_element_user(ROOTELEMENT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rootElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rootElement" element
     */
    public org.omg.spec.bpmn.x20100524.model.TRootElement insertNewRootElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TRootElement target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TRootElement)get_store().insert_element_user(ROOTELEMENT$5, ROOTELEMENT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rootElement" element
     */
    public org.omg.spec.bpmn.x20100524.model.TRootElement addNewRootElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TRootElement target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TRootElement)get_store().add_element_user(ROOTELEMENT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "rootElement" element
     */
    public void removeRootElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROOTELEMENT$5, i);
        }
    }
    
    /**
     * Gets array of all "BPMNDiagram" elements
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNDiagram[] getBPMNDiagramArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BPMNDIAGRAM$6, targetList);
            org.omg.spec.bpmn.x20100524.di.BPMNDiagram[] result = new org.omg.spec.bpmn.x20100524.di.BPMNDiagram[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "BPMNDiagram" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNDiagram getBPMNDiagramArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNDiagram target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNDiagram)get_store().find_element_user(BPMNDIAGRAM$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "BPMNDiagram" element
     */
    public int sizeOfBPMNDiagramArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BPMNDIAGRAM$6);
        }
    }
    
    /**
     * Sets array of all "BPMNDiagram" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBPMNDiagramArray(org.omg.spec.bpmn.x20100524.di.BPMNDiagram[] bpmnDiagramArray)
    {
        check_orphaned();
        arraySetterHelper(bpmnDiagramArray, BPMNDIAGRAM$6);
    }
    
    /**
     * Sets ith "BPMNDiagram" element
     */
    public void setBPMNDiagramArray(int i, org.omg.spec.bpmn.x20100524.di.BPMNDiagram bpmnDiagram)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNDiagram target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNDiagram)get_store().find_element_user(BPMNDIAGRAM$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bpmnDiagram);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BPMNDiagram" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNDiagram insertNewBPMNDiagram(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNDiagram target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNDiagram)get_store().insert_element_user(BPMNDIAGRAM$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BPMNDiagram" element
     */
    public org.omg.spec.bpmn.x20100524.di.BPMNDiagram addNewBPMNDiagram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.di.BPMNDiagram target = null;
            target = (org.omg.spec.bpmn.x20100524.di.BPMNDiagram)get_store().add_element_user(BPMNDIAGRAM$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "BPMNDiagram" element
     */
    public void removeBPMNDiagram(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BPMNDIAGRAM$6, i);
        }
    }
    
    /**
     * Gets array of all "relationship" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TRelationship[] getRelationshipArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATIONSHIP$8, targetList);
            org.omg.spec.bpmn.x20100524.model.TRelationship[] result = new org.omg.spec.bpmn.x20100524.model.TRelationship[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relationship" element
     */
    public org.omg.spec.bpmn.x20100524.model.TRelationship getRelationshipArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TRelationship target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TRelationship)get_store().find_element_user(RELATIONSHIP$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relationship" element
     */
    public int sizeOfRelationshipArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONSHIP$8);
        }
    }
    
    /**
     * Sets array of all "relationship" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRelationshipArray(org.omg.spec.bpmn.x20100524.model.TRelationship[] relationshipArray)
    {
        check_orphaned();
        arraySetterHelper(relationshipArray, RELATIONSHIP$8);
    }
    
    /**
     * Sets ith "relationship" element
     */
    public void setRelationshipArray(int i, org.omg.spec.bpmn.x20100524.model.TRelationship relationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TRelationship target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TRelationship)get_store().find_element_user(RELATIONSHIP$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relationship);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relationship" element
     */
    public org.omg.spec.bpmn.x20100524.model.TRelationship insertNewRelationship(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TRelationship target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TRelationship)get_store().insert_element_user(RELATIONSHIP$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relationship" element
     */
    public org.omg.spec.bpmn.x20100524.model.TRelationship addNewRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TRelationship target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TRelationship)get_store().add_element_user(RELATIONSHIP$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "relationship" element
     */
    public void removeRelationship(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONSHIP$8, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$10) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$10);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$10);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$12);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$12) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$12);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$12);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$12);
        }
    }
    
    /**
     * Gets the "targetNamespace" attribute
     */
    public java.lang.String getTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetNamespace" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGETNAMESPACE$14);
            return target;
        }
    }
    
    /**
     * Sets the "targetNamespace" attribute
     */
    public void setTargetNamespace(java.lang.String targetNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETNAMESPACE$14);
            }
            target.setStringValue(targetNamespace);
        }
    }
    
    /**
     * Sets (as xml) the "targetNamespace" attribute
     */
    public void xsetTargetNamespace(org.apache.xmlbeans.XmlAnyURI targetNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGETNAMESPACE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(TARGETNAMESPACE$14);
            }
            target.set(targetNamespace);
        }
    }
    
    /**
     * Gets the "expressionLanguage" attribute
     */
    public java.lang.String getExpressionLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPRESSIONLANGUAGE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXPRESSIONLANGUAGE$16);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expressionLanguage" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetExpressionLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(EXPRESSIONLANGUAGE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_default_attribute_value(EXPRESSIONLANGUAGE$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "expressionLanguage" attribute
     */
    public boolean isSetExpressionLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXPRESSIONLANGUAGE$16) != null;
        }
    }
    
    /**
     * Sets the "expressionLanguage" attribute
     */
    public void setExpressionLanguage(java.lang.String expressionLanguage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPRESSIONLANGUAGE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPRESSIONLANGUAGE$16);
            }
            target.setStringValue(expressionLanguage);
        }
    }
    
    /**
     * Sets (as xml) the "expressionLanguage" attribute
     */
    public void xsetExpressionLanguage(org.apache.xmlbeans.XmlAnyURI expressionLanguage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(EXPRESSIONLANGUAGE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(EXPRESSIONLANGUAGE$16);
            }
            target.set(expressionLanguage);
        }
    }
    
    /**
     * Unsets the "expressionLanguage" attribute
     */
    public void unsetExpressionLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXPRESSIONLANGUAGE$16);
        }
    }
    
    /**
     * Gets the "typeLanguage" attribute
     */
    public java.lang.String getTypeLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPELANGUAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPELANGUAGE$18);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeLanguage" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTypeLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TYPELANGUAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_default_attribute_value(TYPELANGUAGE$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "typeLanguage" attribute
     */
    public boolean isSetTypeLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPELANGUAGE$18) != null;
        }
    }
    
    /**
     * Sets the "typeLanguage" attribute
     */
    public void setTypeLanguage(java.lang.String typeLanguage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPELANGUAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPELANGUAGE$18);
            }
            target.setStringValue(typeLanguage);
        }
    }
    
    /**
     * Sets (as xml) the "typeLanguage" attribute
     */
    public void xsetTypeLanguage(org.apache.xmlbeans.XmlAnyURI typeLanguage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TYPELANGUAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(TYPELANGUAGE$18);
            }
            target.set(typeLanguage);
        }
    }
    
    /**
     * Unsets the "typeLanguage" attribute
     */
    public void unsetTypeLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPELANGUAGE$18);
        }
    }
    
    /**
     * Gets the "exporter" attribute
     */
    public java.lang.String getExporter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTER$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "exporter" attribute
     */
    public org.apache.xmlbeans.XmlString xgetExporter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXPORTER$20);
            return target;
        }
    }
    
    /**
     * True if has "exporter" attribute
     */
    public boolean isSetExporter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXPORTER$20) != null;
        }
    }
    
    /**
     * Sets the "exporter" attribute
     */
    public void setExporter(java.lang.String exporter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTER$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPORTER$20);
            }
            target.setStringValue(exporter);
        }
    }
    
    /**
     * Sets (as xml) the "exporter" attribute
     */
    public void xsetExporter(org.apache.xmlbeans.XmlString exporter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXPORTER$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EXPORTER$20);
            }
            target.set(exporter);
        }
    }
    
    /**
     * Unsets the "exporter" attribute
     */
    public void unsetExporter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXPORTER$20);
        }
    }
    
    /**
     * Gets the "exporterVersion" attribute
     */
    public java.lang.String getExporterVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTERVERSION$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "exporterVersion" attribute
     */
    public org.apache.xmlbeans.XmlString xgetExporterVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXPORTERVERSION$22);
            return target;
        }
    }
    
    /**
     * True if has "exporterVersion" attribute
     */
    public boolean isSetExporterVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXPORTERVERSION$22) != null;
        }
    }
    
    /**
     * Sets the "exporterVersion" attribute
     */
    public void setExporterVersion(java.lang.String exporterVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTERVERSION$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPORTERVERSION$22);
            }
            target.setStringValue(exporterVersion);
        }
    }
    
    /**
     * Sets (as xml) the "exporterVersion" attribute
     */
    public void xsetExporterVersion(org.apache.xmlbeans.XmlString exporterVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXPORTERVERSION$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EXPORTERVERSION$22);
            }
            target.set(exporterVersion);
        }
    }
    
    /**
     * Unsets the "exporterVersion" attribute
     */
    public void unsetExporterVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXPORTERVERSION$22);
        }
    }
}

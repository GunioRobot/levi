/*
 * XML Type:  tMultiInstanceLoopCharacteristics
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tMultiInstanceLoopCharacteristics(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TMultiInstanceLoopCharacteristicsImpl extends org.omg.spec.bpmn.x20100524.model.impl.TLoopCharacteristicsImpl implements org.omg.spec.bpmn.x20100524.model.TMultiInstanceLoopCharacteristics
{
    private static final long serialVersionUID = 1L;
    
    public TMultiInstanceLoopCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOOPCARDINALITY$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "loopCardinality");
    private static final javax.xml.namespace.QName LOOPDATAINPUTREF$2 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "loopDataInputRef");
    private static final javax.xml.namespace.QName LOOPDATAOUTPUTREF$4 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "loopDataOutputRef");
    private static final javax.xml.namespace.QName INPUTDATAITEM$6 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "inputDataItem");
    private static final javax.xml.namespace.QName OUTPUTDATAITEM$8 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "outputDataItem");
    private static final javax.xml.namespace.QName COMPLEXBEHAVIORDEFINITION$10 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "complexBehaviorDefinition");
    private static final javax.xml.namespace.QName COMPLETIONCONDITION$12 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "completionCondition");
    private static final javax.xml.namespace.QName ISSEQUENTIAL$14 = 
        new javax.xml.namespace.QName("", "isSequential");
    private static final javax.xml.namespace.QName BEHAVIOR$16 = 
        new javax.xml.namespace.QName("", "behavior");
    private static final javax.xml.namespace.QName ONEBEHAVIOREVENTREF$18 = 
        new javax.xml.namespace.QName("", "oneBehaviorEventRef");
    private static final javax.xml.namespace.QName NONEBEHAVIOREVENTREF$20 = 
        new javax.xml.namespace.QName("", "noneBehaviorEventRef");
    
    
    /**
     * Gets the "loopCardinality" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression getLoopCardinality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().find_element_user(LOOPCARDINALITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "loopCardinality" element
     */
    public boolean isSetLoopCardinality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOOPCARDINALITY$0) != 0;
        }
    }
    
    /**
     * Sets the "loopCardinality" element
     */
    public void setLoopCardinality(org.omg.spec.bpmn.x20100524.model.TExpression loopCardinality)
    {
        generatedSetterHelperImpl(loopCardinality, LOOPCARDINALITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "loopCardinality" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression addNewLoopCardinality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().add_element_user(LOOPCARDINALITY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "loopCardinality" element
     */
    public void unsetLoopCardinality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOOPCARDINALITY$0, 0);
        }
    }
    
    /**
     * Gets the "loopDataInputRef" element
     */
    public javax.xml.namespace.QName getLoopDataInputRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOOPDATAINPUTREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "loopDataInputRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetLoopDataInputRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(LOOPDATAINPUTREF$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "loopDataInputRef" element
     */
    public boolean isSetLoopDataInputRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOOPDATAINPUTREF$2) != 0;
        }
    }
    
    /**
     * Sets the "loopDataInputRef" element
     */
    public void setLoopDataInputRef(javax.xml.namespace.QName loopDataInputRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOOPDATAINPUTREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOOPDATAINPUTREF$2);
            }
            target.setQNameValue(loopDataInputRef);
        }
    }
    
    /**
     * Sets (as xml) the "loopDataInputRef" element
     */
    public void xsetLoopDataInputRef(org.apache.xmlbeans.XmlQName loopDataInputRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(LOOPDATAINPUTREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(LOOPDATAINPUTREF$2);
            }
            target.set(loopDataInputRef);
        }
    }
    
    /**
     * Unsets the "loopDataInputRef" element
     */
    public void unsetLoopDataInputRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOOPDATAINPUTREF$2, 0);
        }
    }
    
    /**
     * Gets the "loopDataOutputRef" element
     */
    public javax.xml.namespace.QName getLoopDataOutputRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOOPDATAOUTPUTREF$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "loopDataOutputRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetLoopDataOutputRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(LOOPDATAOUTPUTREF$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "loopDataOutputRef" element
     */
    public boolean isSetLoopDataOutputRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOOPDATAOUTPUTREF$4) != 0;
        }
    }
    
    /**
     * Sets the "loopDataOutputRef" element
     */
    public void setLoopDataOutputRef(javax.xml.namespace.QName loopDataOutputRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOOPDATAOUTPUTREF$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOOPDATAOUTPUTREF$4);
            }
            target.setQNameValue(loopDataOutputRef);
        }
    }
    
    /**
     * Sets (as xml) the "loopDataOutputRef" element
     */
    public void xsetLoopDataOutputRef(org.apache.xmlbeans.XmlQName loopDataOutputRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(LOOPDATAOUTPUTREF$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(LOOPDATAOUTPUTREF$4);
            }
            target.set(loopDataOutputRef);
        }
    }
    
    /**
     * Unsets the "loopDataOutputRef" element
     */
    public void unsetLoopDataOutputRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOOPDATAOUTPUTREF$4, 0);
        }
    }
    
    /**
     * Gets the "inputDataItem" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInput getInputDataItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInput target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInput)get_store().find_element_user(INPUTDATAITEM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "inputDataItem" element
     */
    public boolean isSetInputDataItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUTDATAITEM$6) != 0;
        }
    }
    
    /**
     * Sets the "inputDataItem" element
     */
    public void setInputDataItem(org.omg.spec.bpmn.x20100524.model.TDataInput inputDataItem)
    {
        generatedSetterHelperImpl(inputDataItem, INPUTDATAITEM$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "inputDataItem" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataInput addNewInputDataItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataInput target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataInput)get_store().add_element_user(INPUTDATAITEM$6);
            return target;
        }
    }
    
    /**
     * Unsets the "inputDataItem" element
     */
    public void unsetInputDataItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUTDATAITEM$6, 0);
        }
    }
    
    /**
     * Gets the "outputDataItem" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataOutput getOutputDataItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataOutput target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataOutput)get_store().find_element_user(OUTPUTDATAITEM$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "outputDataItem" element
     */
    public boolean isSetOutputDataItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTPUTDATAITEM$8) != 0;
        }
    }
    
    /**
     * Sets the "outputDataItem" element
     */
    public void setOutputDataItem(org.omg.spec.bpmn.x20100524.model.TDataOutput outputDataItem)
    {
        generatedSetterHelperImpl(outputDataItem, OUTPUTDATAITEM$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "outputDataItem" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataOutput addNewOutputDataItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataOutput target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataOutput)get_store().add_element_user(OUTPUTDATAITEM$8);
            return target;
        }
    }
    
    /**
     * Unsets the "outputDataItem" element
     */
    public void unsetOutputDataItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTPUTDATAITEM$8, 0);
        }
    }
    
    /**
     * Gets array of all "complexBehaviorDefinition" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition[] getComplexBehaviorDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPLEXBEHAVIORDEFINITION$10, targetList);
            org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition[] result = new org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "complexBehaviorDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition getComplexBehaviorDefinitionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition)get_store().find_element_user(COMPLEXBEHAVIORDEFINITION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "complexBehaviorDefinition" element
     */
    public int sizeOfComplexBehaviorDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLEXBEHAVIORDEFINITION$10);
        }
    }
    
    /**
     * Sets array of all "complexBehaviorDefinition" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setComplexBehaviorDefinitionArray(org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition[] complexBehaviorDefinitionArray)
    {
        check_orphaned();
        arraySetterHelper(complexBehaviorDefinitionArray, COMPLEXBEHAVIORDEFINITION$10);
    }
    
    /**
     * Sets ith "complexBehaviorDefinition" element
     */
    public void setComplexBehaviorDefinitionArray(int i, org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition complexBehaviorDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition)get_store().find_element_user(COMPLEXBEHAVIORDEFINITION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(complexBehaviorDefinition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "complexBehaviorDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition insertNewComplexBehaviorDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition)get_store().insert_element_user(COMPLEXBEHAVIORDEFINITION$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "complexBehaviorDefinition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition addNewComplexBehaviorDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TComplexBehaviorDefinition)get_store().add_element_user(COMPLEXBEHAVIORDEFINITION$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "complexBehaviorDefinition" element
     */
    public void removeComplexBehaviorDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLEXBEHAVIORDEFINITION$10, i);
        }
    }
    
    /**
     * Gets the "completionCondition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression getCompletionCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().find_element_user(COMPLETIONCONDITION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "completionCondition" element
     */
    public boolean isSetCompletionCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLETIONCONDITION$12) != 0;
        }
    }
    
    /**
     * Sets the "completionCondition" element
     */
    public void setCompletionCondition(org.omg.spec.bpmn.x20100524.model.TExpression completionCondition)
    {
        generatedSetterHelperImpl(completionCondition, COMPLETIONCONDITION$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "completionCondition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression addNewCompletionCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().add_element_user(COMPLETIONCONDITION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "completionCondition" element
     */
    public void unsetCompletionCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLETIONCONDITION$12, 0);
        }
    }
    
    /**
     * Gets the "isSequential" attribute
     */
    public boolean getIsSequential()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSEQUENTIAL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISSEQUENTIAL$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isSequential" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsSequential()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISSEQUENTIAL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISSEQUENTIAL$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "isSequential" attribute
     */
    public boolean isSetIsSequential()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISSEQUENTIAL$14) != null;
        }
    }
    
    /**
     * Sets the "isSequential" attribute
     */
    public void setIsSequential(boolean isSequential)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSEQUENTIAL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISSEQUENTIAL$14);
            }
            target.setBooleanValue(isSequential);
        }
    }
    
    /**
     * Sets (as xml) the "isSequential" attribute
     */
    public void xsetIsSequential(org.apache.xmlbeans.XmlBoolean isSequential)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISSEQUENTIAL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISSEQUENTIAL$14);
            }
            target.set(isSequential);
        }
    }
    
    /**
     * Unsets the "isSequential" attribute
     */
    public void unsetIsSequential()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISSEQUENTIAL$14);
        }
    }
    
    /**
     * Gets the "behavior" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TMultiInstanceFlowCondition.Enum getBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEHAVIOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BEHAVIOR$16);
            }
            if (target == null)
            {
                return null;
            }
            return (org.omg.spec.bpmn.x20100524.model.TMultiInstanceFlowCondition.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "behavior" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TMultiInstanceFlowCondition xgetBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMultiInstanceFlowCondition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMultiInstanceFlowCondition)get_store().find_attribute_user(BEHAVIOR$16);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TMultiInstanceFlowCondition)get_default_attribute_value(BEHAVIOR$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "behavior" attribute
     */
    public boolean isSetBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BEHAVIOR$16) != null;
        }
    }
    
    /**
     * Sets the "behavior" attribute
     */
    public void setBehavior(org.omg.spec.bpmn.x20100524.model.TMultiInstanceFlowCondition.Enum behavior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEHAVIOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BEHAVIOR$16);
            }
            target.setEnumValue(behavior);
        }
    }
    
    /**
     * Sets (as xml) the "behavior" attribute
     */
    public void xsetBehavior(org.omg.spec.bpmn.x20100524.model.TMultiInstanceFlowCondition behavior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TMultiInstanceFlowCondition target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TMultiInstanceFlowCondition)get_store().find_attribute_user(BEHAVIOR$16);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TMultiInstanceFlowCondition)get_store().add_attribute_user(BEHAVIOR$16);
            }
            target.set(behavior);
        }
    }
    
    /**
     * Unsets the "behavior" attribute
     */
    public void unsetBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BEHAVIOR$16);
        }
    }
    
    /**
     * Gets the "oneBehaviorEventRef" attribute
     */
    public javax.xml.namespace.QName getOneBehaviorEventRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONEBEHAVIOREVENTREF$18);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "oneBehaviorEventRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetOneBehaviorEventRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ONEBEHAVIOREVENTREF$18);
            return target;
        }
    }
    
    /**
     * True if has "oneBehaviorEventRef" attribute
     */
    public boolean isSetOneBehaviorEventRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ONEBEHAVIOREVENTREF$18) != null;
        }
    }
    
    /**
     * Sets the "oneBehaviorEventRef" attribute
     */
    public void setOneBehaviorEventRef(javax.xml.namespace.QName oneBehaviorEventRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONEBEHAVIOREVENTREF$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONEBEHAVIOREVENTREF$18);
            }
            target.setQNameValue(oneBehaviorEventRef);
        }
    }
    
    /**
     * Sets (as xml) the "oneBehaviorEventRef" attribute
     */
    public void xsetOneBehaviorEventRef(org.apache.xmlbeans.XmlQName oneBehaviorEventRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ONEBEHAVIOREVENTREF$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(ONEBEHAVIOREVENTREF$18);
            }
            target.set(oneBehaviorEventRef);
        }
    }
    
    /**
     * Unsets the "oneBehaviorEventRef" attribute
     */
    public void unsetOneBehaviorEventRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ONEBEHAVIOREVENTREF$18);
        }
    }
    
    /**
     * Gets the "noneBehaviorEventRef" attribute
     */
    public javax.xml.namespace.QName getNoneBehaviorEventRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NONEBEHAVIOREVENTREF$20);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "noneBehaviorEventRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetNoneBehaviorEventRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(NONEBEHAVIOREVENTREF$20);
            return target;
        }
    }
    
    /**
     * True if has "noneBehaviorEventRef" attribute
     */
    public boolean isSetNoneBehaviorEventRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NONEBEHAVIOREVENTREF$20) != null;
        }
    }
    
    /**
     * Sets the "noneBehaviorEventRef" attribute
     */
    public void setNoneBehaviorEventRef(javax.xml.namespace.QName noneBehaviorEventRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NONEBEHAVIOREVENTREF$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NONEBEHAVIOREVENTREF$20);
            }
            target.setQNameValue(noneBehaviorEventRef);
        }
    }
    
    /**
     * Sets (as xml) the "noneBehaviorEventRef" attribute
     */
    public void xsetNoneBehaviorEventRef(org.apache.xmlbeans.XmlQName noneBehaviorEventRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(NONEBEHAVIOREVENTREF$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(NONEBEHAVIOREVENTREF$20);
            }
            target.set(noneBehaviorEventRef);
        }
    }
    
    /**
     * Unsets the "noneBehaviorEventRef" attribute
     */
    public void unsetNoneBehaviorEventRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NONEBEHAVIOREVENTREF$20);
        }
    }
}

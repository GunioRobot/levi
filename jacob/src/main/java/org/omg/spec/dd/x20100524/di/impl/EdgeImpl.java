/*
 * XML Type:  Edge
 * Namespace: http://www.omg.org/spec/DD/20100524/DI
 * Java type: org.omg.spec.dd.x20100524.di.Edge
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.di.impl;
/**
 * An XML Edge(@http://www.omg.org/spec/DD/20100524/DI).
 *
 * This is a complex type.
 */
public class EdgeImpl extends org.omg.spec.dd.x20100524.di.impl.DiagramElementImpl implements org.omg.spec.dd.x20100524.di.Edge
{
    private static final long serialVersionUID = 1L;
    
    public EdgeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WAYPOINT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DI", "waypoint");
    
    
    /**
     * Gets array of all "waypoint" elements
     */
    public org.omg.spec.dd.x20100524.dc.Point[] getWaypointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WAYPOINT$0, targetList);
            org.omg.spec.dd.x20100524.dc.Point[] result = new org.omg.spec.dd.x20100524.dc.Point[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "waypoint" element
     */
    public org.omg.spec.dd.x20100524.dc.Point getWaypointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.dc.Point target = null;
            target = (org.omg.spec.dd.x20100524.dc.Point)get_store().find_element_user(WAYPOINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "waypoint" element
     */
    public int sizeOfWaypointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WAYPOINT$0);
        }
    }
    
    /**
     * Sets array of all "waypoint" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setWaypointArray(org.omg.spec.dd.x20100524.dc.Point[] waypointArray)
    {
        check_orphaned();
        arraySetterHelper(waypointArray, WAYPOINT$0);
    }
    
    /**
     * Sets ith "waypoint" element
     */
    public void setWaypointArray(int i, org.omg.spec.dd.x20100524.dc.Point waypoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.dc.Point target = null;
            target = (org.omg.spec.dd.x20100524.dc.Point)get_store().find_element_user(WAYPOINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(waypoint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "waypoint" element
     */
    public org.omg.spec.dd.x20100524.dc.Point insertNewWaypoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.dc.Point target = null;
            target = (org.omg.spec.dd.x20100524.dc.Point)get_store().insert_element_user(WAYPOINT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "waypoint" element
     */
    public org.omg.spec.dd.x20100524.dc.Point addNewWaypoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.dc.Point target = null;
            target = (org.omg.spec.dd.x20100524.dc.Point)get_store().add_element_user(WAYPOINT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "waypoint" element
     */
    public void removeWaypoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WAYPOINT$0, i);
        }
    }
}

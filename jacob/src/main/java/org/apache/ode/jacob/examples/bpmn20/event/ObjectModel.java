package org.apache.ode.jacob.examples.bpmn20.event;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 24, 2010
 * Time: 11:11:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class ObjectModel {
    public static final int START_EVENT = 1;
    public static final int END_EVENT = 2;
    public static final int TASK = 3;

    private List<Integer> _children;
    private Iterator<Integer> _i;

    public ObjectModel() {
        _children = new ArrayList<Integer>();
        init();
        _i = _children.iterator();
    }

    private void init() {
        _children.add(new Integer(START_EVENT));
        _children.add(new Integer(TASK));
        _children.add(new Integer(TASK));
        _children.add(new Integer(TASK));
        _children.add(new Integer(END_EVENT));
    }
    
    public int getNextChild() {
        if (_i.hasNext()) {
            return _i.next();
        }
        return -1;
    }
}

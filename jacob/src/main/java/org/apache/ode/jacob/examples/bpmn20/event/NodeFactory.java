package org.apache.ode.jacob.examples.bpmn20.event;

import org.apache.ode.jacob.examples.bpmn20.EndEvent;
import org.apache.ode.jacob.examples.bpmn20.Node;
import org.apache.ode.jacob.examples.bpmn20.StartEvent;
import org.apache.ode.jacob.examples.bpmn20.Task;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 24, 2010
 * Time: 11:56:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class NodeFactory {
    private ObjectModel _om;

    public NodeFactory(ObjectModel om) {
        _om = om;
    }
    
    public Node createNextNode() {
        switch (_om.getNextChild()) {
            case ObjectModel.START_EVENT:
                return new StartEvent(this, null, null);
            case ObjectModel.TASK:
                return new Task(this, null, null);
            case ObjectModel.END_EVENT:
                return new EndEvent(null, null);
        }
        throw new IllegalArgumentException("Unknown type: " + _om.getNextChild());
    }
}

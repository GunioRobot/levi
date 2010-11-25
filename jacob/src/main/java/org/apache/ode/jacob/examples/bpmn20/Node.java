package org.apache.ode.jacob.examples.bpmn20;

import org.apache.ode.jacob.JacobRunnable;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 22, 2010
 * Time: 2:45:32 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Node extends JacobRunnable {
    List<SequenceFlow> _incomingSeqFlow;
    List<SequenceFlow> _outgoingSeqFlow;
    Node _parent;
    Node _child;

    protected Node(List<SequenceFlow> incomingSeqFlow, List<SequenceFlow> outgoingSeqFlow) {
        _incomingSeqFlow = incomingSeqFlow;
        _outgoingSeqFlow = outgoingSeqFlow;
    }
}

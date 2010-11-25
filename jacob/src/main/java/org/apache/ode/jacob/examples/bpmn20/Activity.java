package org.apache.ode.jacob.examples.bpmn20;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 22, 2010
 * Time: 2:57:06 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Activity extends Node {
    protected Activity(List<SequenceFlow> incomingSeqFlow, List<SequenceFlow> outgoingSeqFlow) {
        super(incomingSeqFlow, outgoingSeqFlow);
    }
}

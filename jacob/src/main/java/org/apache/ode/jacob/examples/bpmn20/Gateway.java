package org.apache.ode.jacob.examples.bpmn20;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 22, 2010
 * Time: 2:55:20 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Gateway extends Node {
    protected Gateway(List<SequenceFlow> incomingSeqFlow, List<SequenceFlow> outgoingSeqFlow) {
        super(incomingSeqFlow, outgoingSeqFlow);
    }
}


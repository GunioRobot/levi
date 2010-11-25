package org.apache.ode.jacob.examples.bpmn20;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 22, 2010
 * Time: 4:01:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class EndEvent extends Event {
    public EndEvent(List<SequenceFlow> incomingsf, List<SequenceFlow> outgoingsf) {
        super(incomingsf, outgoingsf);
    }
    
    public void run() {
        System.out.println(this.getClassName());
    }
}

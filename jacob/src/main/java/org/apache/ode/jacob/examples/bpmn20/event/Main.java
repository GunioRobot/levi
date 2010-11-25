package org.apache.ode.jacob.examples.bpmn20.event;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 24, 2010
 * Time: 9:39:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        ObjectModel om = new ObjectModel();
        Process p = new Process(om);
        p.execute();
    }
}

package com.github.mamadaliev;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        // ---- initial data ----
        Node<String> node1 = new Node<>();
        Node<String> node2 = new Node<>();
        Node<String> node3 = new Node<>();
        Node<String> node4 = new Node<>();
        Node<String> node5 = new Node<>();
        Node<String> node6 = new Node<>();

        node1.next = node2;
        node1.value = "1";

        node2.next = node3;
        node2.value = "2";

        node3.next = node4;
        node3.value = "3";

        node4.next = node5;
        node4.value = "4";

        node5.next = node6;
        node5.value = "5";

        node6.value = "6";

        LinkedList<String> list = new LinkedList<>();

        // ---- calculation ----
        Result<String> result = list.getMiddleValue(node1, new Result<>(), 0);

        // --- output ----
        Logger log = Logger.getLogger(Main.class.getName());

        log.log(Level.INFO, "Success: {0}", result.isFound);
        log.log(Level.INFO, "Size: {0}", result.size);
        log.log(Level.INFO, "Value: {0}", result.node.value);
    }
}

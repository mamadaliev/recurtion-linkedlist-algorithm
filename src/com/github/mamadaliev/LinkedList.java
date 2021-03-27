package com.github.mamadaliev;

public class LinkedList<T> {

    public Result<T> getMiddleValue(Node<T> node, Result<T> result, int index) {
        if (node.next != null) {
            ++index;
            result = getMiddleValue(node.next, result, index);
        } else {
            result.size = ++index;
            result.node = node;
            return result;
        }
        if (result.isFound) return result;
        if (result.size / 2 == index) {
            result.isFound = true;
            result.node = node;
            return result;
        }
        return result;
    }
}

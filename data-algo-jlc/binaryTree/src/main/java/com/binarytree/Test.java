package com.binarytree;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;

@Slf4j
public class Test {
    public static void main(String[] args) {
        LinkedList<BinTreeNode> linkedList = new LinkedList<>();
        linkedList.add(new BinTreeNode(12));
        String str = "Shrikar";
        linkedList.forEach(e-> log.debug("e" , str.concat(String.valueOf(e.getData()))));


    }
}

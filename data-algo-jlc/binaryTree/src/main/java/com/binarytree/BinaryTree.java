package com.binarytree;

import java.util.LinkedList;
import java.util.Objects;

public class BinaryTree {
    private BinTreeNode root = null;

    //level order insertion
    public void insert(int data) {
        BinTreeNode temp = null;
        BinTreeNode newNode = new BinTreeNode(data);
        newNode.setLeft(null);
        newNode.setRight(null);
        if(!Objects.nonNull(root)){
            root = newNode;
            return;
        }
        LinkedList<BinTreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while(!(queue.isEmpty())) {

            temp = queue.removeFirst();

            if( temp.getLeft() != null) {
                queue.addLast(temp.getLeft());
            }
            else {
                temp.setLeft(newNode);
                return;
            }
            if( temp.getRight() != null) {
                queue.addLast(temp.getRight());
            }
            else {
                temp.setRight(newNode);
                return;
            }
        }
    }

    //Pre Order Traversal (Recursive)
    public void preOrderTraversal() {
        preOrder(root);
    }
    private void preOrder(BinTreeNode root) {

        if(null != root) {
            System.out.print(" " +root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
}

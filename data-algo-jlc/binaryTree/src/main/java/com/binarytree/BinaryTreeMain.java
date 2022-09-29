package com.binarytree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree binTree = new BinaryTree();
        binTree.insert(4);
        binTree.insert(45);
        binTree.insert(76);
        binTree.insert(87);
        binTree.insert(92);
        binTree.insert(6);
        binTree.insert(34);
        binTree.insert(95);
        binTree.preOrderTraversal();
    }
}

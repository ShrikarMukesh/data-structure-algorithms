package com.binarytree;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BinTreeNode {
    private int data;
    private BinTreeNode left = null;
    private BinTreeNode right = null;

    public BinTreeNode(int data) {
        super();
        this.data = data;
    }
}

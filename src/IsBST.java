/*
Q4.32: Design a recursive linear-time algorithm that tests whether a binary tree satisfies the
search tree order property at every node
*/
//Help Received: adapted code from https://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/
//to make the algorithm work with AnyType data.

import BST.BinaryNode;
import BST.BinarySearchTree;

public class IsBST<AnyType extends Comparable<AnyType>> {
    public BinaryNode<AnyType> left;
    public BinaryNode<AnyType> right;


    public boolean isBST(BinaryNode<AnyType> root, BinaryNode<AnyType> lt, BinaryNode<AnyType> rt) {
        if (root == null)
            return true;
        if (lt != null && root.theElement.compareTo(lt.theElement) <= 0) return false;
        if (rt != null && root.theElement.compareTo(rt.theElement) >= 0) return false;
        return isBST(root.left, left, right) && isBST(root.right, root, rt);

    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        for (int i = 1; i < 25; i++) {
            bst.insert((int) (Math.random() * 100));
        }

        BinaryNode<Integer> root = bst.getRoot();
        System.out.print(root.toString());
        System.out.println();
        System.out.println(bst.findMax(root) + " is the max value");
        System.out.println();
        System.out.println(bst.findMin(root) + " is the min value");
        System.out.println();
        System.out.println(bst.isBST(root, bst.left, bst.right));



    }
}

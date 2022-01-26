/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21552011294_ahmadranggamuzakki_strukturdata;

/**
 *
 * @author rengge
 */

public class ImplementasiBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        TreeNode node;

        node = new TreeNode(5);
        tree.insert(node);

        node = new TreeNode(3);
        tree.insert(node);

        node = new TreeNode(4);
        tree.insert(node);

        System.out.print("Traversal dengan preorder :");
        tree.preOrder();
        System.out.print("\nTraversal dengan inorder :");
        tree.inOrder();
        System.out.print("\nTraversal dengan postorder :");
        tree.postOrder();
        System.out.println();
        
    }
}
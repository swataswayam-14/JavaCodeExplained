package BinaryTree;

import java.util.Scanner;

public class BinaryTreeClass{
    private class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the value of the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(root, scanner);
    }
    private void populate(Node node , Scanner scanner){
        System.out.println("Do you want to insert in the left of "+node.value);
        boolean leftInsert = scanner.nextBoolean();
        if(leftInsert){
            System.out.println("Enter the left of "+node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(node.left, scanner);
        }
        System.out.println("Do you want to insert in the right of "+node.value);
        boolean rightInsert = scanner.nextBoolean();
        if(rightInsert) {
            System.out.println("Enter the right of "+node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(node.right, scanner);
        }
    }
    public void display(){
        display("", root);
    }
    private void display(String indent , Node node){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(indent + "\t",node.left);
        display(indent+"\t" , node.right);
    }
}
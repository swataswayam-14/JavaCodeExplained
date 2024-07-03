package BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTreeClass tree = new BinaryTreeClass();
        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);
        tree.display();
    }
}

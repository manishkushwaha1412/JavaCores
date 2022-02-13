package com.binary.tree;

import java.util.Scanner;

public class MyBinaryTree {

    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root =  createTree();
        System.out.println(root);
    }

    static Node createTree(){
        Node root = null;
        System.out.println("Enter data ");
        int d =  sc.nextInt();
        if(d == -1) return null;
        root = new Node(d);
        System.out.println("Enter Left data for "+d);
        root.left =  createTree();
        System.out.println("Enter Right data for "+d);
        root.right = createTree();
        return root;
    }

    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "left=" + left +
                    ", right=" + right +
                    ", data=" + data +
                    '}';
        }
    }
}

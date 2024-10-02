/**
 * William Scott
 * CSC 130 - Project 3 - Binary Search Tree
 * BinarySearchTree class
 */

public class BinarySearchTree {
    private Node root;

    //  constructors
    public BinarySearchTree(){
        this.root = null;
    }

    public BinarySearchTree(Node root){
        this.root = root;
    }

    // about method used to return a string mentioning something about me
    public String about() {
        return "This binary search tree was created by William Scott. Stingers Up! ";
    }

    //  toTree method starts recursion on Root with an indent of 0
    public String toTree() {
        return this.root.toTree("Root", 0);
    }

    //  toSortedList method starts same node method recursion on Root
    public String toSortedList() {
        return this.root.toSortedList();
    }

    //  add method to add a new node, starts recursion on Root
    public void add(int key, String value) {
        if (this.root  == null) {  // if there is no root, make node the root
            this.root = new Node(key, value);
        }
        else {
            this.root.add(key, value);
        }
    }

    // More recursion on root
    public String find(int key) {
        return this.root.find(key);
    }

}

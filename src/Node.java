/**
 * William Scott
 * CSC 130 - Project 3 - Binary Search Tree
 * Node class
 */

public class Node {
    public int key;
    public String value;
    public Node left;
    public Node right;

    // constructors
    public Node () {
    }

    public Node (int key, String value) {
        this.key = key;
        this.value = value;
    }

    public Node(int key, String value, Node left, Node right) {
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    // toTree returns a visual representation of the tree with labels & indents
    public String toTree (String label, int indent) {
        String result = "";
        String spaces = "";

        for (int i = 0; i < indent; i++) {  // for loop to create indent
            spaces += " ";
        }

        result += spaces + label + ": (" + this.key + ") " + this.value + "\n";

        if (left != null) {  // if there is a left node, recurse down left
            result += left.toTree("L", indent + 1);
        }

        if (right != null) {  // if there is a right node, recurse down right
            result += right.toTree("R", indent + 1);
        }

        return result;

    }

    //  toSortedList returns a string that is a formatted and sorted list of the tree
    public String toSortedList() {
        String result = "";

        if (left !=null) {  //  if there is a left node, recurse down the left
            result += left.toSortedList();
        }

        result += "(" + this.key + ")" + " " + this.value + ", "; // in order depth first

        if (right != null) {  //  if there is a right node, recurse down the right side
            result += right.toSortedList();
        }

        return result;
    }

    //  add method used to add a new node to the tree
    public void add (int key, String value) {
        if (key < this.key) {
            if (this.left == null) {
                this.left = new Node(key, value);  //if there is no left node create a new node
            }
            else {
                left.add(key, value); // start recursion on left node
            }
        }
        if (key > this.key) {
            if (this.right == null) {
                this.right = new Node (key, value); //if there is no right node create a new node
            }
            else {
                right.add(key, value); // start recursion on right node
            }
        }
    }

    //  find method used to recursively search and return the value of the given key
    public String find (int key) {
        if (key == this.key) {  // base case, if the keys are the same return the value
            return this.value;
        }
        else if (key < this.key) {  // if the key is less than the root start recursion left
            if (this.left != null) {
                return this.left.find(key);
            }
            else {
                return "No value found"; // if no key can be found return a message
            }
        }
        else {
            if (this.right != null) {
                return this.right.find(key);  // if the key is greater than root start recursion right
            } else {
                return "No value found";
            }
        }
    }

}
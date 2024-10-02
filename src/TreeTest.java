/**
 * William Scott
 * CSC 130 - Project 3 - Binary Search Tree
 * TreeTest/Main/Driver class
 * WARNING: In order to work you must have 'test' folder in same directory as java file
 */

import java.io.*;
import java.util.*;

public class TreeTest {
    public static void main (String [] args) throws FileNotFoundException {
        BinarySearchTree tree = new BinarySearchTree();  // plant the tree
        int key;
        String value;
        pl("*** Binary Search Tree Testing ***");
        pl("Please enter the file you would like to test:");
        Scanner console = new Scanner(System.in);
        String file = console.nextLine();
        Scanner inputFile = new Scanner(new File("test/" + file)); // read user input test file from test folder
        while (inputFile.hasNextLine()) {  // fill the tree with data
            key = Integer.parseInt(inputFile.nextLine().trim());  // save the key
            value = inputFile.nextLine().trim();  // save the value
            if (key != 0 && !value.equals("END")) {  // if 0 or END do not add to tree
                tree.add(key, value);
            }
        }
        int choice;
        do {  // testing menu using switch and do while loop
            pl("");
            pl("Choose method to test:");
            pl("");
            pl("1. About the creator");
            pl("2. toTree - Display the tree");
            pl("3. toSortedList - Display a sorted list of tree data");
            pl("4. add - Add a new Node to the tree");
            pl("5. find - Search for a Node's value by key");
            pl("6. Exit");
            choice = console.nextInt();
            switch (choice) {
                case 1:
                    pl(tree.about());
                    break;
                case 2:
                    pl(tree.toTree());
                    break;
                case 3:
                    pl(tree.toSortedList());
                    break;
                case 4:
                    //console.nextLine();
                    pl("Enter a key: ");
                    key = console.nextInt();
                    pl("Enter a value: ");
                    console.nextLine();
                    value = console.nextLine();
                    tree.add(key, value);
                    pl("Node successfully added");
                    break;
                case 5:
                    console.nextLine();
                    pl("Enter a key: ");
                    key = console.nextInt();
                    pl(tree.find(key));
                    break;
                case 6:
                    pl("Bye bye then!");
                    break;
                default:
                    pl("Please enter a valid option:");
                    break;
            }
        } while (choice != 6);
    }

    public static void pl (String line) {  // helper method to print line
        System.out.println(line);
    }


}

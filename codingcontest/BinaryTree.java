package codingcontest;

class Node {
    int key; // this would be the value of the node
    Node left, right; // Just simply remember them as the left and right child of a root node.

    // Ok, thanks for defining the key elements that forms a tree.
    // How to place them? Means, providing a structure to it.
    // Great! We've got constructor to do it.
    public Node(int item) {
        key = item;
        left = null;
        right = null; // Basically right and left are the objects of the class Node.
    }
}

public class BinaryTree {

    // Let's make a simple binary tree
    // You need to place root node first. Yes, you've just entered the word "Node"
    // so you have to create a root object for the Node class.
    Node root;

    // Place the root node into the Binary tree now which means pass the key value
    // to your root node
    // And keep this as a standard way of creating a node with the key.
    BinaryTree(int key) {
        root = new Node(key);
    }

    // Default definition of a binary tree which is having only the root node simply
    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); // This implies that you've just created an empty tree with only the root
                                            // node. Obviously this would be your starting point
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.right = new Node(5);
        tree.root.left.left = new Node(4);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
    }
}

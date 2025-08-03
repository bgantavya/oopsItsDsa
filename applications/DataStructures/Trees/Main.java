
import java.lang.classfile.components.ClassPrinter;

class Node{
    int key;
    Node left, right;
    public Node(int item){
        key = item;
        left = right = null;
    }
}

class BST{
    Node Ins(Node root, int key){
        if(root == null){
            return new Node(key);
        }
        if(key < root.key){
            root.left = Ins(root.left, key);
        }
        else if(key > root.key){
            root.right = Ins(root.right, key);
        }
        return root;
    }

}

public class Main{
    public static void main(String[] args) {
        BST tree = new BST();
        tree.Ins(30);
    }}


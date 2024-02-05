package Recursion.Tree;

import java.util.Arrays;

public class BinaryTree2 {
    public static void main(String[] args) {
        Tree2 tree = new Tree2();
        tree.addRoot('A');
        tree.addLeftChild('B', 0);
        tree.addRightChild('C', 0);
        tree.addLeftChild('D', 1);
        tree.addRightChild('E', 1);
        tree.print();
       // System.out.println(tree.getLeftChild('A'));
        tree.preOrder('A');
        System.out.println();
        tree.inOrder('A');
    }
}

// Helper class
class Tree2 {
    // Member variables of this class
    static int root = 0;
    static char[] arr = new char[10];

    // Creating root node
    public void addRoot(char key) {
        arr[0] = key;
    }

    // Creating left child of root
    public void addLeftChild(char key, int root) {
        int left = (root * 2) + 1;
        if (arr[root] == 0)
            System.out.printf(
                    "Can't set child at %d, no parent found\n", left);
        else
            arr[left] = key;
    }

    // Creating right child of root
    public void addRightChild(char key, int root) {
        int right = (root * 2) + 2;
        if (arr[root] == 0)
            System.out.printf(
                    "Can't set child at %d, no parent found\n", right);
        else
            arr[right] = key;
    }

    // To print tree
    public void print() {
        // Iterating using for loop
        for (int i = 0; i < 10; i++)
            if (arr[i] != 0)
                System.out.print(arr[i]);
            else
                System.out.print("-");
        System.out.println();
    }

    public int findNode(char key){
        if (key==0) return -1;
        return Arrays.binarySearch(arr,key);
    }

    public char getLeftChild(char key){
        int node = findNode(key);
        if (key==-1) return 0;
        if (node*2+1<arr.length)
            return arr[node*2+1];
        else return 0;
    }

    public char getRightChild(char key){
        int node = findNode(key);
        if (key==-1) return 0;
        if (node*2+2<arr.length)
            return arr[node*2+2];
        else return 0;
    }
    public void inOrder (char key){

        if (getLeftChild(key)!=0) inOrder(getLeftChild(key));
            System.out.print(key+" ");
        if (getRightChild(key)!=0) inOrder(getRightChild(key));

    }
    public void preOrder (char key){
        System.out.print(key+" ");
        if (getLeftChild(key)!=0) preOrder(getLeftChild(key));
        if (getRightChild(key)!=0) preOrder(getRightChild(key));
    }

//    public void inOrderFull (char key){  // обход по произвольным деревьям только через for и postOrder или preOrder
//    for (int i=0;i<arr.length;i++){
//        System.out.println(key);
//        preOrder
//    }
//        if (getLeftChild(key)!=0) inOrder(getLeftChild(key));
//        System.out.println(key);
//        if (getRightChild(key)!=0) inOrder(getRightChild(key));
//
//    }
}

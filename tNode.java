import java.util.*;

class tNode{
    int key;
    tNode left;
    tNode right;

    tNode(int key){
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

public class tryBST{
    tNode root;

    public tryBST(){
        root = null;
    }

    public tNode insert(tNode node,int key){
        if (node == null){
            return new tNode(key);
        }

        if (key<node.key){
            node.left = insert(node.left, key);
        }else if(key>node.key){
            node.right = insert(node.right, key);
            return node;
        }

        public void insert(int key){
            root = insert(root,key);
        }

        public tNode buildBalanced(int[] arr, int start,int end){
            if (start>end){
                return null;
            }
            int mid =(start + end)/2;
            tNode node = new tNode(arr[mid]);
            node.left = buildBalanced(arr, start, mid -1);
            node.right = buildBalanced(arr, mid +1, end);
            return node;
        }

        public boolean isBSt(){
            return isBST(root, integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        private boolean isBST(tNode node, int min, int max){
            if(node == null){
                return true;
            }
            if(node.key <= min|| node.key>= max){
                return false;
            }

            return isBST(node.left, min, node.key) && isBST(node.right, node.key, max);
        }

    }
    private tNode deleteNode(tNode node, int key) {
        if (node == null) {
            return null;
        }
        if (key < node.key) node.left = deleteNode(node.left, key);
        else if (key > node.key) {
            node.right = deleteNode(node.right, key);
        }
        else {
            if (node.left == null) {
                return node.right;
            }
            else if (node.right == null) {
                return node.left;
            }
            
            node.key = minValue(node.right);
            node.right = deleteNode(node.right, node.key);
        }
        return node;
    }

    private int minValue(tNode node) {
        int minv = node.key;
        while (node.left != null) {
            minv = node.left.key;
            node = node.left;
        }
        return minv;
    }

    public void deleteEven() {
        root = deleteEven(root);
    }
    
}
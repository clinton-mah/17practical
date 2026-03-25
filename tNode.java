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
    }
}
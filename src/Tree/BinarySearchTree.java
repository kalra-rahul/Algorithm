package Tree;

class Node{
    int data; Node left, right;
    Node(int data){
        this.data = data;
    }
}

class Bst{
    public Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }
        if(root.data < val){
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrderTraversal(Node root){
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data);
        inOrderTraversal(root.right);
    }

    public Node nodeDelete(Node root, int val){
        if(root.data < val){
            root.right = nodeDelete(root.right,val);
        }else if(root.data > val){
            root.left = nodeDelete(root.left,val);
        }else{
            //case-1
            if(root.left == null && root.right == null){
                return null;
            }

            //case-1
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }

            Node IS = findInOrderSuccessor(root.right);
            root.data =  IS.data;
            root.right = nodeDelete(root.right,IS.data);
        }
        return root;
    }

    public Node findInOrderSuccessor(Node root){
        if(root.left !=null){
            findInOrderSuccessor(root.left);
        }
        return root;
    }
}

class BinarySearchTree {
    public static void main(String[] args) {
        Bst bst = new Bst();
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = bst.insert(root,values[i]);
        }
        Bst.inOrderTraversal(root);
    }
}





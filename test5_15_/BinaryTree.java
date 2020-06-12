package test5_15_;

/**
 * @author Q
 * @create 2020-05-15-20:09
 */
class Node{
    public char val;
    public Node left;
    public Node right;

    public Node(char val) {
        this.val = val;
    }
}
public class BinaryTree {
    public static Node buildTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }
    // 前序遍历   递归来实现
    public static void preOrderTraversal(Node root){
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // 中序遍历
    public static void inOrderTraversal(Node root){
        if (root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }
    // 后序遍历
    public static void postOrderTraversal(Node root){
        if (root==null){
            return;
        }
        postOrderTraversal(root.left);

        postOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }
    // 遍历思路-求结点个数   前序遍历
    static int size = 0;
    public static int getSize1(Node root){
        if (root==null){
            return size;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);

        return size;
    }
    // 子问题思路-求结点个数
    public static int getSize2(Node root){
        if(root == null) {
            return 0;
        }
//        size++;
        return getSize2(root.left)+getSize2(root.right)+1;

    }
    //遍历思路-求叶子结点个数
    static int leafSize = 0;
    public static void getLeafSize1(Node root){
        if(root == null) {
            return;
        }
        if (root.left==null&&root.right==null){
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
//        return leafSize;
    }




    public static void main(String[] args) {

        BinaryTree binaryTree=new BinaryTree();
        preOrderTraversal(buildTree());
        System.out.print(" size:");
        System.out.println(getSize2(buildTree()));
        getLeafSize1(buildTree());
        System.out.println("叶子节点："+leafSize);
        System.out.println();
        inOrderTraversal(buildTree());
        System.out.println();
        postOrderTraversal(buildTree());
        System.out.println();
    }

}




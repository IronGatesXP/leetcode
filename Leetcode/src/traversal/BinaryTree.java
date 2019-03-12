package traversal;

/**
 * @author XP
 * @date 2018/5/30 14:35
 */
public class BinaryTree {
    public Node init(){
        Node I = new Node(8,null,null);
        Node H = new Node(4,null,null);
        Node G = new Node(2,null,null);
        Node F = new Node(7,null,I);
        Node E = new Node(5,H,null);
        Node D = new Node(1,null,G);
        Node C = new Node(9,F,null);
        Node B = new Node(3,D,E);
        Node A = new Node(6,B,C);
        return A;
    }

    public void printNode(Node node){
        System.out.print(node.getData());
    }

    public void theFirstTraversal(Node root){
        printNode(root);
        if(root.getLeftNode() != null)
            theFirstTraversal(root.getLeftNode());
        if(root.getRightNode() != null)
            theFirstTraversal(root.getRightNode());
    }

    public void theInorderTraversal(Node root){
        if(root.getLeftNode() != null)
            theInorderTraversal(root.getLeftNode());
        printNode(root);
        if(root.getRightNode() != null)
            theInorderTraversal(root.getRightNode());
    }

    public void thePostorderTraversal(Node root){
        if(root.getLeftNode() != null)
            thePostorderTraversal(root.getLeftNode());
        if(root.getRightNode() != null)
            thePostorderTraversal(root.getRightNode());
        printNode(root);
    }

    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.init();
        System.out.println("前序遍历的结果：");
        binaryTree.theFirstTraversal(root);
        System.out.println();
        System.out.println("中序遍历的结果：");
        binaryTree.theInorderTraversal(root);
        System.out.println();
        System.out.println("后序遍历的结果：");
        binaryTree.thePostorderTraversal(root);
        System.out.println();
    }
}

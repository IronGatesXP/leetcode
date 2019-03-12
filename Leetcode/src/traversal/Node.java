package traversal;

/**
 * @author XP
 * @date 2018/5/30 14:27
 */
public class Node {
    private int data;
    private Node leftNode;
    private Node rightNode;
    public Node(int data,Node leftNode, Node rightNode){
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }

    public void setLeftNode(Node leftNode){
        this.leftNode = leftNode;
    }
    public Node getLeftNode(){
        return leftNode;
    }

    public void setRightNode(Node rightNode){
        this.rightNode = rightNode;
    }
    public Node getRightNode(){
        return rightNode;
    }
}

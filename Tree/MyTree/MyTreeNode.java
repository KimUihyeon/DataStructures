

public class MyTreeNode {
    private MyTreeNode leftChild;
    private MyTreeNode rightChild;
    private Object data;

    public MyTreeNode(Object data){
        this.data = data;
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public MyTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(MyTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public MyTreeNode getRightChild() {
        return rightChild;
    }

    public void setReightChild(MyTreeNode rightChild) {
        this.rightChild = rightChild;
    }


    public boolean isLeftNode(){
        return leftChild != null;
    }

    public boolean isReightNode(){
        return rightChild != null;
    }
}
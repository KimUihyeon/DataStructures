import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class MyTree {

    private  MyTreeNode rootNode;

    public MyTreeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(MyTreeNode rootNode) {
        this.rootNode = rootNode;
    }

    /*
     * DFS 깊이 우선 탐색 (전위순회 _ pre Order) DLR
     *              1
     *          2      3
     *       4    5   6    7
     * 1 -> 2 -> 4 -> 5 -> 3 -> 6 -> 7
     */
    public  void DFS_PreOrder(MyTreeNode node){
        if(node !=null) {
            System.out.print(node.getData().toString() +" -> ");

            if(node.isLeftNode()){
                DFS_PreOrder(node.getLeftChild());
            }
            if (node.isReightNode()){
                DFS_PreOrder(node.getRightChild());
            }
        }
    }

    public void DFS_PreOrder2(MyTreeNode node){
        Stack<MyTreeNode> stack = new Stack<>();
        stack.add(node);

        while ( !stack.isEmpty() ){
            node = stack.pop();

            System.out.println(node.getData());

            if (node.isReightNode()){
                stack.add(node.getRightChild());
            }

            if(node.isLeftNode()){
                stack.add(node.getLeftChild());
            }
        }
    }


    /*
     * DFS 깊이 우선 탐색 (중위순환 _ In Order)  LDR
     *              1
     *          2      3
     *       4    5   6    7
     *  4-> 2-> 5-> 1 -> 6-> 3 ->7
     */
    public  void DFS_InOrder(MyTreeNode node){
        if(node !=null) {
            if(node.isLeftNode()){
                DFS_InOrder(node.getLeftChild());
            }

            System.out.print(node.getData().toString() +" -> ");


            if (node.isReightNode()){
                DFS_InOrder(node.getRightChild());
            }
        }

    }

    /*
     * DFS 깊이 우선 탐색 (후위순환 _ Post Order)  LRD
     *              1
     *          2      3
     *       4    5   6    7
     *  4 ->5 ->2 ->6 ->7 ->3 ->1
     */
    public  void DFS_PostOrder(MyTreeNode node){

        if(node !=null) {
            if(node.isLeftNode()){
                DFS_PostOrder(node.getLeftChild());
            }

            if (node.isReightNode()){
                DFS_PostOrder(node.getRightChild());
            }

            System.out.print(node.getData().toString() +" -> ");

        }

    }


    /*
     * BFS 너비 우선 탐색 (층별순환 _ Level Order)
     *              1
     *          2      3
     *       4    5   6    7
     * 1 -> 2-> 3 -> 4 -> 5 -> 6 ->7
     */
    public void BFS(MyTreeNode node){

        Queue<MyTreeNode> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()){

            node = queue.poll();

            System.out.print(node.getData().toString() +" -> ");

            if(node.isLeftNode()){
               queue.add(node.getLeftChild());
            }
            if (node.isReightNode()){
                queue.add(node.getRightChild());
            }
        }
    }


}
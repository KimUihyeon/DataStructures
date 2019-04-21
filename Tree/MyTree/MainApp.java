
public class MainApp {
    public static void main(String[] arg){

        MyTreeNode root = new MyTreeNode(1);
        {
            MyTreeNode node_2 = new MyTreeNode(2);
            MyTreeNode node_3 = new MyTreeNode(3);


            root.setLeftChild(node_2);
            root.setReightChild(node_3);
        }


        MyTree tree = new MyTree();
        tree.setRootNode(root);
        tree.DFS_PreOrder2(tree.getRootNode());
    }
}

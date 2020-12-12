import BinaryTree.BinaryTree;

public class Main {
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(12);
        tree.add(20);
        tree.add(18);
        tree.add(8);


        tree.traversePreOrder(tree.root);
        tree.delete(15);
        System.out.println();
        tree.traversePreOrder(tree.root);
        tree.add(16);
        System.out.println();
        tree.traversePreOrder(tree.root);
        tree.delete(10);
        System.out.println();
        tree.traversePreOrder(tree.root);
        tree.delete(8);
        System.out.println();
        tree.traversePreOrder(tree.root);
        tree.delete(12);
        tree.delete(16);
        tree.delete(18);
        tree.delete(20);
        tree.delete(5);
        tree.add(10);
        System.out.println();
        tree.traversePreOrder(tree.root);




    }
}

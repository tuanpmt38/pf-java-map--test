public class TestBTS {
    public static void main(String[] args) {
        //create a BST
        BST<Integer> tree = new BST<>();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        //duyet trung thu tu
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        //duyet hau thu tu
        System.out.println();
        System.out.println("postorder (sorted):");
        tree.postorder();
        //duyet tien thu tu
        System.out.println();
        System.out.println("preoder (sorted):");
        tree.preorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}

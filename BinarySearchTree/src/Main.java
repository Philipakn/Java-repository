public class Main {

    public static void main(String[] args) {

        Node root = new Node(1000);
        root.left = new Node(80);
        root.left.left = new Node(70);
        root.left.right = new Node(100);
        root.right = new Node(120);
        root.right.left = new Node(100);
        root.right.right = new Node(110);

        root.insert(root);
        root.inordertraversal(root);
        System.out.println(" ");
        root.preordertraversal(root);
        System.out.println(" ");
        root.postordertraversal(root);
    }
}
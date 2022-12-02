public class Node {

    Node root;
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
    }

    public void insert(Node node) {

        if (node != null) {

            if (node.data < node.left.data) {

                node = node.left.left;
            } else {

                node = node.right.right;
            }
        } else {

            node = root;
        }
    }

    public void delete(Node node) {

        if (node == null) {

            System.out.println(("Tree is already empty, no deletion required"));

        } else {

            if (node.data == root.data) {

                delete(root.right);
                root = root.right;
            }
        }
    }

    public void inordertraversal(Node node) {

        if (node != null) {
            inordertraversal(node.left);
            System.out.println("Key is: " + node.data);
            inordertraversal(node.right);
        }
    }

    public void preordertraversal(Node node) {

        if (node != null) {
            System.out.println("Key is: " + node.data);
            preordertraversal(node.left);
            preordertraversal(node.right);
        }
    }

    public void postordertraversal(Node node) {

        if (node != null) {
            postordertraversal(node.left);
            postordertraversal(node.right);
            System.out.println("Key is: " + node.data);
        }
    }
}

public class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;
    TreeNode root;


    TreeNode(int data) {
        this.data = data;
    }

    // Root-Left-Right for preorder
    public void preordertraversal(TreeNode node) {

        if (node != null) {
            System.out.println("Key is: " + node.data);
            preordertraversal(node.left);
            preordertraversal(node.right);
        }
    }

    // Left-Right-Root for postorder
    public void postordertraversal(TreeNode node) {

        if (node != null) {
            postordertraversal(node.left);
            postordertraversal(node.right);
            System.out.println("Key is: " + node.data);
        }
    }

    // Left-Root-Right for postorder
    public void inordertraversal(TreeNode node) {

        if (node != null) {
            postordertraversal(node.left);
            System.out.println("Key is: " + node.data);
            postordertraversal(node.right);
        }
    }

}


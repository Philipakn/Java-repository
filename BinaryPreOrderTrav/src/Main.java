public class Main {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(80);
        root.left = new TreeNode(60);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(40);
        root.right.right = new TreeNode(50);

        root.preordertraversal(root);
        System.out.println(" ");
        root.postordertraversal(root);
        System.out.println(" ");
        root.inordertraversal(root);

    }
}
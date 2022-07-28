import java.lang.Math;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val, TreeNode left_node, TreeNode right_node) {
        this.val = val;
        this.left = left_node;
        this.right = right_node;
    }

    public static int getSize(TreeNode t) {
        if (t == null) {
            return 0;
        }

        return getSize(t.left) + getSize(t.right) + 1;
    }

    public static int getHeight(TreeNode t) {
        if (t == null) {
            return -1;
        }
        return Math.max((getHeight(t.left)), (getHeight(t.right))) + 1;
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        System.out.println(getHeight(t));
    }
}
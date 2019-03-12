package StringProblems;

public class ConstructStringFromBinaryTree_606 {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * 每一个点的构造字符串的方式实际是一样的，对于一个节点，一共有四种可能的输出
     * val(left.val)(right.val)
     * val(left.val)
     * val()(right.val)
     * val
     * 只要把一个节点的情况处理完了，作为子节点的插入直接调用这个方法来表示他的子节点。这就是递归的意义！！！
     * @param t
     * @return
     */
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        if (t.left == null && t.right == null) {
            return t.val + "";
        }
        if (t.right == null) {
            return t.val + "(" + tree2str(t.left) + ")";
        }
        return t.val + "(" + tree2str(t.left) +")(" + tree2str(t.right) + ")";
    }

    /**
     * 构造二叉树
     */
    public  TreeNode initTree(int[] a) {
        return createBinaryTree(a, 0);
    }

    // 将index作为参数就可以考虑到越界的情况
    private  TreeNode createBinaryTree(int[] a, int index) {
        TreeNode node = null;
        if (index < a.length) {
            node = new TreeNode(a[index]);
            node.left = createBinaryTree(a, 2 * index + 1);
            node.right = createBinaryTree(a, 2 * index + 2);
            return node;
        }
        return node;
    }

    /**
     * 二叉树的前序遍历
     */
    public void preOrderRec(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

}

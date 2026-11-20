import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    List<Integer> lists = List.of(1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1);

    class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static int index = -1;

    Node binaryTree(List<Integer> lists) {
        index++;
        if (lists.get(index) == -1)
            return null;

        Node root = new Node(lists.get(index));
        root.left = binaryTree(lists);
        root.right = binaryTree(lists);

        return root;
    }

    void preOrderTravarsal(Node root) {
        if (root == null)
            return;

        System.out.println("Pre-order Travarsal :- " + root.data);
        preOrderTravarsal(root.left);
        preOrderTravarsal(root.right);
    }

    void inOrderTravarsal(Node root) {
        if (root == null)
            return;

        inOrderTravarsal(root.left);
        System.out.println("In-order Travarsal :- " + root.data);
        inOrderTravarsal(root.right);
    }

    void postOrderTraversal(Node root) {
        if (root == null)
            return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println("Post-order Travarsal :- " + root.data);
    }

    void levelOrderTraversal(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);

        while (queue.size() > 0) {
            Node currentNode = queue.poll();
            System.out.println("Level Traversal >> " + currentNode.data);

            if (currentNode.left != null)
                queue.offer(currentNode.left);
            if (currentNode.right != null)
                queue.offer(currentNode.right);
        }

        System.out.println("");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // Tree Building method
        Node node = tree.binaryTree(tree.lists);

        // Tree: Pre-order Traversal method : root, left, right
        System.out.println("\nTree: Pre-order Traversal");
        tree.preOrderTravarsal(node);

        System.out.println("\nTree: In-order Traversal");
        // Tree: In-order Traversal method : left, root, right
        tree.inOrderTravarsal(node);

        System.out.println("\nTree: POST-order Traversal");
        // Tree: Post-order Traversal method: left, right, root
        tree.postOrderTraversal(node);

        System.out.println("\nTree: Level-order Traversal");
        // Tree: Level-order Traversal method: using queue
        tree.levelOrderTraversal(node);
    }
}
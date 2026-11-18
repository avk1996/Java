import java.util.List;

public class BinaryTree {
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

    Node preOrder(List<Integer> lists) {
        index++;
        if (lists.get(index) == -1)
            return null;

        Node root = new Node(lists.get(index));
        root.left = preOrder(lists);
        root.right = preOrder(lists);

        return root;
    }

    public static void main(String[] args) {
        List<Integer> lists = List.of(1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1);
        BinaryTree tree = new BinaryTree();
        Node node = tree.preOrder(lists);
        System.out.println(node.data);
        System.out.println(node.left.data);
        System.out.println(node.right.data);
    }
}
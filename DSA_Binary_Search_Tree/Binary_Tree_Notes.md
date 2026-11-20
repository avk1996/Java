# Binary Tree -- Notes

## 1. What is a Binary Tree?

A **binary tree** is a hierarchical data structure in which each node
can have **at most two children**:

### Properties of Binary Tree

1. No duplicate elements.
2. In-order gives sorted order.
3. No. of BST have n nodes.

-   **Left child**
-   **Right child**

The first node is called the **root**. A node with no children is called
a **leaf node**.

### Example

``` text
        1          <- Root
       / \
      2   3        <- Children of 1
     / \   \
    4   5   6      <- Leaf nodes: 4, 5, 6
```

In this example: - `1` is the root. - `2` is the left child of `1`. -
`3` is the right child of `1`. - `4`, `5`, and `6` are leaf nodes.

## 2. Basic Terminology

Consider this tree:

``` text
          A
         / \
        B   C
       /   / \
      D   E   F
```

  -----------------------------------------------------------------------
  Term                    Meaning                 Example
  ----------------------- ----------------------- -----------------------
  Root                    Topmost node            A

  Parent                  A node that has         A is parent of B and C
                          children                

  Child                   A node connected below  B and C are children of
                          a parent                A

  Sibling                 Nodes with the same     B and C
                          parent                  

  Leaf                    A node with no children D, E, F

  Edge                    Link between two nodes  A--B

  Subtree                 A node and all its      Subtree rooted at C
                          descendants             

  Depth                   Number of edges from    Depth of E is 2
                          root to a node          

  Height                  Number of edges on the  Height of A is 2
                          longest downward path   
                          to a leaf               
  -----------------------------------------------------------------------

> Some books define height using the number of nodes rather than edges.
> Check which convention your course uses.

## 3. Structure of a Binary Tree Node in Java

Each node stores: 1. Its value (`data`). 2. A reference to its left
child (`left`). 3. A reference to its right child (`right`).

``` java
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
```

A `null` reference means that the node does not have a child on that
side.

## 4. Creating a Binary Tree Manually

Example tree:

``` text
        1
       / \
      2   3
     / \
    4   5
```

Java code:

``` java
public class BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
    }
}
```

The `root` reference points to the first node. From there, we connect
the other nodes using `left` and `right`.

## 5. Building a Binary Tree Using Preorder Input

A common way to construct a binary tree is to provide its nodes in
**preorder** sequence.

In this representation: - Read the root first. - Then read the left
subtree. - Then read the right subtree. - Use `-1` to represent a `null`
node.

### Example input

``` text
1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1
```

This represents:

``` text
          1
         / \
        2   3
           / \
          4   5
```

How to read the input:

  Value   Meaning
  ------- --------------------------
  1       Root node
  2       Left child of 1
  -1      Left child of 2 is null
  -1      Right child of 2 is null
  3       Right child of 1
  4       Left child of 3
  -1      Left child of 4 is null
  -1      Right child of 4 is null
  5       Right child of 3
  -1      Left child of 5 is null
  -1      Right child of 5 is null

### Java implementation

``` java
import java.util.List;

public class BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    int index = -1;

    Node buildTree(List<Integer> values) {

        index++;

        if (values.get(index) == -1) {
            return null;
        }

        Node root = new Node(values.get(index));

        root.left = buildTree(values);
        root.right = buildTree(values);

        return root;
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        List<Integer> values = List.of(
            1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1
        );

        Node root = tree.buildTree(values);
    }
}
```

**Important points:** - `index` keeps track of the current position in
the input list. - Each recursive call consumes one value. - When the
value is `-1`, the method returns `null`. - Otherwise, it creates a node
and recursively builds its left and right subtrees. - `index` is an
instance variable here, so it belongs to the `BinaryTree` object. -
Create a new `BinaryTree` object, or reset `index` to `-1`, before
building another tree with the same object.

## 6. Tree Traversals

Traversal means visiting every node in a tree in a particular order.

Use this tree for the examples:

``` text
          1
         / \
        2   3
       / \   \
      4   5   6
```

### A. Preorder Traversal (Root → Left → Right)

Order: 1. Visit the root. 2. Traverse the left subtree. 3. Traverse the
right subtree.

``` text
          1  (1st)
         / \
    (2nd)2  3 (5th)
       / \   \
  (3rd)4  5   6 (7th)
          (4th)  (6th)
```

**Output:**

``` text
1 2 4 5 3 6
```

Java:

``` java
void preorder(Node root) {
    if (root == null) {
        return;
    }

    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
}
```

### B. Inorder Traversal (Left → Root → Right)

Order: 1. Traverse the left subtree. 2. Visit the root. 3. Traverse the
right subtree.

**Output:**

``` text
4 2 5 1 3 6
```

Java:

``` java
void inorder(Node root) {
    if (root == null) {
        return;
    }

    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}
```

### C. Postorder Traversal (Left → Right → Root)

Order: 1. Traverse the left subtree. 2. Traverse the right subtree. 3.
Visit the root.

**Output:**

``` text
4 5 2 6 3 1
```

Java:

``` java
void postorder(Node root) {
    if (root == null) {
        return;
    }

    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
}
```

### D. Level Order Traversal (Level by Level)

Level order traversal visits nodes one level at a time, from left to
right. It commonly uses a **Queue**.

``` text
Level 0:          1
                 / \
Level 1:         2   3
                / \   \
Level 2:        4   5   6
```

**Output:**

``` text
1 2 3 4 5 6
```

Java:

``` java
import java.util.LinkedList;
import java.util.Queue;

void levelOrder(Node root) {

    if (root == null) {
        return;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {

        Node current = queue.poll();

        System.out.print(current.data + " ");

        if (current.left != null) {
            queue.add(current.left);
        }

        if (current.right != null) {
            queue.add(current.right);
        }
    }
}
```

## 7. Quick Comparison of Traversals

For this tree:

``` text
          1
         / \
        2   3
       / \   \
      4   5   6
```

  Traversal     Rule                Output
  ------------- ------------------- -------------
  Preorder      Root, Left, Right   1 2 4 5 3 6
  Inorder       Left, Root, Right   4 2 5 1 3 6
  Postorder     Left, Right, Root   4 5 2 6 3 1
  Level order   Level by level      1 2 3 4 5 6

## 8. Types of Binary Trees

### Full Binary Tree

Every node has either zero or two children.

``` text
        1
       / \
      2   3
         / \
        4   5
```

### Complete Binary Tree

Every level is completely filled except possibly the last, and the last
level is filled from left to right.

``` text
        1
       / \
      2   3
     / \  /
    4  5 6
```

### Perfect Binary Tree

Every internal node has exactly two children, and all leaf nodes are at
the same level.

``` text
        1
       / \
      2   3
     / \ / \
    4  5 6  7
```

### Skewed Binary Tree

Each node has only one child.

``` text
    1
     \
      2
       \
        3
         \
          4
```

## 9. Time Complexity

Let `n` be the number of nodes.

  Operation                                          Time Complexity
  -------------------------------------------------- -----------------
  Preorder traversal                                 O(n)
  Inorder traversal                                  O(n)
  Postorder traversal                                O(n)
  Level order traversal                              O(n)
  Visit/search every node in a general binary tree   O(n)

A traversal visits every node once, so its time complexity is `O(n)`.

## 10. Important Things to Remember

-   A binary tree node has at most two children.
-   The first node is called the root.
-   A node with no children is called a leaf.
-   `null` means that a child does not exist.
-   Preorder: Root → Left → Right.
-   Inorder: Left → Root → Right.
-   Postorder: Left → Right → Root.
-   Level order: Visit nodes level by level using a queue.
-   Recursion is commonly used for depth-first traversals.
-   A queue is commonly used for level order traversal.

## 11. Practice Questions

Try these without looking at the answers first.

1.  Create a binary tree with root `10`, left child `20`, and right
    child `30`.

2.  Draw the tree represented by this preorder input:

    ``` text
    1, 2, -1, -1, 3, -1, -1
    ```

3.  Find the preorder, inorder, and postorder traversals of:

    ``` text
            10
           /  \
          20   30
         /    /  \
        40   50   60
    ```

4.  What is the difference between a full binary tree and a complete
    binary tree?

5.  Why does a recursive traversal need a base case such as
    `if (root == null) return;`?

------------------------------------------------------------------------

**Suggested learning order:** First understand nodes and references,
then build a tree manually, then construct it using preorder input, and
finally practise the four traversals.

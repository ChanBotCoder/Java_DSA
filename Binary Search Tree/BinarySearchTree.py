import random

class BinarySearchTree:
    def __init__(self, value, depth=1):
        self.value = value
        self.depth = depth
        self.left = None
        self.right = None

    def insert(self, value):
        if value < self.value:
            if self.left is None:
                self.left = BinarySearchTree(value, self.depth + 1)
                print(f"Tree node {value} added to the left of {self.value} at depth {self.depth + 1}")
            else:
                self.left.insert(value)
        else:
            if self.right is None:
                self.right = BinarySearchTree(value, self.depth + 1)
                print(f"Tree node {value} added to the right of {self.value} at depth {self.depth + 1}")
            else:
                self.right.insert(value)

    def get_node_by_value(self, value):
        if self is None:
            return None
        elif value == self.value:
            return self
        elif value < self.value and self.left is not None:
            return self.left.get_node_by_value(value)
        elif value > self.value and self.right is not None:
            return self.right.get_node_by_value(value)
        return None

    def depth_first_traversal(self):
        if self.left is not None:
            self.left.depth_first_traversal()
        print(self.value)
        if self.right is not None:
            self.right.depth_first_traversal()


if __name__ == "__main__":
    print("Creating Binary Search Tree rooted at value 15:")
    tree = BinarySearchTree(15)

    for _ in range(10):
        tree.insert(int(100 * random.random()))

    print("Printing the inorder depth-first traversal:")
    tree.depth_first_traversal()

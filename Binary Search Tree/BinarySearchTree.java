class BinarySearchTree{
  public int value;
  public int depth;
  public BinarySearchTree left;
  public BinarySearchTree right;

  public BinarySearchTree(int value,int depth){
    this.value = value;
    this.depth = depth;
    this.right = null;
    this.left = null;
  }

  public BinarySearchTree(int value){
    this.value = value;
    this.depth = 1;
    this.left = null;
    this.right = null;
  }

  public void insert(int value){
    if (value < this.value){
      if(this.left = null){
        this.left = new BinarySearchTree(value,this.depth + 1);
        System.out.printf("Tree node %d added to the %s of %d at depth %d \n", value, "left", this.value, this.depth + 1);
      }else{
        this.left.insert(value);
      }
    }else{
      if(this.right = null){
        this.right = new BinarySearchTree(value,this.depth+1);
        System.out.printf("Tree node %d added to the %s of %d at depth %d \n", value, "right", this.value, this.depth + 1);
      }else{
        this.right.insert(value);
      }
    }
  }

  public BinarySearchTree getNodeByValue(int value){
    if(this.value == null){
      return this;
    }else if (value < this.value && this.left != null){
      return this.left.getNodeByValue(value);
    }else if (value > this.value && this.right != null){
      return this.left.getNodeByValue(value);
    }
    return null;
  }

  public void depthFirstTraversal() {
    if (this.left != null) {
      this.left.depthFirstTraversal();
    }
    System.out.println(this.value);
    if (this.right != null) {
      this.right.depthFirstTraversal();
    }
  }

  public static void main(String[] args) {
    System.out.println("Creating Binary Search Tree rooted at value 15:");
    BinarySearchTree tree = new BinarySearchTree(15);

    for (int i = 0; i < 10; i++) {
      tree.insert((int) (Math.random() * 100));
    }

    System.out.println("Printing the inorder depth-first traversal:");
    tree.depthFirstTraversal();
  }
}

// https://www.codecademy.com/learn/paths/pass-the-technical-interview-with-java/tracks/nonlinear-data-structures-java/modules/binary-search-trees-java/cheatsheet

class Node{
  public String data;
  public Node next;

  public Node(String data){
    this.data = data;
    this.next = null;
  }

  public void setNextNode(Node node){
    this.next = node;
  }

  public Node getNextNode(){
    return this.next;
  }

  public static void main(String []args){
    Node firstNode = new Node("I am first node");
    Node secondNode = new Node("I am second node");
    Node thirdNode = new Node("I am Third node");

    firstNode.setNextNode(secondNode);
    secondNode.setNextNode(thirdNode);

    Node current_node = firstNode;

    while(current_node != null){
      System.out.println(current_node.data);
      current_node = current_node.getNextNode();
    }
  }

}

// https://www.codecademy.com/learn/paths/pass-the-technical-interview-with-java/tracks/getting-started-with-data-structures-java/modules/nodes-java/cheatsheet

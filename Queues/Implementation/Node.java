public class Node{
  public String data;
  public Node next;
  public Node prevoius;

  public Node(String data){
    this.data = data;
    this.next = null;
  }

  public void setNextNode(Node node){
    this.next = node;
  }

  public void setPreviousNode(Node node){
    this.previous = node;
  }

  public Node getNextNode(){
    return this.next;
  }

  public Node getPreviousNode(){
    return this.previous;
  }
}

public class LinkedList{
  public Node head;

  public LinkedList(){
    this.head = null;
  }

  public void addToHead(String key, String value){
    Node newHead = new Node(key,value);
    Node currentHead = this.head;
    this.head = newHead;
    if(currentHead != null){
      this.head.setNextNode(currentHead);
    }
  }

  public void addToTail(String key, String value){
    Node tail = this.head;
    if(tail == null){
      this.head = new Node
    }
  }
    
}

public class LinkedList{
  public static void main(String []args){
    LinkedList seasons = new LinkedList();
    //Command
    seasons.printList();
    seasons.addToHead("summer");
    seasons.addToHead("spring");
    seasons.printList();
    seasons.addToTail("fall");
    seasons.addToTail("winter");
    seasons.printList();
    seasons.removehead();
    seasons.printList();
  }

  public Node head;

  public LinkedList(){
    this.head = null;
  }
  public void addToHead(String data){
    Node newhead = new Node(data);
    Node current = this.head;
    this.head = newhead;
    if(current != null) this.head.setNextNode(current);
  }
  public void addToTail(String data){
    Node tail = this.head;
    if(tail == null) this.head = new Node(data);
    else{
      while(tail.getNextNode() != null) tail = tail.getNextNode();
    }
    tail.setNextNode(new Node(data));
  }
  public String removehead(){
    Node removedhead = this.head;
    if(removedhead == null) return null;
    this.head = removedhead.getNextNode();
    return removedhead.data;
  }
  public String printList(){
    String output = "<head> ";
    Node currentNode = this.head;
    while(currentNode != null){
      output += currentNode.data+" ";
      currentNode = currentNode.getNextNode();
    }
    output += " <tail>";
    System.out.println(output);
    return output;
  }
}

// https://www.codecademy.com/learn/paths/pass-the-technical-interview-with-java/tracks/linear-data-structures-java/modules/singly-linked-lists-java/cheatsheet

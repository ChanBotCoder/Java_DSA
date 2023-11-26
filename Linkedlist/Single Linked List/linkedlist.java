public class linkedlist{
  public static void main(string []args){
    linkedlist seasons = new linkedlist();
    //Command
    seasons.printList();
    seasons.addToHead("summer");
    seasons.addToHead("spring");
    seasons.printList();
    seasons.addToTail("fall");
    seasons.addToTail("winter");
    seasons.printList();
    seasons.removeHead();
    seasons.printList();
    
  }
  public Node head;
  public linkedlist(){
    this.head = null;
  }
  public void addtohead(String data){
    Node newhead = new Node(data);
    Node current = this.head;
    this.head = newhead;
    if(currenthead != null) this.head.setNextNode(current);
  }
  public void addtotail(String data){
    Node tail = this.head;
    if(tail == null) this.head = new Node(data);
    else{
      while(tail.getNextNode() != null) tail = tail.getNextNode();
    }
    tail.setNextNode(new Node(data));
  }
  public string removehead(){
    Node removedhead = this.head;
    if(removedhead == null) return null;
    this.head = removedhead.getNextNode();
    return removedhead.data;
  }
  public string printlist(){
    String output = "<head> ";
    Node currentNode = this.head;
    while(currentNOde != null){
      output += currentNode.data+" ";
      currentNode = currentNode.grtNextNode();
    }
    output += " <tail>";
    System.out.println(output);
    return output;
  }
}

// https://www.codecademy.com/learn/paths/pass-the-technical-interview-with-java/tracks/linear-data-structures-java/modules/singly-linked-lists-java/cheatsheet

public class linkedlist{
  public static void main(String []args){
    linkedlist seasons = new linkedlist();
    //Command
    seasons.printlist();
    seasons.addtohead("summer");
    seasons.addtohead("spring");
    seasons.printlist();
    seasons.addtotail("fall");
    seasons.addtotail("winter");
    seasons.printlist();
    seasons.removehead();
    seasons.printlist();
    
  }

  public Node head;
  public linkedlist(){
    this.head = null;
  }
  public void addtohead(String data){
    Node newhead = new Node(data);
    Node current = this.head;
    this.head = newhead;
    if(current != null) this.head.setNextNode(current);
  }
  public void addtotail(String data){
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
  public String printlist(){
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

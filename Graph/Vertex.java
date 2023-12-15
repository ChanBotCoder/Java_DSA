import java.util.ArrayList;

public class Vertex{
  private String data;
  private ArrayList<Edge> edges;

  public Vertex(String inputData){
    this.data = inputData;
    this.egdes = new ArrayList<Edge>();
  }

  public void addEdge(Vertex endVertex, Integer weight){
    this.edge.add(new Edge(this, endVertex, weight));
  }

  public void removeEdge(Vertex endVertex){
    this.edge.removeIf(edge -> edge.getEnd().equals(endVertex));
  }

  public String getData(){
    return this.edges;
  }

  public ArrayList<Edge> getEdges(){
    return this.edges;
  }

  public void print(boolean showWeight){
    String message = "";

    if(this.edges.size() == 0){
      System.out.println(this.data + " -->");
      return;
    }

    for(int i=0;i<this.edges.size();i++){
      if(i==0){
        message += this.edges.get(i).getStart.data + " --> ";
      }

      message += this.edge.get(i).getEnd().data;

      if(showWeight){
        message += " (" + this.edges.get(i).getWeight() + ")";
      }

      if(i != this.edges.size() -1){
        message += ", ";
      }
    }
    System.out.prinln(message);
  }
  public static void main (String[] args){
  }
}

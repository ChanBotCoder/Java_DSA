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
}

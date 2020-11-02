
/**
 * Class Vertex comprises the destinations on the tree in the Driver Class.
 *
 * @author Alana Huitric
 * @version 11/1/2020
 */
public class Vertex
{
   Edge[] adjacencies;
   private String vertexName;
   private Vertex parent;
   private int shortestPath; // set to greatest
   /**
    * Constructor of the vertex class
    * 
    * @param name       Name of vertex
    */
   public Vertex(String name)
   {
       vertexName = name;
       shortestPath = Integer.MAX_VALUE;
   }
   
   /**
    * Sets the parent variable to the given Vertex.
    * 
    * @param newVertex      The Vertex that will be set as parent
    */
   public void setParent(Vertex newVertex)
   {
    this.parent = newVertex;
   }
   
   /**
    * Sets the shortestPath variable to a given integer
    * 
    * @param i      New shortestPath value
    */
   public void setShortestPath(int i)
   {
       shortestPath = i;
   }
   
   /**
    * Returns the parent of the Vertex
    * 
    * @return Vertex        parent of the current Vertex
    */
   public Vertex getParent()
   {
       return parent;
   }
   
   /**
    * Returns the shortestPath of the Vertex
    * 
    * @return shortestPath      integer variable
    */
   public int getShortestPath()
   {
      return shortestPath; 
   }
   
   /**
    * Returns the name of the Vertex
    * 
    * @return name      string variable
    */
   public String getName()
   {
       return vertexName;
    }
    
    /**
     * Prints out Vertex and edge adjacencies
     */
    public void printVertex()
    {
        System.out.println(vertexName + "'s adjacencies are: ");
        for(Edge a: adjacencies)
        {
            a.printEdge();
        }
        System.out.println("current shortest path: " + shortestPath);
    }
}

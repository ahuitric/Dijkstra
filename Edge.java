
/**
 * Class Edge comprises the paths on the tree created in the Driver
 * class, connecting the vertices
 *
 * @author Alana Huitric
 * @version 11/1/2020
 */
public class Edge
{
    private int weight;
    private Vertex target;
    
    /**
     * Constructor for Edge Class
     * 
     * @param connectedVertex       Vertex that the edge connects
     * @param cost      the weight of the edge
     */
    public Edge(Vertex connectedVertex, int cost)
    {
        weight = cost;
        target = connectedVertex;
    }
    
    /**
     * Returns the weight of the edge
     * 
     * @return int      edge's weight
     */
    public int getWeight()
    {
        return weight;
    }
    
    /**
     * Returns the closest Vertex
     * 
     * @return the target vertex
     */
    public Vertex getVertex()
    {
        return target;
    }
    
    /**
     * Prints the edge
     */
    public void printEdge()
    {
       System.out.println(" Edge(" + target.getName() + ", " + weight +")");
    }
}

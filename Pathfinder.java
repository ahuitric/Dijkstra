
/**
 * Class Pathfinder contains Dijkstra's shortest path algorithm
 *
 * @author Alana Huitric
 * @version 11/1/2020
 */
public class Pathfinder
{
    /**
     * Calculates the shortest path from a source Vertex to all the other Vertices in the tree
     * 
     * @param source        The vertex from which all the shortest paths will be calculated (a destination)
     */
    public void calculateShortestPath(Vertex source)
    {
        PriorityQueue queue = new PriorityQueue();
        source.setShortestPath(0);
        queue.enQueue(source);
        while(!queue.isEmpty())
        {
            Vertex u = queue.deQueue();
            Edge[] adj = u.adjacencies;
            for(int i = 0; i < adj.length; i++)
            {
                Edge edge = adj[i];
                Vertex v = edge.getVertex();
                if (u.getShortestPath() + edge.getWeight() < v.getShortestPath())
                {
                    v.setShortestPath(u.getShortestPath() + edge.getWeight());
                    v.setParent(u);
                    queue.enQueue(v);
                }
            }
        }
    }
    
    /**
     * Prints the shortest path from every node to the source node
     * 
     * @param source        The vertex from which all the shortest paths will be calculated
     * @param vs            The array of all vertices
     */
    public void printShortestPaths(Vertex source, Vertex[] vs)
    {
        int len;
        for (Vertex v : vs) 
        {
            len = 0;
            if (v != source) 
            {
                Vertex curr = v;
                System.out.println("Shortest path from " + curr.getName() + " to " + source.getName());
                System.out.print(" " + curr.getName() + " ->");
                while (curr != source) 
                {
                    len += curr.getShortestPath();
                    curr = curr.getParent();
                    if (curr != source)
                    {
                        System.out.print(" " + curr.getName() + " ->");
                    }
                    else 
                    {
                        System.out.print(" " + curr.getName());
                    }
                }
                System.out.println();
                
            }
            if (v != source)
            {
                System.out.println("shortest path length: " + len);
                System.out.println();
            }
        }
    }
}

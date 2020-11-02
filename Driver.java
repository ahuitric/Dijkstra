
/**
 * Running the path :)
 * version 11/1/2020
 */
public class Driver
{
    public static void main(String[] args)
    {
        Pathfinder p = new Pathfinder();
        Vertex n1 = new Vertex("A");
        Vertex n2 = new Vertex("B");
        Vertex n3 = new Vertex("C");
        Vertex n4 = new Vertex("D");
        Vertex n5 = new Vertex("E");
        Vertex n6 = new Vertex("F");
        Vertex n7 = new Vertex("G");
        Vertex[] vertices = {n1,n2,n3,n4,n5,n6,n7};

        n1.adjacencies = new Edge[]{
            new Edge(n2, 75),
            new Edge(n4, 140),
            new Edge(n5, 100),
            new Edge(n3, 30),
        };
        n2.adjacencies = new Edge[]{
            new Edge(n1, 75),
            new Edge(n3, 71),
            new Edge(n6, 120)
        };
        n3.adjacencies = new Edge[]{
            new Edge(n2, 71),
            new Edge(n4, 80),
            new Edge(n1, 30)
        };
        n4.adjacencies = new Edge[]{
            new Edge(n1, 140),
            new Edge(n3, 80),
            new Edge(n6, 20)
        };
        n5.adjacencies = new Edge[]{
            new Edge(n1, 100),
            new Edge(n6, 40),
            new Edge(n7, 21)
        };
        n6.adjacencies = new Edge[]{
            new Edge(n2,120),
            new Edge(n5, 40),
            new Edge(n4, 20),
            new Edge(n7,9)
        };
        n7.adjacencies = new Edge[]{
            new Edge(n6, 9),
            new Edge(n5, 21)
        };

        System.out.println("Calculating shortest path to destination: " + n1.getName());
        System.out.println();
        p.calculateShortestPath(n1);
        p.printShortestPaths(n1, vertices);
        System.out.println();
    } 
}

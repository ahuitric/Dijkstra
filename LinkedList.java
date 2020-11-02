
/**
 * Class LinkedList is the parent class to the Stack class and the 
 * PriorityQueue class.
 * It contains the basic LinkedList methods that are adaptable to other 
 * uses. In this case LinkedList stores nodes containing vertices as 
 * their data.
 * 
 *
 * @author Alana Huitric
 * @version 7/21/18
 */
public class LinkedList
{
    Node head = new Node(null);
    
    /**
     * Inserts a node at the very front of the LinkedList
     * @param newData   The Vertex data that will be stored
     */
    public void insertFront(Vertex newData)
    {
        Node newNode = new Node(newData);
        newNode.next = head.next;
        head.next = newNode;
    }
    
    /**
     * Inserts a node at the very end of the LinkedList
     * @param newData   The Vertex data that will be stored
     */
    public void insertEnd(Vertex newData)
    {
        Node temp = head;
        Node newNode = new Node(newData);
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    /**
     * Removes a node at the front of the LinkedList
     * 
     * @return Vertex       returns vertex that has been removed
     */
    public Vertex removeFront()
    {
        if(head.next != null)
        {
            Node temp = head.next;
            head.next = temp.next;
            return (Vertex) temp.data;
        }
        else
        {
            System.out.println("empty");
            return null;
        }
    }
    
    /**
     * Removes a node at the end of the LinkedList
     * 
     * @return      returns the Vertex that has been removed
     */
    public Vertex removeEnd()
    {
        Node prev = null;
        Node temp = head;
        while(temp.next != null)
        {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return temp.data;
    }
    
    /**
     * Prints out the LinkedList and the Vertex data in each Node
     * 
     * @param dataStructure print(String dataStructure)
     */
    public void print(String dataStructure)
    {
        if( head.next == null)
        {
            System.out.println("Empty " + dataStructure);
        }
        else
        {
           System.out.println(dataStructure + ": ");
           Node temp = head.next;
           while(temp != null)
           {
               temp.data.printVertex();
           }
        }
    }
}

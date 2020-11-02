
/**
 * Class PriorityQueue extends the LinkedList class that inserts
 * Nodes based on priority
 *
 * @author Alana Huitric
 * @version 7/21/18
 */
public class PriorityQueue extends LinkedList
{
    /**
     * Returns if the priority queue is empty
     * 
     * @return true if Priority is empty and false otherwise
     */
    public boolean isEmpty()
    {
        return head.next == null;
    }
    
    /**
     * Inserts nodes based on priority, shorter paths get priority
     * in the Priority Queue
     * 
     * @param newData       Vertex data that the Node will contain
     */
    public void enQueue(Vertex newData) // smallest on left end
    {
        Node newNode = new Node(newData);
        if (head.next == null) 
        {
            head.next = newNode;
        }
        else
        {
            Node temp = head.next;
            Node prev = head;
            boolean notFound = true;
            while(notFound && temp != null)
            {
                if (temp.data.getShortestPath() <= newData.getShortestPath())
                {
                    prev = temp;
                    temp = temp.next;
                }
                else
                {
                    notFound = false;
                    prev.next = newNode;
                    newNode.next = temp;
                }
            }
            if (notFound && temp == null)
            {
                prev.next = newNode;
            }
        }
    }
    
    /**
     * Removes the front of the Priority Queue after the head
     * 
     * @return the removed Vertex
     */
    public Vertex deQueue()
    {
        return super.removeFront();
    }
    
    /**
     * Prints out the Priority Queue
     */
    public void print()
    {
        super.print("Priority Queue");
    }
}

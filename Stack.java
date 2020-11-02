
/**
 * Class Stack is a stack data structure holding Nodes with data
 *
 * @author Alana Huitric
 * @version 7/21/18
 */
public class Stack extends LinkedList
{
    /**
     * Inserts a Node at the front of the Stack
     * 
     * @param newData       The vertex data
     */
    public void push(Vertex newData)
    {
        insertFront(newData);
    }
    
    /**
     * Removes a node from the front of the Stack
     */
    public Vertex pop()
    {
        return removeFront();
    }
    
    /**
     * Prints out the contents of the Stack
     */
    public void print()
    {
        super.print("Stack");
    }
}

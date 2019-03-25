/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
     

    /**
      @return the number of elements in this list
     */
    public int size() {
        int counter = 0;
        if (headReference == null){
            return counter;
        }
        Node currentNode = headReference;
        while (currentNode != null){
            currentNode = currentNode.getReferenceToNextNode();
            counter++;
        }
        return counter;
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
        String finalString = "[";
        if (headReference == null){
            return "[]";
        }
        Node currentNode = headReference;
        while (currentNode != null){
            finalString += currentNode + ",";
            currentNode = currentNode.getReferenceToNextNode();
        }
        return (finalString + "]");
    }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
         if (headReference == null){
            headReference = new Node(val);
            System.out.println("null");
            return true;
        }
        Node oldFirst = headReference;
        headReference = new Node(val, oldFirst);
        System.out.println("nonull");
        return true;
     }
}
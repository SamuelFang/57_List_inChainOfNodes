/**
  Represent a list, implemented in a chain of nodes
  Credit to solutionHolmes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
      The default constructor is fine:
      take zero arguments
      do nothing
     */

    /**
      @return the number of elements in this list
     */
    public int size() {
        // recursive approach seems more perspicuous
        if( headReference == null) return 0;
        else return size( headReference);
    }

    // recursively-called helper
    private int size( Node startingAt) {
        Node next = startingAt.getReferenceToNextNode();
        if( next == null) return 1;
        else return 1+ size( next);
    }


     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
    public String toString() {
        String stringRep = size() + " elements [";

        for( Node node = headReference
           ; node != null
           ; node = node.getReferenceToNextNode() )
            stringRep += node.getCargoReference() + ",";
        return stringRep + "]";
    }


    /**
      Append @value to the head of this list.
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
        headReference = new Node( val, headReference);
        return true;
     }
     
     public Object set( int index, Object newValue ) {
        Node currentNode = headReference;
        int counter = 0;
        while (counter != index){
            currentNode = currentNode.getReferenceToNextNode();
            counter++;
        }
        Object temp = currentNode.getCargoReference();
        currentNode.setCargoReference(newValue);
        return temp;
    }
    
    public Object get( int index ) {
        Node currentNode = headReference;
        int counter = 0;
        while (counter != index){
            currentNode = currentNode.getReferenceToNextNode();
            counter++;
        }
        Object temp = currentNode.getCargoReference();
        return temp;
    }
    
    public boolean add( int index, Object val) {
        if (index == this.size()){
            Node currentNode = headReference;
            int counter = 0;
            while (counter != (index - 1)){
                currentNode = currentNode.getReferenceToNextNode();
                counter++;
            }
            Node newNode = new Node(val);
            currentNode.setReferenceToNextNode(newNode);
        }
        else {
            this.add(index + 1, this.set(index, val));
         }
         return true;
     }
    
    // public int remove( int index) {
         // int temp = elements [index];
         // for( ; index < filledElements; index++)
            // elements[ index] = this.get(index + 1);
        // return temp;
     // }
}
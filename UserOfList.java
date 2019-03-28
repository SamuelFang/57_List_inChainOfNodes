/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );
        
        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
        
        list.set(1, "u");
        
        System.out.println( "populated modified list: " + list
                          + System.lineSeparator());
                          
        System.out.println( "list[1]: " + list.get(1)
                          + System.lineSeparator());
                          
        list.add(4, "d");
        list.add(2, "d");
        
        System.out.println( "list with addition: " + list
                          + System.lineSeparator());
                          
        list.remove(2);
        
        System.out.println( "list with remove: " + list
                          + System.lineSeparator());
    }
}

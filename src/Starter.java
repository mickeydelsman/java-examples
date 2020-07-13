import arrays.and.lists.SimpleListsExample;
import threads.CreateNewThreadExample;

/** class to hold the main method (which is the starting point of the application) **/
public class Starter {

    /* this is the first method the main thread puts on his call stack*/
    public static void main(String[] args) {
        // create a new SimpleListExample object and execute the usingFunctionsWithLists method
        new SimpleListsExample().usingFunctionsWithLists();
        // create a new CreateNewThreadExample object
        new CreateNewThreadExample();
    }

}

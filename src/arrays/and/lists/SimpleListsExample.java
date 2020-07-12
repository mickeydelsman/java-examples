package arrays.and.lists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * this class contains some simple examples of using lists in java
 */
public class SimpleListsExample {

    /* below examples show how to use the arrays class to create lists with predefined values */
    private List<Integer> intergerList = Arrays.asList(1,2,3,2,3,2);
    private List<Object> objectList = Arrays.asList(new Object(), new Object());

    /* example of using functions to work with a list */
    public void usingFunctionsWithLists() {

        // using a stream to print out the string representation of the objects
        objectList.forEach(object -> object.toString());

        // using a stream to filter out and print all the values which equals the number 2
        intergerList.stream()
                .filter(integer -> integer.equals(2))
                .forEach(integer -> System.out.println(String.format("It's a %d..", integer)));

        // using a stream to get the lowest value of the list
        int lowestValue = intergerList.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .get();

        // print value to the console using the system output
        System.out.println(String.format("Lowest value: %d", lowestValue));
    }

}

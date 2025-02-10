import java.util.*;

/**
* Main method to print message
*/
public class HelloWorld {

  public static void main (String[] args) {

    Runtime runtime = Runtime.getRuntime();
  
    System.out.println("Hello world!");

    // Java Program to Display Current Date and Time
    // date feature code source:
    // https://www.geeksforgeeks.org/java-program-to-display-current-date-and-time/
    Date current_Date = new Date();
    System.out.println(current_Date);

    // checking free memory:
    // an approximation to the total amount of memory currently available for
    // future allocated objects, measured in bytes.
    long free_memory = runtime.freeMemory();
    //printing free memory 
    System.out.println("Free memory: " + free_memory + " bytes");
  
  }
}
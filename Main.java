// Import the Array List CLASS
// (from the java.util PACKAGE)
import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      // Declare an ArrayList object
      // <Type is required, each ArrayList can hold one type of object      
      ArrayList<String> buzzwords;

      // DECLARE & CREATE an ArrayList 
      // by calling the CONSTRUCTOR method
      //  Declaration/identifyer     =  call to the cosntructor
      ArrayList<String> shoppingList = new ArrayList <String>();
      
      // ArrayLists can ONLY STORE OBJECTS!!!
      // so for int and double (primtiive types),
      // you must use their WRAPPER CLASSES
      // Integer adn Double "wrap" primitives into OBJECTS
      // objects have methods, primtives don't.
      ArrayList<Integer> ages = new ArrayList<Integer>();
      ArrayList<Double> testScores = new ArrayList<Double>();
      // Java will handle the "wrapping" for you,
      // this is called AUTOBOXING

      // Use the .add( obj ) METHOD to populate/fill list
      testScores.add(99.50);
      System.out.println(testScores); // print [95.5]





   }
}

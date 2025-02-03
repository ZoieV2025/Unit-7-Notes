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
      
      // 7.2: ArrayList METHODS
      // after "new", make call to the CONSTRUCTOR
      ArrayList<String> toBuy = new ArrayList<String>(); 

      // .add(obk) appends obj to END OF LIST
      toBuy.add("frozen mango");
      toBuy.add("frozen pinapple");
      toBuy.add("frozen strawberries");
      toBuy.add("ninja blender");
      toBuy.add("vitamin C gummies");
      System.out.println("SHOPPING LIST: ");
      System.out.println(toBuy);

      // .size() returns in -> number of items
      System.out.println(toBuy.size() + " things left to buy!");

      // .add(int index, obj) -> "INSERT" at index 
      toBuy.add(0, "Extra Mint Gum");
      System.out.println(toBuy);
      // ALSO shifts over elements from that index on
      
      // .get(int index) returns an object of the same type as list holds
      // int lastIndex = toBuy.size() - 1;
      String lastElement = toBuy.get(lastIndex);
      System.out.println(lastElement);
      System.out.println(toBuy.get(3));





   }
}

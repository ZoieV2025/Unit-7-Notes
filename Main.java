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
      int lastIndex = toBuy.size() - 1;
      String lastElement = toBuy.get(lastIndex);
      System.out.println(lastElement);
      System.out.println(toBuy.get(3));

      // .set(int index, obj)REPLACES element at that index with the new obj
      // returns the replaced element (same type as the list holds)
      String replacedElement = toBuy.set(0, "No Aspertane Gum");
      System.out.println(toBuy);
      //Often, you won't need to store the return output
      toBuy.set(2, "Organic frozen pineapple"); // like calling a VOID method
      System.out.println(toBuy);

      // /remove(int index) DELETES element at that index
      // returns the removed objkect (same type as the list holds)
      String removedElement = toBuy.remove(0);
      System.out.println(toBuy);
      System.out.println("Moved to shopping cart: " + removedElement);
      // ALSO shifts all remaining elements to the left (lower index)
      // Often, you won't need to actually store the removed item
      toBuy.remove(3);
      System.out.println(toBuy);

      // PRACTICE: Translate Array actions to ArrayList actions
      ArrayList<String> toDoList = new ArrayList<String>();
      toDoList.add("Do Homework");
      toDoList.add("Help me make dinner");
      toDoList.add("Call grandma");
      System.out.println(toDoList);

   String replacedElement2 = toDoList.set(1, "Order pizza");
   System.out.println(toDoList);

   System.out.println("Here's the first thing to do: " + toDoList.get(0));

   String removedElement3 = toDoList.remove(0);
   System.out.println(toDoList);




   }
}

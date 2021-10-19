package drivers;

import java.util.*;
import java.io.*;
import inventory.*;
/**
 * This class creates and populates Inventory objects with data file contents
 */
public class InventoryEngine {

   public static void main(String [] args) {
      LetterInventory inventory = new LetterInventory();
      testInventory(inventory);

      //populate(inventory,"data/hello.txt");
      //System.out.println("Expected [A=0, B=0, C=0] size=0 "+inventory+" size="+inventory.size());

      //populate(inventory,"data/alphabet.txt");
      //System.out.println("Expected [A=5, B=5, C=5] size=15 "+inventory+" size="+inventory.size());

      //populate(inventory,"data/ipsum.txt");
      //System.out.println("Expected [A=7, B=1, C=4] size=12 "+inventory+" size="+inventory.size());

   }


   /**
    * This method reads a text file and produces an Inventory object based on the file contents
    * @param inventory object used to keep track of various characters
    * @param fileName name of file holding the characters
    */
   public static void populate(Inventory inventory, String fileName) {
      // read in the contents of the file
      // use a try-with statement ot open the file so it
      // is automatically closed
      try(Scanner fileIn = new Scanner(new File(fileName))){
         // file is open, read in a line
         while(fileIn.hasNextLine()) {
            String line = fileIn.nextLine();

            // parse each line in the file into individual chars
            // "hello world!" line
            // need to add it to the inventory that is being passed in
            for (char c : line.toCharArray()) {
               inventory.add(c);
            }
         }
      } catch(FileNotFoundException e){
         System.out.println("File not found " + fileName);
      }

      // parse each line in the file into individual chars

      // add each individual character to the inventory object

   }

   /**
    * This method tests the various methods in the inventory
    * @param inventory object used to keep track of various characters
    */
   public static void testInventory(Inventory inventory) {
      // test add/size method
      inventory.add('a');
      inventory.add('z');
      inventory.add('a');
      inventory.add('B');
      inventory.add('a');

      // test subtract method
      inventory.subtract('a');
      System.out.println(inventory);

      // test get method
      System.out.println("Expected Count of b's: 1   " + inventory.get('b'));

      System.out.println("Expected Count of a's: 2   " + inventory.get('a'));

      // test contains method
      System.out.println("Expected Contains !: false " + inventory.contains('!'));
      System.out.println("Expected Contains a: true " + inventory.contains('a'));


      System.out.println("Expected size: 4 " + inventory.size());

      // test set method with letter in inventory
      System.out.println(inventory);
      inventory.set('c', 3);
      System.out.println("Expected [A=1, B=1, C=3] " + inventory);

      // TODO: test set method with letter not in inventory
      try {
         inventory.set('z', 4);
      } catch (IllegalArgumentException e){
         System.out.println("Cannot set inventory to z");
      }

      // test isEmpty method
      System.out.println("Expected isEmpty(): false " + inventory.isEmpty());

   }

}
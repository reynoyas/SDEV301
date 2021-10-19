package inventory;

import java.util.*;
import java.io.*;

/**
 * This class represents an inventory of the 26 letters in the English alphabet.
 * A LetterInventory object keeps track of how many a’s, how many b’s, etc.
 * are contained in a given string.
 * For example:
 * the letter inventory for the string “Washington State” corresponds to [aaeghinnosstttw].
 * The case of the letter is ignored, so ‘s’ and ‘S’ are exactly the same.
 */
public class LetterInventory implements Inventory {
   // instance field
   private int[] letters; // letters is null here
                          // letters[0]

   private static final int ALPHABET_SIZE = 26;

   // default constructor - need to provide this constructor
   // so memory is constructed for array (so it is no longer null)
   public LetterInventory() {

      letters = new int[ALPHABET_SIZE];
   }

   @Override
   public void add(char c) {
      if(Character.isLetter(c)){
         c = Character.toLowerCase(c);
         // one line of coder here to update the count in the
         // letters array for the character for c
         letters[c - 'a'] += 1;
      }
   }

   @Override
   public void subtract(char c) {
      if(Character.isLetter(c)){
         c = Character.toLowerCase(c);
         letters[c-'a']-=1;
      }
   }

   @Override
   public int get(char c) {
      if(Character.isLetter(c)) {
         c = Character.toLowerCase(c);
         return letters[c - 'a'];
      }
      return -1;
   }

   @Override
   public void set(char c, int count) {
      if(Character.isLetter(c)) {
         c = Character.toLowerCase(c);
         letters[c - 'a'] += count;
      }
   }

   @Override
   public boolean contains(char c) {

      return get(c) > 0;
   }

   @Override
   public int size() {
      int count = 0;
      for (int i = 0; i < letters.length; i++) {
            count+= letters[i];
      }
      return count;
   }


   @Override
   public boolean isEmpty() {
      return size() == 0;
   }
/**
 * Returns a String representation of the inventory with the letters all in lowercase
 * surrounded by square brackets in alphabetical order. The number of occurrences of
 * each letter matches its count in the inventory.
 * For example, an inventory of 4 a’s, 1 b, 1 k and 1 m would be represented as “[aaaabkm]”.
 * @return a bracketed string representation of the letters contained in the inventory
 */
   public String toString(){
        // If you are concatenating many strings together, StringBuilder class
        // is often more efficient(faster)
        StringBuilder toReturn=new StringBuilder("[");

        // for every count in the letters inventory
        for(int i=0;i<letters.length;i++){
           // add each character to the string count times
           for(int count=0;count<letters[i];count++){
              // ascii math performed here
              // Example:
              // 97 + 0 = 'a'
              // 97 + 1 = 'b'
              // 97 + 2 = 'c'
              // 97 + 25 = 'z'
              toReturn.append((char)('a'+i));
           }
        }
         return toReturn.append("]").toString();
   }// end of toString
}

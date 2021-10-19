package inventory;
/*
    Yasaira Reynoso
    SDEV 301
    OCT 1, 2021
*/

import java.util.*;

public class InventoryLog implements Inventory{

    // ArayList field
    ArrayList<Character> log; // null

    public InventoryLog(){
        // constuct ArrayList
        // fieldName - new
        log = new ArrayList<>();
    }

    /**
     * adding the character c to the end of the inventory list
     * @param c character to track in inventory
     */
    //@Override
    public void add(char c) {
        // if c is a letter
        if(Character.isLetter(c)){
            // add to end of the arraylist
            log.add(c);
        }

    }

    /**
     * decrements the count of the character c in the inventory
     * @param c character to track in inventory
     */
    @Override
    public void subtract(char c) {
        if(Character.isLetter(c)){
            c = Character.toLowerCase(c);
            Iterator it = log.iterator();
            while(it.hasNext()){
                char letter= (char) it.next();
                if(letter == c)
                    it.remove();
            }
        }

    }

    /**
     * returns a count of the letter in the inventory,
     * zero
     * @param c character in inventory
     * @return a count of the character in the inventory
     */
    @Override
    public int get(char c) {
       int count = 0;
        if (Character.isLetter(c)) {
            c = Character.toLowerCase(c);
            Iterator it = log.iterator();
            while (it.hasNext()) {
                char letter = (char) it.next();
                if (letter == c)
                    count++;
            }
        }
        return count;
    }

    /**
     * updates the index of the character c in the inventory
     * @param c     character to update in inventory
     * @param index number to update index
     */
    @Override
    public void set(char c, int index) {
        log.set(index, c);
    }


    /**
     * returns true if character is contained in the inventory
     * @param c character
     * @return true if character in inventory, false otherwise
     */
    @Override
        public boolean contains(char c) {
            return log.contains(c);
        }

    /**
     * returns the sum of all counts in the inventory
     *
     * @return total count
     */
    @Override
    public int size() {
        return log.size();
    }

    /**
     * returns true if this inventory is empty (all counts)
     * @return true if all counts are 0, false otherwise
     */
    @Override
        public boolean isEmpty() {
            return log.isEmpty();
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
        for(int index = 0; index < log.size(); index++){
            toReturn.append(log.get(index));
        }

        // add closing bracket
        toReturn.append("]");
        return toReturn.toString();
    }// end of toString

}

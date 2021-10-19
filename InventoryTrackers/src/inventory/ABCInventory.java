package inventory;

import java.util.*;
import java.io.*;

/**
 * This class will keep track of counts for the letters a,A,b,B,c,C
 * ABCInventroy 'is-a' Inventory
 * Class implement Interface
 */
public class ABCInventory implements Inventory {
    // instance fields
    private int aCount;
    private int bCount;
    private int cCount;


    /**
     * default constructor initializes all counts to zero
     * Remember: java will provide this if we do not include in the file
     */
    public ABCInventory() {
        aCount = 0;
        bCount = 0;
        cCount = 0;
    }


    /**
     * increments the count of the character c in the inventory
     *
     * @param c character to track in inventory
     */
    @Override
    public void add(char c) {
        // is character parameter a letter?
        if (Character.isLetter(c)) {
            // convert character c to lowercase
            c = Character.toLowerCase(c);

            switch (c) {
                case 'a':
                    this.aCount++;
                    break;
                case 'b':
                    this.bCount++;
                    break;
                case 'c':
                    this.cCount++;
                    break;
            }// end of switch
        }

    }

    /**
     * decrements the count of the character c in the inventory
     *
     * @param c character to track in inventory
     */
    @Override
    public void subtract(char c) {
        if (Character.isLetter(c)) {
            // convert character c to lowercase
            c = Character.toLowerCase(c);

            switch (c) {
                case 'a':
                    if (aCount != 0) {
                        this.aCount--;
                    }
                    break;
                case 'b':
                    if (aCount != 0) {
                        this.bCount--;
                    }
                    break;
                case 'c':
                    if (aCount != 0) {
                        this.cCount--;
                    }
                    break;
                default:
                    System.out.println("Character " + c + " in not in inventory");
                    break;
            }// end of switch
        }
    }

    /**
     * returns a count of the letter in the inventory, zero otherwise
     *
     * @param c character in inventory
     * @return a count of the character in the inventory
     */
    @Override
    public int get(char c) {
        c = Character.toLowerCase(c);

        switch (c) {
            case 'a':
                return aCount;
            case 'b':
                return bCount;
            case 'c':
                return cCount;
            default:
                System.out.println("Character " + c + " in not in inventory");
                return -1;
        }// end of switch
    }

    /**
     * updates the count of the character c in the inventory (if count is zero or greater)
     *
     * @param c     character to update in inventory, throws IllegalArgumentException if character not in inventory
     * @param count number to update count with, throws IllegalArgumentException if negative
     */
    @Override
    public void set(char c, int count) {
        if (count < 0)
            throw new IllegalArgumentException(count + " is < zero");

        // if c is not a letter 'a' 'b' or 'c'
        if (get(c) == -1)
            throw new IllegalArgumentException(c + " is not in the inventory.");

        // convert character c to lowercase
        c = Character.toLowerCase(c);

        switch (c) {
            case 'a':
                if (count >= 0) {
                    this.aCount = count;
                }
                break;
            case 'b':
                if (count >= 0) {
                    this.bCount = count;
                }
                break;
            case 'c':
                if (count >= 0) {
                    this.cCount = count;
                }
                break;
            default:
                System.out.println("Character " + c + " in not in inventory");
                break;
        }// end of switch
    }

    /**
     * returns true if character is contained in the inventory
     *
     * @param c character
     * @return true if character in inventory, false otherwise
     */
    @Override
    public boolean contains(char c) {
        return get(c) > 0;
    }

    /**
     * returns the sum of all counts in the inventory
     *
     * @return the total count
     */
    @Override
    public int size() {
        return aCount + bCount + cCount;
    }

    /**
     * Returns true if this inventory is empty (all counts are 0)
     *
     * @return true if all counts are 0, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }


    /**
     * @return a string representation of the counts for the letters AaBbCc
     * Example: [A=3, B=4, C=5]
     */
    public String toString() {
        return "[A=" + aCount + ", B=" + bCount + ", C=" + cCount + "]";
    }
}

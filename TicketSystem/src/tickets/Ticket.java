package tickets;

import java.text.*;
import java.util.Locale;

public class Ticket {
    private static final int NUM_EQUALS = 20;
    // instance fields not class fields
    private int seatNum;
    private double cost;
    private String owner;

    // class field
    private static int nextSeatNum = 1;

    // constructors
    // zero parameters nothing coming in
    public Ticket(){
        // make owner and empty string
        // Tickets should cost $50 by default
        // seatNum is being stored in an object
        this("", 50.0);
    }

    // use this(.. ) to replace this code
    // suppose to take owner and cost
    public Ticket(String owner, double cost){
        this.owner = owner;
        this.cost = cost;
        seatNum = nextSeatNum++;
    }

    // getters/setters/methods
    public int getSeatNum(){
        return seatNum;
    }

    public double getCost(){
        return cost;
    }

    public String getOwner(){
        return owner;
    }

    //setter
    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType(){
        return "General Admission";
    }

    // toString()
    @Override
    public String toString() {
        // https://stackoverflow.com/questions/14678523/formatting-a-decimal-within-a-tostring-method
        // making the cost have 2 decimal places
        DecimalFormat format = new DecimalFormat("#.00");

        return "T|====================" + System.lineSeparator() +
                "I|  SEAT #" + seatNum + System.lineSeparator() +
                "C|  COST:  $" + format.format(cost) +
                "\nK|  TYPE:  " + getType() + "\nE| \n"
                + "T|====================\n";
    }

    String addEquals(String result) {
        for (int i = 1; i < NUM_EQUALS; i++) {
            result += "=";
        }
        result += System.lineSeparator();
        return result;
    }
}

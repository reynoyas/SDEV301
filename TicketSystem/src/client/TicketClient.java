package client;

import tickets.*;
import java.util.*;

public class TicketClient { //extends Ticket{
    private static final int NUM_TICKETS = 20;

    public static void main(String[] args){
        // create an ArrayList of Tickets
        ArrayList<Ticket> tickets = new ArrayList<>();

        // calculate the number of general admission
        // tickets which is 98% of NUM_TICKETS
        int generalNUM = (int) Math.floor(0.9 * NUM_TICKETS);
        System.out.println(generalNUM);

        // construct general admission tickets
        // and add to tickets list
        for (int i = 1; i <= generalNUM ; i++) {
            tickets.add(new Ticket());
        }

        // construct the VIP tickets
        // and add to tickets list
        for (int i = 1; i <= NUM_TICKETS - generalNUM; i++) {
            tickets.add(new VIPTicket());
        }

        printTickets(tickets);
    }

    public static void printTickets(ArrayList<Ticket> list){
        for(Ticket t : list){
            System.out.println(t);
        }
    }
}

import org.junit.Test;
import tickets.Ticket;

import static org.junit.Assert.*;

public class TicketTest {

    private static Ticket defaultTicket = new Ticket();
    //private static Ticket paramTicket = new Ticket();
    //private static final String PARAM_TO_STRING;

    @Test
    public void testGetSeatNum(){
        // expected value, method call that you are testing
        assertEquals(1, defaultTicket.getSeatNum());
        // testing toString
        //assertEquals("Ada Lovelace", paramTicket.getSeatNum());
    }

    @Test
    public void testGetSeatCost(){
        assertEquals(50.0, defaultTicket.getCost(), 0.0);
    }

    @Test
    public void testGetOwner(){

        assertEquals("", defaultTicket.getOwner());
    }

    // TODO add testGetType() method
    @Test
    public void testGetType(){
        assertEquals("General Admission", defaultTicket.getType());
    }

    // TODO Add a testParamToString()

}
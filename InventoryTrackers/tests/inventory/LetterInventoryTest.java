package inventory;

import static org.junit.Assert.*;
import org.junit.Test;

public class LetterInventoryTest {

    @Test
    public void testAdd(){
        LetterInventory inv = new LetterInventory();
        inv.add('a');
        inv.add('a');
        assertEquals(2, inv.get('a'));

        inv.add('?');
        assertEquals(-1, inv.get('?'));
    }


    @Test
    public void testSubtract() {
        LetterInventory inv = new LetterInventory();
        inv.add('a');
        inv.subtract('a');
        inv.subtract('a');

        assertEquals(1, inv.get('a'));
    }

    @Test
    public void testSet(){
        LetterInventory inv = new LetterInventory();
        inv.set('a', 1);
        assertEquals(97, 'a');
    }

    @Test
    public void testSize(){
        LetterInventory inv = new LetterInventory();
        inv.add('a');
        inv.add('r');
        inv.add('a');
        inv.add('v');
        assertEquals(4, inv.size());
    }
}
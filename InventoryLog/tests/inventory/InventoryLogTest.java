package inventory;

import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryLogTest {

    @Test
    public void testAdd(){
        InventoryLog log = new InventoryLog();
        log.add('a');
        log.add('a');
        assertEquals(2, log.get('a'));
    }

    @Test
    public void testSubtract(){
        InventoryLog log = new InventoryLog();
        log.add('a');
        log.add('a');
        log.add('v');
        log.subtract('a');
        assertEquals(0, log.get('a'));
    }

    @Test
    public void testGet(){
        InventoryLog log = new InventoryLog();
        log.add('a');
        log.add('a');
        log.add('v');
        assertEquals(1, log.get('v'));
    }

    @Test
    public void testSet(){
        InventoryLog log = new InventoryLog();
        log.add('a');
        log.add('a');
        log.add('v');
        log.set('c', 0);
        assertEquals(1, log.get('c'));
    }

}
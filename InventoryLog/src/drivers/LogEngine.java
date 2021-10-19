package drivers;

import inventory.*;

public class LogEngine {

    public static void main(String[] args){

        Inventory log = new InventoryLog();
        log.add('a');
        log.add('z');
        log.add('c');
        log.add('c');
        log.add('c');
        log.add('a');
        System.out.println(log);

        log.subtract('c');    // [azcca]
        System.out.println(log); //[aza]

        log.add('b');
        log.add('b');
        log.add('b');
        System.out.println(log); // [azabbb]

        log.set('a', 5);
        log.set('v', 0);
        log.add('q');
        System.out.println("Expected:[vzabbaq], Output: " + log); // [vzabbaq]

        System.out.println("As = " + log.get('a'));
        System.out.println("As = " + log.get('v'));

        System.out.println("Size: " + log.size());

        System.out.println("Contains a: " + log.contains('a'));
        System.out.println("Contains r: " + log.contains('r'));

        System.out.println("Empty: " + log.isEmpty());

    }
}

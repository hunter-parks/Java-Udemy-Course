package java_basics;

public class Learning_Arrays {
    public static void main(String[] args) {

        // Example #1 - Array with numbers
        int [] values = new int[100];
        values[0] = 1000;
        values[99] = 93432;

        System.out.println(values[99]);

        // Example #2 - Array with strings
        String [] words = new String[] {"My", "name", "is"};
        // You could also do this....
        /*
        words[0] = "My";
        words[1] = "name";
        words[2] = "is";
         */

        System.out.println(words[2]);

        // Assigning 10 brand new slots to this variable. Old data gone from original array

        words = new String[10];
        System.out.println(words[0]);




    }
}

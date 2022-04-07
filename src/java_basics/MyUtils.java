package java_basics;
 public class MyUtils {

    public static String printSomeJunk(String argument) {
//        System.out.println("Some bla bla bla " + argument);
        return argument;
    }

    public static void printSomeJunk(int argument) {
        System.out.println("Integer passed in: " + argument);

    }

    public static void sum2Numbers (int a, int b) {
        System.out.println(a + b);
    }

    public static int add10(int someArgument) {
        int result = someArgument + 10;
        return result;
    }
}

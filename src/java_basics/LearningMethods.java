package java_basics;

import someotherpackage.ExampleClass;

public class LearningMethods {
    public static void main(String[] args) { // Method Signature
        // Everything in parentheses is the Method body
        System.out.println("Hello!");
        MyUtils.printSomeJunk("this is some data");

        System.out.println(MyUtils.printSomeJunk("hello there"));
        MyUtils.sum2Numbers(3,2);

       int myvar = MyUtils.add10(10);
        System.out.println(myvar);

        ExampleClass.doSomething(); // we need to import because it belongs in another package
    }
}

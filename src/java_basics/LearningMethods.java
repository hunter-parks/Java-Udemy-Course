package java_basics;

public class LearningMethods {
    public static void main(String[] args) {
        System.out.println("Hello!");
        MyUtils.printSomeJunk("this is some data");

        System.out.println(MyUtils.printSomeJunk("hello there"));
        MyUtils.sum2Numbers(3,2);

       int myvar = MyUtils.add10(10);
        System.out.println(myvar);
    }
}

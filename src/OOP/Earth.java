package OOP;

public class Earth {

    public static void main(String args[]) {

        // Creating 1st human
        Human tom;

        tom = new Human();
        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Zsabo";

        tom.speak();

        // Created 2nd human
        Human dan;

        dan = new Human();
        dan.age = 20;
        dan.eyeColor = "blueish-green";
        dan.heightInInches = 100;
        dan.name = "Dan Marino";

        dan.speak();
    }
}

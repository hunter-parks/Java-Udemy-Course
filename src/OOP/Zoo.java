package OOP;

public class Zoo {

    public static void main(String [] args) {

        Animal animal1 = new Animal(12, "Male", 25);
        animal1.eat();

        Bird bird1 = new Bird(3, "Female", 10);
        bird1.eat();
        bird1.sleep();



    }

}

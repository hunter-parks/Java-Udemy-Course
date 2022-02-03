package java_basics;

public class ControlFlow {

    public static void main(String[] args){


    // IF/ELSE STATEMENTS

        // EXAMPLE 1
    boolean hungry = true;

    if (hungry){
        System.out.println("I'm starving");
    }else {
        System.out.println("I'm not hungry");
    }


        // EXAMPLE 1 PT 2
    int hungerRating = 5;

    if (hungerRating < 6){
        System.out.println("Not hungry");
    } else {
        System.out.println("I am starving...");
    }


        // EXAMPLE 2
    int favoriteTemp = 75;
    int currentTemp = 60;
    String opinion;

    if (currentTemp < favoriteTemp - 30){
        opinion = "It's Pretty Darn Cold...";
    } else if (currentTemp < favoriteTemp - 20){
        opinion = "It's kinda cold out....";
    } else if (currentTemp > favoriteTemp + 10){
        opinion = "It's a little hot out....";
    } else {
        opinion = "It's a beautiful day outside...";
    }
        System.out.println(opinion);


    // SWITCH CASE

    int month = 4;
    String monthString;

    switch(month){

        case 1: monthString = "January";
            break;
        case 2: monthString = "February";
            break;
        case 3: monthString = "March";
            break;
        case 4: monthString = "April";
            break;
        default: monthString = "Unknown Month";
            break;
    }
        System.out.println(monthString);



    }
}

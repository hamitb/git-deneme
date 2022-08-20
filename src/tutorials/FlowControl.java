package tutorials;

public class FlowControl {

    public static void main(String[] args) {
        // If-Else statement
        int number = 3;

        if (number % 2 == 0) {
            System.out.println("Number is even: " + number);
        } else {
            System.out.println("Number is odd: " + number);
        }

        if (number > 0) {
            System.out.println("Number is positive: " + number);
        } else if (number < 0) {
            System.out.println("Number is negative: " + number);
        } else {
            System.out.println("Number is zero: " + number);
        }

        System.out.println();

        // Switch statement
        int coffeePrice = 0;
        String coffeeSize = "Tall";

        switch (coffeeSize) {
            case "Tall":
                coffeePrice = 30;
                break;
            case "Grande":
                coffeePrice = 35;
                break;
            case "Venti":
                coffeePrice = 38;
                break;
            default:
                coffeePrice = 10;
                break;
        }

        boolean[] exampleArray = new boolean[10];

        for (boolean p: exampleArray) {
            System.out.println("Array: " + p);
        }

        System.out.println("Price for a " + coffeeSize + " Latte is: " + coffeePrice + " TL.");
        System.out.println();

        // For loop
        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.println("In for loop: " + i);
        }

        System.out.println();

        // While loop
        int x = 0;

        while (x < 5) {
            System.out.println("In while loop: " + x);
            x++;
        }
    }
}

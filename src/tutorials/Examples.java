package tutorials;

public class Examples {

    public static void main(String[] args) {
        int coffeePrice = 2123123128;
        double discountRate = 15;

        System.out.println("Coffee price is: " + coffeePrice + " TL");

        System.out.printf("Coffee price is: %,d TL (Applied discount rate: %.2f)", coffeePrice, discountRate);
        System.out.println("hamit");
    }
}

/*
i = 1, f = 1 * 1
i = 2, f = 1 * 1 * 2
i = 3, f = 1 * 1 * 2 * 3
...
...
i = 10, f = 1 * 1 * 2 * 3 .... * 10
 */
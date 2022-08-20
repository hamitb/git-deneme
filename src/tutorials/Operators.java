package tutorials;

public class Operators {

    public static void main(String[] args) {
        // Declare variables
        String name = "Besiktas";
        int a = 10;
        int b = 3;
        double c = 8.0;

         // Arithmetics operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a / c = " + (a / c));
        System.out.println("a % b = " + (a % b));

        // Concatenating strings
        System.out.println("tutorials.Hello " + name + "!");

        // Logical operators
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5)); // false
    }
}

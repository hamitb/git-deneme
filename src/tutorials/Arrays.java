package tutorials;

import arabalar.Araba;

public class Arrays {

    public static void main(String[] args) {
        // Creating an array
        int[] age = {12, 4, 5};

        // Iterate over the array
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        System.out.println();

        // Another way of creating an array
        Araba[] arabalar = new Araba[3];
        arabalar[0] = new Araba("Volvo");
        arabalar[1] = new Araba("Mercedes");
        arabalar[2] = new Araba("Fiat");


        // Another way of iterating over the array
        for (Araba araba: arabalar) {
            System.out.println(araba.brand);
        }
    }
}

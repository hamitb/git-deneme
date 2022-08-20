package arabalar;

public class Araba {
    public String brand;

    public Araba(String brand) {
        this.brand = brand;
    }

    public static void isItGood(String brand) {
        switch (brand) {
            case "Opel":
                System.out.println(brand + " is good!");
                break;
            case "BMW":
                System.out.println(brand + " is bad!");
                break;
            case "Ford":
                System.out.println(brand + " is bad!");
                break;
            default:
                break;
        }
    }
}

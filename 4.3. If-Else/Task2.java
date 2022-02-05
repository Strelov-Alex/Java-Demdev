package DemdevJava;

public class Task2 {
    public static void main(String[] args) {

        int month = 7;

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("зима");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("весна");

        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("лето");

        } else if (month == 9 || month == 104 || month == 11) {
            System.out.println("осень");

        } else {
            System.out.println("Нет такого месяца");
        }
    }
}
package DemdevJava;

import java.util.Random;
import java.util.Scanner;

public class Lesson2Examle {
    public static void main(String[] args) {

        int month = new Random().nextInt(13);
        System.out.println(month);

//        System.out.println("Введите номер месяца от 1 до 12");
//        int month = new Scanner(System.in).nextInt();

        switch (month) {
            case (12):
            case (1):
            case (2):
                System.out.println("На дворе зима");
                break;
            case (3):
            case (4):
            case (5):
                System.out.println("На дворе весна");
                break;
            case (6):
            case (7):
            case (8):
                System.out.println("На дворе лето");
                break;
            case (9):
            case (10):
            case (11):
                System.out.println("На дворе осень");
                break;
            default:
                System.out.println("Нет такого месяца");

        }


    }
}

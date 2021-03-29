package HomeWorkThree;

import java.util.Scanner;
import java.util.Random;

public class Main {

    static final int amountOfNumbers = 10;
    static final int numberOfAttempts = 3;

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main (String[] args) {
        guessTheNumber ();
    }
    public static void guessTheNumber () {
        do {
            System.out.println("Компьютер загадал число от 0 до " + (amountOfNumbers - 1));
            System.out.println("У вас " + numberOfAttempts + " попытки угадать число");
            System.out.println("Введите число от 0 до " + (amountOfNumbers - 1));

            int randomNumber = random.nextInt(amountOfNumbers);

            for (int i = 1; i <= numberOfAttempts; i++) {
                int userNumber = scanner.nextInt();
                if (userNumber == randomNumber) {
                    System.out.println("Вы выйграли");
                    break;
                } else if (userNumber > randomNumber) System.out.println("Загаданное число меньше");
                else if (userNumber < randomNumber) System.out.println("Загаданное число больше");

                if (i == numberOfAttempts) System.out.println("Вы проиграли");
            }
            System.out.println("Хотите ли поиграть заново? (Y/N) -> ");

        }
        while (scanner.next().equals("Y")) ;

        scanner.close();
    }
}


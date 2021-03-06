package HomeWorkSeven;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Cat[] cats = new Cat[(random.nextInt(10) + 1)];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Кот № " + (i + 1), random.nextInt(20));
        }
        Plate plate = new Plate(50);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
            System.out.println("Еды осталось: " + plate.getFood());
            System.out.println();
        }
    }
}

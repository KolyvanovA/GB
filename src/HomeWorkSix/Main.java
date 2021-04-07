package HomeWorkSix;

import java.util.Random;

public class Main {

    public static int quantityDog = 0;
    public static int quantityCat = 0;
    public static int quantityAnimal = 0;

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < (Math.random() * 10); i++) {
            Cat cat = new Cat("Кот № " + (i + 1));
            cat.run(random.nextInt(400));
            cat.swim(random.nextInt(400));

        }
        for (int i = 0; i < (Math.random() * 10); i++) {
            Dog dog = new Dog("Собака № " + (i + 1));
            dog.run(random.nextInt(600));
            dog.swim(random.nextInt(20));
        }
        System.out.println("Создано собак: " + quantityDog);
        System.out.println("Создано кошек: " + quantityCat);
        System.out.println("Создано животных: " + quantityAnimal);
    }
}

package HomeWorkSix;

public class Cat extends Animal {
    public Cat(String name) {
        super(name, 200, -1);
        Main.QUANTITY_CAT++;
    }

    @Override
    public void swim(int length) {
        System.out.println("Кошка не умеет плавать");
    }
}

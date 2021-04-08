package HomeWorkSix;

public class Animal {

    private final String name;
    protected final int runLimit;
    protected final int swimLimit;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        Main.QUANTITY_ANIMAL++;
    }

    public void swim(int length){
        if (length <= 0) {
            System.out.println("Дистанция для плавания должна быть положительной");
            return;
        }
        if (length <= swimLimit) {
            System.out.println(name+" проплыл "+ length +" м.");
        } else {
            System.out.println("Слишком большая дистанция для плавания");
        }
    }

    public void run(int length){
        if (length <= 0) {
            System.out.println("Дистанция для бега должна быть положительной");
            return;
        }
        if (length <= runLimit) {
            System.out.println(name+" пробежал "+ length +" м.");
        } else {
            System.out.println("Слишком большая дистанция для бега");
        }
    }

}

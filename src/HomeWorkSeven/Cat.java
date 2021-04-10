package HomeWorkSeven;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat (Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            satiety = true;
        } else {
            System.out.println("Эй хозяин, где мой паек?");
        }
    }

    @Override
    public String toString() {
        return  name + '\'' +
                ", Аппетит = " + appetite +
                ", Сытость = " + satiety +
                '}';
    }
}

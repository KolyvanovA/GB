package HomeWorkOne;

public class Main {
    public static void main(String[] args) {
        byte bt = 7;
        short sh = 15;
        int it = 55;
        long lg = 274231;

        float ft = 21.6f;
        double db = 24.56;

        char ch = 'W';

        boolean boolT = true;
        boolean boolF = false;

        String name = "Aleksandr";

        System.out.println("Значение для типа byte = " + bt);
        System.out.println("Значение для типа short = " + sh);
        System.out.println("Значение для типа int = " + it);
        System.out.println("Значение для типа long = " + lg);
        System.out.println("Значение для типа float = " + ft);
        System.out.println("Значение для типа double = " + db);
        System.out.println("Значение для типа char = " + ch);
        System.out.println("Значение для типа boolean со значением false = " + boolF);
        System.out.println("Значение для типа boolean со значением true= " + boolT);
        System.out.println("Значение для типа String = " + name);
        System.out.println();

        // проверка метода, для себя
        float exp1 = doThree(23.5f, 54.2f, 546.4f, 65.3f);
        System.out.println("Задание 3");
        System.out.println(exp1);


    }

    public static float doThree (float a, float b, float c, float d) {
        float exp = a * (b + (c / d));
        return exp;

    }

    public static boolean doFour (int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        else return false;

    }

    public static void doFive (int a) {
        if (a < 0) System.out.println("Число " + a + " отрицательное");
        else System.out.println("Число " + a + " положительное");

    }

    public static boolean doSix (int a) {
        if (a < 0) return true;
        else return false;

    }

    public static void doSeven (String name) {
        System.out.println("Привет " + name + "!");
    }

    public static void doEight(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println("Год " + year + " не високосный");
        else System.out.println("Год " + year + " високосный");

    }

}

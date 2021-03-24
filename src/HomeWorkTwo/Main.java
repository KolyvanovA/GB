package HomeWorkTwo;

public class Main {
    public static void main(String[] args) {
        System.out.println("changeArray");
        changeArray();
        System.out.println("\n\narrayFillWithValues");
        arrayFillWithValues();
        System.out.println("\n\narrayReplaceValue");
        arrayReplaceValue();
        System.out.println("\n\nfillDiagonalElements");
        arrayFillDiagonalElements();
    }
    public static void changeArray () {

        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) array[i] = 1;
            else array[i] = 0;
            System.out.print(array[i] + " ");
        }
    }

    public static void arrayFillWithValues() {
        int[] array = new int[8];

        for (int i = 0, j = 0; i < array.length; i++, j+=3 ) {
            array[i] = j;
            System.out.print(array[i] + " ");
        }
    }

    public static void arrayReplaceValue() {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] *= 2;
            System.out.print(array[i] + " ");
        }
    }

    public static void arrayFillDiagonalElements() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i == j) || (i == array.length - 1 - j)) array[i][j] = 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

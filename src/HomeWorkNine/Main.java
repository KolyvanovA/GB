package HomeWorkNine;

public class Main {
    public static void main(String[] args) {

        String[][] arrays = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = calculateSum(arrays);
            System.out.println("Сумма массива = " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Проблема размера: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Проблема значения: " + e.getMessage());
        }
    }


    private static int calculateSum(String[][] data)
            throws MyArraySizeException, MyArrayDataException {

        int sum = 0;
        if (data.length != 4) throw new MyArraySizeException("Неверный размер массива", data.length);

        for (int i = 0; i < data.length; i++) {
            String[] val = data[i];
            for (int j = 0; j < val.length; j++) {
                if (val.length != 4)
                    throw new MyArraySizeException("Неверный размер внутреннего массива", data.length);

                try {
                    sum += Integer.parseInt(val[j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Недействительное значение элемента", val[j], i, j);
                }
            }

        }
        return sum;
    }
}

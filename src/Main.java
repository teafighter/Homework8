import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        int[] firstArray = new int[]{1, 2, 3};
        double[] secondArray = {1.57, 7.654, 9.986};
        String[] thirdArray = {"this", "is", "third", "array"};

        // Задача 2
        for (int i = 0; i <= firstArray.length - 1; i++) {
            System.out.print(firstArray[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i <= secondArray.length - 1; i++) {
            System.out.print(secondArray[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i <= thirdArray.length - 1; i++) {
            System.out.print(thirdArray[i] + ", ");
        }
        System.out.println();

        // Задача 3
        for (int i = firstArray.length - 1; i >= 0; i--) {
            System.out.print(firstArray[i] + ", ");
        }
        System.out.println();

        for (int i = secondArray.length - 1; i > 0; i--) {
            System.out.print(secondArray[i] + ", ");
        }
        System.out.println(secondArray[0]); // костыль для перехода на следующую новую строку

        for (int i = thirdArray.length - 1; i >= 0; i--) {
            if (i != 0) { // еще костыль, чтобы понять, когда перейти на новую строку
                System.out.print(thirdArray[i] + ", ");
            } else {
                System.out.println(thirdArray[i]);
            }
        }

        // Задача 4
        for (int i = 0; i <= firstArray.length - 1; i++) {
            if (firstArray[i] % 2 == 1) {
                firstArray[i] = firstArray[i] + 1;
            }
        }
        System.out.println(Arrays.toString(firstArray));
    }
}
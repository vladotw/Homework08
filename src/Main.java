import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {

        System.out.println("Задача_1");
        System.out.println();

        int oneArr[] = new int[3];
        for (int index = 0; index < oneArr.length; index++) {
            oneArr[index] = index + 1;
        }

        double twoArr[] = {1.57d, 7.654d, 9.986d};
        char threeArr[] = {'a', 'b', 'c'};

        System.out.println();
        System.out.println();
    }

    public static void task2() {

        System.out.println("Задача_2");
        System.out.println();

        int oneArr[] = new int[3];
        for (int index = 0; index < oneArr.length; index++) {
            oneArr[index] = index + 1;
        }

        double twoArr[] = {1.57d, 7.654d, 9.986d};
        char threeArr[] = {'a', 'b', 'c'};

        for (int i = 0; i < oneArr.length; i++) {
            if (i == oneArr.length - 1) {
                System.out.println(oneArr[i]);
                break;
            }
            System.out.print(oneArr[i] + ", ");
        }

        for (int i = 0; i < twoArr.length; i++) {
            if (i == twoArr.length - 1) {
                System.out.println(twoArr[i]);
                break;
            }
            System.out.print(twoArr[i] + ", ");
        }

        for (int i = 0; i < threeArr.length; i++) {
            if (i == threeArr.length - 1) {
                System.out.println(threeArr[i]);
                break;
            }
            System.out.print(threeArr[i] + ", ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task3() {

        System.out.println("Задача_3");
        System.out.println();

        int[] oneArr = {1, 2, 3};
        double twoArr[] = {1.57d, 7.654d, 9.986d};
        char threeArr[] = {'a', 'b', 'c'};

        for (int i = oneArr.length - 1; i >= 0 ; i--) {

            System.out.print(oneArr[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = twoArr.length - 1; i >= 0; i--) {

            System.out.print(twoArr[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = threeArr.length - 1; i >= 0; i--) {

            System.out.print(threeArr[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();System.out.println();
        System.out.println();
    }

    public static void task4() {

        System.out.println("Задача_4");
        System.out.println();

        int oneArr[] = new int[3];

        for (int index = 0; index < oneArr.length; index++) {
            oneArr[index] = index + 1;
        }

        for (int a = 0; a < oneArr.length; a++) {
            if (oneArr[a] % 2 != 0) {
                oneArr[a] += 1;
            }
        }

        System.out.println(Arrays.toString(oneArr));
    }
}
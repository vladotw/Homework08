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

        int oneArr[] = new int[]{1, 2, 3};
        for (int i = 0; i < oneArr.length; i++) {
            oneArr[i] = i + 1;
        }

        double twoArr[] = {1.57d, 7.654d, 9.986d};
        int threeArr[] = {17, 28, 39};

        System.out.println();
        System.out.println();
    }

    public static void task2() {

        System.out.println("Задача_2");
        System.out.println();

        int oneArr[] = new int[]{1, 2, 3};
        for (int i = 0; i < oneArr.length; i++) {
            oneArr[i] = i + 1;
        }
        for (int i = 0; i < oneArr.length; i++) {
            if (i == oneArr.length - 1) {
                System.out.println(oneArr[i]);
                break;
            }
            System.out.print(oneArr[i] + ", ");
        }
        double twoArr[] = {1.57d, 7.654d, 9.986d};
        for (int i = 0; i < twoArr.length; i++) {
            if (i == twoArr.length - 1) {
                System.out.println(twoArr[i]);
                break;
            }
            System.out.print(twoArr[i] + ", ");
        }
        int threeArr[] = {17, 28, 39};
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


        System.out.println();
        System.out.println();
    }

    public static void task4() {

        System.out.println("Задача_4");
        System.out.println();


    }

}
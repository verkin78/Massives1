public class Main {
    public static void main(String[] args) {
        int[] number = new int[]{1, 2, 3};
        for (int i = 0; i < 3; i++) {
            System.out.print(number[i]);
            if (i != number.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        double[] Number = {1.57, 7.654, 9.986};
        for (int i1 = 0; i1 < 3; i1++) {
            System.out.print(Number[i1]);
            if (i1 != Number.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        int[] numbers = new int[]{5, 10, 15, 20, 25};
        for (int i2 = 0; i2 < 5; i2++) {
            System.out.print(numbers[i2]);
            if (i2 != numbers.length - 1) {
                System.out.print(",");
            }

        }
    }
}

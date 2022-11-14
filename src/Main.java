public class Main {
    public static void main(String[] args) {
        int[] number = new int[]{1, 2, 3};
        number[0] += 1;
        number[2] += 1;
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }


}

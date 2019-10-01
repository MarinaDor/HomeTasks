public class Task_1 {

    //"1. Print numbers from 10 to 20 using all known cycles.

    public static void main(String[] args) {

        for (int i = 10; i <= 20; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Next loop");

        int j = 10;
        while (j <= 20) {
            System.out.print(j);
            System.out.print(" ");
            j++;
        }
        System.out.println();
        System.out.println("Next loop");

        int k = 10;
        do {
            System.out.print(k);
            System.out.print(" ");
            k++;
        } while (k <= 20);

    }
}
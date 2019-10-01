public class Task_11 {
    // "11*. Write a program which prints the next figure to the console:
    //          *
    //         ***
    //        *****
    //       *******
    //      *********
    //     ***********
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i*2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

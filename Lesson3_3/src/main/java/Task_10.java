public class Task_10 {
    //"10*. Write a program which prints the next figure to the console:
    //**********
    //*        *
    //*        *
    //*        *
    //**********
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            if (i == 0 || i == 4) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < 10; j++) {
                    if (j == 0 || j == 9) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}

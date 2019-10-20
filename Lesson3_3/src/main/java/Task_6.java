public class Task_6 {
    //6. Write a method named getEvenDigitSum with one parameter of the type "int".
    // The method should return the sum of even digits within the number. If the number is negative, method should return -1;

    public static void main(String[] args) {
        System.out.println("The sum of even digits within the number is: "+ getEvenDigitSum(21));
    }

    public static int getEvenDigitSum(int a) {
        int sum = 0;
        if (a < 0) {
            return -1;
        } else {
            for (int i = 0; i <= a; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }
}

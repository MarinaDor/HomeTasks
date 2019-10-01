public class Task_7 {
    //7. Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
    //If one of the parameters is < 10, method should return -1 to indicate an invalid value.
    //The method should return the greatest common divisor of two numbers."
    public static void main(String[] args) {
        System.out.println("The greatest common divisor of two numbers is: " + getGreatestCommonDivisor(15, 25));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int div = 0;
        int num;
        if (first < 10 || second < 10) {
            return -1;
        }
        else {
            if (first > second){
                num = first;
            }
            else{
                num = second;
            }
        }
        for (int i = 1; i <= num; i++) {
            if (first % i == 0 && second % i == 0) {
                div = i;
            }
        }
        return div;
    }
}


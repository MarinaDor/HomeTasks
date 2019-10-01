public class Task_4 {
    // 4. Given an array of 10 integers. To display the sum of all its elements except the first and last.

    public static void main(String[] args) {
        int [] arr = new int[]{1, 5, 3, 7, 8, 2, 6, 10, 11, 9};
        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

    }
}

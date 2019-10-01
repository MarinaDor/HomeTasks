public class Task_5 {
    //"5. Write a function which calculates and returns the minimum of 4 arguments.
    //Function min(int a, int b, int c, int d) should use the function min(int a, int b)."

    public static void main(String[] args) {
        System.out.println("The minimum of 4 arguments is: " + min(2,1,1,3));
    }
        public static int min(int a, int b, int c, int d) {
            if(min(a,b) < min(c,d)){
                return min(a,b);
            }
            else{
                return min(c,d);
            }
        }

        public static int min(int a, int b) {
            if(a > b){
                return b;
            }
            else{
                return a;
            }

    }
}


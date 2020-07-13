package math_week2;

public class Main {


    public static boolean isPrime(int n){
        for (int c =2; c<n-1; c++){
            if (n %c ==0){
                return false;
            }
        }
        return true;
    }// end of isPrime loop

    public static void main(String[] args) {
        for (int n = 1000000000;n < 2000000000; n++){
            if (isPrime(n)){
                System.out.println("The number %d is prime\n");
            }
        }
    }

}// end of main loop


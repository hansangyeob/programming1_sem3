//keyword and expressions
//void means "dont send any value back"
// but if we want to send data, we can write with the type of data we want to send
package Udemy_5;

public class Main {

    public static void main(String[] args) {
        for(int n = 1; n<30; n++){
            if(isPrime(n)){
                System.out.println("The number " +n+ " is prime number");
            }
        }
//        boolean gameOver = true;
//        int score = 5000;
//        int levelCompeted = 5;
//        int bonus = 100;
//
//
//        calculateScore(true,5000,5,100);
//
//        score = 5000;
//        levelCompeted = 5;
//        bonus = 100;
//
//        if (gameOver) {
//            int finalScore = score + (levelCompeted * bonus);
//            System.out.println("Your final score is " + finalScore);
//        }

    }

    //    public static int calculateScore(boolean gameOver, int score, int levelCompeted, int bonus) {
//
//        if (gameOver) {
//            int finalScore = score + (levelCompeted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score is " + finalScore);
//            return finalScore;
//        }
//            return -1;
//
//
//    }
    public static boolean isPrime(int n) {
        for (int c = 2; c < n - 1; c++) {
            if (n % c == 0) {
                return false;
            }
        }
            return true;
        }


}// end of class main

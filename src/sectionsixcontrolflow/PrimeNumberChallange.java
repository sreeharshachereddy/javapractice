package sectionsixcontrolflow;

public class PrimeNumberChallange {
    public static void main(String[] args) {
    int count = 0;
    for (int i =10; i<=50; i++) {
        if (isPrime(i)) {
            System.out.println("number " + i + " is a prime number");
            count++;
            if(count==3){
                System.out.println("Found 3- exiting for loop");
                break;
            }
        }
    }
//        System.out.println("Total number of prime numbers between 10 and 50 is "+ count);
//

    }


    public static boolean isPrime(int wholeNumber){
        if(wholeNumber<2){
            return false;
        }
        for(int divisor = 2; divisor <=wholeNumber /2 ;divisor ++){
            if(wholeNumber % divisor==0){
                return false;
            }
        }
        return true;
    }
}

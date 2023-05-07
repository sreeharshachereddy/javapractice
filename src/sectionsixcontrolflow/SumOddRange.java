package sectionsixcontrolflow;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(10,10));
        System.out.println(sumOdd(1,11));
        System.out.println(sumOdd(10,25));
    }
    public static boolean isOdd(int number){
    if((number >= 0) && (number % 2 != 0)){
            return true;
        }
        return false;
    }
    public static int sumOdd(int start, int end){
        if ((end < start)||(start<0)){
            return -1;
        }
        int sum =0;
        for (int i = start; i<=end; i++){
            if(isOdd(i)){
                sum+=i;
            }

        }
        return sum;
    }

}

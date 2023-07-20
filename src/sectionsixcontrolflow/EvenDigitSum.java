package sectionsixcontrolflow;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number<0){
            return -1;
        }

        int sum = 0;
        int isEven= 0;
        while (number >0){
            isEven=number%10;
            if(isEven%2==0){
                sum+=isEven;
            }
            number/=10;
        }
        return sum;
    }
}

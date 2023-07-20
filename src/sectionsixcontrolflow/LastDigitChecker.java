package sectionsixcontrolflow;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z){
        if(isValid(x)&& isValid(y) && isValid(z)){
            x%=10;
            y%=10;
            z%=10;
            return (x == y) || (y == z) || (z == x);
        }
        return false;
    }
    public static boolean isValid(int num){
        return (num >= 10) && (num<=1000);
    }
}

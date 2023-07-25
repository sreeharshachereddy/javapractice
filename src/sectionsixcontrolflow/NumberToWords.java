package sectionsixcontrolflow;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(numberToWords(345));
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int digitCount = 0;
        while (number > 0) {
            number /= 10;
            digitCount++;
        }

        return digitCount;
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    private static boolean numberToWords(int number) {
        if(number==0){
            System.out.println("ZERO");
        }
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int ReversedNumber = reverse(number);
        int OriginalDigitCount = getDigitCount(number);
        int ReversedDigitCount = getDigitCount(ReversedNumber);
        while (ReversedNumber > 0) {
            int digit = ReversedNumber % 10;
            ReversedNumber /= 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
            }
        }
        for (int i = ReversedDigitCount; i < OriginalDigitCount; i++) {
            System.out.print("Zero ");

        }
        return false;
    }
}
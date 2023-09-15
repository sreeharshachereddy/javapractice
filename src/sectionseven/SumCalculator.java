package sectionseven;

public class SumCalculator {
    public static void main(String[] args) {
        SimpleCalculator sc =new SimpleCalculator();
        sc.setFirstNumber(5.0);
        sc.setSecondNumber(4);
        System.out.println("add ="+sc.getAdditionResult());
        System.out.println("Subtraction ="+sc.getSubtractionResult());

        sc.setFirstNumber(5.25);
        sc.setSecondNumber(0);
        System.out.println("Multiplication ="+sc.getMultiplicationResult());
        System.out.println("Division ="+sc.getDivisionResult());

    }


}

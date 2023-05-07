package tillsectionfive;/*Teen Number Checker
        We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

        Write a method named hasTeen with 3 parameters of type int.

        The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.



        EXAMPLES OF INPUT/OUTPUT:

        hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19

        hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19

        hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19



        Write another method named isTeen with 1 parameter of type int.

        The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

        EXAMPLES OF INPUT/OUTPUT:

        isTeen(9);  should return false since 9 is in not range 13 - 19

        isTeen(13);  should return true since 13 is in range 13 - 19

Sample code added

        NOTE: All methods need to be defined as public static ​like we have been doing so far in the course.
        NOTE: Do not add a  main method to solution code.*/



public class TeenNumberCheck {
    public static void main(String[] args) {
        System.out.println(hasTeen(3,5,15));
    }
    public static boolean hasTeen(int a, int b, int c){
    if(isTeen(a) || isTeen(b) ||isTeen(c)){
        System.out.println("Congrats!! Given Number is in Range");
        return true;
    }
        System.out.println("Given NUmber not in range");
    return false;
    }
    public static boolean isTeen(int d){
        return (d >=13 && d<= 19);
    }
}

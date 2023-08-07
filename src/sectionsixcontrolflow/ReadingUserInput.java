package sectionsixcontrolflow;
import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = 2023;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }
    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);
       // String name = System.console().readLine("Hi, What's Your Name? ");
        System.out.println("Hi, What's Your Name? ");
        String name = scanner.nextLine();


        System.out.println("Hi "+name + ", Thanks for taking this course!");

        System.out.println("What year were you born? ");

        boolean validDOB =false;
        int age = 0;
        do {
            System.out.println("Enter Year Of Birth >= "+
                    (currentYear-125) + " and <= "+ (currentYear));
            String dateOfBirth=scanner.nextLine();
            age =currentYear - Integer.parseInt(dateOfBirth);

            validDOB = age <0 ?false : true;
        }while (!validDOB);
        return "So You are "+ age + "years Old.";
    }
    public static int validateData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear-125;
        if ((dob < minimumYear) || (dob>currentYear)){
            return -1;
        }
        return (currentYear-dob);
    }
}

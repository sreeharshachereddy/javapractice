package sectionseven;

public class PersonFullName {
    public static void main(String[] args) {
        Person bob =new Person();

        bob.setFirstName("");

        System.out.println("fullName= "+ bob.getFullName());
        System.out.println(bob.isTeen());
        bob.setFirstName("Sree");
        bob.setAge(18);
        System.out.println("fullName = "+bob.getFullName());
        System.out.println(bob.isTeen());
        bob.setlastName("Harsha");
        System.out.println("fullName="+ bob.getFullName());

    }
}

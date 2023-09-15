package sectionseven;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge(int i) {
        return age;
    }

    public int setAge(int age) {
        this.age =age;
        if ((age<0) ||(age>100) ){
            return 0;
        }
        return age;
    }
    public boolean isTeen(){
        return age > 12 && age < 20;
        }

    public String getFullName() {
        if (firstName == null && lastName == null) {
            return "";
        } else if (lastName == null) {
            return firstName;
        } else if (firstName == null) {
            return lastName;
        } else if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }

}



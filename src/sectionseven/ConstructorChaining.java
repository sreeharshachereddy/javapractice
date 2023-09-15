package sectionseven;

public class ConstructorChaining {
    private String name;
    private double creditLimit;
    private String email;

    public ConstructorChaining() {
        this("Nobody", "nobody@nowhere.com");
    }

    public ConstructorChaining(String name, String email) {
        this(name,1000, email);
    }

    public ConstructorChaining(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

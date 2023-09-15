package sectionseven;

public class ChainingMain {
    public static void main(String[] args) {
        ConstructorChaining customer = new ConstructorChaining("Tim", 1000.0,"tim@email.com") ;
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        ConstructorChaining secondCustomer =new ConstructorChaining();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        ConstructorChaining thirdCustomer =new ConstructorChaining("joe","joe@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getEmail());
    }

}

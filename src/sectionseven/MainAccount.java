package sectionseven;

public class MainAccount {
    public static void main(String[] args) {
        Account bobsAccount = new Account("12345",1005.78,"NewBob","abc@123.com","2435346565");
        bobsAccount.setBalance(0);
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.getPhoneNumber("(087) 123-4567");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);
    }


}

package sectionseven;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public Account(){
        this("34t4655", 3.02,"sdfsdf","safddsa@sdfd.com","4345435");
        System.out.println("Empty Constructor Called:");
    }

    public Account(String number,double balance, String customerName, String customerEmail, String phoneNumber){
        System.out.println("Account constructor with parameters called :");
        this.number=number;
        this.balance=balance;
        this.customerName=customerName;
        this.customerEmail=customerEmail;
        this.phoneNumber=phoneNumber;
    }
    public void depositFunds(double depositAmount){
        balance+= depositAmount;
        System.out.println("Deposit of $ = "+depositAmount+ " made. New balance is $"+this.balance);
    }

    public void withdrawFunds(double withdrawalAmount){
        if(balance-withdrawalAmount<0){
            System.out.println("Insufficient Funds! you only have $ "+this.balance +" in your account.");
            }
        else{
            balance-= withdrawalAmount;
            System.out.println("withdrawal of $ "+ withdrawalAmount+ " processed, Remaining balance =$ " +balance);
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber(String s) {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

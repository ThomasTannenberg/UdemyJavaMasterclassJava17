public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposite(int number) {
        this.balance += number;
    }

    public void withdraw(int number) {
        if (this.balance - number < 0) {
            System.out.println("Not possible!");
        } else {
            this.balance -= number;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        BankAccount carl = new BankAccount();
        carl.setAccountNumber(1234567890);
        carl.setBalance(2000);
        carl.setCustomerName("Carl Smith");
        carl.setEmail("Carl.Smith@hotmail.com");
        carl.setPhoneNumber(55543896);

        System.out.println("Carl's balance is: " + carl.getBalance());
        carl.deposite(200);
        System.out.println("After deposite. Carl's balance is: " + carl.getBalance());
        carl.withdraw(500);
        System.out.println("After withdrawl. Carl's balance is: " + carl.getBalance());
    }
}

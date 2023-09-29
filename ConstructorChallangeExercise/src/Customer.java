public class Customer {
    private String name;
    private String email;
    private double limit;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getLimit() {
        return limit;
    }
    public Customer(){
        this("Nobody", "nobody@email.com");
    }

    public Customer(String name, String email) {
        this(name, 1000.0, email);
    }

    public Customer(String name, double limit, String email){
        this.name = name;
        this.limit = limit;
        this.email = email;
    }





}

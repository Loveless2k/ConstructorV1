public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // Declaración de un constructor vacío, o constructor por defecto.
    public Account(){
        // El código dentro del constructor se ejecuta cada vez que se crea un objeto de esta clase.
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String email, String phone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
        System.out.println("Account constructor with parameters called");
    }
}

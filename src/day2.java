class User {
    String name;

    void sayHello() {
        System.out.println("Hello " + name);
    }
}

public class day2 {
    public static void main(String[] args) {

        User user = new User();

        user.name = "Ali";
        user.sayHello();
    }
}


//A constructor is used to initialize an object when it is created.
class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

//Encapsulation = protect an object's data and control how it can be changed.
class BankAccount {

    private double balance;

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}


interface PaymentService {

    void pay(double amount);
}
class StripePayment implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Stripe");
    }
}

class OrderService {

    private PaymentService paymentService;

    OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    void createOrder() {
        paymentService.pay(100);
        System.out.println("Order created");
    }
}
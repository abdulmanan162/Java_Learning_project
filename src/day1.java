class User {
    String name;
    int age;

    void sayHello() {
        System.out.println("Hello, " + name);
    }
}

public class day1 {
    public static void main(String[] args) {

        int age = 25;

        User user = new User();
        user.name = "Alice";
        user.age = 25;

        if (user.age >= 18) {
            user.sayHello();
        }
    }
}
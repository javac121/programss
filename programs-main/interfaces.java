interface MyInterface {
    void sayHello();
    void sayGoodbye();
}
class MyClass implements MyInterface {
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayGoodbye() {
        System.out.println("Goodbye!");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        MyInterface myObj = new MyClass();
        myObj.sayHello();
        myObj.sayGoodbye();
    }
}

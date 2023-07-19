class Parent {
    // Function Overloading
    public void display() {
        System.out.println("overloading");
    }
    public void display(int x) {
        System.out.println("method with parameter: " + x);
    }
    public void display(String message) {
        System.out.println("method with parameter: " + message);
    }
    // Function Overriding
    public void show() {
        System.out.println("Overriding");
    }
}
class Child extends Parent {
    // Function Overriding
    @Override
    public void show() {
        System.out.println("Overridden");
    }
}
public class FunctionOverloadingOverriding {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        Parent childObj = new Child();
        // Function Overloading
        parentObj.display();
        parentObj.display(10);
        parentObj.display("Hello");
        // Function Overriding
        parentObj.show(); 
        childObj.show();  
    }
}

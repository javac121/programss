public class MyClass {
    private int number;
    private String text;
    public MyClass(int number, String text) {
        this.number = number;
        this.text = text;
    }
    public void displayInfo() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }
    public static void main(String[] args) {
        MyClass obj = new MyClass(42, "Hello, world!");
        obj.displayInfo();
    }
}

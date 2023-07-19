interface Shape {
    void draw();
}
interface Color {
    void setColor(String color);
}
class ColoredShape implements Shape, Color {
    public void draw() {
        System.out.println("Drawing a colored shape");
    }
    public void setColor(String color) {
        System.out.println("Color: " + color);
    }
}
public class Main {
    public static void main(String[] args) {
        ColoredShape coloredShape = new ColoredShape();
        coloredShape.draw();
        coloredShape.setColor("Blue");
    }
}
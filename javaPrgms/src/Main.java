class Shape {
    private int sides;
 
    public Shape(int sides) {
       this.sides = sides;
    }
 
    public int getSides() {
       return sides;
    }
 
    public void setSides(int sides) {
       this.sides = sides;
    }
 
    public void displayShape() {
       System.out.println("This is a shape with " + sides + " sides.");
    }
 }
 
 class Rectangle extends Shape {
    private int length;
    private int width;
 
    public Rectangle(int length, int width) {
       super(4);
       this.length = length;
       this.width = width;
    }
 
    public int getLength() {
       return length;
    }
 
    public void setLength(int length) {
       this.length = length;
    }
 
    public int getWidth() {
       return width;
    }
 
    public void setWidth(int width) {
       this.width = width;
    }
 
    @Override
    public void displayShape() {
       System.out.println("This is a rectangle with " + getSides() + " sides and dimensions " + length + "x" + width + ".");
    }
 }
 
 class Triangle extends Shape {
    private int base;
    private int height;
 
    public Triangle(int base, int height) {
       super(3);
       this.base = base;
       this.height = height;
    }
 
    public int getBase() {
       return base;
    }
 
    public void setBase(int base) {
       this.base = base;
    }
 
    public int getHeight() {
       return height;
    }
 
    public void setHeight(int height) {
       this.height = height;
    }
 
    @Override
    public void displayShape() {
       System.out.println("This is a triangle with " + getSides() + " sides and base " + base + " and height " + height + ".");
    }
 }
 
 public class Main {
    public static void main(String[] args) {
       Shape shape = new Shape(0);
       shape.displayShape();
 
       Rectangle rectangle = new Rectangle(10, 20);
       rectangle.displayShape();
 
       Triangle triangle = new Triangle(15, 25);
       triangle.displayShape();
    }
 }

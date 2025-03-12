package ro.ulbs.paradigme.lab2;

public class Square extends Form {
    private float side;

    public Square() {
        super(); //APELEAZA PRIMITIVA ( CONSTRUCTOR FORM)
        this.side = 0;
    }

    public Square(float side, String color) {
        super(color);
        this.side = side;
    }

    public float getArea() {
        return side * side;
    }

    public String toString() {
        return "This is a square with color " + getColor() + " and side = " + side;
    }
}

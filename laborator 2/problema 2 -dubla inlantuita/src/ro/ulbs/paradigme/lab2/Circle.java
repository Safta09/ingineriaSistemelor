
package ro.ulbs.paradigme.lab2;

public class Circle extends Form {
    private float radius;

    public Circle() {
        super(); //APELAM PRIMITIVA( CONSTRUCTOR  FORM)
        this.radius = 0;
    }

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    public String toString() {
        return "This is a circle with color " + getColor() + " and radius = " + radius;
    }
}

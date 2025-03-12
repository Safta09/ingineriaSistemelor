package ro.ulbs.paradigme.lab2;

public class Triangle extends Form {
    private float height;
    private float base;

    public Triangle() {
        super();  //APELAM PRIMITIVA ( CONSTRUCTOR FORM)
        this.height = 0;
        this.base = 0;
    }

    public Triangle(float height, float base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    public float getArea() {
        return (height * base) / 2;
    }

    public String toString() {
        return "This is a triangle with color " + getColor() + ", base = " + base + " and height = " + height;
    }

    public boolean equals(Triangle other) {
        return this.height == other.height && this.base == other.base && this.getColor().equals(other.getColor());
    }
}

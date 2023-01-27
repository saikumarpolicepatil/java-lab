import java.util.*;


abstract class Shape {

int a, b;

public Shape(int a, int b) {
    this.a = a;
    this.b = b;
	}
	abstract void Printarea();
	}

class Circle extends Shape {

    Circle(int a, int b) {
        super(a, b);
    }

    void Printarea() {
        System.out.println("Area of Circle is: " + (3.14 * a * a));
    }

}

class Rectangle extends Shape {
 public Rectangle(int a, int b) {
    super(a, b);
}

void Printarea()
{
    System.out.println("Area of Rectangle is: " + (a * b));
}

}

class Triangle extends Shape {
public Triangle(int a, int b) {
    super(a, b);
}

void Printarea()

{

    System.out.println("Area of Triangle is: " + (0.5 * a * b));

}

}

class Main {
public static void main(String args[]) {

	Scanner in = new Scanner(System.in);

	System.out.println("Enter dimension 1: ");
	int x = in.nextInt();
	System.out.println("\nEnter dimension 2: ");
	int y = in.nextInt();


    Shape b;
    b = new Circle(x, y);
    b.Printarea();
    
    b = new Rectangle(x, y);
    b.Printarea();

    b = new Triangle(x, y);
    b.Printarea();
}
}

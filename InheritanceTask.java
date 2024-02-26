//make a parent class named "Shape" with attributes no.of sides
//two methods : calculateArea(), calculatePerimter(), printNumberOfSides()
//create two more class Triangle, Square
//ask for side and calculate area and perimeter and print no.of sides

import java.util.Scanner;
import java.lang.Math;
//parent class
class Shape{
    Scanner sc=new Scanner(System.in);
    int sides;
    void calculateArea(){
        System.out.println("The area is ");
    }
    void calculatePerimeter(){
        System.out.println("The perimeter is ");
    }
    void printSides(){
        System.out.println("No.of sides is ");;
    }
}

//child 1
class Triangle extends Shape{
    int a;
    int b;
    int c;
    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void calculateArea(){
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the triangle with side is: "+ area);
    }
    void calculatePerimeter(){
        System.out.println("Perimeter of the triangle is: "+(a+b+c));
    }
    void printSides(){
        System.out.println("No.of sides: 3");
    }
}

//child 2
class Circle extends Shape{
    int r;
    Circle(int r){
        this.r=r;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of circle is: "+3.14*r*r);
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter of circle is: "+2*3.14*r);
    }

    @Override
    void printSides() {
        System.out.println("No.of sides: 0");
    }
}


public class InheritanceTask {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //calling an object of Triangle
        Triangle t=new Triangle(1,2,3);
        t.calculateArea();
        t.calculatePerimeter();
        t.printSides();

        //calling an object  of Circle
        Circle c=new Circle(10);
        c.calculateArea();
        c.calculatePerimeter();
        c.printSides();

        //calling another object of triangle with user inputs
        System.out.print("enter a: ");int a=sc.nextInt();
        System.out.print("enter b: ");int b= sc.nextInt();
        System.out.print("enter c: ");int c1=sc.nextInt();
        Triangle t2=new Triangle(a,b,c1);
        t2.calculateArea();
        t2.calculatePerimeter();
        t2.printSides();

        //calling another object of circle with user inputs
        System.out.print("enter radius of the circle: ");int r=sc.nextInt();
        Circle c2=new Circle(r);
        c2.calculateArea();
        c2.calculatePerimeter();
        c2.printSides();
    }
}
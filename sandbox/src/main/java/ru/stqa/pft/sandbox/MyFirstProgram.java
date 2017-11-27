package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Square s = new Square(6);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
        Rectangle r = new Rectangle(5, 8);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    }
}

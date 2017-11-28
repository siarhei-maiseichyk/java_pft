package ru.stqa.pft.points;

import java.lang.Math;

public class DistanceCalculator {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);

        System.out.println("Расстояние между двумя точками:");
        System.out.println(" - метод класса DistanceCalculator = " + String.format("%.3f", distance(point1, point2)));
        System.out.println(" - метод класса Point = " + String.format("%.3f", point1.distance(3, 4)));
        System.out.println(" - метод класса Point (еще один вариант) = " + String.format("%.3f", point1.distance(point2.x, point2.y)));

        //Добавлен еще один метод distance в класс Point, который использует в качестве параметра объект класса Point
        System.out.println(" - метод класса Point (метод distance(Point secondPoint)) = " + String.format("%.3f", point1.distance(point2)));
    }

    public static double distance(Point point1, Point point2) {
        return Math.sqrt(Math.pow((point2.x - point1.x), 2) + Math.pow((point2.y - point1.y), 2));
    }
}

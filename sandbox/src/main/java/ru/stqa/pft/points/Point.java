package ru.stqa.pft.points;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns distance between two points
     *
     * @param x 'x' coordinate value of second point
     * @param y 'y' coordinate value of second point
     * @return distance value in double
     */
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }
}

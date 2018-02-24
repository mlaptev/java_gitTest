package ru.stqa.atest.sandbox;

//public static double distance(x, y)


public class Point {



        public double x;
        public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    double distance(Point p) {

        double dx = this.x - x;
        double dy = this.y - y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    //public distance (Point p){
    public double distance() {
        return this.x * this.y;
    }

    // public double distance (Point p){

    //  return distance(p.x, p.y);


}


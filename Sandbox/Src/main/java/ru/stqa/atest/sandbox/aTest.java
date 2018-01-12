package ru.stqa.atest.sandbox;

import javafx.scene.media.SubtitleTrack;

import java.net.SocketPermission;

public class aTest {

    public static void main(String[] args) {

        hello("world");
        hello("user");
        hello("MiQAVred");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 7);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        Point p = new Point( 2, 4);
                System.out.println("Координаты точек = " + p.x + p.y);
    }
    public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
    }



}



class Point { int х, у;

    Point(int х, int у) {

        this.x = х;

        this. y = y;

    }

    double distance(int х, int у) {

        int dx = this.x - х;

        int dy = this.у - у;

        return Math.sqrt(dx*dx + dy*dy);

    }

    double distance(Point p) {

        return distance(p.x, p.y);

    } }

class PointDist {

    public static void main(String args[]) {

        Point p1 = new Point(0, 0);

        Point p2 = new Point(30, 40);

        System.out.println("p1 = " + pi.x + ", " + p1.y);

        System.out.println("p2 = " + p2.x + ", " + p2.y);

        System.out.println("p1.distance(p2) = " + p1.distance(p2));

        System.out.println("p1.distance(60, 80) = " + p1.distance(60, 80));


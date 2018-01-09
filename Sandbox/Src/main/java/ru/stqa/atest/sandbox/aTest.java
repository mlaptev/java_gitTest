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

package ru.stqa.atest.sandbox;

import javafx.scene.media.SubtitleTrack;

import java.net.SocketPermission;

public class aTest {

<<<<<<< HEAD
    static public void main(String[] args) {
        System.out.println("Hello, Wolderолраыв");
=======
    public static void main(String[] args) {

        hello("world");
        hello("user");
        hello("MiQAVred");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 7);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        Point p = new Point( 2, 4);
                System.out.println("Координаты точек = " + p.x + " и " +  p.y);

        Point p1 = new Point(4, 1);

        Point p2 = new Point(30, 40);



        System.out.println("p1 = " + p1.x + ", " + p1.y);

        System.out.println("p2 = " + p2.x + ", " + p2.y);

        System.out.println("p1.distance(p2) = " + p1.distance(p2));

        //System.out.println("квадратный корень = " + Math.sqrt(p1));

       // System.out.println("p1.distance(60, 80) = " + p1.distance(60, 80));



    }
    public static void hello(String somebody) {
    System.out.println("Hellio, " + somebody + "!");
>>>>>>> bb5dd0913658b88c5816c7598ebe394f8e08ee92
    }

    public static double getDistance(int x1, int y1, int x2, int y2)
    {
        //Напишите тут ваш код
        return Math.sqrt((x2*x2-2*x1*x2+x1*x1) + (y2*y2-2*y1*y2+y1*y1));
    }

}






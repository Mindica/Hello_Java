package Mindica.Ultra.Programmer;

public class MyFirstProg {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Dana");

        double len = 5;
        System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
    } //Запустили функцию main, которая обратилась к функции hello
    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }
    public static double area(double l) {
        return l * l;
    }

    public static double area(double a, double b) {
        return a * b;
    }


}
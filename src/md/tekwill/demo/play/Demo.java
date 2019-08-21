package md.tekwill.demo.play;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

class Demo {
    String name;
    static int b;
    public static void main(String[] args) {
        Demo a = new Demo();
        a.name = "Hello";
        Demo c = new Demo();
        c.b = 15;
        Demo.b = 13;
    }
}
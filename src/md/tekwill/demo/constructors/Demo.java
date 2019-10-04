package md.tekwill.demo.constructors;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class Demo {
    public static void main(String[] args) {
        List<Integer> collect = IntStream.iterate(0, i1 -> i1 + 1)
                .limit(10)
                .peek(System.out::println)
                .filter(i -> i % 2 == 0)
                .peek(System.out::println)
                .boxed()
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println();

        List<Integer> collect2 = IntStream.iterate(0, i -> i + 1)
                .limit(10)
                .peek(System.out::println)
                .sorted()
                .peek(System.out::println)
                .filter(i -> i % 2 == 0)
                .peek(System.out::println)
                .boxed()
                .peek(System.out::println)
                .collect(Collectors.toList());


        System.out.println();
        Stream.of(1, 2, 3, 4, 5, 6)
                .filter(i -> i % 2 == 0)
                .peek(System.out::println)
                .limit(50)
                .collect(Collectors.toList());

        LongStream.iterate(0, l -> l + 2L)
                .boxed()
                .limit(100)
                .collect(Collectors.toList());


        Unicorn mikey = new Unicorn("Mikey", "Pink", 999);
        Unicorn hector = new Unicorn("Hector");
        Unicorn haley = new Unicorn();

        System.out.println(mikey);
        System.out.println(haley);
        System.out.println(hector);
        System.out.println();
        System.out.println(Unicorn.TYPE_OF_ANIMAL);
        System.out.println(mikey.TYPE_OF_ANIMAL);
        System.out.println(haley.TYPE_OF_ANIMAL);
        System.out.println(hector.TYPE_OF_ANIMAL);
        System.out.println();
        mikey.fly();
        mikey.run();
        mikey.executeSuperpower("Sonic blast");
        mikey.executeSuperpower("Rainbow poop", 5);
        hector.fly();
        haley.run();
        System.out.println();
        haley.setName("Haley");
        haley.setColor("Aqua");
        haley.setAgeInYears(666);
        System.out.println(haley);
        haley.run();
        haley.singVerses();
        haley.singVerses("la");
        haley.singVerses("La", "Tra", "La");
        haley.singVerses(new String[]{"Lo", "Lea", "Lo"});
        haley.run();

        Dog d = new Dog("Bobby", -798, "Shepherd", "male");
        System.out.println(d);
        d.setAgeInYears(-798452);
        System.out.println(d);
    }
}

package md.tekwill.demo.integercache;

class Demo {
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer(2);


        System.out.println("== " + (a == b));
        System.out.println("equals " + a.equals(b));

        Integer d = Integer.valueOf(1);
        System.out.println(System.identityHashCode(d));
        Integer c = Integer.valueOf(1);
        System.out.println(System.identityHashCode(c));
        Integer e = Integer.valueOf(1);
        Integer f = Integer.valueOf(1);

        System.out.println("== " + (d == c));
        System.out.println("equals " + d.equals(c));

        Integer ab = 2; // Integer.valueOf(2) ->  -128 > 2 < 127 -> true -> cached 2
        Integer ba = 250; // Integer.valueOf(250) ->  -128 > 250 < 127 -> false -> new Integer(250)

        Integer da = null;
        da++; //da.intValue(); -> NullPointerException
    }
}

package md.tekwill.demo.loop.songs;

class TwelveDaysOfChristmasDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("On the ");
            switch (i) {
                case 0:
                    System.out.println("1");
                    break;
                case 1:
                    System.out.println("2");
                    break;
                case 2:
                    System.out.println("3");
                    break;
            }
            switch (i) {
                case 2:
                    System.out.println("gift gift gift");
                case 1:
                    System.out.println("gift gift");
                case 0:
                    System.out.println("gift");
                    break;
            }
        }
    }
}

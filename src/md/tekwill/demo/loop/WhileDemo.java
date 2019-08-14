package md.tekwill.demo.loop;

class WhileDemo {
    public static void main(String[] args) {
        boolean bunsAvailable = true;
        int totalBuns = 40;
        int numberOfBurgers = 1;

        while (bunsAvailable) {
            System.out.println("Preparing burger " + numberOfBurgers);
            --totalBuns;
            System.out.println("Placing the meat");
            System.out.println("Placing the cheese");
            System.out.println("Placing the pickles");
            System.out.println("Placing the tomatoes");
            System.out.println("Placing the salad");
            --totalBuns;
            System.out.println("Burger is prepared.\n");
            if (totalBuns == 0)
                bunsAvailable = false;
            else
                numberOfBurgers++;
        }
        System.out.println("Prepared " + numberOfBurgers + " burgers.");
        System.out.println("Remaining buns = " + totalBuns);
    }

}

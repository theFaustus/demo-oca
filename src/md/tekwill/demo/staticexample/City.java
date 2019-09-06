package md.tekwill.demo.staticexample;

class City {
    public static void main(String[] args) {
        House h1 = new House("Brick", "EURO", "brown");
        House h2 = new House("Concrete", "STANDARD", "brown");
        House h3 = new House("Stone", "EURO", "gray");

        System.out.println("All these houses were built following SAFETY STANDARD = " + House.SAFETY_STANDARD);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h1.SAFETY_STANDARD);
        System.out.println(h2.SAFETY_STANDARD);
        System.out.println(h3.SAFETY_STANDARD);
        House.SAFETY_STANDARD = "ISO33333332019";
        System.out.println("Due to 2019 elections, all houses have to follow SAFETY STANDARD = " + House.SAFETY_STANDARD);
        System.out.println(h1.SAFETY_STANDARD);
        System.out.println(h2.SAFETY_STANDARD);
        System.out.println(h3.SAFETY_STANDARD);

        System.out.println("H1 Electricity " + h1.hasElectricity());
        h1.setHasElectricity(false);
        System.out.println("H1 Electricity " + h1.hasElectricity());
        System.out.println("H2 Electricity " + h2.hasElectricity());
        System.out.println("H3 Electricity " + h3.hasElectricity());

        House.hideFromWind();
        h1.hideFromWind();
        h2.hideFromWind();
        h3.hideFromWind();


    }
}

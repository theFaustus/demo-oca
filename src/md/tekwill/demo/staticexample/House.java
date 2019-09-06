package md.tekwill.demo.staticexample;

class House {
    public static String SAFETY_STANDARD = "ISO79846524";

    private String typeOfWalls;
    private String typeOfWindows;
    private String colorOfRoof;
    private boolean hasElectricity = true;

    public House(String typeOfWalls, String typeOfWindows, String colorOfRoof) {
        this.typeOfWalls = typeOfWalls;
        this.typeOfWindows = typeOfWindows;
        this.colorOfRoof = colorOfRoof;
    }

    public String getTypeOfWalls() {
        return typeOfWalls;
    }

    public void setTypeOfWalls(String typeOfWalls) {
        this.typeOfWalls = typeOfWalls;
    }

    public String getTypeOfWindows() {
        return typeOfWindows;
    }

    public void setTypeOfWindows(String typeOfWindows) {
        this.typeOfWindows = typeOfWindows;
    }

    public String getColorOfRoof() {
        return colorOfRoof;
    }

    public void setColorOfRoof(String colorOfRoof) {
        this.colorOfRoof = colorOfRoof;
    }

    public void setHasElectricity(boolean hasElectricity) {
        this.hasElectricity = hasElectricity;
    }

    public boolean hasElectricity() {
        return hasElectricity;
    }

    public static void hideFromWind(){
        System.out.println("Always hiding from wind! :)");
    }

    @Override
    public String toString() {
        return "House{" +
                "typeOfWalls='" + typeOfWalls + '\'' +
                ", typeOfWindows='" + typeOfWindows + '\'' +
                ", colorOfRoof='" + colorOfRoof + '\'' +
                '}';
    }
}

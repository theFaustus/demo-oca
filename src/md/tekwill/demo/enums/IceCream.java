package md.tekwill.demo.enums;

enum IceCream {
    VANILLA("white"), STRAWBERRY("pink");

    private String color;

    IceCream(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public String toString(){
        return this.name() + " / " + this.color;
    }
}

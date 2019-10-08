package md.tekwill.demo.inheritance.interfaces.printableinterface;

class Rectangle implements Printable, InterfaceD1, InterfaceD2 {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public int foo() {
        return 0;
    }

    @Override
    public void print() {
        System.out.println("*****************************");
        System.out.println("Rectangle length > " + length);
        System.out.println("Rectangle width > " + width);
        System.out.println("*****************************");
    }
}

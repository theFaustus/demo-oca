package md.tekwill.demo.exceptions;

class Demo {
    public static void main(String[] args) {
        NetworkConnector n = new NetworkConnector();
        try {
            String connect = n.connect("h.");
            System.out.println(connect);
        } catch (InvalidUrlException e) {
            System.out.println(e.getMessage());
        } catch (DotNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

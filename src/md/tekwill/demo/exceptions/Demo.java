package md.tekwill.demo.exceptions;

class Demo {
    public static void main(String[] args) {
        NetworkConnector n = new NetworkConnector();
        //HANDLE
        try {
            String connect = n.getStatusConnection("h");
            System.out.println(connect);
        } catch (BusinessConnectionException e){
            System.out.println(e);
        }

        System.out.println(1 + 2);
    }
}

package md.tekwill.demo.exceptions;

class NetworkConnector {
    public String connect(String url) throws InvalidUrlException, DotNotFoundException {
        if (url.length() == 0) {
            throw new InvalidUrlException("The provided url is wrong!");
        } else if(!url.startsWith("h")) {
            throw new InvalidProtocolException("The provided protocol is wrong! (http/https)");
        } else if (!url.contains(".")){
            throw new DotNotFoundException("Your url needs at least one <.> (dot)!");
        } else {
            return "Connected";
        }
    }

}

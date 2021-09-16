public class Client extends AbstractPerson {
    private String service;
    private double price;

    Client(String name, String serv, double pr) {
        super(name);
        this.service = serv;
        this.price = pr;
    }

    @Override
    public String think() {
        return "Client";
    }
}

public class TestClient {

    public static void main(String[] args) {
        Client client = new Client("Customer", "Internet", 320);
        System.out.println(client.think());
    }
}

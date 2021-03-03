package discount;

public class Client {

    public static void main(String[] args) {
        Ticket t = new Ticket(100, new StudentDiscount());
        System.out.println(t.getPrice());
    }

}

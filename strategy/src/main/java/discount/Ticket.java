package discount;

/**
 * 环境角色【门票】
 */
public class Ticket {

    private double price;

    private Discount discount;

    public Ticket(double price, Discount discount) {
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return discount.calculate(price);
    }
}

package discount;

/**
 * 具体策略【会员票】
 */
public class VipDiscount implements Discount{

    @Override
    public double calculate(double price) {
        return price * 0.5;
    }
}

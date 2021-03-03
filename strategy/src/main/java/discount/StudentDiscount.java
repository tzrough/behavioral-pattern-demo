package discount;

/**
 * 具体策略【学生票】
 */
public class StudentDiscount implements Discount{

    @Override
    public double calculate(double price) {
        return price * 0.7;
    }
}

package solidprinciples.open_closed.discount;

public class VipDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        System.out.println("Vip Discount");
        return amount*0.10;
    }
}

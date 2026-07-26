package solidprinciples.open_closed.discount;


// open for extenstion
public class RegularDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        System.out.println("Regular discount");
        return amount*0.05;
    }
}

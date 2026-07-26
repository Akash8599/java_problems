package solidprinciples.open_closed.discount;


// closed for modification
public class DiscountCalculator {

    public double calculate(DiscountStrategy discountStrategy, double amount){
        return discountStrategy.applyDiscount(amount);
    }

}

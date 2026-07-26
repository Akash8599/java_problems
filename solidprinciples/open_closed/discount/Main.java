package solidprinciples.open_closed.discount;

public class Main {

    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();

        double calculate = discountCalculator.calculate(new RegularDiscount(), 100);
        System.out.println(calculate);

    }
}

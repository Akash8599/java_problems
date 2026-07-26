package solidprinciples.single_responsibilty;

public class Invoice {

    private double amount;
    private final String customerName;

    public Invoice(double amount, String customerName){
        this.amount = amount;
        this.customerName = customerName;

    }

    public double calculateTotalWIthTax(){
        System.out.println(amount + " " + customerName);
        return amount*0.8;
    }
}



package designapattern.observableDesignPattern;

import java.util.Observable;
import java.util.Observer;

public class ObservableDesignPattern {

    public static void main(String[] args) {
        Stock stock = new Stock();

        PriceDisplay display1 = new PriceDisplay("1");
        PriceDisplay display2 = new PriceDisplay("2");

        stock.addObserver(display1);
        stock.addObserver(display2);

        stock.setPrice(100);
        stock.setPrice(200);


    }
}

class Stock extends Observable{

    private double  price;

    public void setPrice(double price){
        this.price = price;
        setChanged();
        notifyObservers(price);
    }

    public double getPrice(){
        return price;
    }

}

class PriceDisplay implements Observer {

    private String dispalyId;

    public PriceDisplay(String dispalyId){
        this.dispalyId = dispalyId;
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Display " + dispalyId + ": Stock price updated to " + arg);
    }
}




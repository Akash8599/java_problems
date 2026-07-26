package designapattern.adopterDesignPattern;

public class ChargerAdopter  implements  OldCharger{

    private NewCharger newCharger;

    public ChargerAdopter (NewCharger newCharger){
        this.newCharger = newCharger;
    }

    @Override
    public void chargeWithMicroUsb() {
        System.out.println("Using adopter");
        newCharger.chargeWithCPort();
    }
}

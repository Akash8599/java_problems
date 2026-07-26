package designapattern.adopterDesignPattern;

public class AdopterPatternMain {
    public static void main(String[] args) {
        OldCharger oldCharger = new OldChargerIml();
        oldCharger.chargeWithMicroUsb();

        System.out.println("---------------------------");

        NewCharger newCharger =  new NewCharger();

        OldCharger adopter = new ChargerAdopter(newCharger);
        adopter.chargeWithMicroUsb();
    }
}

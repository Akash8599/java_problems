package designapattern.factoryDesignPattern;

public class FactoryClass {
    public static Employee getEmployee(String name){
        if (name.equals("WEB_DEVELOPER")){
            return new WebDeveloper();
        }
        else if (name.equals("ANDRIOD_DEVELOPER")){
            return new AndroidDeveloper();
        }
        else
             return null;
    }
}

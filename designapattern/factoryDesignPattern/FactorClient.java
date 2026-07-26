package designapattern.factoryDesignPattern;

public class FactorClient {
    public static void main(String[] args) {
        Employee webDevloperEmployee = FactoryClass.getEmployee("WEB_DEVELOPER");
        System.out.println(webDevloperEmployee.getSalary());

        Employee androidDevloperEmployee = FactoryClass.getEmployee("ANDRIOD_DEVELOPER");
        System.out.println(androidDevloperEmployee.getSalary());
    }
}

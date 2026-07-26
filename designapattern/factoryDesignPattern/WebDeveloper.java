package designapattern.factoryDesignPattern;

public class WebDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Web developer salary");
        return 50000;
    }
}

package designapattern.buiderDesignPattern;


//creational designa pattern
public class BuilderDesignPattern {
    private String name;
    private String salary;

    public class Builder{
        private String name;
        private String salary;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setSalary(String salary){
            this.salary = salary;
            return this;
        }

        public  BuilderDesignPattern build(){
            BuilderDesignPattern builderDesignPattern = new BuilderDesignPattern();
            builderDesignPattern.name  = this.name;
            builderDesignPattern.salary = this.salary;

            return builderDesignPattern;
        }

    }

    public static void main(String[] args) {
        designapattern.BuilderDesignPattern builderDesignPattern = new designapattern.BuilderDesignPattern.Builder().setEngine("V8").setWheels(4).build();
        System.out.println(builderDesignPattern.toString());
    }

}

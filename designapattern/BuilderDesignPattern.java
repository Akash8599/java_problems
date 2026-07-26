package designapattern;

public class BuilderDesignPattern {

    private String engine;
    private int wheels;

    public static class Builder{
        private String engine;
        private int wheels;

        public Builder setEngine(String engine){
            this.engine = engine;
            return this;
        }

        public Builder setWheels(int wheels){
            this.wheels = wheels;
            return this;
        }

        public BuilderDesignPattern build(){
            BuilderDesignPattern builderDesignPattern = new BuilderDesignPattern();
            builderDesignPattern.engine = this.engine;
            builderDesignPattern.wheels = this.wheels;

            return builderDesignPattern;
        }
    }


    public static void main(String[] args) {
        BuilderDesignPattern builderDesignPattern = new Builder().setEngine("V8").setWheels(4).build();
        System.out.println(builderDesignPattern.toString());
    }

}

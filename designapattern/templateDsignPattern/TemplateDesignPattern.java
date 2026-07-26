package designapattern.templateDsignPattern;


abstract class DataProcessor {
    public final void process(){
        loadData();
        processData();
        saveData();
    }

    abstract void loadData();
    abstract void processData();

    void saveData(){
        System.out.println("Saving data to default location");
    }


}

class DatabaseDataProcessor extends DataProcessor{

    @Override
    void loadData() {
        System.out.println("Database data load");
    }

    @Override
    void processData() {
        System.out.println("Database data process");
    }
}

class CsvDataProcessor extends DataProcessor{

    @Override
    void loadData() {
        System.out.println("CSV data load");
    }

    @Override
    void processData() {
        System.out.println("CSV data process");
    }
}

public class TemplateDesignPattern {
    public static void main(String[] args){

        DataProcessor dataProcessor = new DatabaseDataProcessor();
        dataProcessor.process();

        DataProcessor csvDataProcessor = new CsvDataProcessor();
        csvDataProcessor.process();
    }
}
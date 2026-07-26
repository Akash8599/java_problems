package designapattern.singleton;

public class SingletonPattern {
    private static volatile SingletonPattern instance = null;

    private SingletonPattern(){

    }

    public static SingletonPattern getInstance(){
        if (instance == null ){

            synchronized (SingletonPattern.class){
                instance = new SingletonPattern();
            }
        }

        return instance;
    }

}

package designapattern.templateDsignPattern;

import com.sun.org.apache.xerces.internal.impl.dv.XSSimpleType;

public abstract class Game {

    abstract void initialize();

    abstract  void startPlay();

    abstract void endPlay();

    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}

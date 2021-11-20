package rainJmartFH;

import java.util.Vector;
import java.util.function.Function;

public class ObjectPoolThread<T>{
    private boolean exitSignal;
    private Vector<T> objectPool;
    private Function<T, Boolean> routine;

    public ObjectPoolThread(String name, Function<T,Boolean> routine){
        this routine = routine;

    }
    public ObjectPoolThread(Function<T,Boolean> routine){

    }

    public void add(T object){

    }
    public void exit(){

    }
    public void run(){

    }
    public int size(){
        return ;
    }
}

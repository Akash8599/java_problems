import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class GenericList{
    public static void main(String[] args) {

    }
}
class ReturnGenericList<T> implements Iterable<T> {

    private Object[] elements;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public ReturnGenericList(){
        this.size = 0;
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(T element){

        insureCapacity();
        elements[size++] = element;
    }

    private T get(int index){
        if (index<0 || index>=size){
            throw  new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }

    
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private void insureCapacity(){
        if(size == elements.length){
            int newCapacity = elements.length*2;
            Object []newArray = new Object[newCapacity];


            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;

        }
    }
}

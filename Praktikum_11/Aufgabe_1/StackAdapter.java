import java.util.ArrayList;
import java.util.Iterator;

public class StackAdapter <T> implements Stack <T> {
    ArrayList <T> array = new ArrayList <T>();

    public T push(T item) {
        array.add((T) item);
        return  item;
    }

    @Override
    public T pop() throws RuntimeException {
        T var = null;
        int counter = 0 ;
        if (array.size()!= 0) {
           for (int i = 1 ; i < array.size();i++){
               counter++;
           }
        var = array.get(counter);
        array.remove(counter);
        }
        return var;
    }

    @Override
    public T peek() throws RuntimeException {
        T var = null;
        int counter = 0 ;
        // Es wird geprueft, ob die Laenge des Arrays nicht null ist.
        if (array.size()!= 0) {
            for (int i = 1 ; i < array.size();i++){
                counter++;
            }
            var = array.get(counter);
        }
        return var;
    }

    @Override
    public boolean empty() {
        if (array.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}

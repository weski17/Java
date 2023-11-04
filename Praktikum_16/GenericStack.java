import java.util.List;

public class GenericStack<T>{

    private List<T> liste;

    /**
    Constructor
     */
    GenericStack(List<T> newlist)
    {
        liste = newlist;
    }

    /**return if the list empty
     *
     * @return
     */
    public boolean isEmpty()
    {
        if (liste.isEmpty())
        {
            return true;
        }
        return false;
    }


    /**add one objekt
     *
     * @param item
     * @return
     */
    public T push(T item) {

        liste.add(item);
        return item;
    }

    /**shows the uppermost objekt
     *
     * @return
     */
    public T top()
    {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return liste.get(liste.size() - 1);
    }

    /**remove the uppermost objekt
     *
     * @return
     */
    public T pop()
    {
        T item;
        if (isEmpty())
        {
            throw new RuntimeException();
        } else {
            item = liste.remove(liste.size()-1);
            return item;
        }
    }


}

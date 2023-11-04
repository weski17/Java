public interface Tree< E extends Comparable<E> > {
    void insert(E date);
    void delete (E date);
    void traverse();
    boolean isEmpty(E data);
    void print ();
    void finish();
}

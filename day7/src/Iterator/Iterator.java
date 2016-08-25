package Iterator;

/**
 * Created by Марат on 25.08.2016.
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();

    void remove();
}

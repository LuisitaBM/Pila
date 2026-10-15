package tdapila;

import java.util.Iterator;

/**
 *
 * @author luisa
 */
public interface IList<T> {
    public void push (T element);
    public T pop() throws ListException;
    public T peek() throws ListException;
    public boolean empty();
    public int size();
    
}

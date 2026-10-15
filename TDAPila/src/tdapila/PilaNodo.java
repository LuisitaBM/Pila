package tdapila;

import java.util.Iterator;

/*
 * * @author luisa
 */
public class PilaNodo <T> implements IList<T>{
    
    private class Nodo{
        T dato;
        Nodo sig;
        
        Nodo (T dato, Nodo sig){
            this.dato = dato;
            this.sig = sig;
        }
    }
    private Nodo top;
    private int nElem;
    
    public PilaNodo() {
        top= null;
        nElem =0;
    }
    
    public void push(T element) {
        top = new Nodo(element, top);
        nElem++;
    }

    
    public T pop() throws ListException {
        try{
            if(!empty()){
                T dato = top.dato;
                top = top.sig;
                nElem--;
                return dato;
            }            
        }catch(Exception e){
            System.out.println("ERROR: "+e.getMessage());
        }
        return top.dato;
    }

   
    public T peek() throws ListException {
        if(empty()){
            throw new IllegalStateException("La pila esta vacia");
        }
        return top.dato;
    }

    
    public boolean empty() {
        return nElem == 0;
    }

    
    public int size() {
        return nElem;
    }
    
}

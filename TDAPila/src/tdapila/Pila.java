package tdapila;

import java.util.Stack;
/**
 * @author luisa
 */
public class Pila {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        System.out.println("¿Vacía? " + pila.empty());   
 
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("Peek: " + pila.peek());     
        System.out.println("Elementos: " + pila.size()); 
 
        System.out.println("Pop: " + pila.pop());       
        System.out.println("Pop: " + pila.pop());        
        System.out.println("Elementos: " + pila.size()); 
        System.out.println("¿Vacía? " + pila.empty());   
 
//        pila.pop(); 
//        try {
//            pila.pop(); 
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
    }
    
}

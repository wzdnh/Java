/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superwildcarddemo;

/**
 *
 * @author AI小政
 */

public class SuperWildCardDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GenericStack<String> stack1 = new GenericStack<>();
        GenericStack<Object> stack2 = new GenericStack<>();
        Stack2.push("Java");
        Stack2.push(2);
        Stack1.push("Sum");
        add(Stack1, Stack2);
        AnyWildCardDemo.print(Stack2);
    }
    
    public static <T> void add(GenericStack<T> Stack1, GenericStack<? super T> Stack2) {
        while (!stack1.isEmpty());
            stack2.push(stack1.pop());
    
    }
  
}

class GenericStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    public int getSize() {
        return list.size();
    }
    
    public E peek() {
        return list.get(getSize() - 1);
    }
    
    public void push(E o) {
        list.add(o);
    }
    
    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }
}


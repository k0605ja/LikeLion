package week5._22_10_20;

import java.util.EmptyStackException;

public class Stack02 {


    private Integer[] arr; // polymorphism
    // initalization -> null
    private int top = 0;


    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[10000];
    }

    public void push(int value) {
    this.arr[0] = value;
    this.top ++;
    }


    public int pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        int value = this.arr[this.top-1];
        this.top--;
        return value;
    }


    public Integer[] getArr() {
        return arr;
    }

    public boolean isEmpty() {
        boolean isEmpty = this.top == 0;
        return isEmpty;
    }


    public int peek() {
        if(isEmpty()) throw new EmptyStackException();
        return this.arr[this.top-1];
        }


}

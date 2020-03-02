package Lektion4;

public class ArrayStak implements IStak{
    Object[] elements;
    int arraySize;


    public ArrayStak(int arraySize){
        this.arraySize=arraySize;
        elements = new Object[arraySize];
    }

    public void push(String e) {
        Object[] newElements = new Object[elements.length+1];
        newElements[elements.length+1]=e;
        for (int i = 0; i <newElements.length ; i++) {
            newElements[i]=elements[i];
        }
        elements=newElements;
    }

    public String pop() {
        return "";
    }


    public boolean isEmpty() {
        return false;
    }


    public boolean isFull() {
        return false;
    }


    public void show() {

    }
}

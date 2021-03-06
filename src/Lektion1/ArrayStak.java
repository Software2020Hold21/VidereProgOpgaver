package Lektion1;

public class ArrayStak implements Stak {
    private Object[] elements;

    public ArrayStak(){
        this.elements = new Object[0];
    }


    public void push(Object e) {
        //Hvis arrayet er tomt
        if (this.elements.length == 0) {
            this.elements = new Object[1];
            this.elements[0] = e;
        } else {
            //Hvis arrayet ikke er tomt
            Object[] newElements = new Object[this.elements.length + 1];
            for (int i = 0; i < this.elements.length; i++) {
                newElements[i] = this.elements[i];
            }
            newElements[this.elements.length] = e;

            this.elements = newElements;
        }
    }

    public Object pop() {
        //Hvis arrayet ikke har nogen elementer
        if (this.elements.length == 0) {
            return null;
        } else {
            //Hvis arrayet ikke er tomt
            Object[] newElements = new Object[this.elements.length - 1];
            for (int i = 0; i < this.elements.length - 1; i++) {
                newElements[i] = this.elements[i];
            }
            Object output = this.elements[this.elements.length - 1];
            this.elements = newElements;
            return output;
        }
    }

    public boolean isEmpty() {
        boolean isEmpty = true;
        for (Object element:this.elements) {
            if (element!=null){
                isEmpty=false;
            }
        }

        return isEmpty;
    }

    public boolean isFull() {
        boolean isEmpty = true;
        for (Object element:this.elements) {
            if (element==null){
                isEmpty=false;
            }
        }

        if (this.elements.length==0){
            isEmpty = false;
        }

        return isEmpty;
    }

    public void show() {
        for (int i =this.elements.length-1;i>=0;i--){
            System.out.println(this.elements[i]);
        }
    }


}

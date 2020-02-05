package Lektion1;

public class LinkedStak implements Stak{
    class Element{
        private Object object;
        private Element nextElement;
        Element(Object object,Element nextElement){
            this.object = object;
            this.nextElement = nextElement;
        }
    }

    private Element first; //Det første element
    private Element active; //Det aktive element

    public LinkedStak(){
        first = active = null;
    }

    public void push(Object e) {
        if (first == null) {
            //Hvis der ikke er nogen elementer i stakken endnu
            first = new Element(e,null);
        } else {
            Element newFirst = new Element(e,this.first);
            this.first = newFirst;
        }
    }

    public Object pop() {
        this.active = this.first;
        if (first == null) {
            System.out.println("Hov. denne LinkedStak er allerede tom.");
            return null;

        } else {
            Object output = this.first.object;
            this.first = this.first.nextElement;
            return output;
        }
    }

    public boolean isEmpty() {
        return this.first==null;
    }

    public boolean isFull() {
        return this.first!=null;
    }

    public void show() {
        if (this.first==null){
            System.out.println("Denne LinkedStak er tom");
        } else{
            this.active = this.first;
            while (this.active.nextElement != null){
                System.out.println(this.active.object);
                this.active = this.active.nextElement;
            }
            System.out.println(this.active.object);
        }



    }


}

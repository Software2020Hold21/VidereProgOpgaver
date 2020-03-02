package Lektion4.GenericsList;

public interface IStak <E> {
    void push(E element);
    E pop();
    boolean isEmpty();
	boolean isFull();
	void show();
}

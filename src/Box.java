import java.util.*;

class Box<T extends Comparable<T>> implements Comparable<Box<T>> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    @Override
    public int compareTo(Box<T> objek) {
        return this.value.compareTo(objek.get());
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

class BelajarPboList<T extends Comparable<T>> extends ArrayList<T> {

    public void printList() {
        PrintUtil.printList(this);
    }

    public void printListSorted() {
        PrintUtil.printListSorted(this);
    }
}

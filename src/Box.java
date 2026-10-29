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

class BelajarPboList<T extends Comparable<T>> implements List<T> {
    private final List<T> listPBO = new ArrayList<>();

    public void printList() {
        PrintUtil.printList(listPBO);
    }

    public void printListSorted() {
        PrintUtil.printListSorted(listPBO);
    }

    @Override
    public int size() {
        return listPBO.size();
    }

    @Override
    public boolean isEmpty() {
        return listPBO.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return listPBO.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return listPBO.iterator();
    }

    @Override
    public Object[] toArray() {
        return listPBO.toArray();
    }

    @Override
    public <E> E[] toArray(E[] a) {
        return listPBO.toArray(a);
    }

    @Override
    public boolean add(T t) {
        return listPBO.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return listPBO.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return listPBO.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return listPBO.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return listPBO.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return listPBO.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return listPBO.retainAll(c);
    }

    @Override
    public void clear() {
        listPBO.clear();
    }

    @Override
    public T get(int index) {
        return listPBO.get(index);
    }

    @Override
    public T set(int index, T element) {
        return listPBO.set(index, element);
    }

    @Override
    public void add(int index, T element) {
        listPBO.add(index, element);
    }

    @Override
    public T remove(int index) {
        return listPBO.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return listPBO.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return listPBO.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return listPBO.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return listPBO.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return listPBO.subList(fromIndex, toIndex);
    }
}

import java.util.*;

interface Printable {
    String getPrintDetail();
}

class Produk implements Printable{
    private String nama;

    public Produk(String nama){
        this.nama = nama;
    }

    @Override 
    public String getPrintDetail(){
        return "Produk: " + nama;
    }
}

public class PrintUtil {
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static <T> void printList(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }

    public static <T extends Printable> void printPrintList(List<T> list) {
        for (T comp : list) {
            System.out.println(comp.getPrintDetail());
        }

    }

    public static <T extends Printable> void printPrintList(T[] list) {
        for (T comp : list) {
            System.out.println(comp.getPrintDetail());
        }

    }

    public static <T extends Comparable<T>> void printListSorted(List<T> list) {
        List<T> copy = new ArrayList<>(list);
        Collections.sort(copy);
        for (T item : copy) {
            System.out.println(item);
        }
    }

    public static <T extends Comparable<T>> void printListSorted(T[] arr) {
        T[] copy = arr.clone();
        Arrays.sort(copy);
        for (T item : copy) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> produk = new ArrayList<>();

        produk.add("Laptop");
        produk.add("Handpdone");
        produk.add("PC");

        BelajarPboList<Box<Integer>> myList = new BelajarPboList<>();

        myList.add(new Box<>(300));
        myList.add(new Box<>(100));
        myList.add(new Box<>(200));

        System.out.println("Output Data: ");
        myList.printList();

        System.out.println("Output Sorting: ");
        myList.printListSorted();

    }
}
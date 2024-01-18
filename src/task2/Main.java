package task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        VirtualCollection<String> collection = new VirtualCollection<>();
        collection.add("Привет");
        collection.add("шаг");
        collection.add("и");
        collection.add("весь");
        collection.add("Мир!");
        collection.print();
        System.out.println("Второй элемент: " + collection.get(1));
    }
}

class VirtualCollection<T extends Object> {
    private T[] array;

    public VirtualCollection() {
        array = (T[]) new Object[0];
    }

    public void print() {
        for (T t : array) {
            System.out.println(t);
        }
    }

    public void add(T newValue) {
        T[] newArray = Arrays.copyOf(array, array.length + 1);
        this.array = newArray;
        array[array.length - 1] = newValue;
    }

    public T get(int position) {
        if (position >= 0 && position < array.length) {
            return array[position];
        } else return null;
    }
}

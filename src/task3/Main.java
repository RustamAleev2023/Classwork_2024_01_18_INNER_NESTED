package task3;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        TempleClass<Integer> templeClass1 = new TempleClass<Integer>(10, 100);
        templeClass1.compare(templeClass1.o1, templeClass1.o2);
        templeClass1.add(templeClass1.o1, templeClass1.o2);

        TempleClass<String> templeClass2 = new TempleClass<>("Hello", "World");
        templeClass2.add(templeClass2.o1, templeClass2.o2);
        templeClass2.compare(templeClass2.o1, templeClass2.o2);


    }

    static class TempleClass<T extends Object> {
        private T o1;
        private T o2;


        public TempleClass(T o1, T o2) {
            this.o1 = o1;
            this.o2 = o2;
        }

        public void compare(T o1, T o2) {
            if (o1 == o2) {
                System.out.println("Are same");
            } else {
                System.out.println("They are not same");
            }
        }

        public void add(T o1, T o2) {
            if (o1.getClass() == Integer.class) {
                System.out.println((Integer) o1 + (Integer) o2);
            } else if (o1.getClass() == String.class) {
                System.out.println(o1 + " " + o2);
            } else {
                System.out.println(" Такие объекты нельзя сложить");
            }
        }

    }
}


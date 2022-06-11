import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<Integer>();
        System.out.println("Adding elements to the list: ");
        list.addMy(1);
        list.addMy(2);
        list.addMy(3);
        list.addMy(4);

        System.out.println("Added: " + list);
        System.out.println("Adding one more element to the list: ");
        list.addMy(5);
        System.out.println("After adding another element: " + list);

        System.out.println("List size: " + list.sizeMy());
        System.out.println("Remove element by index: " + list.remove(3));

        System.out.println("After removing by index:" + list);

        list.clear();
        System.out.println("List after complete cleaning: " + list);

    }
}
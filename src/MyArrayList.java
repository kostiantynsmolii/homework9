import java.awt.List;
import java.util.*;

public class MyArrayList<T> {

    private T[] elements;
    private int size;
    private int capacity = 0;

    public MyArrayList() {
        int CAPACITY = 16;
        this.elements = (T[]) new Object[CAPACITY];
        capacity = CAPACITY;
    }

    public boolean addMy(T o) {
        if (size >= capacity) {
            increaseCapacity();
        }
        elements[size++] = o;
        return true;
    }

    private void increaseCapacity() {
        capacity = capacity * 2;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
            elements[i] = null;
        }
        elements = (T[]) newArray;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public T getMy(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < this.sizeMy())
            return elements[index];

        else
            throw new IndexOutOfBoundsException("index " + index +
                    " is beyond the size of the array " + "(" + this.sizeMy() + ")");
    }

    public int sizeMy() {
        return this.size;
    }

    public T remove(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < this.sizeMy()) {
            T temp = elements[index];

            for (int i = index; i < this.sizeMy() - 1; i++)
                elements[index] = elements[index + 1];

            size--;
            return temp;
        } else
            throw new IndexOutOfBoundsException("index " + index +
                    " is beyond the size of the array (" + this.sizeMy() + ")");

    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");

        for (int i = 0; i < this.sizeMy(); i++) {
            if (i < this.sizeMy() - 1)
                stringBuffer.append(this.elements[i] + ", ");
            else
                stringBuffer.append(this.elements[i]);
        }

        stringBuffer.append("]");
        return stringBuffer.toString();

    }
}

//add(Object value) добавляет элемент в конец
//remove(int index) удаляет элемент под индексом
//clear() очищает коллекцию
//size() возвращает размер коллекции
//get(int index) возвращает элемент под индексом

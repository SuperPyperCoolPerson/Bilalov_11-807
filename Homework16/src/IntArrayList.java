import java.util.Arrays;
import java.util.Iterator;

public class IntArrayList implements IntList {
    private int[] elements; // элементы
    private static final int DEFAULT_CAPACITY = 10; // размер
    private int capacity; // размер кол во элементов
    int count = 0;
    private static final double EXTENSION_COEF = 1.5; //на сколько увеличиваем


    public IntArrayList() {
        elements = new int[DEFAULT_CAPACITY]; // создаем массив на 10 элементов
        capacity = DEFAULT_CAPACITY;  // размер массива
    }

    @Override
    public int size() {
        int size = 0;
        for (int i = 0; i < count; i++) {
            size++;
        }
        return size;

    }

    @Override
    public void contains() {


    }

    @Override
    public void add(int e) {
        if (capacity == count) {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        return elements[index];
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                int[] OldArray = new int[elements.length - 1];
                System.arraycopy(elements, 0, OldArray, 0, i);
                System.arraycopy(elements, i + 1, OldArray, i, elements.length - 1 - index);
                elements = OldArray;
            }
        }
    }

    @Override
    public void sort() {
        int j;
        for (int i = 0; i < elements.length - 1; i++) {
            if (elements[i] > elements[i + 1]) {
                j = elements[i];
                elements[i] = elements[i + 1];
                elements[i + 1] = j;
            }

        }

    }

    @Override
    public void addAll(IntList intList) {
        for (int i = 0; i < intList.size(); i++) {
            add(intList.get(i));
        }
    }

    @Override
    public void addAll(IntList intList, int startPosition) {
        for (int i = 0; i < intList.size(); i++) {
            if (startPosition >= count || capacity == count) {
                grow();
            }
            elements[startPosition] = intList.get(i);
            startPosition++;
        }
    }

    @Override
    public int[] toArray() {
        return Arrays.copyOf(elements, count);
    }

    @Override
    public int indexOf(int value) {
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (elements[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public IntList next() {
        return null;
    }
}
package ru.itis;

public class ArrayList {
    int array[] = new int[10];
    int count = 0;

    void addToEnd(int element) {
        if (count < array.length) {
            array[count] = element;
            count++;
        }
        else {
            array = longerArray();
            addToEnd(element);
        }
    }

    void deleteNumber(int index) {
        for (int i = index; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        count -= 1;
    }

    void insertNumber(int index, int number) {
        if (count < array.length) {
            if (index <= count) {
                for (int i = count-1; i > index; i--) {
                    array[i] = array[i-1];
                }
                array[index] = number;
                count += 1;
            }
        }
        else {
            array = longerArray();
            insertNumber(index, number);
        }
    }

    private int[] longerArray() {
        int arrayCopy[] = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        return arrayCopy;
    }

    void showList() {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

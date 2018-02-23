package ru.itis;

public class Search {

    int binarySearch(int[] numbers, int searched, int lower, int higher) {

        int middle = lower + (higher - lower) / 2;

        if (higher - lower > 0) {
            if (searched < numbers[middle]) {
                return binarySearch(numbers, searched, lower, middle);
            } else if (searched > numbers[middle]) {
                return binarySearch(numbers, searched, middle, higher);
            } else {
                return middle;
            }
        } else {
            return -1;
        }
    }
}

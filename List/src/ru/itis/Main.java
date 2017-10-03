package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList list = new ArrayList();

        while (true) {
            System.out.println("1. Создать массив");
            System.out.println("2. Добавить число в конец массива");
            System.out.println("3. Удалить число из массива");
            System.out.println("4. Вставить число в массив");
            System.out.println("5. Вывести массив на экран");
            System.out.println("6. Выход");

            int c = scanner.nextInt();    //num command

            if (c == 1) {
                int n = scanner.nextInt();
                for (int i = 0; i < n; i++) {
                    list.addToEnd(scanner.nextInt());
                }
            }

            if (c == 2) {
                list.addToEnd(scanner.nextInt());
            }

            if (c == 3) {
                list.deleteNumber(scanner.nextInt());
            }

            if (c == 4) {
                int index = scanner.nextInt();
                int number = scanner.nextInt();
                list.insertNumber(index, number);
            }

            if (c == 5) {
                list.showList();
            }

            if (c == 6) {
                System.exit(0);
            }
        }
    }
}

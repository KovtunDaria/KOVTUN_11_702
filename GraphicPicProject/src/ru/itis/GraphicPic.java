package ru.itis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class GraphicPic {
    ArrayList<Segment> segments = new ArrayList<>();

    GraphicPic(String filename) {
        //построение списка по множеству отрезков, заданных в тестовом файле

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String s = reader.readLine();

            while (s != null) {
                String[] splitString = s.split("\\s+"); //учитываются возможные лишние пробелы
                double cooX1 = Double.parseDouble(splitString[0]);
                double cooY1 = Double.parseDouble(splitString[1]);
                double cooX2 = Double.parseDouble(splitString[2]);
                double cooY2 = Double.parseDouble(splitString[3]);
                segments.add(new Segment(cooX1, cooY1, cooX2, cooY2));
                s = reader.readLine();
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void show() {
        //вывод всех отрезков и информации о них на экран
        for (int i = 0; i < segments.size(); i++) {
            System.out.println("" + (i+1) + ". " + segments.get(i).toString());
        }
        System.out.println();
    }

    void insert(Segment f) {
        //вставка элемента в список; повторно не добавлять
        for (Segment s : segments) {
            if (s.equals(f) ) {
                return;
            }
        }
        segments.add(f);
    }

    GraphicPic angleList() {
        //построить новый список из отрезков, наклоненных к Ox под углами 30 и 45 градусов
        ArrayList<Segment> list = new ArrayList<>();

        for (int i = 0; i < segments.size(); i++) {
            double a = segments.get(i).cooX1-segments.get(i).cooX2;
            double b = segments.get(i).cooY1-segments.get(i).cooY2;
            long c = (long)((a/b)*10000000000L);
            final long ROOT = (long) (Math.sqrt(3) * 10000000000L);
            if(Math.abs(c) == ROOT || Math.abs(c) == 10000000000L) {
                list.add(segments.get(i));
            }

        }
        return new GraphicPic(list);
    }

    public GraphicPic(ArrayList<Segment> segments) {
        this.segments = segments;
    }

    GraphicPic lengthList(int a, int b) {
        //построить новый список из отрезков, чья длина в [a, b]
        ArrayList<Segment> list = new ArrayList<>();
//        Collections.sort(list);

        for (int i = 0; i < segments.size(); i++) {
//            if (list.get(i).length < a || list.get(i).length > b) {
//                list.remove(i);
//            }
            if (segments.get(i).length>= a && segments.get(i).length<= b) {
                list.add(segments.get(i));
            }
        }
        Collections.sort(list);
        return new GraphicPic(list);
    }

    void sort() {
        // упорядочить по длине
        //WHATIF нужна собственная сортировка, без компараторов?
        Collections.sort(segments);
    }


}


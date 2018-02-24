package ru.itis;

public class Main {

    public static void main(String[] args) {
        GraphicPic list = new GraphicPic("segments.txt");
        list.show();
        list.insert(new Segment(1, 2, 3, 4));
        list.sort();
        list.show();
        list.lengthList(1,3).show();
        list.angleList().show();
        list.sort();
        list.show();
    }
}

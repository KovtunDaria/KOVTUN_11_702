package ru.itis;

public class Car {
    private String color;
    private String model;
    private String number;
    private int power;
    private int mileage = 0;


    public Car(String color, String model, String number, int power) {
        this.color = color;
        this.model = model;
        this.number = number;
        this.power = power;
    }

    public Car(String model, int power) {
        this.model = model;
        this.power = power;

    public Car() {

    }

    void drive(int distance) {
        if (distance >= 0) {
            mileage += distance;
        } else {
            System.err.println("число не может быть отрицательным");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power > 0) {
            this.power = power;
        } else {
            System.err.println("Значение не может быть отрицательным!");
            System.err.println("Установлено значение по умолчанию.");
            this.power = 0;
        }
    }

    public int getMileage() {
        return mileage;
    }

}

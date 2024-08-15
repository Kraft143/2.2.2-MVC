package web.model;

import java.io.Serializable;

public class Car implements Serializable {
    private String color;
    private int year;
    private String model;

    public Car(String color, int year, String model) {
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}

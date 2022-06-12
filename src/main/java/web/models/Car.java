package web.models;

public class Car {

    String color;
    String model;
    int engine;


    public Car(String color, String model, int engine) {
        this.color = color;
        this.model = model;
        this.engine = engine;
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

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }


}

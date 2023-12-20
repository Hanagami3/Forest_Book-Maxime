package be.intecbrussel.the_notebook.entities.plant_entities;

public class Plant {

    protected String name;
    protected double height;



    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this.name = name;
        setHeight(height);
    }



    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0)
            height = 0;
        this.height = height;
    }
}

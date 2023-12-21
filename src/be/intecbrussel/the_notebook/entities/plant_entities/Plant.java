package be.intecbrussel.the_notebook.entities.plant_entities;

import be.intecbrussel.the_notebook.entities.service.ForestNotebook;

public class Plant implements Comparable<Plant>{

    protected String name;
    protected double height;



    public Plant(String name) {
        this.name = name;
        System.out.println("Je probeerde toe te voegen een plant die al in de note book staat: " + name);
    }

    public Plant(String name, double height) {
        this.name = name;
        setHeight(height);
        ForestNotebook.addPlant(this);
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

    @Override
    public int compareTo(Plant plant) {
        if (this.name.compareTo(plant.name) > 0)
            return 1;
        else
            return -1;
    }
}

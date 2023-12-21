package be.intecbrussel.the_notebook.entities.plant_entities;

import be.intecbrussel.the_notebook.entities.service.ForestNotebook;

public class Flower extends Plant{

    private Scent smell;


    public Flower(String name) {
        super(name);
    }

    public  Flower(String name, double height){
        super(name, height);
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }


    @Override
    public String toString() {
        return "\nFlower: " +
                "\nsmell= " + smell +
                "\nname=' " + name + '\'' +
                "\nheight= " + height;
    }
}

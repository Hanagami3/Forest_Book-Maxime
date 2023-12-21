package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Herbivore extends Animal{

    protected Set<Plant> plantDiet;

    public Herbivore(String name){
        super(name);
        plantDiet = new HashSet<>();
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        plantDiet = new HashSet<>();
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
    }

    public void printDiet (){
        Iterator itr = plantDiet.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }


    @Override
    public String toString() {
        return "\nHerbivore: " +
                "\nplantDiet= " + plantDiet.toString() +
                "\nname= '" + name + '\'' +
                "\nweight= " + weight +
                "\nheight= " + height +
                "\nlength= " + length;
    }
}

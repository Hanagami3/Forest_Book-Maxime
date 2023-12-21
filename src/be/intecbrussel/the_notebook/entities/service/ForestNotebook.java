package be.intecbrussel.the_notebook.entities.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ForestNotebook {

    private static List<Carnivore> carnivores;
    private static List<Omnivore> omnivores;
    private static List<Herbivore> herbivores;

    private int plantCount;
    private int animalCount;

    private static List<Animal> animals;
    private static List<Plant> plants;


    public ForestNotebook(){
        carnivores = new ArrayList<>();
        omnivores = new ArrayList<>();
        herbivores = new ArrayList<>();
        animals = new ArrayList<>();
        plants = new ArrayList<>();

        plantCount = getPlantCount();
        animalCount = getPlantCount();
    }


    //<editor-fold desc="'simple' getters and setters">
    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    //</editor-fold>

    public int getPlantCount() {
        return plants.size();
    }

    public int getAnimalCount() {
        return animals.size();
    }


    public static void addAnimal(Animal animal){
        boolean isInList = false;
        for (Animal animalInList : animals)
            if (animalInList.getName().equalsIgnoreCase(animal.getName()))
                isInList = true;
        if (!isInList) {
            animals.add(animal);
            if (animal instanceof Carnivore)
                carnivores.add((Carnivore) animal);
            else if (animal instanceof Herbivore)
                herbivores.add((Herbivore) animal);
            else
                omnivores.add((Omnivore) animal);
        }
        else
            animal = new Animal(animal.getName());
    }

    public static void addPlant(Plant plant){
        boolean isInList = false;
        for (Plant plantInList : plants)
            if (plantInList.getName().equalsIgnoreCase(plant.getName()))
                isInList = true;
        if (!isInList)
            plants.add(plant);
        else
            plant = new Plant(plant.getName());
    }

    public void printNoteBook(){
        System.out.println("\n----Dieren------");
        animals.forEach(System.out::println);
        System.out.println("\n-----Planten------");
        plants.forEach(System.out::println);


    }

    public void sortAnimalsByName(){
        Collections.sort(animals);
    }

    public void sortPlantsByName(){
        Collections.sort(plants);
    }

    //BONUS

    public void sortAnimalsByHeight(){
        animals.sort(Comparator.comparing(Animal::getHeight));
    }

    public void  sortPlantsByHeight(){
        plants.sort(Comparator.comparing(Plant::getHeight));

    }

}

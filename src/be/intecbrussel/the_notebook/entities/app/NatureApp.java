package be.intecbrussel.the_notebook.entities.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.entities.service.ForestNotebook;

public class NatureApp {

    public static void main(String[] args) {

        ForestNotebook notebook = new ForestNotebook();

        Bush bush1 = new Bush("Japanese Laurel", 2);
        bush1.setFruit("Drupes");
        bush1.setLeafType(LeafType.SPEAR);

        Tree tree1 = new Tree("Black Oak", 30);
        tree1.setLeafType(LeafType.HAND);

        Weed weed1 = new Weed("Strawberry Clover",0.03);
        weed1.setArea(10.5);

        Flower flower1 = new Flower("Centifolia Rose", 1.5);
        flower1.setSmell(Scent.SWEET);

        Flower flower2 = new Flower("Cystus Albus", 1);
        flower2.setSmell(Scent.MUSKY);


        Carnivore carnivore1 = new Carnivore("Wolf", 35.8, 0.7, 1.23);
        carnivore1.setMaxFoodSize(1.5);
        Carnivore carnivore2 = new Carnivore("lynx", 34.5, 0.6, 1.05);
        carnivore2.setMaxFoodSize(1);
        Carnivore carnivore3 = new Carnivore("Badger", 13, 0.25, 0.8);
        carnivore3.setMaxFoodSize(0.2);

        Herbivore herbivore1 = new Herbivore("Deer", 13, 0.65, 0.95);
        Herbivore herbivore = new Herbivore("Rabbit", 1.5, 0.1, 0.2);
        Herbivore herbivore2 = new Herbivore("Squirrel", 0.6, 0.1, 0.35);

        Omnivore omnivore1 = new Omnivore("Boar", 120, 0.8, 1.65);
        omnivore1.setMaxFoodSize(0.5);
        Omnivore omnivore2 = new Omnivore("Fox", 7, 0.40, 0.7);
        omnivore2.setMaxFoodSize(0.5);
        Omnivore omnivore = new Omnivore("Bear", 220, 0.95, 2.25);
        omnivore.setMaxFoodSize(2);





    }
}

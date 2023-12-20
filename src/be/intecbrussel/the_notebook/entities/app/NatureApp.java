package be.intecbrussel.the_notebook.entities.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.entities.service.ForestNotebook;

public class NatureApp {

    public static void main(String[] args) {

        ForestNotebook notebook = new ForestNotebook();

        Tree tree1 = new Tree("Oak");
        tree1.setLeafType(LeafType.HAND);
        Plant bush = new Bush("bush");
        Flower flower = new Flower("Rose");

        System.out.println(tree1);

        Herbivore herbivore = new Herbivore("coucou");
        herbivore.addPlantToDiet(tree1);
        herbivore.addPlantToDiet(bush);
        herbivore.addPlantToDiet(flower);

        Herbivore herbivore1 = new Herbivore("Sam",23,23,23);
        Herbivore herbivore2 = new Herbivore("Sam",40, 40, 40);
        Omnivore omnivore1 = new Omnivore("Toto",2,2,2);
        Omnivore omnivore2 = new Omnivore("Sasha",100, 100, 100);
        Carnivore carnivore1 = new Carnivore("Lucie", 55,55,55);

        notebook.addAnimal(herbivore1);
        notebook.addAnimal(herbivore2);
        notebook.addAnimal(omnivore1);
        notebook.addAnimal(omnivore2);
        notebook.addAnimal(carnivore1);

        System.out.println();

        herbivore.printDiet();
        System.out.println();

        System.out.println(notebook.getHerbivores());
        System.out.println(notebook.getCarnivores());
        System.out.println(notebook.getOmnivores());

        System.out.println();
        notebook.sortAnimalsByName();

        notebook.printNoteBook();
        System.out.println();

        System.out.println(notebook.getPlantCount());
        System.out.println(notebook.getAnimalCount());
    }
}

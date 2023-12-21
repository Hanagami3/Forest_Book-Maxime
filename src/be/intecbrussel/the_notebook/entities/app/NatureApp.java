package be.intecbrussel.the_notebook.entities.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.entities.service.ForestNotebook;

public class NatureApp {

    public static void main(String[] args) {

        ForestNotebook notebook = new ForestNotebook();

        Bush bushLaurel = new Bush("Japanese Laurel", 2);
        bushLaurel.setFruit("Drupes");
        bushLaurel.setLeafType(LeafType.SPEAR);

        Tree treeOak = new Tree("Black Oak", 30);
        treeOak.setLeafType(LeafType.HAND);

        Weed weedClover1 = new Weed("Strawberry Clover",0.03);
        weedClover1.setArea(10.5);
        Weed weedClover2 = new Weed("Strawberry Clover",0.03);
        weedClover2.setArea(10.5);

        Flower flowerRose = new Flower("Centifolia Rose", 1.5);
        flowerRose.setSmell(Scent.SWEET);
        Flower flowerCystus = new Flower("Cystus Albus", 1);
        flowerCystus.setSmell(Scent.MUSKY);


        Carnivore carniWolf = new Carnivore("Wolf", 35.8, 0.7, 1.23);
        carniWolf.setMaxFoodSize(1.5);
        Carnivore carniLynx = new Carnivore("Lynx", 34.5, 0.6, 1.05);
        carniLynx.setMaxFoodSize(1);
        Carnivore carniBadger = new Carnivore("Badger", 13, 0.25, 0.8);
        carniBadger.setMaxFoodSize(0.2);

        Herbivore herbiDeer = new Herbivore("Deer", 13, 0.65, 0.95);
        herbiDeer.addPlantToDiet(treeOak);
        herbiDeer.addPlantToDiet(weedClover1);
        Herbivore herbiRabbit = new Herbivore("Rabbit", 1.5, 0.1, 0.2);
        herbiRabbit.addPlantToDiet(flowerCystus);
        Herbivore herbiSquirrel = new Herbivore("Squirrel", 0.6, 0.1, 0.35);
        herbiSquirrel.addPlantToDiet(flowerRose);
        herbiSquirrel.addPlantToDiet(treeOak);

        Omnivore omniBoar = new Omnivore("Boar", 120, 0.8, 1.65);
        omniBoar.setMaxFoodSize(0.5);
        omniBoar.addPlantToDiet(bushLaurel);
        Omnivore omniFox = new Omnivore("Fox", 7, 0.40, 0.7);
        omniFox.setMaxFoodSize(0.5);
        omniFox.addPlantToDiet(flowerCystus);
        Omnivore omniBear1 = new Omnivore("Bear", 220, 0.95, 2.25);
        omniBear1.setMaxFoodSize(2);
        omniBear1.addPlantToDiet(treeOak);
        Omnivore omniBear2 = new Omnivore("Bear", 220, 0.95, 2.25);
        omniBear2.setMaxFoodSize(2);
        omniBear2.addPlantToDiet(treeOak);

        System.out.println("\n-------------Aantal dieren en planten-------------");
        System.out.println("dieren: " + notebook.getAnimalCount());
        System.out.println("planten: " + notebook.getPlantCount());

        System.out.println("\n------------PrintNoteBook ongesorteerde----------");
        notebook.printNoteBook();

        System.out.println("\n------------Carnivoren Lijst--------------");
        notebook.getCarnivores().forEach(System.out::println);
        System.out.println("\n------------Herbivoren Lijst--------------");
        notebook.getHerbivores().forEach(System.out::println);
        System.out.println("\n------------Omnivoren Lijst--------------");
        notebook.getOmnivores().forEach(System.out::println);

        System.out.println("\n----------------sortByName lijst--------------");
        notebook.sortAnimalsByName();
        notebook.sortPlantsByName();
        notebook.printNoteBook();


        System.out.println("\n\n\n-------------Bonus sortByHeight lijst-----------");
        notebook.sortAnimalsByHeight();
        notebook.sortPlantsByHeight();
        notebook.printNoteBook();
    }
}

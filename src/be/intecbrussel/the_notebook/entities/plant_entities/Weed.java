package be.intecbrussel.the_notebook.entities.plant_entities;

public class Weed extends Plant{

    private double area;


    public Weed(String name) {
        super(name);
    }

    public Weed(String name, double height) {
        super(name, height);

    }

    public double getArea(){
        return area;
    }

    public void setArea(double area){
        if (area < 0)
            area = 0;
        this.area = area;
    }

    @Override
    public String toString() {
        return "\nWeed: " +
                "\narea=" + area +
                "\nname='" + name + '\'' +
                "\nheight=" + height;
    }
}

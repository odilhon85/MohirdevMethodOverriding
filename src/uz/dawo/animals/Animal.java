package uz.dawo.animals;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound(){
        System.out.println("Animal sound");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

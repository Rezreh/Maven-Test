package org.campus02.herzer;

public class Animal {

    private String name;
    private String species;
    private String loud;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public Animal(String name, String species, String loud, int age) {
        this.name = name;
        this.species = species;
        this.loud = loud;
        setAge(age);
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getLoud() {
        return loud;
    }

    public void setLoud(String loud) {
        this.loud = loud;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0)
        {
            age=0;
        }
        this.age = age;
    }

    public String giveAnimalLoud() {
        return this.loud;
    }

    public String getNameAndAge() {
        return "Name: " + this.name + ", Age: " + this.age;
    }

    public String getAgeCategory() {
        if (age > 4) {
            return "old";
        } else if (age > 2) {
            return "young";
        } else {
            return "baby";
        }

    }
}

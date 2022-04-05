package com.example.nguyenduythinh.baikt4;

public class Animal {
    private String animalName;
    private String logoName;
    private String desciption;

    public Animal(String animalName, String logoName, String desciption) {
        this.animalName = animalName;
        this.logoName = logoName;
        this.desciption = desciption;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getLogoName() {
        return logoName;
    }

    public void setLogoName(String logoName) {
        this.logoName = logoName;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    @Override
    public String toString() {
        return "Name: " + this.animalName + "\nDescription: " + this.desciption;
    }
}

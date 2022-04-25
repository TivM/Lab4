package com.lab.person;


public abstract class PersonAbstract{
    private String name;

    public PersonAbstract(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Персонаж " + this.getName();
    }


}






package com.lab.person;

import com.lab.interfaces.ActionsOfFather;
import com.lab.interfaces.Describable;

import java.util.Objects;

public class Father extends PersonAbstract implements ActionsOfFather, Describable {
    private Baby baby;

    public Father(String name) {
        super(name);
    }

    public Father(String name, Baby baby) {
        super(name);
        this.baby = baby;
    }

    private class Hard{
        public String howPressed(){
            return "сильно";
        }
    }
    Hard hard = new Hard();


    @Override
    public boolean isPickedUp() {
        return true;
    }

    @Override
    public boolean isCarried() {
        return true;
    }

    @Override
    public boolean isPressed() {
        return true;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Father father = (Father) o;
        return baby.equals(father.baby) && Objects.equals(getName(),father.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(baby, getName());
    }

    @Override
    public String describe() {
        String sentence = "";
        if (isCarried()&&isPressed()&&isPickedUp()){
            sentence = toString() + " взял на руки " + baby.toString() + ", " + hard.howPressed()
                    + " прижал его к себе, " + "понес домой.";
        }

        return sentence;
    }
}

